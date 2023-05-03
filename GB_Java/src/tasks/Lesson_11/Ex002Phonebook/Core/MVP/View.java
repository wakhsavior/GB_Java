package tasks.Lesson_11.Ex002Phonebook.Core.MVP;

public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName();
    void setLastName(String value);
    String getDescription();
    void setDescription(String value);
    boolean requestYN(String string);
    void sendMessage(String string);
    //
}
