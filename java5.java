import java.util.Scanner;
public class java5 {
public static double sumMajorDiagonal(double[][] m){
    double sum =0;
    for(int i = 0;i<m.length;i++){
        sum= sum + m[i][i];
    }
    return sum;
}
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入矩阵的行数和列数");
        int row = input.nextInt();
        int column= input.nextInt();
        double[][] matrix = new double [row][column];
        System.out.println("请输入矩阵：");
        for (int i = 0; i<matrix.length;i++){
            for (int j = 0; j <matrix[i].length;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("矩阵对角线所有元素之和为："+ sumMajorDiagonal(matrix));
    }
}
