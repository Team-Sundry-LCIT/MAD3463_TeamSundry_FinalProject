package Part3;

public class Permanent implements EmployeeContract {
    private int children;
    private Boolean married;
    private double monthlySalary;
    private int bonusPerChildPerMonth;
    private int accumulatedDays;
    @Override
    public double accumulatedSalary() {
        double childBonus = 0.0;
        double cumulativeSalary = 0.0;
        if (married && children > 0){
            childBonus = bonusPerChildPerMonth * children;
        }
        double salary = monthlySalary + childBonus;
        cumulativeSalary = (salary / 20) * accumulatedDays;
        return cumulativeSalary;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }

    public void setBonusPerChildPerMonth(int bonusPerChildPerMonth) {
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    public void setAccumulatedDays(int accumulatedDays) {
        this.accumulatedDays = accumulatedDays;
    }

    public Permanent(int children, Boolean married, double monthlySalary, int bonusPerChildPerMonth, int accumulatedDays) {
        this.children = children;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    public String toString() {
        String marriedStatus = married ? "is" : "is not";
        return " he " + marriedStatus + " married and he/she has " + children + " children.\n" +
                " He/She has worked for "+ accumulatedDays + " days and upon contract his/her monthly salary is " + monthlySalary ;
    }

}
