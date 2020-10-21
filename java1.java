import java.util.*;

public class  java1{
    public static void reverse (int number){
        int a , b = number;
        int reverse = 0;
        while (b != 0){
            a = b % 10;
            reverse = reverse * 10 + a;
            b /=10;
        }
        System.out.println(reverse);
    }
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("请输入一个整数： ");
    int number = input.nextInt();
    reverse(number);
    }  
}
