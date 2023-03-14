import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so phan tu cua day: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("so khong hop le");
            return;
        }
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("nhap vao so thu " + i + ": ");
            int x = sc.nextInt();
            tong += x;
        }
        double tbc = (double) tong / n;

        System.out.println("trung binh cong cua cac so la: " + tbc);
    }
}
