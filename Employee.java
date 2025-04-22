public class Employee extends User {
    protected String employeeId;
    protected String position;

    public Employee(String userId, String username, String password, String name, String email, String employeeId, String position) {
        super(userId, username, password, name, email);
        this.employeeId = employeeId;
        this.position = position;
    }

    public void viewCustomerAccounts(Customer customer) {
        customer.viewAccounts();
    }

    public Customer searchCustomer(String username) {
        // Placeholder: actual search logic would go in Bank class
        return null;
    }

    public void generateReport() {
        // Placeholder for report generation
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println(name + " has logged out.");
    }

    @Override
    public void updateProfile(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
