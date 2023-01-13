package interfacesandinheritence.employees;
import java.util.Objects;

public class Director implements Employee {
    private final String name;
    private final String surname;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title of " + name + " " + surname + " is: " + EmployeeTitle.Director.getJobTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        Director director = (Director) o;
        return name.equals(director.name) && surname.equals(director.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}