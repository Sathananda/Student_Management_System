public class PGStudent extends Student implements SportsParticipant {
    private String specialization;
    public PGStudent(String name, int age, String studentId, double marks, Address address,String specialization) {
        super(name, age, studentId, marks, address);
        this.specialization = specialization;
    }

    @Override
    public void playSport() {
        System.out.println(getName()+" is participating in University Sports.");
    }

    @Override
    public double calculateFees() {
        return 75000.0;
    }
    @Override
    public void displayStudent() {
        super.displayStudent();
        System.out.println("Type: PostGraduate (Specialization: "+specialization+ ")");
    }
}