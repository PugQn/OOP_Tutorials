package Week5.EmployeePayrollSystem;

public class Main {
    public static void main(String[] args) {
        BasePlusCommissionEmployee Bob = new BasePlusCommissionEmployee("Bob", "Lewis", "333-333-333", 0.04, 5000.00, 600.00);
        Bob.superprint();
        Bob.print();
    }
}
