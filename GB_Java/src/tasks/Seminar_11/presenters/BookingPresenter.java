package tasks.Seminar_11.presenters;

import tasks.Seminar_11.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private Collection<Table> tables;
    private final Model model;
    private final View view;


    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Получение списка всех столиков
     */
    public void loadTables() {
        tables = model.loadTables();
    }

    /**
     * Отобразить список всех столиков
     */
    public void updateView() {
        view.showTables(tables);
    }
    public void showAll(){
        this.view.showReservations(tables);
    }

    public void updateReservationTableStatus(int reservationId) {
        view.showReservationTableStatus(reservationId);
    }

    @Override
    public void onReservationTable(Date reservationDate, int tableNum, String name) {
        int reservationID = model.reservationTable(reservationDate, tableNum, name);
        updateReservationTableStatus(reservationID);
    }

    @Override
    public void delReservationTable(int reservationId) {
        model.removeReservationTable(reservationId);
    }
}
