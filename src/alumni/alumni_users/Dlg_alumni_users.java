/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.alumni_users;

import alumni.alumni_generated_cards.Alumni_generated_cards;
import alumni.alumni_generated_cards.Alumni_generated_cards.to_alumni_generated_cards;
import alumni.alumni_users.Alumni_users.to_alumni_users;
import alumni.alumnis.Dlg_print_id;
import alumni.alumnis.Dlg_upload_photo;
import alumni.api.API;
import alumni.utils.Alert;
import alumni.utils.DateType;
import alumni.utils.ImageRenderer2;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

import synsoftech.util.ImageRenderer1;

/**
 *
 * @author Guinness
 */
public class Dlg_alumni_users extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_alumni_users
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_alumni_users(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_alumni_users(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_alumni_users() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_alumni_users myRef;

    private void setThisRef(Dlg_alumni_users myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_alumni_users> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_alumni_users create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_alumni_users create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_alumni_users dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_alumni_users((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_alumni_users dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_alumni_users((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_alumni_users dialog = Dlg_alumni_users.create(new javax.swing.JFrame(), true);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alumni_users = new javax.swing.JTable();
        jTextField1 = new Field.Search();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_alumni_generated_cards = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new Button.Success();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_alumni_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_alumni_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alumni_usersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_alumni_users);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search by:");

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Name");

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("ID No");

        tbl_alumni_generated_cards.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_alumni_generated_cards);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Requisitions");

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        jLabel5.setText("0");

        jLabel6.setText("No. of rows:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Search Member to start...");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni/icons/communication (1).png"))); // NOI18N
        jButton1.setToolTipText("Synch Cloud Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        ret_alumni_users();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        synch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        ret_alumni_users();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbl_alumni_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alumni_usersMouseClicked
        select_user();
    }//GEN-LAST:event_tbl_alumni_usersMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_alumni_generated_cards;
    private javax.swing.JTable tbl_alumni_users;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_alumni_users(tbl_alumni_users);
        init_tbl_alumni_generated_cards(tbl_alumni_generated_cards);
    }

    public void do_pass() {

    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" alumni_users "> 
    public static ArrayListModel tbl_alumni_users_ALM;
    public static Tblalumni_usersModel tbl_alumni_users_M;

    public static void init_tbl_alumni_users(JTable tbl_alumni_users) {
        tbl_alumni_users_ALM = new ArrayListModel();
        tbl_alumni_users_M = new Tblalumni_usersModel(tbl_alumni_users_ALM);
        tbl_alumni_users.setModel(tbl_alumni_users_M);
        tbl_alumni_users.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_alumni_users.setRowHeight(25);
        int[] tbl_widths_alumni_users = {25, 140, 130, 130, 130, 100, 70, 70, 70, 30, 30};
        for (int i = 0, n = tbl_widths_alumni_users.length; i < n; i++) {
            if (i == 5) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_alumni_users, i, tbl_widths_alumni_users[i]);
        }
        Dimension d = tbl_alumni_users.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_alumni_users.getTableHeader().setPreferredSize(d);
        tbl_alumni_users.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_alumni_users.setRowHeight(25);
        tbl_alumni_users.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_alumni_users.getColumnModel().getColumn(9).setCellRenderer(new ImageRenderer1());
        tbl_alumni_users.getColumnModel().getColumn(10).setCellRenderer(new ImageRenderer1());
        tbl_alumni_users.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer2());
    }

    public static void loadData_alumni_users(List<to_alumni_users> acc) {
        tbl_alumni_users_ALM.clear();
        tbl_alumni_users_ALM.addAll(acc);
    }

    public static class Tblalumni_usersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "", "ID No", "Last Name", "First Name", "Middle Name", "Email Address", "Activated", "Approved", "Active", "", ""
        };

        public Tblalumni_usersModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_alumni_users tt = (to_alumni_users) getRow(row);
            final String home = System.getProperty("user.home", "");
            String destinationFile = home + "\\images_alumni\\users\\";

            switch (col) {
                case 0:
                    if (tt.image.isEmpty()) {
                        return destinationFile + "user2-160x160.jpg";
                    } else {
                        File f = new File(destinationFile + tt.image);
                        if (!f.exists()) {
                            return destinationFile + "user2-160x160.jpg";
                        } else {
                            return destinationFile + tt.image;
                        }

                    }

                case 1:
                    return " 0000000000000" + tt.id;
                case 2:
                    return " " + tt.last_name;
                case 3:
                    return " " + tt.first_name;
                case 4:
                    return " " + tt.middle_name;
                case 5:
                    return " " + tt.email;

                case 6:
                    if (tt.activated == 0) {
                        return " Pending";
                    } else {
                        return " Activated";
                    }
                case 7:
                    if (tt.approved == 0) {
                        return " Pending";
                    } else {
                        return " Activated";
                    }
                case 8:
                    if (tt.active == 0) {
                        return " Disabled";
                    } else {
                        return " Active";
                    }
                case 9:
                    return "/alumni/icons/id-card.png";
                default:
                    return "/alumni/icons/photo-camera.png";
            }
        }
    }

    private void ret_alumni_users() {
        String search = jTextField1.getText();
        String where = " where concat(last_name,space(1),first_name) like '%" + search + "%' ";
        if (jCheckBox2.isSelected()) {
            where = " where id like '%" + search + "%' ";
        }
        where = where + " order by last_name asc";
        List<to_alumni_users> datas = Alumni_users.ret_data(where);
        loadData_alumni_users(datas);
        jLabel4.setText("" + datas.size());
    }
