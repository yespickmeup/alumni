/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.family_relations;

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
public class Family_relations {

    public static class to_family_relations {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int upload_status;
        public final String relation;

        public to_family_relations(int id, String created_at, String updated_at, String created_by, String updated_by, int status, int upload_status, String relation) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.upload_status = upload_status;
            this.relation = relation;
        }
    }

    public static void add_data(to_family_relations to_family_relations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into family_relations("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",upload_status"
                    + ",relation"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:upload_status"
                    + ",:relation"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_family_relations.created_at)
                    .setString("updated_at", to_family_relations.updated_at)
                    .setString("created_by", to_family_relations.created_by)
                    .setString("updated_by", to_family_relations.updated_by)
                    .setNumber("status", to_family_relations.status)
                    .setNumber("upload_status", to_family_relations.upload_status)
                    .setString("relation", to_family_relations.relation)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Family_relations.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_family_relations to_family_relations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update family_relations set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",upload_status= :upload_status "
                    + ",relation= :relation "
                    + " where id='" + to_family_relations.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_family_relations.created_at)
                    .setString("updated_at", to_family_relations.updated_at)
                    .setString("created_by", to_family_relations.created_by)
                    .setString("updated_by", to_family_relations.updated_by)
                    .setNumber("status", to_family_relations.status)
                    .setNumber("upload_status", to_family_relations.upload_status)
                    .setString("relation", to_family_relations.relation)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Family_relations.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_family_relations to_family_relations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from family_relations  "
                    + " where id='" + to_family_relations.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Family_relations.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_family_relations> ret_data(String where) {
        List<to_family_relations> datas = new ArrayList();

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
                    + ",relation"
                    + " from family_relations"
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
                String relation = rs.getString(8);

                to_family_relations to = new to_family_relations(id, created_at, updated_at, created_by, updated_by, status, upload_status, relation);
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
