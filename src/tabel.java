
import com.mysql.cj.xdevapi.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.net.www.protocol.http.HttpURLConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class tabel extends javax.swing.JFrame {
double Lek_$=1.1;
double dollar_$=1;
double euro_$=0.85;
double Lek_E=1.2;
double dollar_E=1.19;
double euro_E=1;
double Lek_L=1;
double dollar_L=0.92;
double euro_L=0.8;
    /**
     * Creates new form tabel
     */
    public tabel() {
        
        initComponents();
          PreparedStatement st;
                
                try {
                   String querry="SELECT `Emer`, `Mbiemer`, `Shuma`,  `Emer_babai`, `Monedha` FROM `te_dhenatklient` ";
                   st=lidhja.getConnection().prepareStatement(querry);
                   ResultSet rs=st.executeQuery();
                   DefaultTableModel tm = (DefaultTableModel)Tabela1.getModel();
                    tm.setRowCount(0);
                    while(rs.next())
                    {
                        Object o[]={rs.getString("Emer"),rs.getString("Mbiemer"),rs.getString("Shuma"),rs.getString("Monedha"),rs.getString("Emer_babai")
                    };
                     tm.addRow(o);
                   
                } }
                catch (SQLException ex) {
                  
                }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Currency = new javax.swing.JComboBox();
        Teksti = new javax.swing.JTextField();
        jconvert = new javax.swing.JButton();
        resetbt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jconverted = new javax.swing.JLabel();
        Currency1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Emer", "Mbiemer", "Shuma", "Monedha", "Emri i babait"
            }
        ));
        jScrollPane2.setViewportView(Tabela1);

        jPanel1.setBackground(new java.awt.Color(102, 0, 255));
        jPanel1.setForeground(new java.awt.Color(102, 0, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Konverto");

        Currency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zgjidh", "Dollar", "Euro", "LEK" }));
        Currency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrencyActionPerformed(evt);
            }
        });

        jconvert.setText("Konverto");
        jconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconvertActionPerformed(evt);
            }
        });

        resetbt.setText("Ribej");
        resetbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtActionPerformed(evt);
            }
        });

        jButton3.setText("Hiq");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Currency1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zgjidh", "Dollar", "Euro", "LEK" }));
        Currency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Currency1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nga:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Ne:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Sasia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(461, 461, 461))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(resetbt)
                        .addGap(101, 101, 101)
                        .addComponent(jconvert)
                        .addGap(130, 130, 130)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Currency1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Currency, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(Teksti, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jconverted, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Currency1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Currency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jconverted, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jconvert)
                                    .addComponent(resetbt))
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Teksti, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void resetbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtActionPerformed
jconverted.setText(null);
Teksti.setText(null);
Currency.setSelectedIndex(0);
// TODO add your handling code here:
    }//GEN-LAST:event_resetbtActionPerformed

    private void CurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrencyActionPerformed

    private void jconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconvertActionPerformed
Double Zgjidh=Double.parseDouble(Teksti.getText()); 
if( Currency.getSelectedItem().equals("LEK") &&  Currency1.getSelectedItem().equals("Dollar")){
    String con1=String.format("Shuma:%.2f",Zgjidh*Lek_$);
    jconverted.setText(con1);

    
    }              
else if( Currency.getSelectedItem().equals("Euro") &&  Currency1.getSelectedItem().equals("Dollar")){
    String con1=String.format("Shuma:%.2f",Zgjidh*euro_$);
    jconverted.setText(con1);

    
    }              
else if( Currency.getSelectedItem().equals("Dollar") &&  Currency1.getSelectedItem().equals("Dollar")){
    String con1=String.format("Shuma:%.2f",Zgjidh*dollar_$);
    jconverted.setText(con1);

    
    }     
                                   
else if( Currency.getSelectedItem().equals("LEK") &&  Currency1.getSelectedItem().equals("Euro")){
    String con1=String.format("Shuma:%.2f",Zgjidh*Lek_E);
    jconverted.setText(con1);

    
    }              
else if( Currency.getSelectedItem().equals("Euro")&& Currency1.getSelectedItem().equals("Euro")){
    String con1=String.format("Shuma:%.2f",Zgjidh*euro_E);
    jconverted.setText(con1);

    
    }              
else if( Currency.getSelectedItem().equals("Dollar")&& Currency1.getSelectedItem().equals("Euro")){
    String con1=String.format("Shuma:%.2f",Zgjidh*dollar_E);
    jconverted.setText(con1);

    
    }     
else if( Currency.getSelectedItem().equals("LEK")&&Currency.getSelectedItem().equals("LEK")){
    String con1=String.format("Shuma:%.2f",Zgjidh*Lek_L);
    jconverted.setText(con1);

    
    }              
else if( Currency.getSelectedItem().equals("Euro")&&Currency1.getSelectedItem().equals("LEK")){
    String con1=String.format("Shuma:%.2f",Zgjidh*euro_L);
    jconverted.setText(con1);

    
    }  
else if ( Currency.getSelectedItem().equals("Dollar")&&Currency1.getSelectedItem().equals("LEK")){
    String con1=String.format("Shuma:%.2f",Zgjidh*dollar_L);
    jconverted.setText(con1);

    
    }    


else {
      JOptionPane.showMessageDialog(null,"no");

    
    }//GEN-LAST:event_jconvertActionPerformed
}
    
    
    private void Currency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Currency1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Currency1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Currency;
    private javax.swing.JComboBox Currency1;
    private javax.swing.JTable Tabela1;
    private javax.swing.JTextField Teksti;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jconvert;
    private javax.swing.JLabel jconverted;
    private javax.swing.JButton resetbt;
    // End of variables declaration//GEN-END:variables
}
