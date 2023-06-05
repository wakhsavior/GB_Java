package tasks.Seminar_13.observer;

public class Master extends Employee {

    public Master(String name, VacancyType vacancyType,double salary) {
        super.name = name;
        super.salary = salary;
        super.personType = "Специалист";
        super.vacancyType = vacancyType;
    }


}
