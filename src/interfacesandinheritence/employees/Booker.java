package interfacesandinheritence.employees;

import java.util.Objects;

    public class Booker implements Employee {
        private final String name;
        private final String surname;

        public Booker (String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public void printJobTitle() {
            System.out.println("Job title of " + name + " " + surname + " is: "
                    + EmployeeTitle.Booker.getJobTitle());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Booker)) return false;
            Booker that = (Booker) o;
            return name.equals(that.name) && surname.equals(that.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname);
        }

        @Override
        public String toString() {
            return "Booker{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }