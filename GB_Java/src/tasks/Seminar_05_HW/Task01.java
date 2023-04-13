package tasks.Seminar_05_HW;

import java.util.*;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Task01 {
    private static Map<String, ArrayList<String>> users = new HashMap<>();
    private static Scanner scn = new Scanner(System.in);
    private static StringBuilder strbldr = new StringBuilder();

    public static void addPhone(){
        String user = createStrUser(requestUser());
        ArrayList<String> phones = users.get(user);
        System.out.println("Enter phone number: ");
        String strPhone = scn.nextLine();
        phones.add(strPhone);
    }
    private static ArrayList<String> requestUser(){
        ArrayList<String> data = new ArrayList<>();
        System.out.println("Enter First Name: ");
        String firstName = scn.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = scn.nextLine();
        data.add(firstName);
        data.add(lastName);
        return data;

    }
    public static String createStrUser(ArrayList<String> user){
        strbldr.setLength(0);
        strbldr.append(user.get(0));
        strbldr.append("_");
        strbldr.append(user.get(1));
        return strbldr.toString();

    }
    public static void createUser(){
        ArrayList<String> phones = new ArrayList<>();
        users.putIfAbsent(createStrUser(requestUser()),phones);
    }

    public static void printPhoneBook(){

        for (String user:users.keySet()) {
            System.out.println(user + " - " + users.get(user).toString());

        }

    }
    public static void main(String[] args) {
        boolean cont = true;
        while (cont) {
            System.out.println("You can add user - press \"u\"");
            System.out.println("You can add phone to current user - press \"a\"");
            System.out.println("You can exit - press \"x\"");
            System.out.println("You can print phone book - press \"p\"");
            Object item = scn.nextLine();
            if (item instanceof  String) {
                if (item.equals("u")) {
                    createUser();
                }else if (item.equals("a")) {
                    addPhone();
                }else if (item.equals("p")) {
                    printPhoneBook();
                }else if (item.equals("x")) {
                    System.out.println("Exit from Phone Book!");
                    cont = false;
                }
            }





        }
    }

}
