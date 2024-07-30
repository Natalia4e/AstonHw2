public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrpetrov@mailbox.com", "893312345", 40000, 35);
        employees[2] = new Employee("Sidorov Nikita", "Developer", "niksidorov@mailbox.com", "894412356", 50000, 28);
        employees[3] = new Employee("Smirnov Pavel", "Designer", "smirnovpetr@mailbox.com", "895512367", 45000, 32);
        employees[4] = new Employee("Kuznetsova Anna", "Analyst", "kuznetsovanna@mailbox.com", "896612378", 35000, 29);

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println();
        }
    }
}
