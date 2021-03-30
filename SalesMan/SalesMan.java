// Part A

public class SalesMan {
    private String FirstName, LastName;
    private double SalesAmount;

    public SalesMan(String FN, String LN, double SA) {
        FirstName = FN;
        LastName = LN;
        SalesAmount = SA;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSalesAmount(double salesAmount) {
        SalesAmount = salesAmount;
    }



    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getSalesAmount() {
        return SalesAmount;
    }
}
