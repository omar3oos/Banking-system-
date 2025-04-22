public class Admin extends Employee {
    private String securityClearance;
    private boolean adminPrivileges;

    public Admin(String userId, String username, String password, String name, String email,
                 String employeeId, String position, String securityClearance, boolean adminPrivileges) {
        super(userId, username, password, name, email, employeeId, position);
        this.securityClearance = securityClearance;
        this.adminPrivileges = adminPrivileges;
    }

    public void createEmployee(Employee employee) {
        // Add to Bank's user list
    }

    public void modifySystemSettings() {
        // Placeholder for admin settings
    }

    public void overrideTransactionLimits() {
        // Admin-specific overrides
    }
}
