package tasks.Seminar_08.Task01;

/**
 * Базовый интерфейс бегун
 */
public interface Runner {

    String getName();

    int getMaxRun();

    int getMaxJump();
    /**
     * прыжок
     * @param height высота прыжка
     * @return результат прыжка
     */

    default boolean jump(int height){
        if(height<=getMaxJump()){
            System.out.printf("%s успешно перепрыгнул через стену %d м.\n", getName(),height);
            return true;
        }else{
            System.out.printf("%s не смог перепрыгнуть через стену %d м. Остался\n", getName(),height);
            return false;
        }
    }

    /**
     * <tu
     * @param distance Дистанция бегуна
     * @return результат забега. Удалось ли преодолеть
     */
    default boolean run (int distance){
        if(distance<=getMaxRun()){
            System.out.printf("%s успешно пробежат трэк %d м.\n", getName(),distance);
            return true;
        }else{
            System.out.printf("%s не смог пробежать трэк %d м. Остался\n", getName(),distance);
            return false;
        }
    }
}
