/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.alumni_generated_cards;

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
public class Alumni_generated_cards {

    public static class to_alumni_generated_cards {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int upload_status;
        public final String alumni_no;
        public final String student_no;

        public to_alumni_generated_cards(int id, String created_at, String updated_at, String created_by, String updated_by, int status, int upload_status, String alumni_no, String student_no) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.upload_status = upload_status;
            this.alumni_no = alumni_no;
            this.student_no = student_no;
        }
    }

    public static void add_data(to_alumni_generated_cards to_alumni_generated_cards) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into alumni_generated_cards("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",upload_status"
                    + ",alumni_no"
                    + ",student_no"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:upload_status"
                    + ",:alumni_no"
                    + ",:student_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumni_generated_cards.created_at)
                    .setString("updated_at", to_alumni_generated_cards.updated_at)
                    .setString("created_by", to_alumni_generated_cards.created_by)
                    .setString("updated_by", to_alumni_generated_cards.updated_by)
                    .setNumber("status", to_alumni_generated_cards.status)
                    .setNumber("upload_status", to_alumni_generated_cards.upload_status)
                    .setString("alumni_no", to_alumni_generated_cards.alumni_no)
                    .setString("student_no", to_alumni_generated_cards.student_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_generated_cards.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_alumni_generated_cards to_alumni_generated_cards) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update alumni_generated_cards set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",alumni_no= :alumni_no "
                    + ",student_no= :student_no "
                    + " where id='" + to_alumni_generated_cards.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_alumni_generated_cards.created_at)
                    .setString("updated_at", to_alumni_generated_cards.updated_at)
                    .setString("created_by", to_alumni_generated_cards.created_by)
                    .setString("updated_by", to_alumni_generated_cards.updated_by)
                    .setNumber("status", to_alumni_generated_cards.status)
                    .setNumber("upload_status", to_alumni_generated_cards.upload_status)
                    .setString("alumni_no", to_alumni_generated_cards.alumni_no)
                    .setString("student_no", to_alumni_generated_cards.student_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_generated_cards.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_alumni_generated_cards to_alumni_generated_cards) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from alumni_generated_cards  "
                    + " where id='" + to_alumni_generated_cards.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Alumni_generated_cards.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_alumni_generated_cards> ret_data(String where) {
        List<to_alumni_generated_cards> datas = new ArrayList();

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
                    + " from alumni_generated_cards"
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

                to_alumni_generated_cards to = new to_alumni_generated_cards(id, created_at, updated_at, created_by, updated_by, status, upload_status, alumni_no, student_no);
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
