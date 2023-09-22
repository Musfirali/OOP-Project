
package mullahfuels;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Diesel extends Stock{

    private double price;
    private double qty;

    Database obj = new Database();


    public void setprice() {
        try {
          String priceString = obj.displayAll("SELECT Diesel FROM Table1");
           price = Double.parseDouble(priceString);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Petrol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public String getPrice() {
////        setprice();
//        return price;
//    }

    @Override
    public double price() {
       return price;
    }
    public void setQty() {
        try {
          String qtyString = obj.displayAll("SELECT DieselTank FROM Stock");
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


