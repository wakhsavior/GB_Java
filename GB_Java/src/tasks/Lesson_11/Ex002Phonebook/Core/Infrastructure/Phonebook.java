package tasks.Lesson_11.Ex002Phonebook.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import tasks.Lesson_11.Ex002Phonebook.Core.Models.Contact;

public class Phonebook {

    private List<Contact> contacts;
    
    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    // create
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // read
    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }
    public int contactIndex(Contact contact){

        for (Contact curContact: contacts
             ) {
            if (curContact.equals(contact)) return contacts.indexOf(curContact);
        }
        return -1;
    }

    public boolean updateContact(int index, Contact contact){
        if (this.contains(index)){
            contacts.get(index).setFirstName(contact.firstName);
            contacts.get(index).setLastName(contact.lastName);
            contacts.get(index).setDescription(contact.description);
            return true;
        }else {
            return false;
        }

    }

    // delete
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        if (contacts.size()>0) return contacts;
        else return null;
    }


    public int count() {
        return contacts.size();
    }



}
