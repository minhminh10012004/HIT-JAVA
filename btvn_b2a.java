package buoi_1;

import java.util.Scanner;

public class btvn_b2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so nguyen duong n=");
            n= sc.nextInt();
            if (n < 0) {
                System.out.println("Nhap lai n !");
            }
        } while ( n< 0);
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S += (1.0 / i);
        }
        System.out.println("Gia tri S la " + S);
    }
}
