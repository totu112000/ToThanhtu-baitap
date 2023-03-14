import java.util.Scanner;

public class Bai6 {
    public static void main(String[] arg) {
        int a = 5;
        int i = 1;
        long giaithua = 1;
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so nguyen ");
            a = scanner.nextInt();
            while (i <= a) {
                giaithua = giaithua * i;
                i++;

            }
        }
        System.out.println("giai thua cua so a la: " + giaithua);
    }
}