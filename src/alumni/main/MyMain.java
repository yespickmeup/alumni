/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.main;

import alumni.alumni_users.Dlg_alumni_users;
import alumni.utils.Center;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.CloseDialog;


/**
 *
 * @author Guinness
 */
public class MyMain {

    public static void main(String[] args) {
        ret_config();
    }

    private static void ret_config() {
        String home = System.getProperty("user.home") + "\\my_config_alumni.conf";

        try {

            Properties prop = new Properties();
            String conf = "my_config_alumni.conf";
            String userHome = System.getProperty("user.home");
            System.out.println(conf);
            File file = new File(userHome + "/" + conf);
            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                prop.load(is);
            } else {
                file = new File(conf);
                if (file.exists()) {
                    InputStream is = new FileInputStream(file);
                    prop.load(is);
                }
            }
            System.setProperty("home", "");
          
            System.setProperty("pool_host", prop.getProperty("pool_host", "localhost"));
            System.out.println("local_ip: " + System.getProperty("local_ip"));
            System.out.println("pool_host: " + System.getProperty("pool_host"));
            System.setProperty("license_code", prop.getProperty("license_code", ""));
            System.setProperty("version", prop.getProperty("version", ""));
            System.setProperty("pool_port", prop.getProperty("pool_port", "3306"));
            System.setProperty("pool_user", prop.getProperty("pool_user", "root"));
            System.setProperty("pool_password", prop.getProperty("pool_password", "password"));
            System.setProperty("pool_db", prop.getProperty("pool_db", "db_alumni"));
            System.setProperty("cloud_host", prop.getProperty("cloud_host", "128.199.80.53"));
            System.setProperty("cloud_port", prop.getProperty("cloud_port", "3306"));
            System.setProperty("cloud_user", prop.getProperty("cloud_user", "root"));
            System.setProperty("cloud_password", prop.getProperty("cloud_password", "password"));
            System.setProperty("cloud_db", prop.getProperty("cloud_db", "db_algorithm"));
            System.setProperty("terminal_number", prop.getProperty("terminal_number", "0"));
            System.setProperty("hdd_drive", prop.getProperty("hdd_drive", ""));

            //
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Window p = (Window) new JFrame();
            loading nd = loading.create(p, true);
            nd.setTitle("");
            nd.setCallback(new loading.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, loading.OutputData data) {
                    new MyMain().start();
                    closeDialog.ok();
                }
            });
            Center.setCenter(nd);
            nd.setVisible(true);
        }
    }

    private void start() {
        Application.setSystemLookAndFeel();
        Dlg_alumni_users pnl = new Dlg_alumni_users();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());

        pnl.setVisible(true);
        pnl.setSize(xSize, ySize);
    }

    public static String getSerialNumber() {
        String drive = System.getProperty("hdd_drive", "");

        String result = "";
        try {
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);

            String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
                    + "Set colDrives = objFSO.Drives\n"
                    + "Set objDrive = colDrives.item(\"" + drive + "\")\n"
                    + "Wscript.Echo objDrive.SerialNumber";  // see note
            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input
                    = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.trim();
    }
}
