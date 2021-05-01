import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Matrix : ");
        int arr1[][] = new int[3][3];
        for (int i=0; i<3; i++) { 
            for (int j=0; j<3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix : ");
        int arr2[][] = new int[3][3];
        for (int i=0; i<3; i++) { 
            for (int j=0; j<3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of a matrix : ");
        int arr3[][] = new int[3][3];
        for (int i=0; i<3; i++) { 
            for (int j=0; j<3; j++) {
                arr3[i][j]= arr1[i][j] + arr2[i][j];
            }
        }
        for (int[] i : arr3) 
        { 
            for (int j : i ) {
                System.out.print( j + " "); 
            }
            System.out.println();
        }

        System.out.println("Multiplication of a matrix : ");
        int arr4[][] = new int[3][3];
        for (int i=0; i<3; i++) { 
            for (int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    arr4[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int[] i : arr4) 
        { 
            for (int j : i ) {
                System.out.print( j + " "); 
            }
            System.out.println();
        }
    }
}
//yoo 