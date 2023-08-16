package buoi_1;

import java.util.Scanner;

public class btvn_b1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap so nguyen duong n");
            n = s.nextInt();
            if (n <= 0) {
                System.out.println("Nhap lại");
            }
        }
        while (n <= 0);
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i==n){
                for (int j= 1; j <=n; j++) {
                    System.out.print("*");
                    }
                }
            else{
                for (int j= 1; j <= n; j++) {
                    if(j==1){
                           System.out.print("*");
                       }
                       if(j>1 && j<n){
                           System.out.print(" ");
                       }
                       if(j==n){
                           System.out.println("*");
                    }
                }
            }
        }
    }
}

