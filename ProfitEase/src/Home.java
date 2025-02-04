public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    String namaProduk = "";
    int jumlahProduk = 0;
    int hargaPerProduk = 0;
    int keuntunganPenjualan = 0;
    int biayaOperasionalProduksi = 0;
    int keuntunganBersih = 0;

    private void initComponents() {

        fieldNamaProduk = new javax.swing.JTextField();
        titleMasukanDataProduk = new javax.swing.JLabel();
        labelNamaProduk = new javax.swing.JLabel();
        labelProdukTerjual = new javax.swing.JLabel();
        fieldJumlahProdukTerjual = new javax.swing.JTextField();
        labelHargaProduk = new javax.swing.JLabel();
        fieldHargaPerProduk = new javax.swing.JTextField();
        labelBiayaOperasional = new javax.swing.JLabel();
        fieldBiayaOperasionalProduksi = new javax.swing.JTextField();
        buttonHitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROFIT EASE");
        setResizable(false);

        fieldNamaProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaProdukActionPerformed(evt);
            }
        });

        titleMasukanDataProduk.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        titleMasukanDataProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMasukanDataProduk.setText("MASUKAN DATA PRODUK");

        labelNamaProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelNamaProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaProduk.setText("NAMA PRODUK");

        labelProdukTerjual.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelProdukTerjual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProdukTerjual.setText("JUMLAH PRODUK TERJUAL");

        fieldJumlahProdukTerjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJumlahProdukTerjualActionPerformed(evt);
            }
        });

        labelHargaProduk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelHargaProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHargaProduk.setText("HARGA PER PRODUK");

        fieldHargaPerProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHargaPerProdukActionPerformed(evt);
            }
        });

        labelBiayaOperasional.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelBiayaOperasional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBiayaOperasional.setText("BIAYA PRODUKSI ATAU OPERASIONAL");

        fieldBiayaOperasionalProduksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBiayaOperasionalProduksiActionPerformed(evt);
            }
        });

        buttonHitung.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        buttonHitung.setText("HITUNG");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleMasukanDataProduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(272, 272, 272))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelProdukTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(labelBiayaOperasional, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldBiayaOperasionalProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldHargaPerProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldJumlahProdukTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(titleMasukanDataProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fieldNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelNamaProduk))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelProdukTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldJumlahProdukTerjual))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldHargaPerProduk))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fieldBiayaOperasionalProduksi)
                                        .addComponent(labelBiayaOperasional, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addComponent(buttonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>

    private void fieldNamaProdukActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fieldJumlahProdukTerjualActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fieldHargaPerProdukActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fieldBiayaOperasionalProduksiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        namaProduk = fieldNamaProduk.getText().trim();
        jumlahProduk = Integer.parseInt(fieldJumlahProdukTerjual.getText().trim());
        hargaPerProduk = Integer.parseInt(fieldHargaPerProduk.getText().trim());
        biayaOperasionalProduksi = Integer.parseInt(fieldBiayaOperasionalProduksi.getText().trim());

        Result result = new Result();
        result.setData(namaProduk, jumlahProduk, hargaPerProduk, biayaOperasionalProduksi);
        result.setVisible(true);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private javax.swing.JButton buttonHitung;
    private javax.swing.JTextField fieldBiayaOperasionalProduksi;
    private javax.swing.JTextField fieldHargaPerProduk;
    private javax.swing.JTextField fieldJumlahProdukTerjual;
    private javax.swing.JTextField fieldNamaProduk;
    private javax.swing.JLabel labelBiayaOperasional;
    private javax.swing.JLabel labelHargaProduk;
    private javax.swing.JLabel labelNamaProduk;
    private javax.swing.JLabel labelProdukTerjual;
    private javax.swing.JLabel titleMasukanDataProduk;
}
