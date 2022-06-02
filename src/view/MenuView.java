
package view;

import control.MenuControl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Menu;
import dao.MenuDAO;
import table.TableMenu;
import exception.InputanKosongException;

/**
 *
 * @author asus
 */
public class MenuView extends javax.swing.JFrame {
    
    private MenuControl menuControl;
    String action = null;
    List<Menu> listMenu;
    int selectedId = 0;

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
        setComponents(false);
        setEditDeleteBtn(false);
        menuControl = new MenuControl();
        showMenu();
        setRadioKategori(false);
//        setActionCommandRadio();
    }
    
    public void setComponents(boolean value){
        
        cancelAddingMenuBtn.setEnabled(value);
        saveMenuBtn.setEnabled(value);
        
        namaMenuInput.setEnabled(value);
        deskripsiMenuInput.setEnabled(value);
        hargaMenuInput.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value){
        editMenuBtn.setEnabled(value);
        deleteMenuBtn.setEnabled(value);
    }
    
    public void setRadioKategori(boolean value){
        makananjRadioButton.setEnabled(value);
        minumanjRadioButton.setEnabled(value);
    }
    
    public void showMenu(){
        tableMenu.setModel(menuControl.showDataMenu(""));
    }
    
    public void clearText(){
        searchInput.setText("");
        namaMenuInput.setText("");
        deskripsiMenuInput.setText("");
        hargaMenuInput.setText("");
        
        kategoriGroup.clearSelection();
    }
    
