import java.util.Scanner;
public class java4{
    public static void main(String[] args){
        
        
        System.out.print("请输入10个整数，以逗号隔开：");
        Scanner in = new Scanner(System.in);
        int[] num=new int[10];
        for (int i = 0;i<num.length;i++){
            num[i]=in.nextInt();
        }
        int min = num[0];
        int n = 0;
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
                n=i;
            }
        }
        System.out.println("最小数的下标为："+n);
    }
}