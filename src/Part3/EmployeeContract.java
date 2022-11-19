package Part3;

public interface EmployeeContract {

    public String description = "";
//    public String contractInfo();

    public default double accumulatedSalary() {
        return 0.0;
    }
}
