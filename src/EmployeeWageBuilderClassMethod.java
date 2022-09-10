public class EmployeeWageBuilderClassMethod {
    public static final int WAGE_PER_HOUR = 20;
    public static final int IS_FULL_TIME = 8;
    public static final int IS_PART_TIME = 4;
    public static final int NUM_OF_WORKING_DAYS=20;
    public static final int NUM_OF_WORKING_HOURS=100;

    public static int computeWage() {
        int workingHours = 0,dailyWage = 0,totalWorkingDays = 0;

        while (workingHours < NUM_OF_WORKING_HOURS && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            int empCheck = (int) (Math.random() * ((2) + 1));
            totalWorkingDays++;
            switch (empCheck) {
                case 1:
                    workingHours = workingHours + IS_FULL_TIME;
                    System.out.println("Employee is full day present ");
                    dailyWage = dailyWage + WAGE_PER_HOUR * IS_FULL_TIME;
                    break;
                case 2:
                    workingHours = workingHours + IS_PART_TIME;
                    System.out.println("Employee is half day present ");
                    dailyWage = dailyWage + WAGE_PER_HOUR * IS_PART_TIME;
                    break;
                default:
                    System.out.println("Employee is absent ");
            }

            System.out.println("Working days: " + totalWorkingDays + " & Hours: " + workingHours);
            System.out.println(" ");
        }
        System.out.println("Employee's total wage for month is: " + dailyWage);
        return dailyWage;
    }

    public static void main(String[] args) {
        computeWage();
    }
}
