import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class MyClass<T> {
    private T obj;

    //Method generic
    public void demoMethod(T data) {
        System.out.println("Demo method generic");
        System.out.println("Data" + data);
    }

    //public void demoMethod1(U data) {

    //}

    public static void main(String[] args) {
        //Khỏi tạo đối tượng kiểu Integer
        MyClass<Integer> myClass = new MyClass<>(10);
        System.out.println(myClass.getObj());
        myClass.demoMethod(15);

        //Khỏi tạo đối tượng kiểu String
        MyClass<String> myClass1 = new MyClass<>("Hello");
        System.out.println(myClass1.getObj());
        myClass1.demoMethod("Good");

        //Khỏi tạo đối tượng kế thừa từ Number
        MyClass<? extends Number> myClass2 = new MyClass<>(15.4);
        System.out.println(myClass2.getObj());
        //myClass2.demoMethod(15.5);

        //Khỏi tạo đối tượng Student
        MyClass<Student> studentMyClass = new MyClass<>(new Student("Nguyễn Văn A", 23));
        System.out.println(studentMyClass.getObj());
    }
}
