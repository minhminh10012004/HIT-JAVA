package buoi_3;
import java.util.Scanner;
public class b3 {
    static void sapxep (int [] a, int n){
        int tg;
        for(int i=0; i < n-1;i++){
            for(int j=i; j<n;j++){
                if(a[i]>a[j]){
                    tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
        System.out.println("mang sau khi sap xep la:");
        for (int i=0;i<n; i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("nhap so luong phan tu mang: ");
            n= sc.nextInt();
        }while (n<=0);
        int []a=new int[n];
        for(int i=0; i<n;i++){
            System.out.print("a["+ i+"]=");
            a[i]=sc.nextInt();
        }
        sapxep(a,n);

    }

}

