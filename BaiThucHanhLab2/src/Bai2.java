import java.util.Scanner;

public class Bai2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " la so chan ");
        } else {
            System.out.println(n + " la so le ");
        }
    }
}