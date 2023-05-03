package tasks.Lesson_11.Ex002Phonebook.Core.MVP;
import tasks.Lesson_11.Ex002Phonebook.Core.Models.Contact;
public class Presenter {
    
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void LoadFromFile() {
        model.load();

        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
        }
    }

    public void add() {
        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));
    }

    public void remove() {
        if (view.requestYN("Хотите удалить текущий контакт? [y/n]")){
            model.removeContact();
        }else {
            boolean cont = true;
            while(cont) {
                Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
                cont = model.setContact(contact);
            }
            model.removeContact(model.currentContact());
        }

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currentContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
        }
    }

    public void saveToFile() {
        model.save();
        view.sendMessage("Файл успешно сохранен.");
    }

    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);                
            }else{
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
            }
        }
    }

    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);  
            }else {
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
            }
        }
    }
    public boolean update(){

        if (view.requestYN("Хотите изменить текущий контакт? [y/n]")){
            Contact newContact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
            if (model.updateCurrentContact(newContact)){
                view.sendMessage("Контакт успешно обновлен.");
            }
        }else {
            boolean cont = true;
            while(cont) {
                Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
                cont = !model.setContact(contact);
            }
            Contact newContact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
            model.updateCurrentContact(newContact);
            view.sendMessage("Контакт успешно обновлен.");
        }
        return true;
    }
    public void setContact(){
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
        model.setContact(contact);
    }
}
