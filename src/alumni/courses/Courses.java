/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.courses;

import alumni.course_majors.Course_majors;
import alumni.utils.MyConnection;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Courses {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String line = "";
        String cvsSplitBy = ",";

        String csvFilePath = "C:\\Users\\Guinness\\Desktop\\Courses Offered in SPUD...csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            Connection conn = MyConnection.connect();
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] list = line.split(cvsSplitBy);

//                System.out.println("aa: " + list[0] + " course: " + list[1] + " major: " + list[2]);
                int id = 0;
                String created_at = DateType.now();
                String updated_at = DateType.now();
                String created_by = "";
                String updated_by = "";
                int status = 1;
                int upload_status = 0;
                String school_level_id = "0";
                String course = list[1];

//                to_courses co = new to_courses(id, created_at, updated_at, created_by, updated_by, status, upload_status, school_level_id, course);
//                if (!course.isEmpty()) {
//                    add_data(co);
//                }
                try {

                    String s0 = "insert into test_laravel.majors("
                            + " major"
                            + ",level_id"
                            + ",year_id"
                            + ",course_id"
                            + ",status"
                            + ",created_at"
                            + ",updated_at"
                            + ")values("
                            + " :major"
                            + ",:level_id"
                            + ",:year_id"
                            + ",:course_id"
                            + ",:status"
                            + ",:created_at"
                            + ",:updated_at"
                            + ")";

                    s0 = SqlStringUtil.parse(s0)
                            .setString("major", list[2])
                            .setString("level_id", "0")
                            .setString("year_id", "0")
                            .setString("course_id", "0")
                            .setString("status", "1")
                            .setString("created_at", DateType.now())
                            .setString("updated_at", DateType.now())
                            .ok();

                    PreparedStatement stmt = conn.prepareStatement(s0);
                    if (!list[2].isEmpty()) {
                        stmt.execute();
                    }

                    Lg.s(Courses.class, "Successfully Added");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } finally {

                }

            }
        }

    }

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
