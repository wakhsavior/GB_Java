package tasks.Seminar_13.observer;

import java.util.Random;

/*
 * Компания
 */
public class Company implements Requester{
    private Random random;
    private String nameCompany;
    private double maxSalary;
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    @Override
    public void createVacancy(String vacancyName, VacancyType vacancyType) {
        double salary = random.nextDouble(3000,maxSalary);
        Vacancy vacancy = new Vacancy(this,vacancyType,vacancyName,salary);
        System.out.println(vacancy);
        jobAgency.registerVacancy(vacancy);

    }

    @Override
    public String toString() {
        return String.format(nameCompany);
    }
}
