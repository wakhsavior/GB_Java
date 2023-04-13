//package tasks.Seminar_05_HW;
//
///*
//    С лекции, для сотрировки по значению, доработать для использования.
//    Используется компаратор, который можно свернуть.
// */
//
//import java.util.*;
//
//public class Compare {
//    Map<String, Integer> map =
//            Map.of("Анна", 3, "Борис", 2, "Вова", 2, "Гена", 5, "Дима", 1);
//    Map<String, Integer> result = new LinkedHashMap<>();
//
//    List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
//        entries.sort(comparator); // Comparator.comparing(o -> (o.getValue())) OR Map.Entry.comparingByValue()
//
//
//        for (Map.Entry<String, Integer> entry:  entries) {
//        result.put(entry.getKey(), entry.getValue());
//    }
//
//        System.out.println(result);
//}
//
//    static Comparator<Map.Entry<String, Integer>> comparator = new Comparator<>() {
//        @Override
//        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//            return o1.getValue().compareTo(o2.getValue());
//        }
//    };
//
//}
