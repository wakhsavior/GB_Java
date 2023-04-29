package tasks.Seminar_11.presenters;

import tasks.Seminar_11.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
   Collection<Table> loadTables();
   int reservationTable(Date reservationDate, int tableNo, String name);
   void removeReservationTable(int reservationId);
}
