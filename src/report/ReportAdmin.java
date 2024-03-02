/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import dao.Connectdb;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author kabor
 */
public class ReportAdmin {
    public  void afficher_report() {
    try {
     Connection conn = Connectdb.getInstance();
     HashMap param = new HashMap();
			
 JasperPrint print = JasperFillManager.fillReport("ireport/report_admin.jasper", param, conn);
         JRViewer viewer=new JRViewer(print); 

            JFrame frame = new JFrame("LISTE DES ADMINISTRATEURS");
            frame.getContentPane().add(viewer);
            frame.setExtendedState(frame.MAXIMIZED_BOTH);
            frame.pack();
            frame.setVisible(true);
        } catch (JRException ex) {
       Logger.getLogger(ReportAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
