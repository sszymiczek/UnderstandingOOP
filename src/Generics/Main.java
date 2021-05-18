package Generics;

public class Main {
    public static void main(String[] args) {
        var users = new GenericList<Instructor>();
        Utils.printUsers(users);
    }
}
