package tasks.Seminar_11.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter;
    private final int number;
    private final Collection<Reservation> reservations = new ArrayList<>();
    {
        number = ++counter;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return String.format("Столик #%d", number);
    }
}
