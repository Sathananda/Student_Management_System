public class Teacher extends Person{
    private String teacherId;
    private double salary;
    public Teacher(String name, int age,String teacherId,double salary) {
        super(name, age);
        this.teacherId = teacherId;
        this.salary = salary;
    }
    //Getters and Setters omitted for brevity
}