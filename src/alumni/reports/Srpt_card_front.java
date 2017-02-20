/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumni.reports;

import java.io.InputStream;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Guinness
 */
public class Srpt_card_front {

    public final String background_path;
    public final String photo_path;
    public final String id_no;
    public final String name;
    public final String signature_path;

    public Srpt_card_front(String background_path, String photo_path, String id_no, String name, String signature_path) {
        this.background_path = background_path;
        this.photo_path = photo_path;
        this.id_no = id_no;
        this.name = name;
        this.signature_path = signature_path;
    }

    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String background_path = home + "\\images_alumni\\template\\default_front.jpg";
        
        String photo_path = home+ "\\images_alumni\\users\\3.jpg";
        String id_no = "000000000000011";
        String name = "Mary Josephine Teves Bandiola Mary Josephine Teves Bandiola";
        String signature_path = "";
        Srpt_card_front rpt = new Srpt_card_front(background_path, photo_path, id_no, name, signature_path);

        String jrxml = "rpt_card_front.jrxml";
        JRViewer viewer = Srpt_card_front.get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_card_front.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_card_front to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

}
