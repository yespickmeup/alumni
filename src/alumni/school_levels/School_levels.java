/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.school_levels;

import alumni.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class School_levels {

    public static class to_school_levels {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int upload_status;
        public final String level;

        public to_school_levels(int id, String created_at, String updated_at, String created_by, String updated_by, int status, int upload_status, String level) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.upload_status = upload_status;
            this.level = level;
        }
    }

    public static void add_data(to_school_levels to_school_levels) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into school_levels("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",upload_status"
                    + ",level"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:upload_status"
                    + ",:level"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_school_levels.created_at)
                    .setString("updated_at", to_school_levels.updated_at)
                    .setString("created_by", to_school_levels.created_by)
                    .setString("updated_by", to_school_levels.updated_by)
                    .setNumber("status", to_school_levels.status)
                    .setNumber("upload_status", to_school_levels.upload_status)
                    .setString("level", to_school_levels.level)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(School_levels.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_school_levels to_school_levels) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update school_levels set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",level= :level "
                    + " where id='" + to_school_levels.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_school_levels.created_at)
                    .setString("updated_at", to_school_levels.updated_at)
                    .setString("created_by", to_school_levels.created_by)
                    .setString("updated_by", to_school_levels.updated_by)
                    .setNumber("status", to_school_levels.status)
                    .setNumber("upload_status", to_school_levels.upload_status)
                    .setString("level", to_school_levels.level)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(School_levels.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_school_levels to_school_levels) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from school_levels  "
                    + " where id='" + to_school_levels.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(School_levels.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_school_levels> ret_data(String where) {
        List<to_school_levels> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",upload_status"
                    + ",level"
                    + " from school_levels"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                int status = rs.getInt(6);
                int upload_status = rs.getInt(7);
                String level = rs.getString(8);

                to_school_levels to = new to_school_levels(id, created_at, updated_at, created_by, updated_by, status, upload_status, level);
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
