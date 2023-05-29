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
        Master Ivanov = new Master("Ivanov");
        Master Petrov = new Master("Petrov");
        Student Sidorov = new Student("Sidorov");
        jobAgency.registerObserver(Ivanov);
        jobAgency.registerObserver(Petrov);
        jobAgency.registerObserver(Sidorov);

        for (int i = 0; i < 10; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }
}
