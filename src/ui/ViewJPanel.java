/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CarCatalogHistory;
import model.carCatalog;

/**
 *
 * @author DELL
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    CarCatalogHistory history;
    public ViewJPanel(CarCatalogHistory history) {
        initComponents();
        lbltimeUpdate.setText(history.getTimeUpdate());
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCatalog = new javax.swing.JTable();
        lblSeats = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblMaintainance = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtSerial = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        lblCompany = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblSerial = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        checkAvail = new javax.swing.JCheckBox();
        checkMaintain = new javax.swing.JCheckBox();
        lblUpdatedOn = new javax.swing.JLabel();
        lbltimeUpdate = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CAR CATALOG");

        tblCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COMPANY", "MODEL NO", "SERIAL NO", "YEAR", "SEATS", "AVAILABILITY", "MAINTAINANCE", "CITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCatalogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCatalog);

        lblSeats.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblSeats.setText("No Of Seats :");

        lblAvailability.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblAvailability.setText("Availability :");

        lblMaintainance.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblMaintainance.setText("Maintainance Date :");

        lblCompany.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblCompany.setText("Company :");

        lblModel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblModel.setText("Model No :");

        lblSerial.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblSerial.setText("Serial No :");

        lblYear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblYear.setText("Manufacturing Year :");

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblCity.setText("City :");

        lblUpdatedOn.setText("Last Updated On :");

        lbltimeUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblUpdatedOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltimeUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCity)
                    .addComponent(lblMaintainance)
                    .addComponent(lblAvailability)
                    .addComponent(lblSeats)
                    .addComponent(lblYear)
                    .addComponent(lblSerial)
                    .addComponent(lblCompany)
                    .addComponent(lblModel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtModel)
                        .addComponent(txtSerial)
                        .addComponent(txtYear)
                        .addComponent(txtSeats)
                        .addComponent(txtCity))
                    .addComponent(checkAvail)
                    .addComponent(checkMaintain))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUpdate, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnView)
                    .addComponent(lblUpdatedOn)
                    .addComponent(lbltimeUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerial)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(checkAvail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaintainance)
                    .addComponent(checkMaintain))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUpdate, btnView});

    }// </editor-fold>//GEN-END:initComponents

    private void tblCatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatalogMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCatalogMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        boolean check;
        String alphapattern = "^[a-zA-Z]{1,}$";
        String numpattern = "\\d+";
        
        Pattern aP = Pattern.compile(alphapattern);
        Pattern nP = Pattern.compile(numpattern);
        
        Matcher cM = aP.matcher(txtCompany.getText());
        Matcher mM = aP.matcher(txtModel.getText());
        Matcher ctM = aP.matcher(txtCity.getText());
        Matcher yM = nP.matcher(txtYear.getText());
        Matcher sM = nP.matcher(txtSeats.getText());
        Matcher sr = nP.matcher(txtSerial.getText());
        
         if ((!cM.matches()) || (!mM.matches()) || (!ctM.matches()) || (!yM.matches())|| (!sM.matches()) || (!sr.matches()) )
            {
            check=false;
            }
        else{
                check=true;
            }
         
        if (check == true){
            
        
            int selectedRowIndex = tblCatalog.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)tblCatalog.getModel();
            carCatalog cc = (carCatalog)model.getValueAt(selectedRowIndex, 0);

            cc.setCompany(txtCompany.getText());
            cc.setModel_number(txtModel.getText());
            cc.setSerial_number(Integer.parseInt(txtSerial.getText()));
            cc.setManufacturing_year(Integer.parseInt(txtYear.getText()));
            cc.setSeats(Integer.parseInt(txtSeats.getText()));
            cc.setAvailability(checkAvail.isSelected());
            cc.setMaintainance(checkMaintain.isSelected());
            cc.setCity(txtCity.getText());
            history.updateCars(selectedRowIndex, cc);
            JOptionPane.showMessageDialog(this, "Car Details Updated");

            if(selectedRowIndex >= 0){

                model.setValueAt(txtCompany.getText(),selectedRowIndex, 0);
                model.setValueAt(txtModel.getText(),selectedRowIndex, 1);
                model.setValueAt(txtSerial.getText(),selectedRowIndex, 2);
                model.setValueAt(txtYear.getText(),selectedRowIndex, 3);
                model.setValueAt(txtSeats.getText(),selectedRowIndex, 4);
                model.setValueAt(checkAvail.isSelected(),selectedRowIndex, 5);
                model.setValueAt(checkMaintain.isSelected(),selectedRowIndex, 6);
                model.setValueAt(txtCity.getText(),selectedRowIndex, 7);
            }
            else{

                JOptionPane.showMessageDialog(this, "Error updating");
            }
            }
        
       else {
            JOptionPane.showMessageDialog(this, "ERROR! Enter the correct value in the field.");} 
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCatalog.getSelectedRow();
        
        if(selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "Please Select a Row !");
            return;
        }
       DefaultTableModel model = (DefaultTableModel)tblCatalog.getModel();
       carCatalog cc = (carCatalog)model.getValueAt(selectedRowIndex, 0);
       txtCompany.setText(cc.getCompany());
       txtModel.setText(cc.getModel_number());
       txtSerial.setText(String.valueOf(cc.getSerial_number()));
       txtYear.setText(String.valueOf(cc.getManufacturing_year()));
       txtSeats.setText(String.valueOf(cc.getSeats()));
       checkAvail.setSelected(cc.getAvailability());
       checkMaintain.setSelected(cc.getMaintainance());
       txtCity.setText(cc.getCity());
       
    }//GEN-LAST:event_btnViewActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JCheckBox checkAvail;
    private javax.swing.JCheckBox checkMaintain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblMaintainance;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerial;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdatedOn;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lbltimeUpdate;
    private javax.swing.JTable tblCatalog;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCatalog.getModel();
        model.setRowCount(0);
        
        for(carCatalog cc : history.getHistory()){
            
            Object[] row = new Object[8];
            row[0] = cc;
            row[1] = cc.getModel_number();
            row[2] = cc.getSerial_number();
            row[3] = cc.getManufacturing_year();
            row[4] = cc.getSeats();
            row[5] = cc.getAvailability();
            row[6] = cc.getMaintainance();
            row[7] = cc.getCity();
            
            model.addRow(row);
        }
    }
}
