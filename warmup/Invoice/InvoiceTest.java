public class InvoiceTest {
    public static void main(String[] args) {
        Invoice hardware = new Invoice();
        hardware.setData_partNum("DSDF824");
        hardware.setData_partDesc("i9 9900k");
        hardware.setData_Quantity(2);
        hardware.setData_price(564.00);
        hardware.getInvoiceAmount();

        System.out.println("Part Number: "+hardware.getPartNumber());
        System.out.println("Part Descreption: "+hardware.getPartDesc());
        System.out.println("Quantity: "+hardware.getPurQuantity());
        System.out.println("Price: "+hardware.getPrice());
        System.out.println("Invoice Amount: "+hardware.getInvoiceAmount());
        
    }
    // Isa Ebrahim (0xRar)
}
