//package tasks.Seminar_02;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//// который запишет эту строку в простой текстовый файл, обработайте исключения.
//
//
//public class Task02 {
//
//    public static void writeStringToFile(String file, String str){
//        try {
//            FileWriter in = new FileWriter(file);
//            in.append(str);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            throw new RuntimeException(e);
//        } finally {
////            try {
////                in.close();
////            }
//        }
//
//    }
//
//    public static String makeString (int N, String str) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < N; i++) {
//            builder.append(str);
//        }
//        return builder.toString();
//    }
//
//
//
//}
