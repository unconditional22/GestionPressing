/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import classes.Client;
import dao.ClientDAO;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import report.ReportClients;

/**
 *
 * @author kabor
 */
public class PanelClient extends javax.swing.JPanel {

    /**
     * Creates new form PanelClient
     */
    public PanelClient() {
        initComponents();
        liste_client();
        numclt.setText(Integer.toString(nombreClients()));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_prenom = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btn_enregistrer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_supprimer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_modifier = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_tel = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_ville = new javax.swing.JTextField();
        txt_rue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_client = new javax.swing.JTable();
        txt_dateNaiss = new com.toedter.calendar.JDateChooser();
        btn_imprimer = new javax.swing.JButton();
        numclt = new javax.swing.JLabel();
        txt_rechercher = new javax.swing.JTextField();
        loup = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion Des Clients", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Teko", 1, 36))); // NOI18N
        setMaximumSize(new java.awt.Dimension(733, 440));
        setMinimumSize(new java.awt.Dimension(733, 440));
        setPreferredSize(new java.awt.Dimension(733, 440));

        btn_enregistrer.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_enregistrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/save_50px.png"))); // NOI18N
        btn_enregistrer.setText("Enregistrer");
        btn_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enregistrerActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom");

        btn_supprimer.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/Delete_48px.png"))); // NOI18N
        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        jLabel2.setText("Prenom");

        btn_modifier.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/icons8-modify-48.png"))); // NOI18N
        btn_modifier.setText("Modifier");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        jLabel4.setText("Tel");

        jLabel5.setText("Ville");

        jLabel6.setText("Rue");

        jLabel7.setText("Date de naissance");

        tb_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Client", "Nom", "Prenom", "Email", "Telephone", "Ville", "Rue", "DateNaiss"
            }
        ));
        tb_client.setGridColor(new java.awt.Color(0, 153, 255));
        tb_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_client);

        btn_imprimer.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/icons8-print-48.png"))); // NOI18N
        btn_imprimer.setText("Imprimer");
        btn_imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimerActionPerformed(evt);
            }
        });

        numclt.setBackground(new java.awt.Color(255, 255, 255));
        numclt.setForeground(new java.awt.Color(255, 255, 255));

        txt_rechercher.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        txt_rechercher.setForeground(new java.awt.Color(153, 153, 153));
        txt_rechercher.setText("Entrez Votre Recherche...");
        txt_rechercher.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_rechercherFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_rechercherFocusLost(evt);
            }
        });
        txt_rechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rechercherKeyReleased(evt);
            }
        });

        loup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Dashboard/searchloup1.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dateNaiss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_prenom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ville, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rue)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loup))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numclt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btn_enregistrer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modifier)
                        .addGap(18, 18, 18)
                        .addComponent(btn_supprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_imprimer)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loup)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txt_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txt_dateNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numclt, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enregistrerActionPerformed
        ClientDAO edao = new ClientDAO();
        
        String Nom = txt_nom.getText();
        String Prenom = txt_prenom.getText();
        String Email_client = txt_email.getText();
        String Tel_client = txt_tel.getText();
        String Ville_client = txt_ville.getText();
        String Rue_client = txt_rue.getText();
        Date DateNaiss_client = txt_dateNaiss.getDate();
        
        if (Nom.equals("") || Prenom.equals("") || Email_client.equals("") || Tel_client.equals("") || Ville_client.equals("") || Rue_client.equals("") || DateNaiss_client == null) {
            JOptionPane.showMessageDialog(this, "Veillez renseigner tous les champs!");
        } else {
            Client ct = new Client(Nom, Prenom, Email_client, Tel_client, Ville_client, Rue_client, DateNaiss_client);
            edao.inserer(ct);
            vider();
            liste_client();
        }
    }//GEN-LAST:event_btn_enregistrerActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_client.getSelectedRow();
        
        if(index==-1) {
            JOptionPane.showMessageDialog(this, "Veillez selectionner une ligne!");
        } else {
            int id = (int) tb_client.getValueAt(index, 0);
            ClientDAO edao = new ClientDAO();
            edao.supprimer(id);
            vider();
            liste_client();
        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        ClientDAO edao = new ClientDAO();
        
        String Nom = txt_nom.getText();
        String Prenom = txt_prenom.getText();
        String Email_client = txt_email.getText();
        String Tel_client = txt_tel.getText();
        String Ville_client = txt_ville.getText();
        String Rue_client = txt_rue.getText();
        Date DateNaiss_client = txt_dateNaiss.getDate();
        
        if (Nom.equals("") || Prenom.equals("") || Email_client.equals("") || Tel_client.equals("") || Ville_client.equals("") || Rue_client.equals("") || DateNaiss_client == null) {
            JOptionPane.showMessageDialog(this, "Veillez renseigner tous les champs!");
        } else {
            int index = tb_client.getSelectedRow();
            int id = (int) tb_client.getValueAt(index, 0);
            Client ct = new Client(Nom, Prenom, Email_client, Tel_client, Ville_client, Rue_client, DateNaiss_client);
            edao.modifier(ct, id);
            vider();
            liste_client();
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void tb_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientMouseClicked
        int index = tb_client.getSelectedRow();
        
        if(index!=-1) {
            int id = (int) tb_client.getValueAt(index, 0);
            ClientDAO edao = new ClientDAO();
            Client ctl = edao.rechercher(id);
            
            txt_nom.setText(ctl.getNom());
            txt_prenom.setText(ctl.getPrenom());
            txt_email.setText(ctl.getEmail_client());
            txt_tel.setText(ctl.getTel_client());
            txt_ville.setText(ctl.getVille_client());
            txt_rue.setText(ctl.getRue_client());
            txt_dateNaiss.setDate(ctl.getDateNaiss_client()); 
        }
        
        
    }//GEN-LAST:event_tb_clientMouseClicked

    private void btn_imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimerActionPerformed
        ReportClients re = new ReportClients();
        re.afficher_report();
    }//GEN-LAST:event_btn_imprimerActionPerformed

    private void txt_rechercherFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_rechercherFocusGained
        if(txt_rechercher.getText().equals("Entrez Votre Recherche...")){
            txt_rechercher.setText("");
            txt_rechercher.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txt_rechercherFocusGained

    private void txt_rechercherFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_rechercherFocusLost
        if(txt_rechercher.getText().equals("")){
            txt_rechercher.setText("Entrez Votre Recherche...");
            txt_rechercher.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txt_rechercherFocusLost

    private void txt_rechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rechercherKeyReleased
        DefaultTableModel model = (DefaultTableModel) tb_client.getModel();
        TableRowSorter sorter = new TableRowSorter(model);
        tb_client.setRowSorter(sorter);
        String rech = txt_rechercher.getText();
        sorter.setRowFilter(RowFilter.regexFilter(rech));
    }//GEN-LAST:event_txt_rechercherKeyReleased


    private void liste_client() {
        ClientDAO edao = new ClientDAO();
        List<Client> client = edao.liste();
        
        for(int i = 0; i < client.size(); i++) {
            ((DefaultTableModel) tb_client.getModel()).addRow(new Object[] {
            client.get(i).getID_Client(),
            client.get(i).getNom(),
            client.get(i).getPrenom(),
            client.get(i).getEmail_client(),
            client.get(i).getTel_client(),
            client.get(i).getVille_client(),
            client.get(i).getRue_client(),
            client.get(i).getDateNaiss_client()
        });
       }
    }

   public void vider() {
        txt_nom.setText("");
        txt_prenom.setText("");
        txt_email.setText("");
        txt_tel.setText("");
        txt_ville.setText("");
        txt_rue.setText("");
        txt_dateNaiss.setDate(null); 
        
        DefaultTableModel model = (DefaultTableModel) tb_client.getModel();
        int n = model.getRowCount();
        for(int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
    }
    
    public int nombreClients() {
        
        int rowsCount = tb_client.getRowCount();
        
        for(int i = 0; i < rowsCount; i++){
            int num = rowsCount;
        } 
        return rowsCount;
     }
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enregistrer;
    private javax.swing.JButton btn_imprimer;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loup;
    public static javax.swing.JLabel numclt;
    private javax.swing.JTable tb_client;
    private com.toedter.calendar.JDateChooser txt_dateNaiss;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    private javax.swing.JTextField txt_rechercher;
    private javax.swing.JTextField txt_rue;
    private javax.swing.JFormattedTextField txt_tel;
    private javax.swing.JTextField txt_ville;
    // End of variables declaration//GEN-END:variables
}
