//package tasks.Seminar_02;
//
///*
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//*/
//
//public class Task01 {
//    public static String nString_chars(int N, char c1, char c2) {
//        StringBuilder str = new StringBuilder();
//
//        for (int i = 0; i < N/2; i++ ){
//            str.append(c1);
//            str.append(c2);
//        }
//        if (N % 2 != 0){
//            str.append(c1);
//        }
//        return str.toString();
//    }
//}
