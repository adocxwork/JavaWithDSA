n = int(input("Enter number : "))
nn = n**(1/3)
if(nn**3==n):
    print("Cube root :", nn)
    print("The number is perfect cube.")
else:
    print("The number is not perfect cube.")