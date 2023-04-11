package tasks.Seminar_06;

import java.util.Objects;

public class Cat {
    public String name;
    public int age;
    public boolean isIll;
    public String diagnoses;
    public Owner owner;   // Ссылается на другой класс

    public Cat(String name, int age, boolean isIll, String diagnoses, Owner owner) {
        this.name = name;
        this.age = age;
        this.isIll = isIll;
        this.diagnoses = diagnoses;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("Cat {Name = %s, age = %s, isIll = %s, diagnoses = %s, Owner = %s, hashcode - %s}", name, age, isIll, diagnoses, owner,hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

//        return Objects.equals(this,obj);
        Cat cat = (Cat)obj;

        return cat.name.equals(this.name) && cat.age == this.age && cat.isIll == this.isIll &&
                cat.diagnoses.equals(this.diagnoses) && cat.owner.name.equals(this.owner.name);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null)? 0: name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnoses == null)? 0: diagnoses.hashCode());

        return result;
    }
}
