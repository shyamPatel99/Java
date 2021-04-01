import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        for(int i=0; i<str.length(); i++) {            
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
}
