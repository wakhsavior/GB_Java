package tasks.Seminar_06_HW;

import tasks.Seminar_06.Cat;

public class Laptop {
    public Brand brand;
    public Color color;

    public Laptop(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("{BrandName: {%s}, Color: {%s}}",brand,color);
    }

    @Override
    public int hashCode() {
        final int prime = 128;
        int result = 1;
        result = prime * result + ((brand == null)? 0: brand.hashCode());
        result = prime * result + ((color == null)? 0: color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;

        }
        Laptop laptop = (Laptop) obj;

        return laptop.brand.equals(this.brand) && laptop.color.equals(this.color);
    }
}
