package buoi_3;
import java.util.Scanner;
public class b4 {
    static void ktra( String a){
        int index = 0;
        int dem = 0;
        double sl = Math.floor(a.length() / 2);
        for (int i = (a.length() - 1); i >= sl; i--) {
            if (a.charAt(i) == (a.charAt(index))) {
                dem++;
            }
            index++;
        }
        if (a.length() % 2 != 0) {
            dem--;
        }
        if (dem == sl) {
            System.out.println("Chuoi doi xung.");
        } else {
            System.out.println("Chuoi khong doi xung.");
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("nhap chuoi:");
        a=sc.nextLine();
        ktra(a);

    }
}
