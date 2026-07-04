import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add UG Student");
            System.out.println("2. Add PG Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Update Marks");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter Pincode: ");
                    String pin = scanner.nextLine();
                    Address address = new Address(city, state, pin);

                    if (choice == 1) {
                        System.out.print("Enter Semester: ");
                        int sem = scanner.nextInt();
                        sms.addStudent(new UGStudent(name, age, id, marks, address, sem));
                    } else {
                        System.out.print("Enter Specialization: ");
                        String spec = scanner.nextLine();
                        sms.addStudent(new PGStudent(name, age, id, marks, address, spec));
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to remove: ");
                    String removeId = scanner.nextLine();
                    sms.removeStudent(removeId);
                    break;

                case 4:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student found = sms.searchStudent(searchId);
                    if (found != null) {
                        found.displayStudent();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Marks: ");
                    double newMarks = scanner.nextDouble();
                    sms.updateMarks(updateId, newMarks);
                    break;

                case 6:
                    sms.displayAllStudents();
                    break;

                case 7:
                    System.out.println("Exiting System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
