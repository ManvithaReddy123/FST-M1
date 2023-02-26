package Activities;

public class Car {
    int make;
    int tyres;
    int doors;
    String color;
    String transmission;
   Car() {
       tyres = 4;
       doors = 4;
   }
       public void displayCharacterstics(){
           System.out.println(color);
           System.out.println(transmission);
           System.out.println(make);
           System.out.println(doors);
           System.out.println(tyres);
       }
       public void accelerate(){
       System.out.println("accelerate");

       }
       public void brake(){
       System.out.println("brake");
       }

}
