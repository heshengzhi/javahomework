import java.util.Scanner;
public class java2 {
    public static void main(String[]args){
        System.out.printf("Enter n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for (int i = 0; i<n; i++){
            for(int x =0; x<n; x++)
                System.out.print(Math.round(Math.random())+"");
            System.out.println();
        }
    }
}
