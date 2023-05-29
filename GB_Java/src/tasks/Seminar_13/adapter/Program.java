package tasks.Seminar_13.adapter;

public class Program {
    public static void main(String[] args) {
        ST500Info st500Info_1 = new ST500Info(44223);
        MS200 ms200_1 = new MS200(11553);
        MeteoStore meteoStore = new MeteoStore();
        meteoStore.save(ms200_1);
//        meteoStore.save(new AdapterST00Info(st500Info_1));

    }
}
