public class Test {
    
    // Main method
    public static void main(String[] args) {
        // Creating employee
        Employee e = new Employee();
        // Setting employee info
        e.setFirstName("Jim");
        e.setLastName("Anderson");
        e.setEmployeeID(1);
        // Displaying employee info
        e.employeeSummary();

        // Printing blank space
        System.out.println("\n");

        // Creating manager
        Manager m = new Manager();
        // Setting manager info
        m.setFirstName("Pam");
        m.setLastName("Henderson");
        m.setEmployeeID(2);
        m.setDepartment("Human Resources");
        // Displaying manager info
        m.employeeSummary();
    }
}
