package tasks.Seminar_11.presenters;

import tasks.Seminar_11.models.Table;

import java.util.Collection;

public interface View {
    /**
     * Отобразить список всех столиков
     * @param tables
     */
    void showTables(Collection<Table> tables);
    /**
     * Установить наблюдателя, отслеживающего действие пользователя
     * @param observer
     */
    void setObserver(ViewObserver observer);
    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    void showReservationTableStatus(int reservationId);

    /**
     * Выводит все резервы для списка столов
     * @param tables
     */
    void showReservations(Collection<Table> tables);
}
