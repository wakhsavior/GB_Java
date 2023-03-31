//package tasks.Seminar_02;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class Task03 {
//    private static final Logger LOG = Log.log(Task3.class.getName());
//
//    public static void write(String path, String filename) {
//        try {
//            FileWriter in = new FileWriter(filename);
//            String[] data = getFilesInFolder(path);
//            for (String datum : data) {
//                in.append(datum);
//            }
//            LOG.log(Level.INFO, "Recorded! :)");
//            throw new RuntimeException("Error");
//
//        } catch (IOException e) {
//            LOG.log(Level.INFO, e.getMessage());
//            throw new RuntimeException(e);
//    }
///*
//    public static String[] getFilesInFolder(String path) {
//        File dir = new  File(path);
//        String[] result new String[0];
//        Files[] files;
//        if(dir.isDirectory()){
//            files = dir.listFiles();
//            if (files != null){
//                result = new String[files.length];
//                for (int i = 0;i files.length;i++){
//                    String name = files[i].getName();
//                    if (files[i].isFile()){
//                        System.out.println("\tFile - " + name);
//                    }
//                    else {
//                        System.out.println("Directory - " + name);
//                    }
//                    result[i] = name;
//
//                }
//            }
//        }
//        else {
//            System.out.println(dir.getName() + "not a directory");
//        }
//                return result;
//  */
//    }
//
//}
