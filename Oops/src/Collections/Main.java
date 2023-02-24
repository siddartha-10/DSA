package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        System.out.println(list2);
    }
}
