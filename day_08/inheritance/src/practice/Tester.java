package practice;

public class Tester extends Employee {

    private int error;

    public Tester() {
    }

    public Tester(int error) {
        this.error = error;
    }

    public Tester(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error = error;
    }

    //Method

    public int calculateSalary(){
        int salaryTester = super.getSalaryBasic() + error * 50000;
        return salaryTester;
    }
}
