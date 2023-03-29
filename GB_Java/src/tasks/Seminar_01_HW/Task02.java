package tasks.Seminar_01_HW;

public class Task02 {
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
