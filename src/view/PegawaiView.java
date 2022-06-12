/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author asus
 */
import control.PegawaiControl;
import control.AkunPegawaiControl;
import exception.InputanKosongException;
import exception.NegativeInputException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Pegawai;
import model.AkunPegawai;
import table.TableAkunPegawai;
public class PegawaiView extends javax.swing.JFrame {
    private AkunPegawaiControl akunPegawaiControl;
    private PegawaiControl pegawaiControl;
    String action = null;
    List<Pegawai> listPegawai;
    List<AkunPegawai> listAkunPegawai;
    private Pegawai pegawai;
    int selectedId = 0;
    int selectedId2 = 0;
    /**
     * Creates new form PegawaiView
     */
    public PegawaiView() {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        akunPegawaiControl = new AkunPegawaiControl();
        pegawaiControl = new PegawaiControl();
        showTransaksi();
    }
    
    public PegawaiView(Pegawai pegawai) {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        akunPegawaiControl = new AkunPegawaiControl();
        pegawaiControl = new PegawaiControl();
        showTransaksi();
        this.pegawai = pegawai;
    }
    
    public void showTransaksi() {
        tableAkunPegawai.setModel(akunPegawaiControl.showDataAkunPegawai(""));
    }
    
    public void setComponent (boolean value) {
        
        namaPegawaiInput.setEnabled(value);
        shifMulaiInput.setEnabled(value);
        shiftSelesaiInput.setEnabled(value);
        gajiInput.setEnabled(value);
        emailInput.setEnabled(value);
        usernameInput.setEnabled(value);
        passwordInput.setEnabled(value);
        
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
        
    }
    
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    public void clearText() {
        searchInput.setText("");
        namaPegawaiInput.setText("");
        shifMulaiInput.setText("");
        shiftSelesaiInput.setText("");
        gajiInput.setText("");
        emailInput.setText("");
        usernameInput.setText("");
        passwordInput.setText("");
    }
    
    public void InputanKosongException() throws InputanKosongException{
        if (namaPegawaiInput.getText().isEmpty() || shiftSelesaiInput.getText().isEmpty() 
                || shifMulaiInput.getText().isEmpty() || gajiInput.getText().isEmpty()
                   || emailInput.getText().isEmpty() || usernameInput.getText().isEmpty()
                    || passwordInput.getText().isEmpty()) {
            throw new InputanKosongException();
        }
    }
    
