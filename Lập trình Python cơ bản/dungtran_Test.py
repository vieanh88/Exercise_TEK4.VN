#ví dụ cho hàm print có format
name = "Dũng"
namSinh = 2003

#m muốn in ra "Tôi tên là Dũng, năm sinh 2003"
#dùng hàm print trong đó 2 phần là Dũng và 2003 sẽ được thay thế bằng biến name và namSinh

print("Tôi tên là {}, năm sinh {}".format(name, namSinh))
#khi này thì name và namSinh sẽ được thay thế vào 2 dấu {} tương ứng theo thứ tự

#bth dùng print
print ("Tôi tên là", name, ", năm sinh", namSinh)

#ví dụ hàm imput
name = input()
print("Tên của bạn là", name)

#ví dụ hàm input nhập vào số lãi
lai = int(input())
print("Số tiền lãi là", lai)