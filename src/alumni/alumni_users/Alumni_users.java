/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.alumni_users;

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
public class Alumni_users {

    public static class to_alumni_users {

        public final int id;
        public final String first_name;
        public final int approved;
        public final int role_id;
        public final String email;
        public final String suffix_name;
        public final String middle_name;
        public final int activated;
        public final String last_name;
        public final String role;
        public final int active;
        public final String civil_status;
        public final String gender;
        public final String date_of_birth;
        public final String blood_type;
        public final String home_address;
        public final String level;
        public final String year;
        public final String course;
        public final String major;
        public final String image;

        public to_alumni_users(int id, String first_name, int approved, int role_id, String email, String suffix_name, String middle_name, int activated, String last_name, String role, int active, String civil_status, String gender, String date_of_birth, String blood_type, String home_address, String level, String year, String course, String major, String image) {
            this.id = id;
            this.first_name = first_name;
            this.approved = approved;
            this.role_id = role_id;
            this.email = email;
            this.suffix_name = suffix_name;
            this.middle_name = middle_name;
            this.activated = activated;
            this.last_name = last_name;
            this.role = role;
            this.active = active;
            this.civil_status = civil_status;
            this.gender = gender;
            this.date_of_birth = date_of_birth;
            this.blood_type = blood_type;
            this.home_address = home_address;
            this.level = level;
            this.year = year;
            this.course = course;
            this.major = major;
            this.image = image;
        }
    }

    public static void add_data(List<to_alumni_users> to_alumni_users1, int new_only,int last_id) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
           
