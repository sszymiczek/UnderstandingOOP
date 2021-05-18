package Generics;

public class Utils {
    public static <T extends Comparable> T max(T first, T second){
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? extends User> users) { //WILDCARD // extends to read and super to add

    }
}
