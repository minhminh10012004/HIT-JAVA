package buoi_3;
import java.util.Scanner;
public class b1 {
    static int dem(int n, int x, int[] a) {
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (x == a[i]) {
                d++;
            }
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int d = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    d++;
                }
            }
            if (d == 0) {
                System.out.println("So " + a[i] + " xuat hien " + dem(n, a[i], a) + " lan");
            }
        }

    }

}
