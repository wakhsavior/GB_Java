package tasks.Seminar_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            SEMINAR 03
     */
        tasks.Seminar_03.Task01.sortedArray();


        ArrayList<String> poetry = new ArrayList<>();
        poetry.add("Поэзия");
        poetry.add("Евгений Онегин");
        poetry.add("Облако в штанах");
        ArrayList<String> prose = new ArrayList<>();
        prose.add("Проза");
        prose.add("Война и мир");
        prose.add("Мертвые души");

        tasks.Seminar_03.Task02.fillCatalog(poetry);
        tasks.Seminar_03.Task02.fillCatalog(prose);


        tasks.Seminar_03.Task03.delete();
        tasks.Seminar_03.Task04.calcPlanets();
    }
}
