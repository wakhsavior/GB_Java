package tasks.Seminar_12.isp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<BasePaymentService> services = new ArrayList<>();
        services.add(new InternetPaymentService());
        services.add(new CustomPaymentService());

        for (BasePaymentService service: services) {
            if (service instanceof PayablePhonePumber){
                ((PayablePhonePumber)service).payPhoneNumber(1000);
                break;
            }


        }
    }
}
