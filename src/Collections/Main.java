package Collections;

import Generics.GenericList;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("w");
        list.add("e");
        for (var item : list)
            System.out.println(item);
    }
}
