import java.util.Random;

class EmployeeWage2 {
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;

    private int hourlyWage;
    private int fullDayHours;
    private int partTimeHours;
    private int maxWorkingDays;
    private int maxWorkingHours;

    public EmployeeWage2(int hourlyWage, int fullDayHours, int partTimeHours, int maxWorkingDays, int maxWorkingHours) {
        this.hourlyWage = hourlyWage;
        this.fullDayHours = fullDayHours;
        this.partTimeHours = partTimeHours;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void checkAttendance() {
        Random random = new Random();
        int attendance = random.nextInt(2); 

        if (attendance == FULL_TIME) {
            System.out.println("Employee is present");
        } 
        else 
        System.out.println("Employee is absent");
    }



    public int calculateDailyWage() {
        Random random = new Random();
        int attendance = random.nextInt(2); 

        if (attendance == FULL_TIME) {
            return hourlyWage * fullDayHours;
        } else if(attendance==PART_TIME) {
            return hourlyWage*partTimeHours;
        }
        else 
        return 0;
    }

    public int calculateMonthlyWage() {
        int totalWage = 0;
        for (int day = 1; day <= maxWorkingDays; day++) {
            totalWage += calculateDailyWage();
        }
        return totalWage;
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
}


