import java.util.Scanner;

public class Bai1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen a");
        int a = scanner.nextInt();
        System.out.println("Nhap so nguyen b");
        int b = scanner.nextInt();

        int tong = a + b;
        System.out.println("Tong la 2 chu so la " + tong);
        int hieu = a - b;
        System.out.println("Hieu cua 2 chu so la " + hieu);
        int tich = a * b;
        System.out.println("Tich cua 2 chu so la " + tich);
        int thuong = a / b;
        System.out.println("Thuong cua 2 chu so la " + thuong);
        int du = a % b;
        System.out.println("Phan du cua 2 so la " + du);

        if (a > b) {
            System.out.print("a lon hon b");
        } else {
            System.out.print("a nho hon b");
        }

    }
}