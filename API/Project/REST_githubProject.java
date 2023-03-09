package Activities;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class REST_githubProject {
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    String sshKey;
    int sshKeyId;

    @BeforeClass
    public void setUp() {
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token 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")
                .setBaseUri("https://api.github.com")
                .build();
        sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIG1BpskaqXaQ9AzrglIpnyeLwxnpUJVt0IE5HderF/cr";
    }
    @Test(priority = 1)
    public void addKeys() {
        String reqBody = "{\"title\": \"B44-M1-RA\", \"key\": \"" + sshKey + "\" }";
        Response response = given().spec(requestSpec)
                .body(reqBody)
                .when().post("/user/keys");
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response);
        System.out.println(response.getStatusCode());
        sshKeyId = response.then().extract().path("id");
        response.then().statusCode(201);
    }
    @Test(priority = 2)
    public void getKeys() {
        Response response = given().spec(requestSpec)
                .when().get("/user/keys");
        System.out.println(response.headers());
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());

        response.then().statusCode(200);
    }
    @Test(priority = 3)
    public void deleteKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("keyId", sshKeyId).when().delete("/user/keys/{keyId}");
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());
        response.then().statusCode(204);
    }
}