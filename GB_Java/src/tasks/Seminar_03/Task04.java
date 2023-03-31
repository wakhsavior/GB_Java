package tasks.Seminar_03;

import java.util.ArrayList;

/*

Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.

 */
public class Task04 {

    private static void printPlanetCount(ArrayList<String> planets, ArrayList<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venera");
        planets.add("Mercury");
        planets.add("Venera");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Earth");

        ArrayList<String> planetsUniq= new ArrayList<>();
        ArrayList<Integer> countPlanets = new ArrayList<>();
        for (String planet: planets) {
            int posit = planetsUniq.indexOf((planet));
            if (posit >= 0){
                countPlanets.set(posit,countPlanets.get(posit) + 1);
            }
            else {
                planetsUniq.add(planet);
                countPlanets.add(1);
            }

        }
        for (int i = 0; i < countPlanets.size();i++){
            System.out.println(planetsUniq.get(i) + " - " + countPlanets.get(i));
        }
        printPlanetCount(planetsUniq,countPlanets);

    }
}
