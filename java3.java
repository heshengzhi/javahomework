import java.util.Random;
public class java3 {
    public static void main(String[] args){
        int[] numCount = new int[10];
        int[] nums = new int[100];
            for (int i = 0;i<100;i++){
                nums[i] = new Random().nextInt(10);
            }
            for (int i : nums){
                numCount[i]++;
            }
            for(int i = 0; i<10; i++){
                System.out.println(i+"出现了："+ numCount[i]+"次");
                
            }
    }
    
}
