package tasks.Seminar_11.presenters;

import tasks.Seminar_05_OOP.Tailable;
import tasks.Seminar_11.models.Table;
import tasks.Seminar_11.models.TableModel;

import java.util.Collection;

public class BookingPresentor {
    private Collection<Table> tables;
    private final Model model;
    private  final View view;
    public BookingPresentor(Model model, View view){
        this.model = model;
        this.view = view;
    }

    /**
     * Получение списка всех столиков
     */
    public void loadTables(){
        tables = model.loadTables();
    }

    /**
     * Отобразить список всех столиков
     */
    public void updateView(){
        view.showTables(tables);
    }
}
