import java.util.Random;

class Employee {
    private final String companyName;
    private final int hourlyWage;
    private final int fullDayHours;
    private final int partTimeHours;
    private final int maxWorkingDays;
    private final int maxWorkingHours;

    public Employee(String companyName, int hourlyWage, int fullDayHours, int partTimeHours, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.hourlyWage = hourlyWage;
        this.fullDayHours = fullDayHours;
        this.partTimeHours = partTimeHours;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public int calculateDailyWage() {
        Random random = new Random();
        int attendance = random.nextInt(2); // 0 for absent, 1 for present

        if (attendance == 1) {
            return hourlyWage * fullDayHours;
        } else {
            return 0; // Employee is absent
        }
    }

    public int calculateMonthlyWage() {
        int totalWage = 0;
        for (int day = 1; day <= maxWorkingDays; day++) {
            totalWage += calculateDailyWage();
        }
        return totalWage;
    }

    public int calculatePartTimeWage() {
        return hourlyWage * partTimeHours;
    }

    public int calculateWagesTillCondition() {
        int totalWage = 0;
        int totalHours = 0;
        int currentDay = 1;

        while (currentDay <= maxWorkingDays && totalHours < maxWorkingHours) {
            totalWage += calculateDailyWage();
            totalHours += fullDayHours;
            currentDay++;
        }

        return totalWage;
    }

    public void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Full Day Hours: " + fullDayHours);
        System.out.println("Part Time Hours: " + partTimeHours);
        System.out.println("Max Working Days: " + maxWorkingDays);
        System.out.println("Max Working Hours: " + maxWorkingHours);
    }
}