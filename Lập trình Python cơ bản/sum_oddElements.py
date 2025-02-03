# Tổng của các phần tử lẻ trong danh sách
arr = [13,15,4,6,8,71,45,54,56,77,67,88,49,33838,3784376,77735]
sum = 0
for i in arr:
  if i%2 != 0:
    sum += i
print(sum)