public class EmployeeWageCalculation {
    public static void main(String[] args) {
        EmployeeWage2 employee = new EmployeeWage2(20, 8, 4, 20, 100);

        System.out.println("Welcome to Employee Wage Computation Program");


        employee.checkAttendance();
        int dailyWage = employee.calculateDailyWage();
        System.out.println(" Daily Wage: " + dailyWage);

     
        int monthlyWage = employee.calculateMonthlyWage();
        System.out.println(" Monthly Wage: " + monthlyWage);

       
        int wagesTillCondition = employee.calculateWagesTillCondition();
        System.out.println(" Wages till condition: " + wagesTillCondition);
    }
}