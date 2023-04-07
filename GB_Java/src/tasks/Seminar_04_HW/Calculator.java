package tasks.Seminar_04_HW;

import java.util.*;

public class Calculator {
    //Реализовать простой калькулятор Использовать сканнер: Scanner scanner = new Scanner(System.in);
// String enter = scanner.next(); int i = Integer.parseInt(enter);

    private static LinkedList<Integer> numbers = new LinkedList<>();
    private static LinkedList<String> operators = new LinkedList<>();
    private static LinkedList<String> formula = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);
    private static StringBuilder sb = new StringBuilder();


    private static int calculateResult() {
        int summ = numbers.pollFirst();
        String tmpOper = operators.pollFirst();
        while (!tmpOper.equals("=")) {
            int tmpNum = numbers.pollFirst();
            if (tmpOper.equals("+")) {
                summ = summ + tmpNum;
            } else if (tmpOper.equals("-")) {
                summ = summ - tmpNum;
            } else if (tmpOper.equals("*")) {
                summ = summ * tmpNum;
            } else if (tmpOper.equals("/")) {
                if (tmpNum == 0) {
                    System.out.println("Division by Zero!");
                    return 0;
                }
                summ = summ / tmpNum;
            }
            tmpOper = operators.pollFirst();
        }
        return summ;
    }

    private static void printFormula() {
        if (sb.length() > 0) {
            sb.delete(0, sb.length() - 1);
        }
        int lenght = formula.size();
        for (int i = 0; i < lenght; i++) {
            sb.append(formula.get(i) + " ");
        }
        System.out.println("Formula: " + sb.toString());
    }

    private static void addNumber(int number){
        numbers.add(number);
        formula.add(Integer.toString(number));
    }

    private static void removeNumber(){
        numbers.removeLast();
        formula.removeLast();
    }

    private static void addOperator(String oper){
        operators.add(oper);
        formula.add(oper);
    }

    private static void removeOperator(){
        operators.removeLast();
        formula.removeLast();
    }

    private static Object requestItem() {    // Параметр boolItem определяет, что мы запрашиваем, true - цифру, false - оператор
        int num;
        String operator = "";
        while (true) {
            System.out.println("Enter item: ");

            if (sc.hasNextInt() == true) {
                num = sc.nextInt();
                return num;
            } else {
                operator = sc.next();
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") ||
                        operator.equals("/") || operator.equals("=") || operator.equals("b") || operator.equals("x")) {
                    return operator;
                }
            }
            System.out.println("Please, Enter a correct data!");

        }
    }


    public static void calculator() {


        boolean numberOrOperator = true;
        System.out.println("In this porgram you can continuesly enter a numbers or operators.\nPress Enter after writing number or operator.\n" +
                "This calculator support only this operators: \"+\", \"-\", \"*\", \"/\".\n" +
                "If you want to finish enter and receive result write \"=\".\nIf you want to cancel previous enter - write \"b\".\n" +
                "If you want to exit - write \"x\"");

        boolean cont = true;
        boolean number = true;
        while (cont) {

            Object item = requestItem();

            if (item instanceof  String) {
                if (item.equals("b")) {
                    if (!number && numbers.size() != 0) {
                        removeNumber();
                        printFormula();
                        number = true;
                    } else if (number && operators.size() != 0 ) {
                        removeOperator();
                        printFormula();
                        number = false;
                    } else {
                        System.out.println("Nothing to Delete!");
                    }


                } else if (item.equals("x")) {
                    System.out.println("Exit from calculator!");
                    cont = false;

                } else if(item.equals("=") && number && numbers.size() > 0){
                    removeOperator();
                    addOperator((String) item);
                    addNumber(calculateResult());
                    printFormula();
                    cont = false;
                }
                else if (item.equals("=") && !number) {
                    addOperator((String) item);
                    addNumber(calculateResult());
                    printFormula();
                    cont = false;
                } else if (!number) {
                    addOperator((String) item);
                    printFormula();
                    number = true;
                } else if (number && numbers.size() > 0) {
                    removeOperator();
                    addOperator((String) item);
                    printFormula();
                } else{
                    System.out.println("Please, Enter a correct data!");
                }

            } else if (item instanceof  Integer && number) {
                addNumber((Integer) item);
                printFormula();
                number = false;
            } else {
                printFormula();
                System.out.println("Please, Enter a correct data!");
            }
        }
        System.out.println("Exit from calculator!");
    }
}
