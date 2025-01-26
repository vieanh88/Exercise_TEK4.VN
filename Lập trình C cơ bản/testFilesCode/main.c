#include <stdio.h>

int main () {
    //tạo con trỏ file
    FILE* fptr;
    
    //mở file bằng dạng ghi (w)
    fptr = fopen("fileTest.txt", "w");
    //ghi vào file bằng hàm fputs
    char fileContent[100] = "This is a test string" ;
    fputs (fileContent, fptr);
    //đóng file
    fclose (fptr);

    //mở file bằng dạng đọc
    fptr = fopen("fileTest.txt", "r");
    //đọc dữ liệu trong file bằng hàm fgets và lưu trong string readContent
    char readContent[100];
    fgets (readContent, 100, fptr);
    //in ra dữ liệu đọc được lưu trong biến
    printf ("%s", readContent);
    //đóng file
    fclose (fptr);

    return 0;
}