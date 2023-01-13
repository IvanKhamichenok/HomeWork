package interfacesandinheritence.employees;

import java.util.Objects;

public class Worker implements Employee {
    private final String name;
    private final String surname;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void printJobTitle() {
        System.out.println("Job title of " + name + " " + surname + " is: " + EmployeeTitle.Worker.getJobTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return name.equals(worker.name) && surname.equals(worker.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}