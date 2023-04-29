package tasks.Seminar_11.models;

import tasks.Seminar_11.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return Столики
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public Collection<Table> getTables() {
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNum Номер столика
     * @param name Имя бронирующего
     * @return
     */
    public int reservationTable(Date reservationDate, int tableNum, String name){
        for (Table table : tables){
            if (table.getNumber() == tableNum){
                Reservation reservation = new Reservation(reservationDate,name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
//        throw new RuntimeException("Невозможно забронировать столик.");
    }

    /**
     * Удаление брони по номеру брони
     * @param reservationId Номер брони для удаления
     */
    public void removeReservationTable(int reservationId){
        boolean delSuccess = false;
        for (Table table : tables
        ) {
            for (Reservation reservation : table.getReservations()
            ) {
                if (reservation.getId() == reservationId){
                    table.getReservations().remove(reservation);
                    System.out.printf("Столик #%d: Номер резерва %d для клиента: %s успешно удален.\n", table.getNumber(), reservation.getId(), reservation.getName());
                    break;
                } else {
                    System.out.printf("Нет брони %d для удаления.\n",reservationId);
                }

            }
        }
    }
}
