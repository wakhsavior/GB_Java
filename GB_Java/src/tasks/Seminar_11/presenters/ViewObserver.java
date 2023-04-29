package tasks.Seminar_11.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date reservationDate, int tableNum, String name);
    void delReservationTable(int reservationId);
}
