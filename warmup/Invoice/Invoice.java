public class Invoice {

//    Private Data Members
    private String partNumber;
    private String partDesc;
    private int purQuantity;
    private double price;


//    Constructor
    public Invoice() {
        partNumber = "";
        partDesc = "";
        purQuantity = 0;
        price = 0;

    }

    //    setter
    public void setData_partNum(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setData_partDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public void setData_Quantity(int purQuantity) {
        this.purQuantity = purQuantity;
    }

    public void setData_price(double price) {
        this.price = price;
    }


//    getter
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public int getPurQuantity() {
        return purQuantity;
    }

    public double getPrice() {
        return price;
    }

//    Calculating the invoice amount
    public double getInvoiceAmount() {
        if (purQuantity < 0) {
            purQuantity = 0;
        } else if (price < 0) {
            price = 0.0;
        }

        return purQuantity * price;
    }
    // Isa Ebrahim (0xRar)
}
