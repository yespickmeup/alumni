/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.users;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import alumni.users.Users.to_users;
import alumni.utils.MyConnection;

/**
 *
 * @author Guinness
 */
public class MyUser {

    public static String user_id;
    public static String user_name;
    public static String user_screen_name;

    public MyUser(String user_id, String user_name, String user_screen_name) {
        MyUser.user_id = user_id;
        MyUser.user_name = user_name;
        MyUser.user_screen_name = user_screen_name;
    }

    public static String getUser_id() {
        if (user_id == null) {
            return "";
        }
        return user_id;
    }

    public static void setUser_id(String user_id) {
        MyUser.user_id = user_id;
    }

    public static String getUser_name() {
        if (user_name == null) {
            return "";
        }
        return user_name;
    }

    public void setUser_name(String user_name) {
        MyUser.user_name = user_name;
    }

    public static String getUser_screen_name() {
        if (user_screen_name == null) {
            return "";
        }
        return user_screen_name;
    }

    public void setUser_screen_name(String user_screen_name) {
        MyUser.user_screen_name = user_screen_name;
    }

    public static List<to_users> ret_data(String where) {
        List<to_users> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",user_name"
                    + ",user_screen_name"
                    + ",password"
                    + ",status"
                    + ",date_added"
                    + " from users"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String user_name1 = rs.getString(2);
                String user_screen_name1 = rs.getString(3);
                String password = rs.getString(4);
                int status = rs.getInt(5);
                String date_added = rs.getString(6);

                to_users to = new to_users(id, user_name1, user_screen_name1, password, status, date_added);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
