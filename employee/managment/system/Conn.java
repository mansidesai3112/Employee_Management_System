package employee.managment.system;
import java.sql.*;
public class Conn 
{
    Connection c=null;
    Statement s;
    public Conn()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employee","postgres","roman123");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}