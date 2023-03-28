package tasks.Seminar_01;

public class Task3 {

    // вычислить n-трегольное число
    public static int nTriangle(int n){
        int summ = 0;
        for(int i = 1; i<=n; i++){
            summ = summ + i;
            System.out.println(summ);
        }
        return summ;
    }
    // вычислить Факториал числа n
    public static int nFactorial(int n){
        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void primeNumber(int n){
        for (int i = 2; i <= n; i++){
            for (int j = 2; j<= i; j++){
                if (j == i){
                    System.out.println(i);
                }
                if (i % j == 0){
                    break;
                }

            }

        }

    }
}
