package Employee;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Nguyễn Thị C";
        employee.age = 26;
        employee.address = "Hà Nội";
        employee.totalHours = 230;
        employee.printInfo();

        Employee employee1 = new Employee("Bành Thị Lành", 40, "Bắc Cạn", 250);
        employee1.printInfo();


    }
}
