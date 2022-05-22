import lombok.*;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

interface InterfaceGeneric<T> {
    void add(T obj);
    void remove(T obj);
    void print();
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class DemoGenericInterface<T> implements InterfaceGeneric<T> {

    List<T> list;

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public void print() {
        for (T obj : list) {
            System.out.println(obj + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        InterfaceGeneric<Integer> integerInterfaceGeneric = new DemoGenericInterface<>(new ArrayList<>());

        //Add
        integerInterfaceGeneric.add(1);
        integerInterfaceGeneric.add(2);
        integerInterfaceGeneric.add(3);

        integerInterfaceGeneric.print();

        //xóa
        integerInterfaceGeneric.remove(3);
        integerInterfaceGeneric.print();

        //List Student
        InterfaceGeneric<Student> studentInterfaceGeneric = new DemoGenericInterface<>(new ArrayList<>());
        studentInterfaceGeneric.add(new Student("Nguyễn Văn A", 22));
        studentInterfaceGeneric.add(new Student("Nguyễn Văn B", 25));

    }
}
