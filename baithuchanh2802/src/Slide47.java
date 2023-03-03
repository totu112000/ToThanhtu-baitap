import java.util.Scanner;

public class Slide47 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a, tong = 0;
        while (tong < 100) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so nguyen ");
            a = scanner.nextInt();
            tong = tong + a;
        }
        System.out.println("Tong cua cac chu so la: " + tong);
    }
}
