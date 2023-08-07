package buoi_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class btvn_b2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap so nguyen duong n=");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Nhap lai n!");
            }
        } while (n <= 0);
        int P = 0;
        int S = 1;
        for (int i = 1; i <= n; i++) {
            S *= i;
            P += S;
        }
        System.out.println("Gia tri P=" + P);
    }
}
