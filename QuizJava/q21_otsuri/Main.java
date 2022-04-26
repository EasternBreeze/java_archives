package otsuri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Main {

    public static void main(String[] args) {
        List<People> list = new ArrayList<>(Arrays.asList(
                new People("A", 30), //
                new People("B", 15), //
                new People("C", 22)));

        System.out.println("Start");
        System.out.println(list.toString());
        System.out.println();

        int tag = 0;
        while (list.get(tag % 3).payTo(list.get((tag + 1) % 3))) {
            System.out.printf("Turn:%d [%s >> %s]\n%s\n\n",
                    tag + 1,
                    list.get(tag % 3).name,
                    list.get((tag + 1) % 3).name,
                    list);
            tag++;
        }

        System.out.println("End");
        System.out.println(list.toString());
    }
}
