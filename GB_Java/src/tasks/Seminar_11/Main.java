package tasks.Seminar_11;

import tasks.Seminar_11.models.TableModel;
import tasks.Seminar_11.presenters.BookingPresenter;
import tasks.Seminar_11.views.BookingView;

import java.util.Date;

public class Main {
    /**
     * TODO: Домашняя работа, нужно реализовать метод изменения текущего бронирования
     * @param args
     */
    public static void main(String[] args) {

        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        view.reservationTable(new Date(),2,"Станислав");
        view.reservationTable(new Date(),1,"Федор");
        view.reservationTable(new Date(),3,"Татьяна");
        view.reservationTable(new Date(),4,"Игорь");
        bookingPresenter.showAll();

        view.changeReservationTable(1001, new Date(), 3, "Станислав");
        bookingPresenter.showAll();

    }
}
