/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.alumnis;

import alumni.course_majors.Course_majors;
import alumni.course_majors.Dlg_course_major;
import alumni.courses.Courses;
import alumni.courses.Dlg_courses;
import alumni.school_levels.Dlg_school_levels;
import alumni.school_levels.School_levels;
import alumni.users.MyUser;
import alumni.utils.Alert;
import alumni.utils.DateType;
import alumni.utils.Dlg_confirm_action;
import alumni.utils.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
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
public class Dlg_alumnis extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_template1
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
    private Dlg_alumnis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_alumnis(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_alumnis() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_alumnis myRef;

    private void setThisRef(Dlg_alumnis myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_alumnis> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_alumnis create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_alumnis create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_alumnis dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_alumnis((java.awt.Frame) parent, false);
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
            Dlg_alumnis dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_alumnis((java.awt.Dialog) parent, false);
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

        Dlg_alumnis dialog = Dlg_alumnis.create(new javax.swing.JFrame(), true);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_official_schedule_types = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField8 = new Field.Combo();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField9 = new Field.Combo();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new Field.Combo();
        jButton3 = new Button.Default();
        jButton1 = new Button.Success();
        jTextField11 = new Field.Search();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_official_schedule_types.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_official_schedule_types.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_official_schedule_typesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_official_schedule_types);

        jLabel7.setText("No. of Rows:");

        jLabel8.setText("0");

        jLabel9.setText("Status:");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni/imgs/stpaul.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("ALUMNI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("St. Paul University Dumaguete");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Dumaguete City, Philippines");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Year:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("All");

        jYearChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Level:");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("All");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Course:");

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("All");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Major:");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni/icons/magnifying-glass34.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni/icons/new-file.png"))); // NOI18N
        jButton1.setText("New [F1]");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Name:");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setSelected(true);
        jCheckBox5.setText("All");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField9)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox4)))
                .addGap(1, 6, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni/imgs/mortarboard (1).png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("REGISTRY");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Philippines");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new_alumni();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_official_schedule_typesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_official_schedule_typesMouseClicked
        select_alumni();
    }//GEN-LAST:event_tbl_official_schedule_typesMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ret_official_schedule_types();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        ret_official_schedule_types();
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        init_levels();
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        init_levels();
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        init_courses();
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        init_courses();
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        init_course_majors();
    }//GEN-LAST:event_jTextField10ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JTable tbl_official_schedule_types;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_official_schedule_types(tbl_official_schedule_types);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jTextField11.grabFocus();
            }
        });
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
        jTextField11.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (!tbl_official_schedule_types_ALM.isEmpty()) {
                        tbl_official_schedule_types.setRowSelectionInterval(0, 0);
                        tbl_official_schedule_types.grabFocus();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    new_alumni();
                }
            }
        });
        tbl_official_schedule_types.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    select_alumni();
                    e.consume();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    jTextField11.grabFocus();
                }
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    new_alumni();
                }
            }
        });
        jTextField8.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_levels();
                }

            }
        });
        jTextField9.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_courses();
                }

            }
        });
        jTextField10.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_majors();
                }

            }
        });
    }

    private void dlg_levels() {
        Window p = (Window) this;
        Dlg_school_levels nd = Dlg_school_levels.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_school_levels.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_school_levels.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_courses() {
        Window p = (Window) this;
        Dlg_courses nd = Dlg_courses.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_courses.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_courses.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void dlg_majors() {
        Window p = (Window) this;
        Dlg_course_major nd = Dlg_course_major.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_course_major.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_course_major.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" otbl "> 
    public static ArrayListModel tbl_official_schedule_types_ALM;
    public static Tblofficial_schedule_typesModel tbl_official_schedule_types_M;

    public static void init_tbl_official_schedule_types(JTable tbl_official_schedule_types) {
        tbl_official_schedule_types_ALM = new ArrayListModel();
        tbl_official_schedule_types_M = new Tblofficial_schedule_typesModel(tbl_official_schedule_types_ALM);
        tbl_official_schedule_types.setModel(tbl_official_schedule_types_M);
        tbl_official_schedule_types.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_official_schedule_types.setRowHeight(25);
        int[] tbl_widths_official_schedule_types = {100, 120, 30, 150, 100, 30, 30, 0};
        for (int i = 0, n = tbl_widths_official_schedule_types.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_official_schedule_types, i, tbl_widths_official_schedule_types[i]);
        }
        Dimension d = tbl_official_schedule_types.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_official_schedule_types.getTableHeader().setPreferredSize(d);
        tbl_official_schedule_types.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_official_schedule_types.setRowHeight(25);
        tbl_official_schedule_types.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_official_schedule_types.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer1());
        tbl_official_schedule_types.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer1());
    }

    public static void loadData_official_schedule_types(List<Alumnis.to_alumnis> acc) {
        tbl_official_schedule_types_ALM.clear();
        tbl_official_schedule_types_ALM.addAll(acc);
    }

    public static class Tblofficial_schedule_typesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Alumni No", "Student No", "Name", "Level", "Graduated", "", "", ""
        };

        public Tblofficial_schedule_typesModel(ListModel listmodel) {
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
            if (col == 7) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Alumnis.to_alumnis tt = (Alumnis.to_alumnis) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.alumni_no;
                case 1:
                    return " " + tt.student_no;
                case 2:
                    return " " + tt.lname + ", " + tt.fname + " " + tt.mi;
                case 3:
                    return " " + tt.graduated_in;
                case 4:
                    return " " + tt.graduated_on;
                case 5:
                    return "/alumni/icons/edit.png";
                case 6:
                    return "/alumni/icons/remove11.png";
                default:
                    return tt.selected;
            }
        }
    }

    private void ret_official_schedule_types() {
        Field.Combo level = (Field.Combo) jTextField8;
        Field.Combo course = (Field.Combo) jTextField9;
        Field.Combo major = (Field.Combo) jTextField10;

        String where = " where motto_in_life like '%" + "" + "%' ";
        String where2 = " or motto_in_life like '%" + "" + "%' ";
        if (!jCheckBox1.isSelected()) {
            where = where + " and graduated_on like '" + jYearChooser1.getValue() + "' ";
            where2 = where2 + " and graduated_on like '" + jYearChooser1.getValue() + "' ";
        }
        if (!jCheckBox3.isSelected()) {
            where = where + " and level like '" + jTextField8.getText() + "' ";
            where2 = where2 + " and level like '" + jTextField8.getText() + "' ";
        }
        if (!jCheckBox4.isSelected()) {
            where = where + " and course like '" + jTextField9.getText() + "' ";
            where2 = where2 + " and course like '" + jTextField9.getText() + "' ";
        }
        if (!jCheckBox5.isSelected()) {
            where = where + " and major like '" + jTextField10.getText() + "' ";
            where2 = where2 + " and major like '" + jTextField10.getText() + "' ";
        }
        String name = jTextField11.getText();
        where = where + " and concat(lname,space(1),fname) like '%" + name + "%' ";
        where2 = where2 + " and concat(fname,space(1),lname) like '%" + name + "%' order by lname asc ";

        where = where + where2;
        
      
        List< Alumnis.to_alumnis> datas = Alumnis.ret_data(where);
        loadData_official_schedule_types(datas);
        jLabel8.setText("" + datas.size());
    }

    private void clear_official_schedule_types() {
//        jTextField1.setText("");
//        jTextField2.setText("");
        tbl_official_schedule_types.clearSelection();
//        jTextField1.grabFocus();
    }

    private void save_official_schedule_types() {
        int row = tbl_official_schedule_types.getSelectedRow();
        if (row < 0) {

        } else {

        }
    }

    private void select_official_schedule_types() {
        int row = tbl_official_schedule_types.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_official_schedule_types.getSelectedColumn();
        if (col == 1) {

        }
        if (col == 2) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    private void new_alumni() {
        Window p = (Window) this;
        Dlg_alumni_new nd = Dlg_alumni_new.create(p, true);
        nd.setTitle("");
        nd.do_pass_new();
        nd.setCallback(new Dlg_alumni_new.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_alumni_new.OutputData data) {
                closeDialog.ok();
                int id = 0;
                String created_at = DateType.now();
                String updated_at = DateType.now();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                int status = 1;
                int upload_status = 0;
                String alumni_no = Alumnis.increment_id();
                String where = " where alumni_no='" + alumni_no + "' ";
                List<Alumnis.to_alumnis> datas = Alumnis.ret_data(where);
                do {
                    alumni_no = Alumnis.increment_id();
                } while (datas.size() >= 1);

                String home = System.getProperty("user.home", "");

                String oldfile = home + "\\images_alumni\\default.jpg";
                String newfile = home + "\\images_alumni\\" + alumni_no + ".jpg";

                File source = new File(oldfile);
                System.out.println("Source: " + oldfile);
                System.out.println("Source: " + source.getAbsolutePath());
                if (source.exists()) {
                    // Abstract file path (does not exist)
                    File destination = new File(newfile);
                    System.out.println(destination.getAbsolutePath());
                    // rename the source file
                    source.renameTo(destination);
                }

                String student_no = data.student_no;
                String fname = data.fname;
                String mi = data.mi;
                String lname = data.lname;
                String sname = data.sname;
                int gender = data.gender;
                String civil_status = data.civil_status;
                String bday = data.bday;
                String landline_no = data.landline_no;
                String email_address = data.email_address;
                String cellphone_no = data.cellphone_no;
                String graduated_in = data.graduated_in;
                String graduated_on = data.graduated_on;
                String level = data.level;
                String course = data.course;
                String major = data.major;
                String motto_in_life = data.motto_in_life;
                String password = data.password;
                String father_name = data.father_name;
                int father_is_alumni = data.father_is_alumni;
                String father_occupation = data.father_occupation;
                String father_office_address = data.father_office_address;
                String mother_name = data.mother_name;
                String mother_is_alumni = data.mother_is_alumni;
                String mother_occupation = data.mother_occupation;
                String mother_office_address = data.mother_office_address;
                List<Alumni_school_activities.to_alumni_school_activities> activities = data.activities;
                List<Alumni_family_members.to_alumni_family_members> members = data.members;

                Alumnis.to_alumnis alumni = new Alumnis.to_alumnis(id, created_at, updated_at, created_by, updated_by, status, upload_status, alumni_no, student_no, fname, mi, lname, sname, gender, civil_status, bday, landline_no, email_address, cellphone_no, graduated_in, graduated_on, level, course, major, motto_in_life, password, father_name, father_is_alumni, father_occupation, father_office_address, mother_name, mother_is_alumni, mother_occupation, mother_office_address, true);
                Alumnis.add_data(alumni, activities, members);
                ret_official_schedule_types();
                Alert.set(1, "");
                jTextField11.grabFocus();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_alumni() {
        int row = tbl_official_schedule_types.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Alumnis.to_alumnis alumni = (Alumnis.to_alumnis) tbl_official_schedule_types_ALM.get(row);
        int col = tbl_official_schedule_types.getSelectedColumn();
        if (col == 6) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Alumnis.delete_data(alumni);
                    ret_official_schedule_types();
                    Alert.set(3, "");
                    jTextField11.grabFocus();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        } else {
            Window p = (Window) this;
            Dlg_alumni_new nd = Dlg_alumni_new.create(p, true);
            nd.setTitle("");
            nd.do_pass(alumni);
            nd.setCallback(new Dlg_alumni_new.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_alumni_new.OutputData data) {
                    closeDialog.ok();
                    int id = alumni.id;
                    String created_at = alumni.created_at;
                    String updated_at = DateType.now();
                    String created_by = alumni.created_by;
                    String updated_by = MyUser.getUser_id();
                    int status = alumni.status;
                    int upload_status = 0;
                    String alumni_no = alumni.alumni_no;

                    String student_no = data.student_no;
                    String fname = data.fname;
                    String mi = data.mi;
                    String lname = data.lname;
                    String sname = data.sname;
                    int gender = data.gender;
                    String civil_status = data.civil_status;
                    String bday = data.bday;
                    String landline_no = data.landline_no;
                    String email_address = data.email_address;
                    String cellphone_no = data.cellphone_no;
                    String graduated_in = data.graduated_in;
                    String graduated_on = data.graduated_on;
                    String level = data.level;
                    String course = data.course;
                    String major = data.major;
                    String motto_in_life = data.motto_in_life;
                    String password = data.password;
                    String father_name = data.father_name;
                    int father_is_alumni = data.father_is_alumni;
                    String father_occupation = data.father_occupation;
                    String father_office_address = data.father_office_address;
                    String mother_name = data.mother_name;
                    String mother_is_alumni = data.mother_is_alumni;
                    String mother_occupation = data.mother_occupation;
                    String mother_office_address = data.mother_office_address;

                    Alumnis.to_alumnis alumni = new Alumnis.to_alumnis(id, created_at, updated_at, created_by, updated_by, status, upload_status, alumni_no, student_no, fname, mi, lname, sname, gender, civil_status, bday, landline_no, email_address, cellphone_no, graduated_in, graduated_on, level, course, major, motto_in_life, password, father_name, father_is_alumni, father_occupation, father_office_address, mother_name, mother_is_alumni, mother_occupation, mother_office_address, true);
                    Alumnis.update_data(alumni);
                    ret_official_schedule_types();
                    tbl_official_schedule_types.clearSelection();
                    Alert.set(2, "");
                    jTextField11.grabFocus();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold> 

    private void init_levels() {
        String where = "";
        final List<School_levels.to_school_levels> levels = School_levels.ret_data(where);

        Object[][] obj = new Object[levels.size()][1];
        int i = 0;
        for (School_levels.to_school_levels to : levels) {
            obj[i][0] = " " + to.level;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField8.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField8, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                School_levels.to_school_levels to = levels.get(data.selected_row);
                jTextField8.setText(to.level);
            }
        });
    }

    private void init_courses() {
        String where = "";
        final List<Courses.to_courses> levels = Courses.ret_data(where);

        Object[][] obj = new Object[levels.size()][1];
        int i = 0;
        for (Courses.to_courses to : levels) {
            obj[i][0] = " " + to.course;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField9.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField9, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Courses.to_courses to = levels.get(data.selected_row);
                jTextField9.setText(to.course);
            }
        });
    }

    private void init_course_majors() {
        String where = "";
       final  List<Course_majors.to_course_majors> levels = Course_majors.ret_data(where);

        Object[][] obj = new Object[levels.size()][1];
        int i = 0;
        for (Course_majors.to_course_majors to : levels) {
            obj[i][0] = " " + to.major;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField9.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField9, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Course_majors.to_course_majors to = levels.get(data.selected_row);
                jTextField9.setText(to.major);
            }
        });
    }
}
