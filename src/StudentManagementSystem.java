import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully");
    }

    public void removeStudent(String id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student with ID " + id + " removed.");
        } else {
            System.out.println("Student not found!");
        }
    }

    Student searchStudent(String id) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
    public void updateMarks(String id,double newMarks) {
        Student s = searchStudent(id);
        if(s != null) {
            s.setMarks(newMarks);
            System.out.println("Marks updated successfully");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        for (Student s : students) {
            s.displayStudent();//Polymorphism in action!
            if (s instanceof PGStudent) {
                ((PGStudent) s).playSport();//Interface method
            }
        }
    }
}