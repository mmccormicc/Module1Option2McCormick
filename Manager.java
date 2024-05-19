class Manager extends Employee{
    String department;

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    // Summary
    void employeeSummary() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
