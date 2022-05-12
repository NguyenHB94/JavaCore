package demo_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMethod {

    public static void main(String[] args) {

        //tạo arraylist
        ArrayList<String> names = new ArrayList<>();
        names.add("Cao");
        names.add("Huy");
        names.add("Hòa");

        //in ra các phần tử
        System.out.println(Arrays.toString(names.toArray()));

        //thêm phần tử vào arraylist
        names.add(1,"Nam");
        System.out.println(Arrays.toString(names.toArray()));

        names.remove(3);
        System.out.println(Arrays.toString(names.toArray()));

        //tạo arraylist khác
        ArrayList<String> namesOther = new ArrayList<>();
        namesOther.add("Hoa");
        namesOther.add("Duyên");

        //thêm arraylist mới vào arraylist ban đầu
        names.addAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));

        //Kiểm tra 1 phần tử có nằm trong arraylist hay không
        System.out.println(names.contains("Hoa"));
        System.out.println(names.contains("Duyên"));

        names.add("Nam");
        System.out.println(names.lastIndexOf("Nam"));

//        names.clear();
//        System.out.println(names.size());
//        System.out.println(names.isEmpty());

        names.retainAll(namesOther);
        System.out.println(Arrays.toString(names.toArray()));
    }

}
