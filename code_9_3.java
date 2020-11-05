
import java.util.Date;
class UsingDate {
    public static void main(String args[]) {
        long time = 10000;  
        Date d = new Date();    
        for (int i = 0; i < 8; i++) {  
            d.setTime(time);    
            System.out.println("流逝时间" + time + "，日期为: " + d.toString());    // 用toString()方法打印流逝后的时间
            time *= 10;    
        }
    }
}