/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.util.List;
import javax.swing.table.TableModel;
import control.DetailPesananControl;
import control.PesananControl;
import model.DetailPesanan;
import model.Pesanan;
import table.TableDetailPesanan;
import table.TableRiwayat;
/**
 *
 * @author asus
 */
public class HistoryView extends javax.swing.JFrame {
    private DetailPesananControl dpc;
    private PesananControl pc;
    String action = null;
    List<DetailPesanan> listdetailPesanan;
    List<Pesanan> listPesanan;
    int selectedId;
    
    /**
     * Creates new form HistoryView
     */
    public HistoryView() {
        initComponents();
        dpc = new DetailPesananControl();
        pc = new PesananControl();
        showRiwayat();
        showDetailPesanan(0);
    }

    public void showRiwayat(){
        tableRiwayat.setModel(pc.showDataPesanan("", 0, 0));
    }
    
    public void showDetailPesanan(int id){
        tableDetailPesanan.setModel(dpc.showDataDetailPesanan(id));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        panelRound1 = new view.PanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDetailPesanan = new javax.swing.JTable();
        subTotalOutput = new javax.swing.JTextField();
        Sub_total = new javax.swing.JLabel();
        panelRound3 = new view.PanelRound();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableRiwayat = new javax.swing.JTable();
        TransaksiPanel = new view.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        editMenuPanel = new view.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        PegawaiPanel = new view.PanelRound();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setForeground(new java.awt.Color(0, 0, 0));

        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        tableDetailPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDetailPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDetailPesananMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableDetailPesanan);

        subTotalOutput.setEditable(false);

        Sub_total.setText("Sub total Pembelian");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Sub_total)
                        .addGap(7, 7, 7)
                        .addComponent(subTotalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subTotalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub_total))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);

        tableRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableRiwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRiwayatMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableRiwayat);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        TransaksiPanel.setRoundBottomLeft(10);
        TransaksiPanel.setRoundBottomRight(10);
        TransaksiPanel.setRoundTopLeft(10);
        TransaksiPanel.setRoundTopRight(10);
        TransaksiPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransaksiPanelMouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Menu Transaksi");

        javax.swing.GroupLayout TransaksiPanelLayout = new javax.swing.GroupLayout(TransaksiPanel);
        TransaksiPanel.setLayout(TransaksiPanelLayout);
        TransaksiPanelLayout.setHorizontalGroup(
            TransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        TransaksiPanelLayout.setVerticalGroup(
            TransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        editMenuPanel.setRoundBottomLeft(10);
        editMenuPanel.setRoundBottomRight(10);
        editMenuPanel.setRoundTopLeft(10);
        editMenuPanel.setRoundTopRight(10);
        editMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenuPanelMouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Edit Menu");

        javax.swing.GroupLayout editMenuPanelLayout = new javax.swing.GroupLayout(editMenuPanel);
        editMenuPanel.setLayout(editMenuPanelLayout);
        editMenuPanelLayout.setHorizontalGroup(
            editMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        editMenuPanelLayout.setVerticalGroup(
            editMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        PegawaiPanel.setRoundBottomLeft(10);
        PegawaiPanel.setRoundBottomRight(10);
        PegawaiPanel.setRoundTopLeft(10);
        PegawaiPanel.setRoundTopRight(10);
        PegawaiPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PegawaiPanelMouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tambah Pegawai");

        javax.swing.GroupLayout PegawaiPanelLayout = new javax.swing.GroupLayout(PegawaiPanel);
        PegawaiPanel.setLayout(PegawaiPanelLayout);
        PegawaiPanelLayout.setHorizontalGroup(
            PegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PegawaiPanelLayout.setVerticalGroup(
            PegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(TransaksiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PegawaiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PegawaiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TransaksiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(268, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void TransaksiPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransaksiPanelMouseClicked
        // TODO add your handling code here:
        TransaksiView tv = new TransaksiView();
        this.dispose();
        tv.setVisible(true);
    }//GEN-LAST:event_TransaksiPanelMouseClicked

    private void editMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuPanelMouseClicked
        // TODO add your handling code here:
        MenuView mv = new MenuView();
        this.dispose();
        mv.setVisible(true);
    }//GEN-LAST:event_editMenuPanelMouseClicked

    private void PegawaiPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PegawaiPanelMouseClicked
        // TODO add your handling code here:
        PegawaiView pv = new PegawaiView();
        this.dispose();
        pv.setVisible(true);
    }//GEN-LAST:event_PegawaiPanelMouseClicked

    private void tableRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRiwayatMouseClicked
        // TODO add your handling code here:
        int clickedRow = tableRiwayat.getSelectedRow();
        TableModel tableModel = tableRiwayat.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        showDetailPesanan(selectedId);
        
    }//GEN-LAST:event_tableRiwayatMouseClicked

    private void tableDetailPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDetailPesananMouseClicked
        // TODO add your handling code here:
        
        int clickedRow = tableDetailPesanan.getSelectedRow();
        TableModel tableModel = tableDetailPesanan.getModel();
        
        subTotalOutput.setText(tableModel.getValueAt(clickedRow, 3).toString());
        
    }//GEN-LAST:event_tableDetailPesananMouseClicked

    
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
            java.util.logging.Logger.getLogger(HistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.PanelRound PegawaiPanel;
    private javax.swing.JLabel Sub_total;
    private view.PanelRound TransaksiPanel;
    private view.PanelRound editMenuPanel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainPanel;
    private view.PanelRound panelRound1;
    private view.PanelRound panelRound3;
    private javax.swing.JTextField subTotalOutput;
    private javax.swing.JTable tableDetailPesanan;
    private javax.swing.JTable tableRiwayat;
    // End of variables declaration//GEN-END:variables
}
