package buoi_1;

import java.util.Scanner;

public class btvn_b3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap so nguyen duong n=");
            n=sc.nextInt();
            if(n<=0){
                System.out.println("nhap lai !");
            }
        }while(n<=0);
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i==0){
                System.out.println("Kết quả :");
                System.out.println(n +" không phải là số nguyên tố");
            }
            else {
                System.out.println("Kết quả:");
                System.out.println(n +" là số nguyên tố ");
            }
        }
    }
}
