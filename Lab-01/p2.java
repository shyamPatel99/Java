import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int ans = 0, rem = 0;
        while(value != 0) {
            rem = value % 10;
            ans += rem;
            value /= 10;
        }
        System.out.println("Sum of Digit : " + ans);
    }
}
