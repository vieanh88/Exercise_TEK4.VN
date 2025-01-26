string = "  i have a new String with spaces  "
print(string.strip())

#how to dealete all spaces in a string
string = "  i have a new String with spaces  "
print(string.replace(" ",""))

#a method to remove all spaces in a string
string = "  i have a new String with spaces  "
print("".join(string.split()))

#test how strip work
s = 'www.example.com'.strip('cmow.')
print(s)
#why the output is example? not exaple
#the strip method will remove any character in the string that is in the argument
#the method remove characters from the start to when it finds a character that is not in the argument