package ua.saniok.web.shop.model.to;

import ua.saniok.web.shop.model.CasheConn;
import ua.saniok.web.shop.model.DAO;
import ua.saniok.web.shop.model.entity.DB_User;

import java.sql.*;

/**
 * Created by sAnCho on 01.08.2016.
 */
public class DAO_User implements DAO {
    public DAO_User() {
    }

    public int insert(String login, String email, String passw, String name, String sourname, String dateBirth, int cityKey){
        int i = 0;
        Connection con = null;
        try {
            con = CasheConn.getConnectionUser();
            Statement st = con.createStatement();

            i = st.executeUpdate("insert into users(login, email, passw, firstname, sourname, dateBirth,cityKey) values (" +
                    "'" + login + "','" + email + "','" + passw + "','" + name + "','" + sourname +"','"+ dateBirth +"','"+ cityKey + "')");
        }
        catch (Exception e)
        {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

   public DB_User get(){
       Connection connection = null;
       PreparedStatement pstmt = null;
       ResultSet rS = null;
       DB_User user =null;
       try
       {

           connection = CasheConn.getConnectionGuest();
           pstmt = connection.prepareStatement("SELECT * FROM saniok_siteshop.users");
           System.out.println("The Connection Object is of Class: " + connection.getClass());
           rS = pstmt.executeQuery();
           rS.next();
           user = new DB_User(rS.getInt(1),rS.getString(2),rS.getString(3),rS.getString(4),rS.getString(5),rS.getString(6),rS.getString(7),rS.getString(8),rS.getInt(9));


       }
       catch (Exception e)
       {
           try {
               connection.rollback();
           } catch (SQLException e1) {
               e1.printStackTrace();
           }
           e.printStackTrace();
       }finally {
           try {
               connection.close();
               try {
                   rS.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
       return user;
   }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }
}
