public abstract class Student extends Person{
    private String studentId;
    private double marks;
    private Address address;
    public Student(String name, int age,String studentId,double marks,Address address) {
        super(name, age);
        this.studentId = studentId;
        this.marks = marks;
        this.address = address;
    }
    //Abstract Method to enforce polymorphism
    public abstract double calculateFees();
    public String getStudentId() { return studentId;}
    public double getMarks() { return marks;}
    public void setMarks(double marks) { this.marks = marks;}

    public void displayStudent() {
        System.out.println("\n---Student Info---");
        System.out.println("ID: "+ studentId);
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Marks: "+marks);
        System.out.println("Address: "+ address.toString());
        System.out.println("Fees: $"+ calculateFees());//Run Time Polymorphism
    }
}