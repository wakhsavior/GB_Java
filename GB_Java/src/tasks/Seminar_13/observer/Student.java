package tasks.Seminar_13.observer;

public class Student extends Employee {


    public Student(String name, VacancyType vacancyType,double salary) {
        super.name = name;
        super.personType = "Студент";
        super.vacancyType = vacancyType;
        super.salary = salary;
    }
}
