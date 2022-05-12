package service;

import model.Employee;

import java.util.*;

public class EmployeeService {
    //Tạo list nhân viên để quản lý
    private ArrayList<Employee> employees;

    //Khỏi tạo data từ constructor
    public EmployeeService() {
        init();
    }

    //Khỏi rạo data
    private void init() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "Nguyễn Văn A", "a@gmail.com", 14_000_000));
        employees.add(new Employee(2, "Trần Văn B", "b@gmail.com", 6_000_000));
        employees.add(new Employee(3, "Tống Văn C", "c@gmail.com", 8_000_000));
        employees.add(new Employee(4, "Đinh Văn D", "d@gmail.com", 11_000_000));
    }

    //Trả về danh sách nhân viên
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    //In ra thông tin nhân viên
    public void printInfo(ArrayList<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    //Thêm nhân viên mới
    public Employee createEmployee() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập email: ");
        String email = sc.nextLine();

        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(rd.nextInt(5, 100), name, email, salary);

        //Thêm vào danh sách để quản lý
        employees.add(employee);

        return employee;
    }

    //Tìm kiếm theo tên
    public ArrayList<Employee> findByName(String name) {//name trùng tên dẫn đến trả về nhiều đối tượng >> dùng arraylisst
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e : employees ) {
            if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(e);
            }
        }
        return list;
    }

    //Tìm kiếm theo id
    public Employee findById(int id) {//id chỉ trả về 1 đối tượng >> kiểu trả về Employee
        for (Employee e: employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    //Xóa id
    public void deleteEmployee(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
            }
        }
    }

    //Tìm kiếm nhân viên theo lương
    public ArrayList<Employee> findBySalary(int minSalary, int maxSalary) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getSalary() < maxSalary && e.getSalary() > minSalary) {
                list.add(e);
            }
        }
        return list;
    }

}
