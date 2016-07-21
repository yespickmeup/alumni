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
public class Srpt_cart_back {

    public final String fathers_name;
    public final String contact_no;
    public final String address;

    public Srpt_cart_back(String fathers_name, String contact_no, String address) {
        this.fathers_name = fathers_name;
        this.contact_no = contact_no;
        this.address = address;
    }

    public static void main(String[] args) {
        String fathers_name = "Basilio Pascua Jr.";
        String contact_no = "09161932567";
        String address = "Canlas Subdivision, Lower Bagacay, Dumaguete City,Negros Oriental";

        Srpt_cart_back rpt = new Srpt_cart_back(fathers_name, contact_no, address);

        String jrxml = "rpt_card_back.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_cart_back.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_cart_back to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }
}
