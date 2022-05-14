package demo_abstract;

public class Tester extends Employee{

    private int error;

    public Tester() {
    }

    public Tester(int id, String name, String email, int salary, int error) {
        super(id, name, email, salary);
        this.error = error;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    @Override
    int calculateSalary() {
        return getBasicSalary() + 50_000 * error;
    }
}
