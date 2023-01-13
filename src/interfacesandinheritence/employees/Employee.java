package interfacesandinheritence.employees;

public interface Employee {
    void printJobTitle();
    public enum EmployeeTitle {
        Director("Director"),
        Booker("Booker"),
        Worker("Worker");
        private final String jobTitle;

        EmployeeTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getJobTitle() {
            return jobTitle;
        }
    }
}
