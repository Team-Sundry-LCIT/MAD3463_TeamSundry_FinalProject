package Part3;

public interface EmployeeContract {
    /**
     * @return Accumulated Salary in double format
     */
    public default double accumulatedSalary() {
        return 0.0;
    }

}
