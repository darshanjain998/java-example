import java.sql.*;

class eg2
{
  public static void main(String gg[])
  {
    try
    {
      Class.forName("com.mysql.cj.jdbc.Driver");
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    try
    {
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","darshan","Darshan@1409");
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from country where Population >= 100000000 order by name   limit 10 ");
      Statement stmt2 = con.createStatement();
      ResultSet rs2 = stmt2.executeQuery("select count(*) from country");
      rs2.next();
      while(rs.next())
      {
        String name = rs.getString("Name");
        int population = rs.getInt("Population");
        System.out.println(name+"    "+population);
      }
      System.out.println(rs2.getInt(1));
      con.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
