package interfacesandinheritence.employees;

public class EmployeeDemo {

        public static void main(String[] args) {
            Employee[] employees = {new Director("Name1", "Surname1"),
                    new Worker("Name2", "Surname2"),
                    new Booker("Name3", "Surname3")};
            getEmployeesJobTitles(employees);
        }

        private static void getEmployeesJobTitles(Employee[] employees) {
            for (Employee employee : employees) {
                employee.printJobTitle();
            }
        }
    }

