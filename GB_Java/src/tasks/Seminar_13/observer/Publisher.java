package tasks.Seminar_13.observer;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String nameCompany, Vacancy vacancy);
    void registerVacancy(Vacancy vacancy);
    void removeVacancy(Vacancy vacancy);

}
