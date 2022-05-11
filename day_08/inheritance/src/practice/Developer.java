package practice;

public class Developer  extends Employee{

    private int overtimeHours;

    public Developer() {
    }

    public Developer(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Developer(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    //Method
    public int caculateSalary() {
        int salaryDeveloper = super.getSalaryBasic() + overtimeHours * 200000;
        return salaryDeveloper;
    }

    public void showInfo(){
        System.out.println("Thông tin nhân viên: ");
        System.out.println("Id: " + super.getId() + "\tTên: " + super.getName() + "\tTuổi: " + super.getAge() + "\tSđt: "
         + "\tEmail: " + super.getEmail() + "\tLương cơ bản: " + super.getSalaryBasic() + "\tSố giờ OT: " + overtimeHours  );
    }

}
