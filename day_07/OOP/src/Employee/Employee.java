package Employee;

public class Employee {
    public String name;
    public int age;
    public String address;
    public int totalHours;

    public Employee() {
    }

    public Employee(String name, int age, String address, int totalHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.totalHours = totalHours;
    }

    public void printInfo(){
        System.out.println(name + "-" + age + "-" + address + "-" + getSalary(totalHours) );
    }

    public int getSalary(int totalHours) {
        int salary;
        int salarydefault = totalHours * 200000;
        if (totalHours < 100) {
            salary = salarydefault;
        } else if (totalHours >= 100 && totalHours < 200) {
            salary = salarydefault + salarydefault * 10 / 100;
        } else {
            salary = salarydefault + salarydefault * 20 / 100;
        }
        return salary;
    }

}
