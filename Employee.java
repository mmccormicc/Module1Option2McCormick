class Employee {
    String firstName;
    String lastName;
    int employeeID;
    double salary;

    // Constructor
    Employee() {
        salary = 0;
    }

    // Setters
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Getters
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getEmployeeID() {
        return employeeID;
    }

    // Summary
    void employeeSummary() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Salary: " + salary);
    } 
}