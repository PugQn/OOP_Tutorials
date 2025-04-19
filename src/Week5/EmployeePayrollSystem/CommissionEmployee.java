package Week5.EmployeePayrollSystem;

public class CommissionEmployee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double commissionRate;
    protected double grossSale;

    public CommissionEmployee(String fname, String lname, String SSN, double comRate, double gross) {
        this.firstName = fname;
        this.lastName = lname;
        this.socialSecurityNumber = SSN;
        this.commissionRate = comRate;
        this.grossSale = gross;
    }

    public double earnings(){
        return commissionRate * grossSale;
    }

    public void print() {
        System.out.println("Employee information obtained by get methods");
        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);
        System.out.println("Social security number is " + socialSecurityNumber);
        System.out.println("Gross sales is " + grossSale);
        System.out.println("Commission rate is " + commissionRate);
        System.out.println("Base Salary is " + earnings());
        System.out.println();
    }
}
