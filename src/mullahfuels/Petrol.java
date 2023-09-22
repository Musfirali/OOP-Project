package mullahfuels;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
   
public class Petrol extends Stock {
    
    private double price;
    private double qty;
    Database obj = new Database();

    public void setprice() {
        try {
          String priceString = obj.displayAll("SELECT Petrol FROM Table1");
           price = Double.parseDouble(priceString);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Petrol.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
@Override
    public double price() {
        return price;
    }
    public void setQty() {
        try {
          String qtyString = obj.displayAll("SELECT PetrolTank FROM Stock");
           qty = Double.parseDouble(qtyString);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Petrol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@Override
    public double qty() {
        return qty;
    }
} 
