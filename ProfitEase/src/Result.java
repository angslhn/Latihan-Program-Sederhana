public class Result extends javax.swing.JFrame {

    private String namaProduk;
    private int jumlahProduk;
    private int hargaPerProduk;
    private int biayaOperasionalProduksi;

    public Result() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelNamaProduk = new javax.swing.JLabel();
        labelProdukTerjual = new javax.swing.JLabel();
        labelHargaProduk = new javax.swing.JLabel();
        labelBiayaOperasional = new javax.swing.JLabel();
        labelBiayaOperasional1 = new javax.swing.JLabel();
        labelBiayaOperasional2 = new javax.swing.JLabel();
        infoHasilKeuntunganSatu = new javax.swing.JLabel();
        infoHasilKeuntunganDua = new javax.swing.JLabel();
        infoNamaProduk = new javax.swing.JLabel();
        infoJumlahProdukTerjual = new javax.swing.JLabel();
        infoHargaPerProduk = new javax.swing.JLabel();
        infoBiayaOperasionalProduksi = new javax.swing.JLabel();
        infoKeuntunganPenjualan = new javax.swing.JLabel();
        buttonKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMASI DATA PRODUK");
        jLabel1.setToolTipText("");

        labelNamaProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelNamaProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaProduk.setText("NAMA PRODUK");

        labelProdukTerjual.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelProdukTerjual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProdukTerjual.setText("JUMLAH PRODUK TERJUAL");

        labelHargaProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelHargaProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHargaProduk.setText("HARGA PER PRODUK");

        labelBiayaOperasional.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelBiayaOperasional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBiayaOperasional.setText("BIAYA PRODUKSI ATAU OPERASIONAL");

        labelBiayaOperasional1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelBiayaOperasional1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBiayaOperasional1.setText("KEUNTUNGAN PENJUALAN");

        labelBiayaOperasional2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        labelBiayaOperasional2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBiayaOperasional2.setText("INFO");

        infoHasilKeuntunganSatu.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        infoHasilKeuntunganSatu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoHasilKeuntunganSatu.setText("Selamat Produk Yang Anda Pasarkan Mengalami Keuntungan Dari Penjualan ");
        infoHasilKeuntunganSatu.setAlignmentY(0.0F);

        infoHasilKeuntunganDua.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        infoHasilKeuntunganDua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoHasilKeuntunganDua.setText("Sebanyak Rp.  100.000.000 Dari Total Biaya Operasional Produksi Yang Di Keluarkan.");

        infoNamaProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        infoNamaProduk.setText("KERIPIK SINGKONG");

        infoJumlahProdukTerjual.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        infoJumlahProdukTerjual.setText("1000 PCS");

        infoHargaPerProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        infoHargaPerProduk.setText("RP. 10.000");

        infoBiayaOperasionalProduksi.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        infoBiayaOperasionalProduksi.setText("RP. 1.450.000");

        infoKeuntunganPenjualan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        infoKeuntunganPenjualan.setText("RP. 6.500.000");

        buttonKembali.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        buttonKembali.setText("KEMBALI");
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelBiayaOperasional2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(infoNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelProdukTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82)
                                                .addComponent(infoJumlahProdukTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(118, 118, 118)
                                                .addComponent(infoHargaPerProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelBiayaOperasional, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(infoBiayaOperasionalProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelBiayaOperasional1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78)
                                                .addComponent(infoKeuntunganPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(104, 104, 104))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(infoHasilKeuntunganDua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(infoHasilKeuntunganSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(112, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelNamaProduk)
                                        .addComponent(infoNamaProduk))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(infoJumlahProdukTerjual)
                                        .addComponent(labelProdukTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(infoHargaPerProduk)
                                        .addComponent(labelHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(infoBiayaOperasionalProduksi)
                                        .addComponent(labelBiayaOperasional, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(infoKeuntunganPenjualan)
                                        .addComponent(labelBiayaOperasional1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(labelBiayaOperasional2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoHasilKeuntunganSatu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoHasilKeuntunganDua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    private javax.swing.JButton buttonKembali;
    private javax.swing.JLabel infoBiayaOperasionalProduksi;
    private javax.swing.JLabel infoHargaPerProduk;
    private javax.swing.JLabel infoHasilKeuntunganDua;
    private javax.swing.JLabel infoHasilKeuntunganSatu;
    private javax.swing.JLabel infoJumlahProdukTerjual;
    private javax.swing.JLabel infoKeuntunganPenjualan;
    private javax.swing.JLabel infoNamaProduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBiayaOperasional;
    private javax.swing.JLabel labelBiayaOperasional1;
    private javax.swing.JLabel labelBiayaOperasional2;
    private javax.swing.JLabel labelHargaProduk;
    private javax.swing.JLabel labelNamaProduk;
    private javax.swing.JLabel labelProdukTerjual;
}