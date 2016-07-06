/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.courses;

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
public class Courses {

    public static class to_courses {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int upload_status;
        public final String school_level_id;
        public final String course;

        public to_courses(int id, String created_at, String updated_at, String created_by, String updated_by, int status, int upload_status, String school_level_id, String course) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.upload_status = upload_status;
            this.school_level_id = school_level_id;
            this.course = course;
        }
    }

    public static void add_data(to_courses to_courses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into courses("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",upload_status"
                    + ",school_level_id"
                    + ",course"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:upload_status"
                    + ",:school_level_id"
                    + ",:course"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_courses.created_at)
                    .setString("updated_at", to_courses.updated_at)
                    .setString("created_by", to_courses.created_by)
                    .setString("updated_by", to_courses.updated_by)
                    .setNumber("status", to_courses.status)
                    .setNumber("upload_status", to_courses.upload_status)
                    .setString("school_level_id", to_courses.school_level_id)
                    .setString("course", to_courses.course)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Courses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_courses to_courses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update courses set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",school_level_id= :school_level_id "
                    + ",course= :course "
                    + " where id='" + to_courses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_courses.created_at)
                    .setString("updated_at", to_courses.updated_at)
                    .setString("created_by", to_courses.created_by)
                    .setString("updated_by", to_courses.updated_by)
                    .setNumber("status", to_courses.status)
                    .setNumber("upload_status", to_courses.upload_status)
                    .setString("school_level_id", to_courses.school_level_id)
                    .setString("course", to_courses.course)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Courses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_courses to_courses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from courses  "
                    + " where id='" + to_courses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Courses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_courses> ret_data(String where) {
        List<to_courses> datas = new ArrayList();

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
                    + ",school_level_id"
                    + ",course"
                    + " from courses"
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
                String school_level_id = rs.getString(8);
                String course = rs.getString(9);

                to_courses to = new to_courses(id, created_at, updated_at, created_by, updated_by, status, upload_status, school_level_id, course);
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
