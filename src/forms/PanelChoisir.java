/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import classes.Choisir;
import classes.Client;
import classes.Service;
import dao.ChoisirDAO;
import dao.ClientDAO;
import dao.ServiceDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import report.ReportChoisir;

/**
 *
 * @author kabor
 */
public class PanelChoisir extends javax.swing.JPanel {

    /**
     * Creates new form PanelChoisir
     */
    public PanelChoisir() {
        initComponents();
        combo_service();
        combo_client();
        liste_choix();
        numchx.setText(Integer.toString(nombreAbonnes()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_service = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_client = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_enregistrer = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        btn_modifier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_choix = new javax.swing.JTable();
        btn_imprimer = new javax.swing.JButton();
        numchx = new javax.swing.JLabel();
        txt_rechercher = new javax.swing.JTextField();
        loup = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choix du Client", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Teko", 1, 36))); // NOI18N

        jLabel2.setText("Service");

        jLabel3.setText("Client");

        btn_enregistrer.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_enregistrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/save_50px.png"))); // NOI18N
        btn_enregistrer.setText("Enregistrer");
        btn_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enregistrerActionPerformed(evt);
            }
        });

        btn_supprimer.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/Delete_48px.png"))); // NOI18N
        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        btn_modifier.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/icons8-modify-48.png"))); // NOI18N
        btn_modifier.setText("Modifier");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        tb_choix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_choisir", "Libelle d'un service", "Prenom du client"
            }
        ));
        tb_choix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_choixMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_choix);

        btn_imprimer.setFont(new java.awt.Font("Painting With Chocolate", 0, 11)); // NOI18N
        btn_imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/btn/icons8-print-48.png"))); // NOI18N
        btn_imprimer.setText("Imprimer");
        btn_imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimerActionPerformed(evt);
            }
        });

        numchx.setBackground(new java.awt.Color(255, 255, 255));
        numchx.setForeground(new java.awt.Color(255, 255, 255));

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_imprimer)
                            .addComponent(numchx, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_enregistrer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modifier)
                        .addGap(18, 18, 18)
                        .addComponent(btn_supprimer)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_service, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_client, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loup)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loup)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                        .addComponent(numchx, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enregistrerActionPerformed
        ChoisirDAO edao = new ChoisirDAO();
        ServiceDAO sdao = new ServiceDAO();
        ClientDAO cdao = new ClientDAO();

        //String IDS = txt_service.getSelectedItem().toString();
        String LibelleS = txt_service.getSelectedItem().toString();

        //String ID_Client = txt_client.getSelectedItem().toString();
        String Prenom = txt_client.getSelectedItem().toString();

        if (LibelleS.equals("") || Prenom.equals("")) {
            JOptionPane.showMessageDialog(this, "Veillez renseigner tous les champs!");
        } else {
            int IDS = sdao.getIdService(LibelleS);
            int ID_Client = cdao.getIdClient(Prenom);

            Choisir choix = new Choisir(sdao.getIdService(LibelleS), cdao.getIdClient(Prenom));
            edao.inserer(choix);
            vider();
            liste_choix();
        }
    }//GEN-LAST:event_btn_enregistrerActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = tb_choix.getSelectedRow();

        if(index==-1) {
            JOptionPane.showMessageDialog(this, "Veillez selectionner une ligne!");
        } else {
            int id = (int) tb_choix.getValueAt(index, 0);
            ChoisirDAO edao = new ChoisirDAO();
            edao.supprimer(id);
            vider();
            liste_choix();
        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        ChoisirDAO edao = new ChoisirDAO();
        ServiceDAO sdao = new ServiceDAO();
        ClientDAO cdao = new ClientDAO();

        //String IDS = txt_service.getSelectedItem().toString();
        String LibelleS = txt_service.getSelectedItem().toString();
        
        //String ID_Client = txt_client.getSelectedItem().toString();
        String Prenom = txt_client.getSelectedItem().toString();

        if (LibelleS.equals("") || Prenom.equals("")) {
            JOptionPane.showMessageDialog(this, "Veillez renseigner tous les champs!");
        } else {
            int index = tb_choix.getSelectedRow();
            int id = (int) tb_choix.getValueAt(index, 0);
            Choisir choix = new Choisir(sdao.getIdService(LibelleS), cdao.getIdClient(Prenom));
            int IDS = sdao.getIdService(LibelleS);
            int ID_Client = cdao.getIdClient(Prenom);
            edao.modifier(choix, id);
            vider();
            liste_choix();
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void tb_choixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_choixMouseClicked
        int index = tb_choix.getSelectedRow();

        if(index!=-1) {
            int id = (int) tb_choix.getValueAt(index, 0);
            ChoisirDAO edao = new ChoisirDAO();
            Choisir choixl = edao.rechercher(id);

            txt_service.setSelectedItem(choixl.getIDS());
            txt_client.setSelectedItem(choixl.getID_Client());
        }
    }//GEN-LAST:event_tb_choixMouseClicked

    private void btn_imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimerActionPerformed
        ReportChoisir re = new ReportChoisir();
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
        DefaultTableModel model = (DefaultTableModel) tb_choix.getModel();
        TableRowSorter sorter = new TableRowSorter(model);
        tb_choix.setRowSorter(sorter);
        String rech = txt_rechercher.getText();
        sorter.setRowFilter(RowFilter.regexFilter(rech));
    }//GEN-LAST:event_txt_rechercherKeyReleased


    private void combo_service() {
        ServiceDAO sdao = new ServiceDAO();
        List<Service> service = sdao.liste();
        txt_service.addItem("");
        for(int i = 0; i < service.size(); i++) {
            //txt_service.addItem(service.get(i).getIDS()+"");
            txt_service.addItem(service.get(i).getLibelleS());
            sdao.rechercher(service.get(i).getIDS()).getLibelleS();
       }
    }
    
    private void combo_client() {
        ClientDAO cdao = new ClientDAO();
        List<Client> client = cdao.liste();
        txt_client.addItem("");
        for(int i = 0; i < client.size(); i++) {
            //txt_client.addItem(client.get(i).getID_Client()+"");
            txt_client.addItem(client.get(i).getPrenom());
            cdao.rechercher(client.get(i).getID_Client()).getPrenom();
       }
    }
    
 
    private void liste_choix() {
        ChoisirDAO edao = new ChoisirDAO();
        ServiceDAO sdao = new ServiceDAO();
        ClientDAO cdao = new ClientDAO();
        
        List<Choisir> choisir = edao.liste();
        
        for(int i = 0; i < choisir.size(); i++) {
            ((DefaultTableModel) tb_choix.getModel()).addRow(new Object[] {
            choisir.get(i).getId_choisir(),
            
            //choisir.get(i).getIDS(),
            sdao.rechercher(choisir.get(i).getIDS()).getLibelleS(),
            
            //choisir.get(i).getID_Client(),
            cdao.rechercher(choisir.get(i).getID_Client()).getPrenom(),
            
        });
       }
    }

   public void vider() {
        txt_service.setSelectedItem("");
        txt_client.setSelectedItem("");
        
        DefaultTableModel model = (DefaultTableModel) tb_choix.getModel();
        int n = model.getRowCount();
        for(int i = n - 1; i >= 0; --i) {
            model.removeRow(i);
        }
   }
   
   public int nombreAbonnes() {
        
        int rowsCount = tb_choix.getRowCount();
        
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loup;
    public static javax.swing.JLabel numchx;
    private javax.swing.JTable tb_choix;
    private javax.swing.JComboBox<String> txt_client;
    private javax.swing.JTextField txt_rechercher;
    private javax.swing.JComboBox<String> txt_service;
    // End of variables declaration//GEN-END:variables
}
