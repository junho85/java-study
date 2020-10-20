import java.io.Serializable;

public class EmployeeBean implements Serializable {
    private String firstName;
    private String lastName;
    private int startYear;
    private double payRate;

    public EmployeeBean() {
    }

    public EmployeeBean(String firstName, String lastName, int startYear, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        this.payRate = payRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}