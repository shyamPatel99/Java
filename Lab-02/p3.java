import java.util.*;
import java.math.*;
import java.lang.*;


public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() != 1) {
            if(str.length() % 2 != 0 ) {
                
                double mid = (double) str.length() / 2 ;
                mid = Math.ceil(mid);
               // System.out.println(mid);
                int index = (int) mid - 1;
               // System.out.println("middle char : " + str.charAt(index));
                String s2 = str.substring(0, index);
               // System.out.println( "string befor mid : " + s2);
                String s3 = str.substring(index+1, str.length());
               // System.out.println( "string after mid : " + s3);
                
                s2 = s2.toLowerCase();
                s3 = s3.toLowerCase();
                int l = s3.length() - 1;
                int flag = 0;

                for(int i=0; i<s3.length(); i++) {                    
                    if(s2.charAt(i) != s3.charAt(l)) {
                        flag = 1;
                        break;
                    }
                    l--;
                }

                if(flag == 0) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }                                                                
            }else {
                System.out.println("Not a Palindrome");
                return;
            }
        }else {
            System.out.println("Palindrome");
            return;
        }
    }
}
