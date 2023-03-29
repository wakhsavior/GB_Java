package tasks.Seminar_01_HW;

import java.util.Scanner;

public class Task03 {
//Реализовать простой калькулятор Использовать сканнер: Scanner scanner = new Scanner(System.in);
// String enter = scanner.next(); int i = Integer.parseInt(enter);
    private static int calcAB(int A, int B, String oper){
        if (oper.equals("+")) {
            return A + B;
        } else if (oper.equals("-")) {
            return A - B;
        } else if (oper.equals("*")) {
            return A * B;
        }
        else if (oper.equals("/")) {
            if (B == 0) {
                return 0;
            }
            return A / B;
            }
        else return 0;
    }
    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        int aNum = 0;
        int bNum = 0;
        String oper = "";
        boolean flag = false;
        while(flag ==false){
            System.out.println("Enter number A: ");
            if (sc.hasNextInt() == true) {
                flag = true;
                aNum = sc.nextInt();
            }
            else {
                System.out.println("You enter not a number - " + sc.next());
            }
        }
        flag = false;
        while(flag ==false){
            System.out.println("Enter number B: ");
            if (sc.hasNextInt() == true) {
                flag = true;
                bNum = sc.nextInt();
            }
            else {
                System.out.println("You enter not a number - " + sc.next());
            }
        }
        flag = false;
        while(flag ==false){
            System.out.println("Enter operator + - / *: ");
            if (sc.hasNext() == true) {
                oper = sc.next();
                if (oper.equals("+")  || oper.equals("-") || oper.equals("*") || oper.equals("/") ) {
                    flag = true;
                }
                else {
                    System.out.println("You enter not an operator - " + oper);
                }
            }
            else {
                System.out.println("You enter not an operator - " + sc.next());
            }
        }
        sc.close();
        StringBuilder sb = new StringBuilder();
        sb.append(aNum);
        sb.append(" ");
        sb.append(oper);
        sb.append(" ");
        sb.append(bNum);
        sb.append(" = ");
        sb.append(calcAB(aNum,bNum,oper));
        System.out.println(sb.toString());
    }
}
