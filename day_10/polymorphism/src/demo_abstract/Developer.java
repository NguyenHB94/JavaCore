package demo_abstract;

public class Developer extends Employee{
    private int overtimeHours;

    public Developer() {
    }

    public Developer(int id, String name, String email, int salary, int overtimeHours) {
        super(id, name, email, salary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    int calculateSalary() {
        return getBasicSalary() + 200_000 * overtimeHours;
    }

}
