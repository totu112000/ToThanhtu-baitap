import java.util.Scanner;

public class Bai3 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ho Ten");
        String Hoten = scanner.nextLine();
        System.out.println("Nhap nam sinh");
        int nam = scanner.nextInt();

        int tuoi = 2023 - nam;
        if (tuoi < 16) {
            System.out.println(Hoten + " o do tuoi vi thanh nien");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println(Hoten + " o do tuoi truong thanh");
        } else {
            System.out.println(Hoten + " o do tuoi gia");
        }
    }
}
