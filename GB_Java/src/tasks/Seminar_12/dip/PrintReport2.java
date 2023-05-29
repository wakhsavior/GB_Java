package tasks.Seminar_12.dip;

import java.util.List;

public class PrintReport2 implements Print{
    public void printToFile(List<ReportItem> items){
        System.out.println("Output to printer");
        for (ReportItem item: items){
            System.out.format("priter %s - %f \n\r", item.getDescription(),item.getAmount());
        }

    }

    @Override
    public void print(List<ReportItem> items) {
        printToFile(items);
    }
}
