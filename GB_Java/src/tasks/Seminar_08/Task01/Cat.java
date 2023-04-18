package tasks.Seminar_08.Task01;

public class Cat implements Runner{
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

//    @Override
//    public boolean jump(int height) {
//        if(height<=maxJump){
//            System.out.printf("%s успешно перепрыгнул через стену %d м.\n", name,height);
//            return true;
//        }else{
//            System.out.printf("%s не смог перепрыгнуть через стену %d м.\n", name,height);
//            return false;
//        }
//
//
//    }
//
//    @Override
//    public boolean run(int distance) {
//        if(distance<=maxRun){
//            System.out.printf("%s успешно пробежат трэк %d м.\n", name,distance);
//            return true;
//        }else{
//            System.out.printf("%s не смог пробежать трэк %d м.\n", name,distance);
//            return false;
//        }
//    }
}