    public void NegativeInputException() throws NegativeInputException {
        if ( Integer.parseInt(gajiInput.getText()) < 0) {
            throw new NegativeInputException();
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

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        panelRound1 = new view.PanelRound();
        panelRound3 = new view.PanelRound();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAkunPegawai = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        panelRound4 = new view.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        panelRound2 = new view.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        namaPegawaiInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        shifMulaiInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        shiftSelesaiInput = new javax.swing.JTextField();
        gajiInput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        passwordInput = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(242, 217, 99));
        mainPanel.setForeground(new java.awt.Color(0, 0, 0));

        panelRound1.setBackground(new java.awt.Color(81, 175, 157));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        panelRound3.setBackground(new java.awt.Color(48, 81, 90));
        panelRound3.setRoundBottomLeft(10);
        panelRound3.setRoundBottomRight(10);
        panelRound3.setRoundTopLeft(10);
        panelRound3.setRoundTopRight(10);

        searchInput.setHighlighter(null);
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(81, 175, 157));
        searchBtn.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(48, 81, 90));
        searchBtn.setText("Cari");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        tableAkunPegawai.setModel(new javax.swing.table.DefaultTableModel(
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
        tableAkunPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAkunPegawaiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableAkunPegawai);

        deleteBtn.setBackground(new java.awt.Color(239, 50, 64));
        deleteBtn.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(252, 233, 201));
        deleteBtn.setText("Hapus");
        deleteBtn.setBorderPainted(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(252, 233, 201));
        editBtn.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(48, 81, 90));
        editBtn.setText("Edit");
        editBtn.setBorderPainted(false);
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(243, 161, 97));
        addBtn.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(48, 81, 90));
        addBtn.setText("Tambah Pegawai");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBtn))
                            .addGroup(panelRound3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn)))
                        .addGap(22, 22, 22))))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(editBtn)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        panelRound4.setBackground(new java.awt.Color(48, 81, 90));
        panelRound4.setRoundBottomLeft(5);
        panelRound4.setRoundBottomRight(7);
        panelRound4.setRoundTopLeft(7);
        panelRound4.setRoundTopRight(7);

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(252, 233, 201));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DAFTAR PEGAWAI");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelRound2.setBackground(new java.awt.Color(243, 161, 97));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(48, 81, 90));
        jLabel1.setText("Nama ");

        namaPegawaiInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaPegawaiInput.setText("asdasd");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 81, 90));
        jLabel2.setText("Shif Mulai");

        shifMulaiInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(48, 81, 90));
        jLabel3.setText("Shif Selesai");

        shiftSelesaiInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        gajiInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(48, 81, 90));
        jLabel11.setText("Gaji");

        emailInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(48, 81, 90));
        jLabel12.setText("E-mail Aktif");

        saveBtn.setBackground(new java.awt.Color(81, 175, 157));
        saveBtn.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(48, 81, 90));
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(252, 233, 201));
        cancelBtn.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(48, 81, 90));
        cancelBtn.setText("Batal");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(48, 81, 90));
        jLabel14.setText("Password");

        jLabel13.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(48, 81, 90));
        jLabel13.setText("Username");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(namaPegawaiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(gajiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(shiftSelesaiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(shifMulaiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(passwordInput)
                        .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn)
                .addGap(21, 21, 21))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaPegawaiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shifMulaiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shiftSelesaiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gajiInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LogoUtama.png"))); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel15)
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        setComponent(true);
        clearText();
        action = "Tambah";
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane,"Apakah yakin ingin menambah data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                InputanKosongException();
                NegativeInputException();

                if(action.equals("Tambah")){
                    int result = 0;
                    listAkunPegawai = akunPegawaiControl.showListAkunPegawai("");
                    for (int i = 0; i < listAkunPegawai.size(); i++) {
                        if(usernameInput.getText().equals(listAkunPegawai.get(i).getUsername()))
                            result = 1;        
                    }
                    
                    if(result == 0){
                        Pegawai P = new Pegawai (selectedId,namaPegawaiInput.getText(),shifMulaiInput.getText(), shiftSelesaiInput.getText(),Double.parseDouble(gajiInput.getText()), emailInput.getText());
                        pegawaiControl.insertDataPegawai(P);
                        listPegawai = pegawaiControl.showListPegawai();


                        P = listPegawai.get(listPegawai.size()-1);
                        AkunPegawai Ap = new AkunPegawai(selectedId,P,usernameInput.getText(), passwordInput.getText());
                        akunPegawaiControl.insertDataAkunPegawai(Ap);
                        JOptionPane.showMessageDialog(null, "Data berhasil ditambah!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Username sudah ada!");
                    }
                    
                }else{
                    Pegawai P = new Pegawai (selectedId,namaPegawaiInput.getText(),shifMulaiInput.getText(), shiftSelesaiInput.getText(),Double.parseDouble(gajiInput.getText()), emailInput.getText());
                    pegawaiControl.updateDataPegawai(P);
                    AkunPegawai Ap = new AkunPegawai(selectedId,P,usernameInput.getText(), passwordInput.getText());
                    akunPegawaiControl.updateDataAkunPegawai(Ap);
                    JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
                }
                


            }catch(InputanKosongException e){
                JOptionPane.showMessageDialog(this, e.message());
            }catch(NegativeInputException e){
                JOptionPane.showMessageDialog(this, e.message());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Inputan Harus Berupa Angka");
            }
        }else {JOptionPane.showMessageDialog(null, "Data tidak jadi diubah!");}
        clearText();
        showTransaksi();
        setComponent(false);
        setEditDeleteBtn(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void tableAkunPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAkunPegawaiMouseClicked
        setEditDeleteBtn(true);
        setComponent(false);
        
        int clickedRow = tableAkunPegawai.getSelectedRow();
        TableModel tableModel = tableAkunPegawai.getModel();

        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 8).toString());
        namaPegawaiInput.setText(tableModel.getValueAt(clickedRow, 0).toString());
        shifMulaiInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        shiftSelesaiInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        gajiInput.setText(tableModel.getValueAt(clickedRow, 3).toString());
        emailInput.setText(tableModel.getValueAt(clickedRow, 4).toString());
        selectedId2 = Integer.parseInt(tableModel.getValueAt(clickedRow, 7).toString());
        usernameInput.setText(tableModel.getValueAt(clickedRow, 5).toString());
        passwordInput.setText(tableModel.getValueAt(clickedRow, 6).toString());
    }//GEN-LAST:event_tableAkunPegawaiMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        setComponent(true);
        action = "Ubah";
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data?","Konfirmasi", JOptionPane.YES_NO_OPTION);
        switch(getAnswer){
            case 0:
            try{
                akunPegawaiControl.deleteDataAkunPegawai(selectedId2);
                pegawaiControl.deleteDataPegawai(selectedId);
                clearText();
                showTransaksi();
                setComponent(false);
                setEditDeleteBtn(false);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }catch (Exception e){
                System.out.println("Error : " + e.getMessage());
            }
            break;

            case 1:
                JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus!");
            break;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        clearText();
        setEditDeleteBtn(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        setEditDeleteBtn(false);
        setComponent(false);

        try{
            TableAkunPegawai pegawai = akunPegawaiControl.showDataAkunPegawai(searchInput.getText());
            if(pegawai.getRowCount() == 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(rootPane, "Data tidak ditemukan","Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                tableAkunPegawai.setModel(pegawai);
            }
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PegawaiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PegawaiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField emailInput;
    private javax.swing.JTextField gajiInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField namaPegawaiInput;
    private view.PanelRound panelRound1;
    private view.PanelRound panelRound2;
    private view.PanelRound panelRound3;
    private view.PanelRound panelRound4;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField shifMulaiInput;
    private javax.swing.JTextField shiftSelesaiInput;
    private javax.swing.JTable tableAkunPegawai;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
