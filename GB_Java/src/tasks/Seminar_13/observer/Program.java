package tasks.Seminar_13.observer;

import tasks.Lesson_11.Ex002Phonebook.Core.Models.Contact;

public class Program {
    /**
     * TODO: 1. Доработать приложение , поработать с шаблоном проектирования Observer
     * добавить новый тип соискателей.
     * ** 2. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * ** 3. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);
        Company altex = new Company("Altex", 80000, jobAgency);
        Master Ivanov = new Master("Ivanov",VacancyType.BUILDING,80000);
        Master Petrov = new Master("Petrov",VacancyType.IT,70000);
        Student Sidorov = new Student("Sidorov",VacancyType.STARTCAREER,20000);
        Junior Karasev = new Junior("Karasev",VacancyType.IT,30000);
        Junior Lagutin = new Junior("Latugin",VacancyType.DRIVER,40000);
        jobAgency.registerObserver(Ivanov);
        jobAgency.registerObserver(Petrov);
        jobAgency.registerObserver(Sidorov);
        jobAgency.registerObserver(Karasev);
        jobAgency.registerObserver(Lagutin);


        for (int i = 0; i < 3; i++){
            geekBrains.createVacancy("Instructor", VacancyType.IT);
            google.createVacancy("Java Programmer", VacancyType.IT);
            yandex.createVacancy("Metodolog", VacancyType.IT);
            altex.createVacancy("Driver",VacancyType.DRIVER);
        }
        Master Kruglov = new Master("Kruglov",VacancyType.DRIVER,60000);
        jobAgency.registerObserver(Kruglov);
    }
}
