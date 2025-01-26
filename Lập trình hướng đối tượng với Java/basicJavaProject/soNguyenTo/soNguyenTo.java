/*
Bài tập Tek4.vn
Chương trình in ra tất cả các số nguyên tố từ 50 đến 100
 */

 class soNguyenTo {

    //phương thức kiểm tra số nguyên tố
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //ham main
    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 100;

        //tạo obj của class soNguyenTo
        soNguyenTo obj = new soNguyenTo();

        //in ra các số nguyên tố từ 50 đến 100
        for (int i = n1; i<= n2; i++) {
            if (obj.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
 }