            PreparedStatement stmt = conn.prepareStatement("");
            if (new_only == 1) {
                for (to_alumni_users to_alumni_users : to_alumni_users1) {
                    if (to_alumni_users.id > last_id) {
                        String s0 = "insert into alumni_users("
                                + "id"
                                + ",first_name"
                                + ",approved"
                                + ",role_id"
                                + ",email"
                                + ",suffix_name"
                                + ",middle_name"
                                + ",activated"
                                + ",last_name"
                                + ",role"
                                + ",active"
                                + ",civil_status"
                                + ",gender"
                                + ",date_of_birth"
                                + ",blood_type"
                                + ",home_address"
                                + ",level"
                                + ",year"
                                + ",course"
                                + ",major"
                                + ",image"
                                + ")values("
                                + ":id"
                                + ",:first_name"
                                + ",:approved"
                                + ",:role_id"
                                + ",:email"
                                + ",:suffix_name"
                                + ",:middle_name"
                                + ",:activated"
                                + ",:last_name"
                                + ",:role"
                                + ",:active"
                                + ",:civil_status"
                                + ",:gender"
                                + ",:date_of_birth"
                                + ",:blood_type"
                                + ",:home_address"
                                + ",:level"
                                + ",:year"
                                + ",:course"
                                + ",:major"
                                + ",:image"
                                + ")";

                        s0 = SqlStringUtil.parse(s0)
                                .setNumber("id", to_alumni_users.id)
                                .setString("first_name", to_alumni_users.first_name)
                                .setNumber("approved", to_alumni_users.approved)
                                .setNumber("role_id", to_alumni_users.role_id)
                                .setString("email", to_alumni_users.email)
                                .setString("suffix_name", to_alumni_users.suffix_name)
                                .setString("middle_name", to_alumni_users.middle_name)
                                .setNumber("activated", to_alumni_users.activated)
                                .setString("last_name", to_alumni_users.last_name)
                                .setString("role", to_alumni_users.role)
                                .setNumber("active", to_alumni_users.active)
                                .setString("civil_status", to_alumni_users.civil_status)
                                .setString("gender", to_alumni_users.gender)
                                .setString("date_of_birth", to_alumni_users.date_of_birth)
                                .setString("blood_type", to_alumni_users.blood_type)
                                .setString("home_address", to_alumni_users.home_address)
                                .setString("level", to_alumni_users.level)
                                .setString("year", to_alumni_users.year)
                                .setString("course", to_alumni_users.course)
                                .setString("major", to_alumni_users.major)
                                .setString("image", to_alumni_users.image)
                                .ok();

                        stmt.addBatch(s0);
                    }

                }
            } else {
                for (to_alumni_users to_alumni_users : to_alumni_users1) {
                    String s0 = "insert into alumni_users("
                            + "id"
                            + ",first_name"
                            + ",approved"
                            + ",role_id"
                            + ",email"
                            + ",suffix_name"
                            + ",middle_name"
                            + ",activated"
                            + ",last_name"
                            + ",role"
                            + ",active"
                            + ",civil_status"
                            + ",gender"
                            + ",date_of_birth"
                            + ",blood_type"
                            + ",home_address"
                            + ",level"
                            + ",year"
                            + ",course"
                            + ",major"
                            + ",image"
                            + ")values("
                            + ":id"
                            + ",:first_name"
                            + ",:approved"
                            + ",:role_id"
                            + ",:email"
                            + ",:suffix_name"
                            + ",:middle_name"
                            + ",:activated"
                            + ",:last_name"
                            + ",:role"
                            + ",:active"
                            + ",:civil_status"
                            + ",:gender"
                            + ",:date_of_birth"
                            + ",:blood_type"
                            + ",:home_address"
                            + ",:level"
                            + ",:year"
                            + ",:course"
                            + ",:major"
                            + ",:image"
                            + ")";

                    s0 = SqlStringUtil.parse(s0)
                            .setNumber("id", to_alumni_users.id)
                            .setString("first_name", to_alumni_users.first_name)
                            .setNumber("approved", to_alumni_users.approved)
                            .setNumber("role_id", to_alumni_users.role_id)
                            .setString("email", to_alumni_users.email)
                            .setString("suffix_name", to_alumni_users.suffix_name)
                            .setString("middle_name", to_alumni_users.middle_name)
                            .setNumber("activated", to_alumni_users.activated)
                            .setString("last_name", to_alumni_users.last_name)
                            .setString("role", to_alumni_users.role)
                            .setNumber("active", to_alumni_users.active)
                            .setString("civil_status", to_alumni_users.civil_status)
                            .setString("gender", to_alumni_users.gender)
                            .setString("date_of_birth", to_alumni_users.date_of_birth)
                            .setString("blood_type", to_alumni_users.blood_type)
                            .setString("home_address", to_alumni_users.home_address)
                            .setString("level", to_alumni_users.level)
                            .setString("year", to_alumni_users.year)
                            .setString("course", to_alumni_users.course)
                            .setString("major", to_alumni_users.major)
                            .setString("image", to_alumni_users.image)
                            .ok();

                    stmt.addBatch(s0);
                }
            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Alumni_users.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_alumni_users to_alumni_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update alumni_users set "
                    + "first_name= :first_name "
                    + ",approved= :approved "
                    + ",role_id= :role_id "
                    + ",email= :email "
                    + ",suffix_name= :suffix_name "
                    + ",middle_name= :middle_name "
                    + ",activated= :activated "
                    + ",last_name= :last_name "
                    + ",role= :role "
                    + ",active= :active "
                    + " where id='" + to_alumni_users.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("first_name", to_alumni_users.first_name)
                    .setNumber("approved", to_alumni_users.approved)
                    .setNumber("role_id", to_alumni_users.role_id)
                    .setString("email", to_alumni_users.email)
                    .setString("suffix_name", to_alumni_users.suffix_name)
                    .setString("middle_name", to_alumni_users.middle_name)
                    .setNumber("activated", to_alumni_users.activated)
                    .setString("last_name", to_alumni_users.last_name)
                    .setString("role", to_alumni_users.role)
                    .setNumber("active", to_alumni_users.active)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_users.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_all() {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from alumni_users  "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_users.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_alumni_users to_alumni_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from alumni_users  "
                    + " where id='" + to_alumni_users.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_users.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_alumni_users> ret_data(String where) {
        List<to_alumni_users> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",first_name"
                    + ",approved"
                    + ",role_id"
                    + ",email"
                    + ",suffix_name"
                    + ",middle_name"
                    + ",activated"
                    + ",last_name"
                    + ",role"
                    + ",active"
                    + ",civil_status"
                    + ",gender"
                    + ",date_of_birth"
                    + ",blood_type"
                    + ",home_address"
                    + ",level"
                    + ",year"
                    + ",course"
                    + ",major"
                    + ",image"
                    + " from alumni_users"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String first_name = rs.getString(2);
                int approved = rs.getInt(3);
                int role_id = rs.getInt(4);
                String email = rs.getString(5);
                String suffix_name = rs.getString(6);
                String middle_name = rs.getString(7);
                int activated = rs.getInt(8);
                String last_name = rs.getString(9);
                String role = rs.getString(10);
                int active = rs.getInt(11);
                String civil_status = rs.getString(12);
                String gender = rs.getString(13);
                String date_of_birth = rs.getString(14);
                String blood_type = rs.getString(15);
                String home_address = rs.getString(16);
                String level = rs.getString(17);
                String year = rs.getString(18);
                String course = rs.getString(19);
                String major = rs.getString(20);
                String image = rs.getString(21);

                to_alumni_users to = new to_alumni_users(id, first_name, approved, role_id, email, suffix_name, middle_name, activated, last_name, role, active, civil_status, gender, date_of_birth, blood_type, home_address, level, year, course, major, image);
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
