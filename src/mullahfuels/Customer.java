package mullahfuels;

import java.sql.SQLException;

public class Customer {
    private String name;
    private String email;
    private String vehicleType;
    private String vehicleNumber;
    private String product;
    private double qty;
    private double amount;
    private String cardNumber;
    private double cashPaid;

    public void setCashPaid(double cashPaid) {
        this.cashPaid = cashPaid;
    }
    
    private Database obj = new Database();
    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;

    }
public void insertCustomerInfo() throws SQLException, ClassNotFoundException {
String query = "INSERT into CustomerInfo (Name, Email, CarModel, CarNumber, Product, Qty, Amount, CashPaid, CardNumber) " +
               "VALUES ('" + this.name + "', '" + this.email + "', '" + this.vehicleType + "', '" + this.vehicleNumber + "', '" +
               this.product + "', " + this.qty + ", " + this.amount + ", '" + this.cashPaid + "', '" + this.cardNumber + "')";
    obj.insert(query);
}


}
