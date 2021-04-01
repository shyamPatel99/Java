import java.util.Scanner;

public class p4 {
    static StringBuilder reverse_string_words(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        String arr[] = s.split(" ");
        for (int i = arr.length - 1;  i >= 0;  i--) {
            sb.append(arr[i] + " ");
        }

        return sb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("String : ");
        String str = sc.nextLine();

        StringBuilder st = new StringBuilder();
        st = reverse_string_words(str);

        System.out.println("Reverse : " + st);
    }

}
