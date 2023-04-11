package tasks.Seminar_06;

import java.util.Objects;

public class Owner {
    public String name;
    public String phoneNumber;
    public Owner(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Owner {Name = %s, phoneNumber = %s}",name,phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return Objects.equals(this,obj);
    }
}