//    public void setActionCommandRadio(){
//        makananjRadioButton.setActionCommand("Makanan");
//        minumanjRadioButton.setActionCommand("Minuman");
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kategoriGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        panelRound1 = new view.PanelRound();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        searchInput = new javax.swing.JTextField();
        searchMenuBtn = new javax.swing.JButton();
        editMenuBtn = new javax.swing.JButton();
        deleteMenuBtn = new javax.swing.JButton();
        panelRound2 = new view.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        namaMenuInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        deskripsiMenuInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hargaMenuInput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addMenuBtn = new javax.swing.JButton();
        cancelAddingMenuBtn = new javax.swing.JButton();
        makananjRadioButton = new javax.swing.JRadioButton();
        minumanjRadioButton = new javax.swing.JRadioButton();
        saveMenuBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tambahPegawaiPanel = new view.PanelRound();
        tambahPegawaiLabel = new javax.swing.JLabel();
        riwayatPesananPanel = new view.PanelRound();
        riwayatPesananLabel = new javax.swing.JLabel();
        menuTransaksiPanel = new view.PanelRound();
        menuTransaksiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setForeground(new java.awt.Color(0, 0, 0));

        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMenuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableMenu);

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchMenuBtn.setText("Cari");
        searchMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuBtnActionPerformed(evt);
            }
        });

        editMenuBtn.setText("Ubah Menu");
        editMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuBtnActionPerformed(evt);
            }
        });

        deleteMenuBtn.setText("Hapus Menu");
        deleteMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchMenuBtn))
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRound1Layout.createSequentialGroup()
                            .addComponent(editMenuBtn)
                            .addGap(18, 18, 18)
                            .addComponent(deleteMenuBtn))))
                .addGap(16, 16, 16))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchMenuBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editMenuBtn)
                    .addComponent(deleteMenuBtn))
                .addGap(22, 22, 22))
        );

        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        jLabel1.setText("Nama Menu ");

        jLabel2.setText("Deskripsi Menu");

        jLabel3.setText("Kategori ");

        jLabel11.setText("Harga Menu");

        addMenuBtn.setText("Tambah Menu");
        addMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuBtnActionPerformed(evt);
            }
        });

        cancelAddingMenuBtn.setText("Batal ");
        cancelAddingMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddingMenuBtnActionPerformed(evt);
            }
        });

        kategoriGroup.add(makananjRadioButton);
        makananjRadioButton.setText("Makanan ");
        makananjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makananjRadioButtonActionPerformed(evt);
            }
        });

        kategoriGroup.add(minumanjRadioButton);
        minumanjRadioButton.setText("Minuman");
        minumanjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minumanjRadioButtonActionPerformed(evt);
            }
        });

        saveMenuBtn.setText("Simpan");
        saveMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(namaMenuInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(hargaMenuInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(deskripsiMenuInput, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound2Layout.createSequentialGroup()
                                .addComponent(addMenuBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveMenuBtn)
                                .addGap(74, 74, 74))))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(makananjRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(minumanjRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelAddingMenuBtn)
                .addGap(24, 24, 24))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaMenuInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deskripsiMenuInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makananjRadioButton)
                    .addComponent(minumanjRadioButton))
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargaMenuInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMenuBtn)
                    .addComponent(cancelAddingMenuBtn)
                    .addComponent(saveMenuBtn))
                .addGap(29, 29, 29))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Tambah Menu");

        tambahPegawaiPanel.setRoundBottomLeft(10);
        tambahPegawaiPanel.setRoundBottomRight(10);
        tambahPegawaiPanel.setRoundTopLeft(10);
        tambahPegawaiPanel.setRoundTopRight(10);

        tambahPegawaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambahPegawaiLabel.setText("Tambah Pegawai");
        tambahPegawaiLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahPegawaiLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambahPegawaiPanelLayout = new javax.swing.GroupLayout(tambahPegawaiPanel);
        tambahPegawaiPanel.setLayout(tambahPegawaiPanelLayout);
        tambahPegawaiPanelLayout.setHorizontalGroup(
            tambahPegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tambahPegawaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        tambahPegawaiPanelLayout.setVerticalGroup(
            tambahPegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tambahPegawaiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        riwayatPesananPanel.setRoundBottomLeft(10);
        riwayatPesananPanel.setRoundBottomRight(10);
        riwayatPesananPanel.setRoundTopLeft(10);
        riwayatPesananPanel.setRoundTopRight(10);

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

        menuTransaksiPanel.setRoundBottomLeft(10);
        menuTransaksiPanel.setRoundBottomRight(10);
        menuTransaksiPanel.setRoundTopLeft(10);
        menuTransaksiPanel.setRoundTopRight(10);

        menuTransaksiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTransaksiLabel.setText("Menu Transaksi");
        menuTransaksiLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTransaksiLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuTransaksiPanelLayout = new javax.swing.GroupLayout(menuTransaksiPanel);
        menuTransaksiPanel.setLayout(menuTransaksiPanelLayout);
        menuTransaksiPanelLayout.setHorizontalGroup(
            menuTransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTransaksiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        menuTransaksiPanelLayout.setVerticalGroup(
            menuTransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTransaksiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuTransaksiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(riwayatPesananPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tambahPegawaiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(menuTransaksiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(riwayatPesananPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahPegawaiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
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

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void addMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuBtnActionPerformed
        // tambah menu
        setComponents(true);
        setRadioKategori(true);
        kategoriGroup.clearSelection();
        
        clearText();
        searchInput.setText("");
        action = "Tambah";
    }//GEN-LAST:event_addMenuBtnActionPerformed

    private void makananjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makananjRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makananjRadioButtonActionPerformed

    private void minumanjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minumanjRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minumanjRadioButtonActionPerformed

    private void menuTransaksiLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTransaksiLabelMouseClicked
        // klik panel menu transaksi
        TransaksiView tv = new TransaksiView();
        this.dispose();
        tv.setVisible(true);
    }//GEN-LAST:event_menuTransaksiLabelMouseClicked

    private void riwayatPesananLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayatPesananLabelMouseClicked
        // klik panel riwayat pesanan
        HistoryView hv = new HistoryView();
        this.dispose();
        hv.setVisible(true);
    }//GEN-LAST:event_riwayatPesananLabelMouseClicked

    private void tambahPegawaiLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahPegawaiLabelMouseClicked
        // klik panel tambah pegawai
        PegawaiView pv = new PegawaiView();
        this.dispose();
        pv.setVisible(true);
    }//GEN-LAST:event_tambahPegawaiLabelMouseClicked

    private void searchMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuBtnActionPerformed
        // TODO add your handling code here:
        setEditDeleteBtn(false);
        setComponents(false);
        
        try{
            TableMenu menu = menuControl.showDataMenu(searchInput.getText());
            if(menu.getRowCount()== 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Menu tidak ditemukan",
                        "Konfimasi", JOptionPane.DEFAULT_OPTION);
            } else {
                tableMenu.setModel(menu);
            }
        }catch(Exception e){
            System.out.println("error : " + e.getMessage());
        }
    }//GEN-LAST:event_searchMenuBtnActionPerformed

    private void editMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuBtnActionPerformed
        // edit menu
        setComponents(true);
        setRadioKategori(true);
        action = "Ubah";
        showMenu();
        
    }//GEN-LAST:event_editMenuBtnActionPerformed

    private void deleteMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuBtnActionPerformed
        // hapus menu
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus menu ini?",
                        "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        switch(getAnswer){
            case 0:
                try{
                    menuControl.deleteDataMenu(selectedId);
                    clearText();
                    showMenu();
                    setComponents(false);
                    setEditDeleteBtn(false);
                    setRadioKategori(false);
                }catch(Exception e){
                    System.out.println("Error " + e.getMessage());
                }
                break;
            case 1:
                JOptionPane.showConfirmDialog(null, "Data batal dihapus!", 
                        "Konfirmasi", JOptionPane.CLOSED_OPTION);
                break;
        }
    }//GEN-LAST:event_deleteMenuBtnActionPerformed

    private void saveMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuBtnActionPerformed
        // simpan
        
        
        try{
            String kategori = "";

            if(makananjRadioButton.isSelected()){
                kategori = "Makanan";
            } else if(minumanjRadioButton.isSelected()){
                kategori = "Minuman";
            }

            Menu m = new Menu(selectedId, namaMenuInput.getText(), deskripsiMenuInput.getText(),
                    kategori, Integer.parseInt(hargaMenuInput.getText()));

            if(action.equals("Tambah")){
                menuControl.insertDataMenu(m);
            } else {
                menuControl.updateDataMenu(m);
            }

            clearText();
            showMenu();
            setComponents(false);
            setRadioKategori(false);
            kategoriGroup.clearSelection();

            setEditDeleteBtn(false);
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_saveMenuBtnActionPerformed

    private void tableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMenuMouseClicked
        int indexMenu = -1;
        setEditDeleteBtn(true);
        setComponents(false);
        setRadioKategori(false);
        
        kategoriGroup.clearSelection();
        
        int clickedRow = tableMenu.getSelectedRow();
        TableModel tableModel = tableMenu.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
        namaMenuInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        deskripsiMenuInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        hargaMenuInput.setText(tableModel.getValueAt(clickedRow, 4).toString());
        
        String selectedKategori = tableModel.getValueAt(clickedRow, 3).toString();
        switch(selectedKategori){
            case "Makanan":
                makananjRadioButton.setSelected(true);
                break;
            case "Minuman":
                minumanjRadioButton.setSelected(true);
                break;
        }
        
    }//GEN-LAST:event_tableMenuMouseClicked

    private void cancelAddingMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddingMenuBtnActionPerformed
        // btn cancel
        setComponents(false);
        setEditDeleteBtn(false);
        setRadioKategori(false);
        clearText();
    }//GEN-LAST:event_cancelAddingMenuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMenuBtn;
    private javax.swing.JButton cancelAddingMenuBtn;
    private javax.swing.JButton deleteMenuBtn;
    private javax.swing.JTextField deskripsiMenuInput;
    private javax.swing.JButton editMenuBtn;
    private javax.swing.JTextField hargaMenuInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup kategoriGroup;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton makananjRadioButton;
    private javax.swing.JLabel menuTransaksiLabel;
    private view.PanelRound menuTransaksiPanel;
    private javax.swing.JRadioButton minumanjRadioButton;
    private javax.swing.JTextField namaMenuInput;
    private view.PanelRound panelRound1;
    private view.PanelRound panelRound2;
    private javax.swing.JLabel riwayatPesananLabel;
    private view.PanelRound riwayatPesananPanel;
    private javax.swing.JButton saveMenuBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JButton searchMenuBtn;
    private javax.swing.JTable tableMenu;
    private javax.swing.JLabel tambahPegawaiLabel;
    private view.PanelRound tambahPegawaiPanel;
    // End of variables declaration//GEN-END:variables
}
