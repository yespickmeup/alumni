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
public class Alumni_family_members {

    public static class to_alumni_family_members {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int upload_status;
        public final String alumni_no;
        public final String student_no;
        public  String name;
        public  String relation;
        public  String name_before_married;
        public  String residence_address;
        public  String occupation;
        public  String office_address;

        public to_alumni_family_members(int id, String created_at, String updated_at, String created_by, String updated_by, int status, int upload_status, String alumni_no, String student_no, String name, String relation, String name_before_married, String residence_address, String occupation, String office_address) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.upload_status = upload_status;
            this.alumni_no = alumni_no;
            this.student_no = student_no;
            this.name = name;
            this.relation = relation;
            this.name_before_married = name_before_married;
            this.residence_address = residence_address;
            this.occupation = occupation;
            this.office_address = office_address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRelation() {
            return relation;
        }

        public void setRelation(String relation) {
            this.relation = relation;
        }

        public String getName_before_married() {
            return name_before_married;
        }

        public void setName_before_married(String name_before_married) {
            this.name_before_married = name_before_married;
        }

        public String getResidence_address() {
            return residence_address;
        }

        public void setResidence_address(String residence_address) {
            this.residence_address = residence_address;
        }

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getOffice_address() {
            return office_address;
        }

        public void setOffice_address(String office_address) {
            this.office_address = office_address;
        }
        
    }

    public static void add_data(to_alumni_family_members to_alumni_family_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into alumni_family_members("
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

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumni_family_members.created_at)
                    .setString("updated_at", to_alumni_family_members.updated_at)
                    .setString("created_by", to_alumni_family_members.created_by)
                    .setString("updated_by", to_alumni_family_members.updated_by)
                    .setNumber("status", to_alumni_family_members.status)
                    .setNumber("upload_status", to_alumni_family_members.upload_status)
                    .setString("alumni_no", to_alumni_family_members.alumni_no)
                    .setString("student_no", to_alumni_family_members.student_no)
                    .setString("name", to_alumni_family_members.name)
                    .setString("relation", to_alumni_family_members.relation)
                    .setString("name_before_married", to_alumni_family_members.name_before_married)
                    .setString("residence_address", to_alumni_family_members.residence_address)
                    .setString("occupation", to_alumni_family_members.occupation)
                    .setString("office_address", to_alumni_family_members.office_address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_family_members.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_alumni_family_members to_alumni_family_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update alumni_family_members set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",alumni_no= :alumni_no "
                    + ",student_no= :student_no "
                    + ",name= :name "
                    + ",relation= :relation "
                    + ",name_before_married= :name_before_married "
                    + ",residence_address= :residence_address "
                    + ",occupation= :occupation "
                    + ",office_address= :office_address "
                    + " where id='" + to_alumni_family_members.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumni_family_members.created_at)
                    .setString("updated_at", to_alumni_family_members.updated_at)
                    .setString("created_by", to_alumni_family_members.created_by)
                    .setString("updated_by", to_alumni_family_members.updated_by)
                    .setNumber("status", to_alumni_family_members.status)
                    .setNumber("upload_status", to_alumni_family_members.upload_status)
                    .setString("alumni_no", to_alumni_family_members.alumni_no)
                    .setString("student_no", to_alumni_family_members.student_no)
                    .setString("name", to_alumni_family_members.name)
                    .setString("relation", to_alumni_family_members.relation)
                    .setString("name_before_married", to_alumni_family_members.name_before_married)
                    .setString("residence_address", to_alumni_family_members.residence_address)
                    .setString("occupation", to_alumni_family_members.occupation)
                    .setString("office_address", to_alumni_family_members.office_address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_family_members.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_alumni_family_members to_alumni_family_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from alumni_family_members  "
                    + " where id='" + to_alumni_family_members.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_family_members.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_alumni_family_members> ret_data(String where) {
        List<to_alumni_family_members> datas = new ArrayList();

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
                    + ",name"
                    + ",relation"
                    + ",name_before_married"
                    + ",residence_address"
                    + ",occupation"
                    + ",office_address"
                    + " from alumni_family_members"
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
                String name = rs.getString(10);
                String relation = rs.getString(11);
                String name_before_married = rs.getString(12);
                String residence_address = rs.getString(13);
                String occupation = rs.getString(14);
                String office_address = rs.getString(15);

                to_alumni_family_members to = new to_alumni_family_members(id, created_at, updated_at, created_by, updated_by, status, upload_status, alumni_no, student_no, name, relation, name_before_married, residence_address, occupation, office_address);
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
