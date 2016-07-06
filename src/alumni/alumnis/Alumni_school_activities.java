/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.alumnis;

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
public class Alumni_school_activities {

    public static class to_alumni_school_activities {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int upload_status;
        public final String alumni_no;
        public final String student_no;
        public  String involvement;

        public to_alumni_school_activities(int id, String created_at, String updated_at, String created_by, String updated_by, int status, int upload_status, String alumni_no, String student_no, String involvement) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.upload_status = upload_status;
            this.alumni_no = alumni_no;
            this.student_no = student_no;
            this.involvement = involvement;
        }

        public String getInvolvement() {
            return involvement;
        }

        public void setInvolvement(String involvement) {
            this.involvement = involvement;
        }
        
    }

    public static void add_data(to_alumni_school_activities to_alumni_school_activities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into alumni_school_activities("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",upload_status"
                    + ",alumni_no"
                    + ",student_no"
                    + ",involvement"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:upload_status"
                    + ",:alumni_no"
                    + ",:student_no"
                    + ",:involvement"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumni_school_activities.created_at)
                    .setString("updated_at", to_alumni_school_activities.updated_at)
                    .setString("created_by", to_alumni_school_activities.created_by)
                    .setString("updated_by", to_alumni_school_activities.updated_by)
                    .setNumber("status", to_alumni_school_activities.status)
                    .setNumber("upload_status", to_alumni_school_activities.upload_status)
                    .setString("alumni_no", to_alumni_school_activities.alumni_no)
                    .setString("student_no", to_alumni_school_activities.student_no)
                    .setString("involvement", to_alumni_school_activities.involvement)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_school_activities.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_alumni_school_activities to_alumni_school_activities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update alumni_school_activities set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",alumni_no= :alumni_no "
                    + ",student_no= :student_no "
                    + ",involvement= :involvement "
                    + " where id='" + to_alumni_school_activities.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumni_school_activities.created_at)
                    .setString("updated_at", to_alumni_school_activities.updated_at)
                    .setString("created_by", to_alumni_school_activities.created_by)
                    .setString("updated_by", to_alumni_school_activities.updated_by)
                    .setNumber("status", to_alumni_school_activities.status)
                    .setNumber("upload_status", to_alumni_school_activities.upload_status)
                    .setString("alumni_no", to_alumni_school_activities.alumni_no)
                    .setString("student_no", to_alumni_school_activities.student_no)
                    .setString("involvement", to_alumni_school_activities.involvement)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_school_activities.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_alumni_school_activities to_alumni_school_activities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from alumni_school_activities  "
                    + " where id='" + to_alumni_school_activities.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_school_activities.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_alumni_school_activities> ret_data(String where) {
        List<to_alumni_school_activities> datas = new ArrayList();

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
                    + ",alumni_no"
                    + ",student_no"
                    + ",involvement"
                    + " from alumni_school_activities"
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
                String alumni_no = rs.getString(8);
                String student_no = rs.getString(9);
                String involvement = rs.getString(10);

                to_alumni_school_activities to = new to_alumni_school_activities(id, created_at, updated_at, created_by, updated_by, status, upload_status, alumni_no, student_no, involvement);
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
