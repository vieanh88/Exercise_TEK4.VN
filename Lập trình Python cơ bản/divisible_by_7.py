# Bài toán "chia hết cho 7"
# Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 2000 và 3200 (tính cả 2000 và 3200).
# Các số thu được sẽ được in thành chuỗi trên một dòng và được phân cách nhau bằng dấu phẩy.
# Không được sử dụng list để lưu trữ kết quả.

j = ""
for i in range(2000,3201): # vòng lặp từ 2000 đến 3200
  if (i%7 == 0) and (i%5 != 0): # kiểm tra số chia hết cho 7 nhưng không phải bội số của 5
    j = j + str(i) + "," # nối chuỗi
print(j[:-1]) # bỏ dấu phẩy cuối cùng