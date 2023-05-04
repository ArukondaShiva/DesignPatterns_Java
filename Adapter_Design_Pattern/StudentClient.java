import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    
    public List<Student> getStudentList(){
        
        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("vijay","antony","vij@gmail.com");

        SchoolStudent schoolStudent = new SchoolStudent("kumar","antony","kmr@gmail.com");
    
        students.add(collegeStudent);

        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
    
}
