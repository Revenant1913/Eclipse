package test1;
import maven.second.Linking;

 class CompanyMember {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private int salary;

    public CompanyMember(String name, int age, String phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

 class Employee extends CompanyMember {
    private String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    
}

 class Manager extends CompanyMember{
    private String department;

    public Manager(String name, int age, String phoneNumber,
                    String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}


public class Test1 {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Ben", 25, "9384938384", "Home", 25631, "IT");
        Manager manager = new Manager("Ron", 30, "94850284939", "Earth", 69586, "IT");
        employee.printSalary();
        manager.printSalary();
		
		
	}
}

 