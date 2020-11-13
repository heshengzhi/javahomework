public class code_13_13 {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public code_13_13(String courseName) {
        this.courseName = courseName;
    }

    public void addStudents(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public code_13_13 clone() {
        code_13_13 courseNew = new code_13_13(this.courseName);
        courseNew.numberOfStudents = this.numberOfStudents;
        String[] studentsNew = new String[100];
        for (int i = 0; i < this.numberOfStudents; i++)
            studentsNew[i] = this.students[i];
        courseNew.students = studentsNew;
        return courseNew;
    }

    // 测试函数
    public static void main(String[] args) {
        code_13_13 course1 = new code_13_13("Java_Programming");   
        code_13_13 course2 = course1.clone();   
        boolean a = course1 == course2;    
        boolean b = course1.students == course2.students;    
        System.out.println("与原对象地址相同：" + a + "\n" + "与原对象内students地址相同：" + b + "\n" +  "clone是深刻复制：" + (!a && !b)); 
    }
}