//</editor-fold> 

    private void synch() {
        final String home = System.getProperty("user.home", "");
        Window p = (Window) this;
        Dlg_synch_data nd = Dlg_synch_data.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_synch_data.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, final Dlg_synch_data.OutputData data) {
                closeDialog.ok();
                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                jButton1.setEnabled(false);
                jTextField1.setEnabled(false);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        if (data.new_only == 0) {
                            Alumni_users.delete_all();
                        }
                        List<to_alumni_users> last = Alumni_users.ret_data(" order by id desc limit 1");
                        int last_id = 0;
                        for (to_alumni_users u : last) {
                            last_id = u.id;
                        }
                        System.out.println("last_id: "+last_id);
                        Alumni_users.add_data(data.users, data.new_only, last_id);

                        if (data.new_only == 0) {
                            last_id = 0;
                        }
                        
                        for (to_alumni_users to_alumni_users : data.users) {
                            if (to_alumni_users.id > last_id) {
                                if (!to_alumni_users.image.isEmpty()) {
                                    String imageUrl = "http://spudaa.com/src/images/users/" + to_alumni_users.image;
                                    String destinationFile = home + "\\images_alumni\\users\\" + to_alumni_users.image;
                                    File f = new File(destinationFile);
                                    if (!f.exists()) {
                                        System.out.println("destinationFile: " + destinationFile);
                                        API.saveImage(imageUrl, destinationFile);
                                    }
                                }
                            }

                        }
                        ret_alumni_users();
                        Alert.set(0, "Data synch successfully!");
                        jButton1.setEnabled(true);
                        jTextField1.setEnabled(true);
                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);
                    }
                });
                t.start();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_user() {
        int row = tbl_alumni_users.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_alumni_users user = (to_alumni_users) tbl_alumni_users_ALM.get(row);
        int col = tbl_alumni_users.getSelectedColumn();
        ret_generated_cards();
        if (col == 9) {
            String home = System.getProperty("user.home");
            String photo_path = home + "\\images_alumni\\users\\" + user.image;
            if (user.image.isEmpty()) {
                photo_path = home + "\\images_alumni\\users\\" + "user2-160x160.jpg";
            }

            Window p = (Window) this;
            Dlg_print_id nd = Dlg_print_id.create(p, true);
            nd.setTitle("");
            nd.do_pass(photo_path, user); //
            nd.setCallback(new Dlg_print_id.Callback() {

                @Override
                public void front(CloseDialog closeDialog, Dlg_print_id.OutputData data) {
//                    closeDialog.ok();

                    ret_generated_cards();

                }

                @Override
                public void back(CloseDialog closeDialog, Dlg_print_id.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 10) {
            String home = System.getProperty("user.home");
            String photo_path = home + "\\images_alumni\\users\\" + user.image;
            if (user.image.isEmpty()) {
                photo_path = home + "\\images_alumni\\users\\" + "user2-160x160.jpg";
            }

            Window p = (Window) this;
            Dlg_upload_photo nd = Dlg_upload_photo.create(p, true);
            nd.setTitle("");
            nd.do_pass(photo_path, user); //
            nd.setCallback(new Dlg_upload_photo.Callback() {
                @Override
                public void back(CloseDialog closeDialog, Dlg_upload_photo.OutputData data) {
                }

                @Override
                public void front(CloseDialog closeDialog, Dlg_upload_photo.OutputData data) {
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    //<editor-fold defaultstate="collapsed" desc=" alumni_generated_cards "> 
    public static ArrayListModel tbl_alumni_generated_cards_ALM;
    public static Tblalumni_generated_cardsModel tbl_alumni_generated_cards_M;

    public static void init_tbl_alumni_generated_cards(JTable tbl_alumni_generated_cards) {
        tbl_alumni_generated_cards_ALM = new ArrayListModel();
        tbl_alumni_generated_cards_M = new Tblalumni_generated_cardsModel(tbl_alumni_generated_cards_ALM);
        tbl_alumni_generated_cards.setModel(tbl_alumni_generated_cards_M);
        tbl_alumni_generated_cards.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_alumni_generated_cards.setRowHeight(25);
        int[] tbl_widths_alumni_generated_cards = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_alumni_generated_cards.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_alumni_generated_cards, i, tbl_widths_alumni_generated_cards[i]);
        }
        Dimension d = tbl_alumni_generated_cards.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_alumni_generated_cards.getTableHeader().setPreferredSize(d);
        tbl_alumni_generated_cards.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_alumni_generated_cards.setRowHeight(25);
        tbl_alumni_generated_cards.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_alumni_generated_cards(List<to_alumni_generated_cards> acc) {
        tbl_alumni_generated_cards_ALM.clear();
        tbl_alumni_generated_cards_ALM.addAll(acc);
    }

    public static class Tblalumni_generated_cardsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "created_at", "updated_at", "created_by", "updated_by", "status", "upload_status", "alumni_no", "student_no"
        };

        public Tblalumni_generated_cardsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_alumni_generated_cards tt = (to_alumni_generated_cards) getRow(row);
            switch (col) {
                case 0:
                    return " " + DateType.convert_slash_datetime3(tt.created_at);
                case 1:
                    return tt.created_at;
                case 2:
                    return tt.updated_at;
                case 3:
                    return tt.created_by;
                case 4:
                    return tt.updated_by;
                case 5:
                    return tt.status;
                case 6:
                    return tt.upload_status;
                case 7:
                    return tt.alumni_no;
                default:
                    return tt.student_no;
            }
        }
    }

    private void ret_generated_cards() {
        int row = tbl_alumni_users.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_alumni_users to = (to_alumni_users) tbl_alumni_users_ALM.get(row);
        String where = " where student_no = '" + to.id + "'";
        List<to_alumni_generated_cards> datas = Alumni_generated_cards.ret_data(where);
        loadData_alumni_generated_cards(datas);
        jLabel5.setText("" + datas.size());
    }
//</editor-fold> 

}
