def calculate_sum(numbers):
	sum = 0
	for number in numbers:
		sum += number
	return sum
numList = [56, 45, 93, 32]
result = calculate_sum(numList)
print("The sum of all the elements is: " + str(result))
