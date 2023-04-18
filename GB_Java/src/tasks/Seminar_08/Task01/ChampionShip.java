package tasks.Seminar_08.Task01;

public class ChampionShip {
    public static void main(String[] args) {

        // Бегуны
        Runner[] runners = {
                new Cat("Cat1", 1500,3),
        new Cat("Cat2", 1700,2),
        new Robot("Robot1", 10000,0),
        new Robot("Robot2", 5000,5),
        new Human("Human1",2500,1),
        new Human("Human2",3500,1)
        };

        // Препятствия
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(2),
                new Track(2000),
                new Wall(1),
                new Track(3000),
                new Wall(3)
        };
        for (Runner runner: runners
             ) {
            for(Obstacle obstacle: obstacles){
                if (obstacle instanceof Track){
                    if(!runner.run(obstacle.getLength())) break;
                } else if (obstacle instanceof Wall) {
                    if (!runner.jump(obstacle.getHeight())) break;
                }

            }
        }
    }
}
