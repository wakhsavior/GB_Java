package tasks.Seminar_13.adapter;

public class MeteoStore {
    boolean save(MeteoSensor meteoSensor){
        System.out.printf("Сохранение данных по метеодатчику\n[%d]: temperature - %f",
                meteoSensor.getId(), meteoSensor.getTemperature());
        return true;
    }
//    boolean save(MeteoSensor meteoSensor){
//        System.out.printf("Сохранение данных по метеодатчику\n[%d]: temperature - %f",
//                meteoSensor.getId(), meteoSensor.getTemperature());
//        return true;
//    }
}
