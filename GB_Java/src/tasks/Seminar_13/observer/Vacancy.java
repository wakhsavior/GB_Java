package tasks.Seminar_13.observer;

public class Vacancy {
    private VacancyType vacancyType;
    private String name;
    private double salary;
    private Company company;

    public double getSalary() {
        return salary;
    }

    public Vacancy(Company company, VacancyType vacancyType, String name, double salary) {
        this.company = company;
        this.vacancyType = vacancyType;
        this.name = name;
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    @Override
    public String toString() {
        return String.format("%s created Vacancy %s type - %s salary - %f",this.company, this.name, this.vacancyType, this.salary);

    }
}
