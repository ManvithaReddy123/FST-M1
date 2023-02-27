listOne = [21, 56, 23, 11, 79]
listTwo = [19, 42, 24, 36, 12]
print("First List ", listOne)
print("Second List ", listTwo)
thirdList = []
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)
print("result List is:")
print(thirdList)