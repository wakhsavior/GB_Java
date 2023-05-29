package tasks.Seminar_13.adapter;

public class AdapterST00Info implements SensorTemperature{

    private final SensorTemperature sensorTemperature;
    public AdapterST00Info(SensorTemperature sensorTemperature){
        this.sensorTemperature = sensorTemperature;
    }

//    @Override
//    public int getId() {
//        return sensorTemperature.identifier();
//    }
//
//    @Override
//    public double getTemperature() {
//        return sensorTemperature.temperature();
//    }
//
//    @Override
//    public double getHumidity() {
//        return 0;
//    }
//
//    @Override
//    public double getPressure() {
//        throw new RuntimeException("Method not implemented");
//    }

    @Override
    public int identifier() {
        throw new RuntimeException("Method not implemented");
    }

    @Override
    public double temperature() {
        throw new RuntimeException("Method not implemented");
    }
}
