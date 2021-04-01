import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, ans = 0;
        for(int i=0; i<n; i++) {
            System.out.print(ans+" ");
            if(ans == 0) {
                System.out.print("1 ");
            }
            ans = a + b;
            a = b;
            b = ans;
        }
    }
}