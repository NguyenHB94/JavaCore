package DemoBuilderpattern;

public class Test {
    public static void main(String[] args) {
        Person person = Person.builder().withName("Nguyễn Văn A").withAge(23).build();
        System.out.println(person);

        Person person1 = Person.builder().withAge(15).withPhone("012345678").withEmail("abc@gmail.xyz").withName("Văn Bá").build();
        System.out.println(person1);
    }
}
