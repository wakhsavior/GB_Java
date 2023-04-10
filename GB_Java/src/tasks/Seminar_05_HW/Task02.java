package tasks.Seminar_05_HW;

import java.util.*;
import java.util.stream.Stream;

/*
Пусть дан список сотрудников:
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
public class Task02 {
    private static ArrayList<String> people = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                                               "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов", "Петр Чернышов",
"Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова",
            "Петр Лыков", "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов"));

//    private static LinkedHashMap<String,Integer> sortDict(HashMap<String ,Integer> nameMap){
//        return ;
//    }
    public static void main(String[] args) {
        HashMap<String,Integer> names = new HashMap<>();
        LinkedHashMap<String,Integer> sortedNames = new LinkedHashMap<>();

        for (String human: people) {
//            ArrayList<String> names = new ArrayList<>();
            String[] dividedName = human.split(" ");
            if (names.containsKey(dividedName[0])){
                Integer value = names.get(dividedName[0]);
                value++;
                names.put(dividedName[0],value);
            }
            else {
                names.put(dividedName[0], 1);
            }
        }

//        names.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed());
        ArrayList<Integer> arrayNames = new ArrayList<>(names.values());
       Collections.sort(arrayNames, Collections.reverseOrder());
        int i = 0;
        int arrayLength = arrayNames.size();
       while(i < arrayLength){
            for (String name:names.keySet()
                 ) {
                if (names.get(name) == arrayNames.get(i)){
                    sortedNames.put(name,arrayNames.get(i));
                    i++;
                }

            }
        }


//        System.out.println(arrayNames);
        System.out.println(names.toString());
        System.out.println(sortedNames.toString());
//        System.out.println(names.descendingMap().toString());
    }
}
