package tasks.Lesson_11.Ex002Phonebook.Core.Models;

import java.time.LocalDate;

public class Contact  implements Comparable<Contact> {
    public LocalDate date;
    public String firstName;
    public String lastName;
    public String company;
    public String phone;
    //public Email email;
    //public String email;
    public String description;

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }
// добавить возможность создания объектов с бОльшим
    // количеством параметров


    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact)obj;
        return this.firstName.equals(t.firstName)
                && this.lastName.equals(t.lastName);
    }

    @Override
    public int compareTo(Contact o) {
        return (this.lastName.compareTo(o.lastName));
    }
}
