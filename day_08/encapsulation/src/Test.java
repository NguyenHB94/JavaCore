public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.setId(1);
        person.setName("Lê Văn Luyện");
        person.setAge(24);
        person.setEmail("luyen@gmail.com");

        System.out.println(person);
        System.out.println(person.getName());

        Person person1 = new Person(2,"Lê Văn Luyện2", 23, "luyen2@gmail.com");

        System.out.println(person1);
        System.out.println(person1.getEmail());

        person1.setAge(28);
        System.out.println(person1.getAge());


    }
}
