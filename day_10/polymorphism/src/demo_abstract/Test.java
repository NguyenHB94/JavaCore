package demo_abstract;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //Không thể trực tiếp khỏi tạo đối tượng từ class abstract
        //Employee employee = new Employee();

        //Khỏi tạo đối tượng từ class Developer
        Developer developer = new Developer(1, "Nguyễn Văn A", "a@gmail.com", 2_000_000, 50);
        developer.register();
        System.out.println(developer.calculateSalary());

        //Khỏi tạo đối tượng từ class Tester
        Tester tester = new Tester(2, "Nguyễn Văn B", "b@gmail.com", 3_000_000, 40);
        tester.register();
        System.out.println(developer.calculateSalary());

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(developer);
        employees.add(new Developer(3, "Trần c", "c@gmail.com", 2_500_000, 30));
        employees.add(tester);
        employees.add(new Tester(4, "Trần D", "d@gmail.com", 4_000_000, 20));

        //sử dụng vòng lặp đê tính lương
        int totalSalary = 0;
        for (Employee employee : employees) {
            System.out.println("Tên = " + employee.getName() + " - lương = " + employee.calculateSalary());
            totalSalary += employee.calculateSalary();

        }
        System.out.println("Tổng lương phải trả cho nhân viên = " + totalSalary);

        //Sắp xếp theo tên
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

        //Sắp xếp theo thực lĩnh
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.calculateSalary() - o2.calculateSalary();
            }
        });
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee + " lương = " + employee.calculateSalary());
        }
    }






}
