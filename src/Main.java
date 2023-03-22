import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double VND = 23000;
        double USD;

        System.out.println("Nhập số USD bạn muốn chuyển đổi: ");
        USD = sc.nextDouble();

        double Conver = USD * VND;
        System.out.println("Với " + USD + " USD bạn đổi được " + Conver + " tiền VND");
    }
}