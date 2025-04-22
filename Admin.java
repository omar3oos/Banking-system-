public class Admin extends Employee {
    private String securityClearance;
    private boolean adminPrivileges;

    public Admin(String userId, String username, String password, String name, String email,
                 String employeeId, String position, String securityClearance, boolean adminPrivileges) {
        super(userId, username, password, name, email, employeeId, position);
        this.securityClearance = securityClearance;
        this.adminPrivileges = adminPrivileges;
    }


    public void createEmployee(Bank bank, Employee employee) {
        bank.createUser(employee);
        System.out.println("Employee created: " + employee.name);
    }

    public void modifySystemSettings() {
        System.out.println("System settings modified (placeholder).");
    }

    public void overrideTransactionLimits() {
        System.out.println("Transaction limits overridden (placeholder).");
    }
}