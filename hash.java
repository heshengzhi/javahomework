import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Comparator;
import java.util.Scanner;
public class hash {
    // 主函数
    public static void main(String args[]) {
        System.out.println("Please enter the absolute path of the file directory：");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        s.close();
        try {
            MessageDigest complete = MessageDigest.getInstance("SHA-1");
            dfsFiles(path, complete);
            byte[] sha1 = complete.digest();
            String result = "";
            for (byte b : sha1) {
                result += Integer.toString(b & 0xFF, 16);
            }
            System.out.println("The hash of the file directory is：\n" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 深度优先遍历文件夹
    private static void dfsFiles(String path, MessageDigest complete) throws Exception {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        // 使用重写比较器对fs进行排序
        Arrays.sort(fs, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                return f1.getName().compareTo(f2.getName());
            }
        });
        // 进行遍历，对文件加入文件字节输入流，对文件夹则递归遍历其下的文件
        for (File f : fs) {
            if (f.isFile()) {
                SHA1Checksum(new FileInputStream(f), complete);
            } else if (f.isDirectory()) {
                dfsFiles(f.getPath(), complete);
            }
        }
    }

    // 更新hash
    private static void SHA1Checksum(FileInputStream is, MessageDigest complete) throws Exception {
        //用于计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];
        int num = 0;
        while (num != -1) {
            //读出numRead字节到buffer中
            num = is.read(buffer);
            if (num > 0)
                //根据buffer[0:numRead]的内容更新hash值
                complete.update(buffer, 0, num);
        }
        is.close();
    }
}