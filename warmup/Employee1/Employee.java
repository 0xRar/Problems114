public class Employee {
    private String name = new String();
    private int idNumber;
    private String department = new String();
    private String position = new String();

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int IdNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}
