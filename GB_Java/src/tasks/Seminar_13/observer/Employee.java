package tasks.Seminar_13.observer;

public abstract class Employee implements Observer {
    protected String name;
    protected double salary;
    protected VacancyType vacancyType;
    protected String personType;

    @Override
    public void receiveOffer( Vacancy vacancy) {
        if (this.vacancyType == vacancy.getVacancyType()) {
            if (this.salary < vacancy.getSalary()) {
                System.out.printf("%s %s >>> Мне нужна эта работа! [%s - %s -  %f]\n",
                        personType, name, vacancy.getCompany(), vacancy.getVacancyType(), salary);
                this.salary = vacancy.getSalary();
            } else {
                System.out.printf("%s %s >>> Я найду работу получше! [%s - %s -  %f]\n",
                        personType, name, vacancy.getCompany(), vacancy.getVacancyType(), salary);
            }
        }
    }
}
