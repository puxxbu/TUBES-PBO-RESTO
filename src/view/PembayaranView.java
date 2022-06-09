/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import control.MenuControl;
import control.PembeliControl;
import control.PesananControl;
import control.DetailPesananControl;
import exception.InputanKosongException;
import exception.NegativeInputException;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Menu;
import model.TempMenu;
import model.DetailPesanan;
import model.AkunPegawai;
import model.Pegawai;
import model.Pembeli;
import model.Pesanan;
/**
 *
 * @author asus
 */
public class PembayaranView extends javax.swing.JFrame {
    private DetailPesananControl dpc;
    private PesananControl pc;
    private PembeliControl pembeliControl;
    String action = null;
    List<DetailPesanan> listdetailPesanan;
    List<Pesanan> listPesanan;
    private Pegawai pegawai;
    int selectedId;

    public PembayaranView() {
        initComponents();
        dpc = new DetailPesananControl();
        pc = new PesananControl();
        pembeliControl = new PembeliControl();
        showPesanan();
//        showDetailPesanan(0);
    }
    
    public void showPesanan(){
        tableRiwayat.setModel(pc.showDataPesanan());
    }
    
    public void showDetailPesanan(int id){
        tblTempMenu.setModel(dpc.showDataDetailPesanan(id));
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
        panelRound2 = new view.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        totalHargaField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomorHPInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        menuTransksiPanel = new view.PanelRound();
        menuTransaksiLabel = new javax.swing.JLabel();
        riwayatPesananPanel = new view.PanelRound();
        riwayatPesananLabel = new javax.swing.JLabel();
        editMenuPanel = new view.PanelRound();
        editMenuLabel = new javax.swing.JLabel();
        LabelPembeli = new javax.swing.JLabel();
        panelRound3 = new view.PanelRound();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableRiwayat = new javax.swing.JTable();
        panelRound4 = new view.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        namaPembeliInput1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nomorHPInput1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tanggalTransaksiInput2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        namaPegawaiField = new javax.swing.JTextField();
        panelRound1 = new view.PanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTempMenu = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 252, 247));
        mainPanel.setForeground(new java.awt.Color(0, 0, 0));

        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        jLabel1.setText("Total Harga");

        totalHargaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalHargaFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("masukan Uang");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Bayar");

        jButton2.setText("Bayar Pesanan");

        jButton3.setText("Batal");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(312, Short.MAX_VALUE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomorHPInput)
                            .addComponent(totalHargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33))))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(totalHargaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomorHPInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTransksiPanel.setRoundBottomLeft(10);
        menuTransksiPanel.setRoundBottomRight(10);
        menuTransksiPanel.setRoundTopLeft(10);
        menuTransksiPanel.setRoundTopRight(10);
        menuTransksiPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTransksiPanelMouseClicked(evt);
            }
        });

        menuTransaksiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTransaksiLabel.setText("Menu Transaksi");

        javax.swing.GroupLayout menuTransksiPanelLayout = new javax.swing.GroupLayout(menuTransksiPanel);
        menuTransksiPanel.setLayout(menuTransksiPanelLayout);
        menuTransksiPanelLayout.setHorizontalGroup(
            menuTransksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTransaksiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        menuTransksiPanelLayout.setVerticalGroup(
            menuTransksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTransaksiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        riwayatPesananPanel.setRoundBottomLeft(10);
        riwayatPesananPanel.setRoundBottomRight(10);
        riwayatPesananPanel.setRoundTopLeft(10);
        riwayatPesananPanel.setRoundTopRight(10);
        riwayatPesananPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwayatPesananPanelMouseClicked(evt);
            }
        });

        riwayatPesananLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        riwayatPesananLabel.setText("Riwayat Pesanan");
        riwayatPesananLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwayatPesananLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout riwayatPesananPanelLayout = new javax.swing.GroupLayout(riwayatPesananPanel);
        riwayatPesananPanel.setLayout(riwayatPesananPanelLayout);
        riwayatPesananPanelLayout.setHorizontalGroup(
            riwayatPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(riwayatPesananLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        riwayatPesananPanelLayout.setVerticalGroup(
            riwayatPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(riwayatPesananLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
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

        editMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editMenuLabel.setText("Edit Menu");
        editMenuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenuLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editMenuPanelLayout = new javax.swing.GroupLayout(editMenuPanel);
        editMenuPanel.setLayout(editMenuPanelLayout);
        editMenuPanelLayout.setHorizontalGroup(
            editMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        editMenuPanelLayout.setVerticalGroup(
            editMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        LabelPembeli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelPembeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LogoUtama.png"))); // NOI18N

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
                .addContainerGap(116, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);

        jLabel4.setText("NamaPembeli");

        namaPembeliInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPembeliInput1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Nomor HP");

        jLabel12.setText("Tanggal Transaksi");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Detail Pesanan");

        jLabel14.setText("Nama Pegawai");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound4Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addComponent(namaPegawaiField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound4Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(53, 53, 53)
                            .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tanggalTransaksiInput2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(nomorHPInput1)
                                .addComponent(namaPembeliInput1)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPembeliInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nomorHPInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tanggalTransaksiInput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaPegawaiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        tblTempMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTempMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTempMenuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblTempMenu);

        jLabel11.setText("Menu Yang Dipesan");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(LabelPembeli)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(menuTransksiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(riwayatPesananPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(riwayatPesananPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menuTransksiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelPembeli))
                .addGap(22, 22, 22)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
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

    private void menuTransksiPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTransksiPanelMouseClicked
        // klik panel tambah pegawai
        PesananView pv = new PesananView();
        this.dispose();
        pv.setVisible(true);
    }//GEN-LAST:event_menuTransksiPanelMouseClicked

    private void riwayatPesananLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayatPesananLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_riwayatPesananLabelMouseClicked

    private void riwayatPesananPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayatPesananPanelMouseClicked
        // klik panel riwayat pesanan
        HistoryView hv = new HistoryView();
        this.dispose();
        hv.setVisible(true);
    }//GEN-LAST:event_riwayatPesananPanelMouseClicked

    private void editMenuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuLabelMouseClicked
        // klik panel edit menu
        MenuView mv = new MenuView();
        this.dispose();
        mv.setVisible(true);
    }//GEN-LAST:event_editMenuLabelMouseClicked

    private void editMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuPanelMouseClicked
        // klik panel edit menu
        MenuView mv = new MenuView();
        this.dispose();
        mv.setVisible(true);
    }//GEN-LAST:event_editMenuPanelMouseClicked

    private void tableRiwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRiwayatMouseClicked
        // TODO add your handling code here:
        int clickedRow = tableRiwayat.getSelectedRow();
        TableModel tableModel = tableRiwayat.getModel();
       
        
        namaPembeliInput1.setText(tableModel.getValueAt(clickedRow, 1).toString());
        nomorHPInput1.setText(tableModel.getValueAt(clickedRow, 8).toString());
        tanggalTransaksiInput2.setText(tableModel.getValueAt(clickedRow, 4).toString());
        namaPegawaiField.setText(tableModel.getValueAt(clickedRow, 2).toString());
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        showDetailPesanan(selectedId);
        totalHargaField.setText(tableModel.getValueAt(clickedRow, 3).toString());
    }//GEN-LAST:event_tableRiwayatMouseClicked

    private void totalHargaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalHargaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalHargaFieldActionPerformed

    private void namaPembeliInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPembeliInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPembeliInput1ActionPerformed

    private void tblTempMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTempMenuMouseClicked
        // TODO add your handling code here:
        int clickedRow = tblTempMenu.getSelectedRow();
//        List<Menu> tempData = new ArrayList<>();
//        Menu menu = null;
//
//        TableModel tableModel = tblTempMenu.getModel();
//
//        tempData = mc.searchMenu(tableModel.getValueAt(clickedRow, 1).toString());
//        menu = new Menu(tempData.get(0).getNama_menu(),
//            tempData.get(0).getDeskripsi_menu(),
//            tempData.get(0).getKategori(),
//            tempData.get(0).getHarga_menu());
//
//        namaMenuField.setText(menu.getNama_menu());
//        hargaMenuField.setText(Integer.toString(menu.getHarga_menu()));
//        deskripsiMenuField.setText(menu.getDeskripsi_menu());
//        bnyakPesananInputField.setText(tblTempMenu.getValueAt(clickedRow, 2).toString());
//        hapusPesananBtn.setEnabled(true);
    }//GEN-LAST:event_tblTempMenuMouseClicked

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
            java.util.logging.Logger.getLogger(PembayaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembayaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembayaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembayaranView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembayaranView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPembeli;
    private javax.swing.JLabel editMenuLabel;
    private view.PanelRound editMenuPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menuTransaksiLabel;
    private view.PanelRound menuTransksiPanel;
    private javax.swing.JTextField namaPegawaiField;
    private javax.swing.JTextField namaPembeliInput1;
    private javax.swing.JTextField nomorHPInput;
    private javax.swing.JTextField nomorHPInput1;
    private view.PanelRound panelRound1;
    private view.PanelRound panelRound2;
    private view.PanelRound panelRound3;
    private view.PanelRound panelRound4;
    private javax.swing.JLabel riwayatPesananLabel;
    private view.PanelRound riwayatPesananPanel;
    private javax.swing.JTable tableRiwayat;
    private javax.swing.JTextField tanggalTransaksiInput2;
    private javax.swing.JTable tblTempMenu;
    private javax.swing.JTextField totalHargaField;
    // End of variables declaration//GEN-END:variables
}
