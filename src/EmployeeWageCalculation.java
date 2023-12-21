
public class EmployeeWageCalculation {
    public static void main(String[] args) {
        Employee company1Employee = new Employee("Company 1", 20, 8, 4, 20, 100);
        Employee company2Employee = new Employee("Company 2", 25, 9, 5, 22, 110);

      
        company1Employee.displayEmployeeDetails();
        company2Employee.displayEmployeeDetails();

        
        System.out.println("Company 1 Monthly Wage: " + company1Employee.calculateMonthlyWage());
        System.out.println("Company 2 Monthly Wage: " + company2Employee.calculateMonthlyWage());
    }
}