import java.util.List;

public class Driver{
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> studentList = client.getStudentList();
        System.out.println(studentList);
    }
}