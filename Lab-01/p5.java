import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Roll No : ");
        int roll_no = sc.nextInt();
        String[] subject = {"Maths","S.S","Science","English","Computer"};
        float Total = 0, Avg = 0;
        System.out.println("Enter Marks : ");
        for(int i=0; i<5; i++) {
            System.out.print(subject[i]+" : ");
            float T = sc.nextInt();
            Total += T;
        }
        Avg = Total / 5;
        System.out.println("------------------OUTPUT----------------");
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll_no);
        System.out.println("Average : "+Avg);
        if(Avg > 80) {
            System.out.println("Grade : A");
        } else if( Avg >= 60) {
            System.out.println("Grade : B");
        } else if( Avg >= 40) {
            System.out.println("Grade : C");
        } else if( Avg >= 33) {
            System.out.println("Grade : D");
        }else {
            System.out.println("Grade : F");
        }
    }
}
