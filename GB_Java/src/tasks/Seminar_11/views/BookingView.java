package tasks.Seminar_11.views;

import tasks.Seminar_11.models.Reservation;
import tasks.Seminar_11.models.Table;
import tasks.Seminar_11.presenters.View;
import tasks.Seminar_11.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действие пользователя
     *
     * @param observer
     */
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /**
     * Обобразить список всех столиков
     *
     * @param tables
     */
    public void showTables(Collection<Table> tables) {
        for (Table table : tables
        ) {
            System.out.println(table);
        }
    }

    /**
     * Действие клиента (Пользователь как-то забронировал столик)
     *
     * @param reservationDate Дата бронирования
     * @param tableNum        Номер столика
     * @param name            Имя клиента
     */
    public void reservationTable(Date reservationDate, int tableNum, String name) {
        this.observer.onReservationTable(reservationDate, tableNum, name);
    }

    /**
     * Действие клиента (пользователь что-то сделал для изменения бронирования)
     * Изменение бронирования
     *
     * @param oldReservation  Старый номер бронирования
     * @param reservationDate новая дата бронирования
     * @param tableNum        номер столика
     * @param name            Имя Клиента
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNum, String name) {
        reservationTable(reservationDate, tableNum, name);
        removeReservation(oldReservation);
    }

    public void removeReservation(int reservationId) {
        this.observer.delReservationTable(reservationId);
    }

    /**
     * Отобразить результат резервирования столика
     *
     * @param reservationId
     */
    public void showReservationTableStatus(int reservationId) {
        if (reservationId > 0) {
            System.out.printf("Столик успешно забронирован.\nНомер брони: #%d\n", reservationId);
        } else {
            System.out.printf("Ошибка бронирования.\nПовторите попытку.\n");
        }

    }

    public void showReservations(Collection<Table> tables) {
        for (Table table : tables
        ) {
            for (Reservation reservation : table.getReservations()
            ) {
                System.out.printf("Столик #%d: Номер резерва %d для клиента: %s\n", table.getNumber(), reservation.getId(), reservation.getName());
            }
        }
    }
}
