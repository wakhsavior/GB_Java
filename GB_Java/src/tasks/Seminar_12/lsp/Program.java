package tasks.Seminar_12.lsp;

public class Program {

    // Тип S будет подтипом Т тогда и только тогда,
    // когда каждому объекту oS типа S соответствует некий объект oT типа T таким образом,
    // что для всех программ P,
    // реализованных в терминах T, поведение P не будет меняться, если oT заменить на oS.
    public static void main(String[] args) {
        Bird oT1 = new Bird(); // T
        Bird oT2 = new Bird(); // T
        Bird oT3 = new Bird(); // T
        Bird oT4 = new Bird(); // T
        Duck oS1  = new Duck(); // S
        Duck oS2  = new Duck(); // S
        Duck oS3  = new Duck(); // S
        Duck oS4  = new Duck(); // S
        Penguin oS5 = new Penguin(); // Не соответствует критерию LSP

        processFly(oT1);
        processFly(oT2);
        processFly(oT3);
        processFly(oT4);
        processFly(oS1);
        processFly(oS2);
        processFly(oS3);
        processFly(oS4);
        processFly(oS5);


    }
    public static void processFly(Bird bird){
        try {
            bird.fly();
        }
        catch (Exception e){
            System.out.println("Птице не удалось полетать.");
        }
    }
}
