import java.util.Scanner;

class Employee {
    String name, address;
    int age, phone_number, salary;
    
    public Employee(String name, int age, int phone_number, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }
    
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
    
    public Officer(String name, int age, int phone_number, String address, int salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Employee {
    String department;
    
    public Manager(String name, int age, int phone_number, String address, int salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Officer Details
        System.out.println("OFFICER DETAILS");
        System.out.print("Enter Officer Name: ");
        String off_name = obj.nextLine();
        System.out.print("Enter Officer Age: ");
        int off_age = obj.nextInt();
        System.out.print("Enter Officer Phone Number: ");
        int off_phone_number = obj.nextInt();
        obj.nextLine(); // Consume newline
        System.out.print("Enter Officer Address: ");
        String off_address = obj.nextLine();
        System.out.print("Enter Officer Salary: ");
        int off_salary = obj.nextInt();
        obj.nextLine(); // Consume newline
        System.out.print("Enter Officer Specialization: ");
        String off_specialization = obj.nextLine();
        
        System.out.println();

        // Manager Details
        System.out.println("MANAGER DETAILS");
        System.out.print("Enter Manager Name: ");
        String mngr_name = obj.nextLine();
        System.out.print("Enter Manager Age: ");
        int mngr_age = obj.nextInt();
        System.out.print("Enter Manager Phone Number: ");
        int mngr_phone_number = obj.nextInt();
        obj.nextLine(); // Consume newline
        System.out.print("Enter Manager Address: ");
        String mngr_address = obj.nextLine();
        System.out.print("Enter Manager Salary: ");
        int mngr_salary = obj.nextInt();
        obj.nextLine(); // Consume newline
        System.out.print("Enter Manager Department: ");
        String mngr_department = obj.nextLine();
        
        Officer officer = new Officer(off_name, off_age, off_phone_number, off_address, off_salary, off_specialization);
        Manager manager = new Manager(mngr_name, mngr_age, mngr_phone_number, mngr_address, mngr_salary, mngr_department);
        
        System.out.println();
        
        System.out.println("Displaying Officer Details:");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone Number: " + officer.phone_number);
        System.out.println("Address: " + officer.address);
        officer.printSalary();
        System.out.println("Specialization: " + officer.specialization);
        
        System.out.println();
        
        System.out.println("Displaying Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phone_number);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}