package tasks.Seminar_13.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * Агенство по поиску сотрудников
 */
public class JobAgency implements Publisher{
    private List<Observer> observers = new ArrayList<>();
    private List<Vacancy> vacancies = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        for (Vacancy vacancy: vacancies){
            observer.receiveOffer(vacancy);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(String nameCompany, Vacancy vacancy) {
        for (Vacancy curVacancy: vacancies) {
            for (Observer observer: observers){
                observer.receiveOffer(vacancy);
            }
        }

    }

    @Override
    public void registerVacancy(Vacancy vacancy) {
        vacancies.add(vacancy);
        for (Observer observer: observers){
            observer.receiveOffer(vacancy);
        }

    }

    @Override
    public void removeVacancy(Vacancy vacancy) {
        vacancies.remove(vacancy);
    }
}
