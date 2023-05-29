package tasks.Seminar_13.adapter;

public interface MeteoSensor {
    int getId(); //идентификатор датчика
    double getTemperature(); // Температура
    double getHumidity(); //Влажность
    double getPressure(); //Давление
}
