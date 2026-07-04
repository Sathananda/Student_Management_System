public class UGStudent extends Student{
    private int semester;
    public UGStudent(String name,int age,String studentId,double marks,Address address,int semester) {
        super(name,age,studentId,marks,address);
        this.semester = semester;
    }
    @Override
    public double calculateFees() {
        return 50000.0;
    }
    @Override
    public void displayStudent() {
        super.displayStudent();
        System.out.println("Type: Undergraduate (Semester "+semester+")");
    }
}