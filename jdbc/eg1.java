import java.sql.*;

public class eg1 {
   public static void main(String[] args) {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } catch(ClassNotFoundException e) {
         System.out.println("Class not found "+ e);
      }
      try {
         Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/wedding_money","darshan", "Darshan@1409");
         
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM ronak");
         System.out.println("id  name    job");
         
         while (rs.next()) {
            int id = rs.getInt("amount");
            String name = rs.getString("date_time");
            int job = rs.getInt("installment");
            System.out.println(id+"   "+name+"    "+job);
         }
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
   }
}