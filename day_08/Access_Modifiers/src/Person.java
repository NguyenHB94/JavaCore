public class Person {
    private String name;
    public int age;
    protected String email;
    int salary;

    public Person() {
    }

    public Person(String name, int age, String email, int salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Person person = new Person("Nguyễn Văn A", 25, "A@gmail.com", 1000000);
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.email);
        System.out.println(person.salary);
    }
}
