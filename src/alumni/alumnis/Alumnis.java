/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.alumnis;

import alumni.utils.DateType;
import alumni.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Alumnis {

    public static class to_alumnis {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int upload_status;
        public final String alumni_no;
        public final String student_no;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String sname;
        public final int gender;
        public final String civil_status;
        public final String bday;
        public final String landline_no;
        public final String email_address;
        public final String cellphone_no;
        public final String graduated_in;
        public final String graduated_on;
        public final String level;

        public final String course;
        public final String major;
        public final String motto_in_life;
        public final String password;
        public final String father_name;
        public final int father_is_alumni;
        public final String father_occupation;
        public final String father_office_address;
        public final String mother_name;
        public final String mother_is_alumni;
        public final String mother_occupation;
        public final String mother_office_address;
        public boolean selected;

        public to_alumnis(int id, String created_at, String updated_at, String created_by, String updated_by, int status, int upload_status, String alumni_no, String student_no, String fname, String mi, String lname, String sname, int gender, String civil_status, String bday, String landline_no, String email_address, String cellphone_no, String graduated_in, String graduated_on, String level, String course, String major, String motto_in_life, String password, String father_name, int father_is_alumni, String father_occupation, String father_office_address, String mother_name, String mother_is_alumni, String mother_occupation, String mother_office_address, boolean selected) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.upload_status = upload_status;
            this.alumni_no = alumni_no;
            this.student_no = student_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.sname = sname;
            this.gender = gender;
            this.civil_status = civil_status;
            this.bday = bday;
            this.landline_no = landline_no;
            this.email_address = email_address;
            this.cellphone_no = cellphone_no;
            this.graduated_in = graduated_in;
            this.graduated_on = graduated_on;
            this.level = level;
            this.course = course;
            this.major = major;
            this.motto_in_life = motto_in_life;
            this.password = password;
            this.father_name = father_name;
            this.father_is_alumni = father_is_alumni;
            this.father_occupation = father_occupation;
            this.father_office_address = father_office_address;
            this.mother_name = mother_name;
            this.mother_is_alumni = mother_is_alumni;
            this.mother_occupation = mother_occupation;
            this.mother_office_address = mother_office_address;
            this.selected = selected;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

    public static void add_data(to_alumnis to_alumnis, List<Alumni_school_activities.to_alumni_school_activities> activities1, List<Alumni_family_members.to_alumni_family_members> members1) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "insert into alumnis("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",upload_status"
                    + ",alumni_no"
                    + ",student_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",gender"
                    + ",civil_status"
                    + ",bday"
                    + ",landline_no"
                    + ",email_address"
                    + ",cellphone_no"
                    + ",graduated_in"
                    + ",graduated_on"
                    + ",level"
                    + ",course"
                    + ",major"
                    + ",motto_in_life"
                    + ",password"
                    + ",father_name"
                    + ",father_is_alumni"
                    + ",father_occupation"
                    + ",father_office_address"
                    + ",mother_name"
                    + ",mother_is_alumni"
                    + ",mother_occupation"
                    + ",mother_office_address"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:upload_status"
                    + ",:alumni_no"
                    + ",:student_no"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:sname"
                    + ",:gender"
                    + ",:civil_status"
                    + ",:bday"
                    + ",:landline_no"
                    + ",:email_address"
                    + ",:cellphone_no"
                    + ",:graduated_in"
                    + ",:graduated_on"
                    + ",:level"
                    + ",:course"
                    + ",:major"
                    + ",:motto_in_life"
                    + ",:password"
                    + ",:father_name"
                    + ",:father_is_alumni"
                    + ",:father_occupation"
                    + ",:father_office_address"
                    + ",:mother_name"
                    + ",:mother_is_alumni"
                    + ",:mother_occupation"
                    + ",:mother_office_address"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumnis.created_at)
                    .setString("updated_at", to_alumnis.updated_at)
                    .setString("created_by", to_alumnis.created_by)
                    .setString("updated_by", to_alumnis.updated_by)
                    .setNumber("status", to_alumnis.status)
                    .setNumber("upload_status", to_alumnis.upload_status)
                    .setString("alumni_no", to_alumnis.alumni_no)
                    .setString("student_no", to_alumnis.student_no)
                    .setString("fname", to_alumnis.fname)
                    .setString("mi", to_alumnis.mi)
                    .setString("lname", to_alumnis.lname)
                    .setString("sname", to_alumnis.sname)
                    .setNumber("gender", to_alumnis.gender)
                    .setString("civil_status", to_alumnis.civil_status)
                    .setString("bday", to_alumnis.bday)
                    .setString("landline_no", to_alumnis.landline_no)
                    .setString("email_address", to_alumnis.email_address)
                    .setString("cellphone_no", to_alumnis.cellphone_no)
                    .setString("graduated_in", to_alumnis.graduated_in)
                    .setString("graduated_on", to_alumnis.graduated_on)
                    .setString("level", to_alumnis.level)
                    .setString("course", to_alumnis.course)
                    .setString("major", to_alumnis.major)
                    .setString("motto_in_life", to_alumnis.motto_in_life)
                    .setString("password", to_alumnis.password)
                    .setString("father_name", to_alumnis.father_name)
                    .setNumber("father_is_alumni", to_alumnis.father_is_alumni)
                    .setString("father_occupation", to_alumnis.father_occupation)
                    .setString("father_office_address", to_alumnis.father_office_address)
                    .setString("mother_name", to_alumnis.mother_name)
                    .setString("mother_is_alumni", to_alumnis.mother_is_alumni)
                    .setString("mother_occupation", to_alumnis.mother_occupation)
                    .setString("mother_office_address", to_alumnis.mother_office_address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            for (Alumni_school_activities.to_alumni_school_activities activities : activities1) {
                String s2 = "insert into alumni_school_activities("
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

                s2 = SqlStringUtil.parse(s2)
                        .setString("created_at", to_alumnis.created_at)
                        .setString("updated_at", to_alumnis.updated_at)
                        .setString("created_by", to_alumnis.created_by)
                        .setString("updated_by", to_alumnis.updated_by)
                        .setNumber("status", to_alumnis.status)
                        .setNumber("upload_status", to_alumnis.upload_status)
                        .setString("alumni_no", to_alumnis.alumni_no)
                        .setString("student_no", to_alumnis.student_no)
                        .setString("involvement", activities.involvement)
                        .ok();

                stmt.addBatch(s2);
            }

            for (Alumni_family_members.to_alumni_family_members member : members1) {
                String s3 = "insert into alumni_family_members("
                        + "created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",upload_status"
                        + ",alumni_no"
                        + ",student_no"
                        + ",name"
                        + ",relation"
                        + ",name_before_married"
                        + ",residence_address"
                        + ",occupation"
                        + ",office_address"
                        + ")values("
                        + ":created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:upload_status"
                        + ",:alumni_no"
                        + ",:student_no"
                        + ",:name"
                        + ",:relation"
                        + ",:name_before_married"
                        + ",:residence_address"
                        + ",:occupation"
                        + ",:office_address"
                        + ")";

                s3 = SqlStringUtil.parse(s3)
                        .setString("created_at", to_alumnis.created_at)
                        .setString("updated_at", to_alumnis.updated_at)
                        .setString("created_by", to_alumnis.created_by)
                        .setString("updated_by", to_alumnis.updated_by)
                        .setNumber("status", to_alumnis.status)
                        .setNumber("upload_status", to_alumnis.upload_status)
                        .setString("alumni_no", to_alumnis.alumni_no)
                        .setString("student_no", to_alumnis.student_no)
                        .setString("name", member.name)
                        .setString("relation", member.relation)
                        .setString("name_before_married", member.name_before_married)
                        .setString("residence_address", member.residence_address)
                        .setString("occupation", member.occupation)
                        .setString("office_address", member.office_address)
                        .ok();

                stmt.addBatch(s3);
            }

            stmt.executeBatch();
            conn.commit();
            Lg.s(Alumnis.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_alumnis to_alumnis) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "update alumnis set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",alumni_no= :alumni_no "
                    + ",student_no= :student_no "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",gender= :gender "
                    + ",civil_status= :civil_status "
                    + ",bday= :bday "
                    + ",landline_no= :landline_no "
                    + ",email_address= :email_address "
                    + ",cellphone_no= :cellphone_no "
                    + ",graduated_in= :graduated_in "
                    + ",graduated_on= :graduated_on "
                    + ",level= :level"
                    + ",course= :course "
                    + ",major= :major "
                    + ",motto_in_life= :motto_in_life "
                    + ",password= :password "
                    + ",father_name= :father_name "
                    + ",father_is_alumni= :father_is_alumni "
                    + ",father_occupation= :father_occupation "
                    + ",father_office_address= :father_office_address "
                    + ",mother_name= :mother_name "
                    + ",mother_is_alumni= :mother_is_alumni "
                    + ",mother_occupation= :mother_occupation "
                    + ",mother_office_address= :mother_office_address "
                    + " where id='" + to_alumnis.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumnis.created_at)
                    .setString("updated_at", to_alumnis.updated_at)
                    .setString("created_by", to_alumnis.created_by)
                    .setString("updated_by", to_alumnis.updated_by)
                    .setNumber("status", to_alumnis.status)
                    .setNumber("upload_status", to_alumnis.upload_status)
                    .setString("alumni_no", to_alumnis.alumni_no)
                    .setString("student_no", to_alumnis.student_no)
                    .setString("fname", to_alumnis.fname)
                    .setString("mi", to_alumnis.mi)
                    .setString("lname", to_alumnis.lname)
                    .setString("sname", to_alumnis.sname)
                    .setNumber("gender", to_alumnis.gender)
                    .setString("civil_status", to_alumnis.civil_status)
                    .setString("bday", to_alumnis.bday)
                    .setString("landline_no", to_alumnis.landline_no)
                    .setString("email_address", to_alumnis.email_address)
                    .setString("cellphone_no", to_alumnis.cellphone_no)
                    .setString("graduated_in", to_alumnis.graduated_in)
                    .setString("graduated_on", to_alumnis.graduated_on)
                    .setString("level", to_alumnis.level)
                    .setString("course", to_alumnis.course)
                    .setString("major", to_alumnis.major)
                    .setString("motto_in_life", to_alumnis.motto_in_life)
                    .setString("password", to_alumnis.password)
                    .setString("father_name", to_alumnis.father_name)
                    .setNumber("father_is_alumni", to_alumnis.father_is_alumni)
                    .setString("father_occupation", to_alumnis.father_occupation)
                    .setString("father_office_address", to_alumnis.father_office_address)
                    .setString("mother_name", to_alumnis.mother_name)
                    .setString("mother_is_alumni", to_alumnis.mother_is_alumni)
                    .setString("mother_occupation", to_alumnis.mother_occupation)
                    .setString("mother_office_address", to_alumnis.mother_office_address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            String s2 = " update alumni_family_members set "
                    + " updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",student_no= :student_no "
                    + " where alumni_no='" + to_alumnis.alumni_no + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setString("updated_at", to_alumnis.updated_at)
                    .setString("updated_by", to_alumnis.updated_by)
                    .setNumber("status", to_alumnis.status)
                    .setNumber("upload_status", to_alumnis.upload_status)
                    .setString("student_no", to_alumnis.student_no)
                    .ok();
            stmt.addBatch(s2);

            String s3 = " update alumni_school_activities set "
                    + " updated_at= :updated_at "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",student_no= :student_no "
                    + " where alumni_no='" + to_alumnis.alumni_no + "' "
                    + " ";

            s3 = SqlStringUtil.parse(s3)
                    .setString("updated_at", to_alumnis.updated_at)
                    .setString("updated_by", to_alumnis.updated_by)
                    .setNumber("status", to_alumnis.status)
                    .setNumber("upload_status", to_alumnis.upload_status)
                    .setString("student_no", to_alumnis.student_no)
                    .ok();
            stmt.addBatch(s3);

            stmt.executeBatch();
            conn.commit();

            Lg.s(Alumnis.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_alumnis to_alumnis) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = " delete from alumnis  "
                    + " where id='" + to_alumnis.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            String s2 = " delete from alumni_family_members  "
                    + " where alumni_no='" + to_alumnis.alumni_no + "' "
                    + " ";
            stmt.addBatch(s2);

            String s3 = " delete from alumni_school_activities  "
                    + " where alumni_no='" + to_alumnis.alumni_no + "' "
                    + " ";
            stmt.addBatch(s3);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Alumnis.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_alumnis> ret_data(String where) {
        List<to_alumnis> datas = new ArrayList();

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
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",gender"
                    + ",civil_status"
                    + ",bday"
                    + ",landline_no"
                    + ",email_address"
                    + ",cellphone_no"
                    + ",graduated_in"
                    + ",graduated_on"
                    + ",course"
                    + ",major"
                    + ",motto_in_life"
                    + ",password"
                    + ",father_name"
                    + ",father_is_alumni"
                    + ",father_occupation"
                    + ",father_office_address"
                    + ",mother_name"
                    + ",mother_is_alumni"
                    + ",mother_occupation"
                    + ",mother_office_address"
                    + ",level"
                    + " from alumnis"
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
                String fname = rs.getString(10);
                String mi = rs.getString(11);
                String lname = rs.getString(12);
                String sname = rs.getString(13);
                int gender = rs.getInt(14);
                String civil_status = rs.getString(15);
                String bday = rs.getString(16);
                String landline_no = rs.getString(17);
                String email_address = rs.getString(18);
                String cellphone_no = rs.getString(19);
                String graduated_in = rs.getString(20);
                String graduated_on = rs.getString(21);
                String course = rs.getString(22);
                String major = rs.getString(23);
                String motto_in_life = rs.getString(24);
                String password = rs.getString(25);
                String father_name = rs.getString(26);
                int father_is_alumni = rs.getInt(27);
                String father_occupation = rs.getString(28);
                String father_office_address = rs.getString(29);
                String mother_name = rs.getString(30);
                String mother_is_alumni = rs.getString(31);
                String mother_occupation = rs.getString(32);
                String mother_office_address = rs.getString(33);
                String level = rs.getString(34);
                to_alumnis to = new to_alumnis(id, created_at, updated_at, created_by, updated_by, status, upload_status, alumni_no, student_no, fname, mi, lname, sname, gender, civil_status, bday, landline_no, email_address, cellphone_no, graduated_in, graduated_on, level, course, major, motto_in_life, password, father_name, father_is_alumni, father_occupation, father_office_address, mother_name, mother_is_alumni, mother_occupation, mother_office_address, true);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id() {
        String year = DateType.y.format(new Date());

        String id = year + "000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from alumnis";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select alumni_no from alumnis where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = year + "000000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
