package mullahfuels;

import java.sql.*;

public class Database {

    public Statement connect() throws SQLException, ClassNotFoundException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        String url = "jdbc:ucanaccess://Price.accdb";

        Connection conn = DriverManager.getConnection(url);
        Statement st = conn.createStatement();
        return st;
    }
    
    
    //UPDATE
    
    public void update(String query) throws SQLException, ClassNotFoundException {
        Statement st;
        st = connect();
        st.executeUpdate(query);
        
    }
    
    public ResultSet executeQuery(String query) throws SQLException, ClassNotFoundException {
        Statement st = connect();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }
    
    

    String displayAll(String query) throws ClassNotFoundException, SQLException {
        Statement st;
        st = connect();

//            String sql="query";
        ResultSet rs = st.executeQuery(query);
        if (query == "SELECT Petrol FROM Table1") {
            if (rs.next()) {
                String result = rs.getString("Petrol");
                return result;
            }
            return null; // Return null if no result is found
        } else if (query == "SELECT Diesel FROM Table1") {
            if (rs.next()) {
                String result = rs.getString("Diesel");
                return result;
            }
            return null;
        } else if (query == "SELECT EngineOil FROM Table1") {
            if (rs.next()) {
                String result = rs.getString("EngineOil");
                return result;
            }
            return null;
        } else if (query == "SELECT BrakeOil FROM Table1") {
            if (rs.next()) {
                String result = rs.getString("BrakeOil");
                return result;
            }
            return null;
        } else if (query == "SELECT GearOil FROM Table1") {
            if (rs.next()) {
                String result = rs.getString("GearOil");
                return result;
            }
            return null;
        } else {
            System.out.println("Colomun not found");
        }

        if (query == "SELECT PetrolTank FROM Stock") {
            if (rs.next()) {
                String result = rs.getString("PetrolTank");
                return result;
            }
            return null; // Return null if no result is found
        } else if (query == "SELECT DieselTank FROM Stock") {
            if (rs.next()) {
                String result = rs.getString("DieselTank");
                return result;
            }
            return null;
        } else if (query == "SELECT EngineOilBoxes FROM Stock") {
            if (rs.next()) {
                String result = rs.getString("EngineOilBoxes");
                return result;
            }
            return null;
        } else if (query == "SELECT GearOilBoxes FROM Stock") {
            if (rs.next()) {
                String result = rs.getString("GearOilBoxes");
                return result;
            }
            return null;
        } else if (query == "SELECT BrakeOilBoxes FROM Stock") {
            if (rs.next()) {
                String result = rs.getString("BrakeOilBoxes");
                return result;
            }
            return null;
        }
        
        if (query == "SELECT ID FROM CustomerInfo") {
            if (rs.next()) {
                String result = rs.getString("ID");
                return result;
            }
            return null; // Return null if no result is found
        } else if (query == "SELECT Name FROM CustomerInfo") {
            if (rs.next()) {
                String result = rs.getString("Name");
                return result;
            }
            return null;
        }
        return null;
    }
    //END OF READING FILES
    
    //START OF insert OPERATION
       void insert(String query) throws SQLException, ClassNotFoundException
    {
        Statement st;
        st=connect();
        
        st.executeUpdate(query);
        
//        st.executeUpdate("INSERT into CustomerInfo(Name,Email,CarModel,CarNumber,Product,Qty, Amount, Card#) VALUES('"+"3"+"','"+"Huma"+"','"+"xyz"+"')");
        System.out.println("Row is added");
    }
}