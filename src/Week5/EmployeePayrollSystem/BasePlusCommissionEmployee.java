package Week5.EmployeePayrollSystem;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double salary;

    public BasePlusCommissionEmployee(String fname, String lname, String SSN, double comRate, double gross, double base) {
        super(fname, lname, SSN, comRate, gross);
        this.salary = base;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public double earnings(){
        return super.earnings() + salary;
    }

    @Override
    public void print() {
        System.out.println("Updated employee information obtained by get toString");
        System.out.println();
        System.out.println("Base-salaried commission employee: " + firstName + lastName);
        System.out.println("Social security number: " + socialSecurityNumber);
        System.out.println("Gross sales: " + grossSale);
        System.out.println("Commission rate: " + commissionRate);
        System.out.println("Base Salary: " + this.earnings());
        System.out.println();
    }

    public void superprint() {
        super.print();
    }
}
