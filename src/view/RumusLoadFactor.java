/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import javax.swing.JOptionPane;
import menu.menuEvent;
import java.lang.Math;
import Exception.inputKosongException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 *
 * @author User
 */
public class RumusLoadFactor extends javax.swing.JFrame {

    /**
     * Creates new form kalkulatorvVew
     */private String nama= "";
    public RumusLoadFactor() {
        initComponents();
        LoadFactor.setEditable(false);
        
         menu1.setEvent(new menuEvent(){
            
            @Override
            public void selected(int index,int subIndex)
                {
                     nama = menu1.getItemsName(index, subIndex);
                     selectedclick(nama);  
                      
                }
           
        });
         clearText(); 
    }
    
    public void selectedclick(String nama)
    {
        
         if(nama.equalsIgnoreCase("Kecepatan Tempuh"))   
         {  
              RumusKecepatanTempuh KecepatanTempuh =  new  RumusKecepatanTempuh();
              this.dispose();
              KecepatanTempuh.setVisible(true);
         }
         else if(nama.equalsIgnoreCase("Headway"))
         {
               RumusHeadway  Headway =   new RumusHeadway();
               this.dispose();
               Headway.setVisible(true);
                        
         }
         else if(nama.equalsIgnoreCase("Jumlah Kendaraan"))
         {
             RumusJumlahKendaraan  JumlahKendaraan = new RumusJumlahKendaraan();
             this.dispose();
             JumlahKendaraan.setVisible(true);
             
         }
         else if(nama.equalsIgnoreCase("Credit"))
         {
             Credit kredit  = new Credit();
             this.dispose();
             kredit.setVisible(true);
         }
         
    }
    
     public void clearText()
    {
        JumlahPenumpangInput.setText("");
        KapasitasAngkutInput.setText("");
        LoadFactor.setText("");
        
    }
     
     public void InputKosongException() throws inputKosongException
      {
          if( JumlahPenumpangInput.getText().isEmpty() && KapasitasAngkutInput.getText().isEmpty())
          {
              throw new  inputKosongException();
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
        slideBar = new javax.swing.JPanel();
        slideBarIcon = new javax.swing.JLabel();
        menu1 = new menu.menu();
        header = new javax.swing.JPanel();
        kalkulatorJudul = new javax.swing.JLabel();
        identitasHeader = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        papanKalkulator = new javax.swing.JPanel();
        LoadFactorLabel = new javax.swing.JLabel();
        JumlahPenumpangLabel = new javax.swing.JLabel();
        KapasitasAngkutLabel = new javax.swing.JLabel();
        Hasil = new javax.swing.JLabel();
        JumlahPenumpangInput = new javax.swing.JTextField();
        KapasitasAngkutInput = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        LoadFactor = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        slideBarIcon1 = new javax.swing.JLabel();
        slideBarIcon2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slideBar.setBackground(new java.awt.Color(204, 204, 0));
        slideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slideBarIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        slideBarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu (1).png"))); // NOI18N
        slideBarIcon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        slideBarIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slideBarIconMouseClicked(evt);
            }
        });
        slideBar.add(slideBarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 41));

        menu1.setBackground(new java.awt.Color(255, 0, 51));
        menu1.setForeground(new java.awt.Color(255, 51, 51));
        slideBar.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, -1));

        jPanel1.add(slideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 170, 440));

        header.setBackground(new java.awt.Color(255, 204, 51));

        kalkulatorJudul.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        kalkulatorJudul.setForeground(new java.awt.Color(0, 0, 0));
        kalkulatorJudul.setText("KALKULATOR RUMUS");

        identitasHeader.setBackground(new java.awt.Color(255, 204, 51));

        namaLabel.setBackground(new java.awt.Color(0, 0, 0));
        namaLabel.setForeground(new java.awt.Color(0, 0, 0));
        namaLabel.setText("Nama : ");

        npmLabel.setBackground(new java.awt.Color(0, 0, 0));
        npmLabel.setForeground(new java.awt.Color(0, 0, 0));
        npmLabel.setText("EUNIKE M.MACPAL");

        javax.swing.GroupLayout identitasHeaderLayout = new javax.swing.GroupLayout(identitasHeader);
        identitasHeader.setLayout(identitasHeaderLayout);
        identitasHeaderLayout.setHorizontalGroup(
            identitasHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(identitasHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(npmLabel)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        identitasHeaderLayout.setVerticalGroup(
            identitasHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, identitasHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(identitasHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(npmLabel))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(identitasHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(kalkulatorJudul)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kalkulatorJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(identitasHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        papanKalkulator.setBackground(new java.awt.Color(255, 204, 0));

        LoadFactorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoadFactorLabel.setForeground(new java.awt.Color(0, 0, 0));
        LoadFactorLabel.setText("Load Factor (%)");

        JumlahPenumpangLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JumlahPenumpangLabel.setForeground(new java.awt.Color(0, 0, 0));
        JumlahPenumpangLabel.setText("Jumlah Penumpang (Orang)");

        KapasitasAngkutLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        KapasitasAngkutLabel.setForeground(new java.awt.Color(0, 0, 0));
        KapasitasAngkutLabel.setText("Kapasitas  Angkut (Orang)");

        Hasil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Hasil.setForeground(new java.awt.Color(0, 0, 0));
        Hasil.setText("HASIL");

        JumlahPenumpangInput.setBackground(new java.awt.Color(255, 255, 255));
        JumlahPenumpangInput.setForeground(new java.awt.Color(0, 0, 0));

        KapasitasAngkutInput.setBackground(new java.awt.Color(255, 255, 255));
        KapasitasAngkutInput.setForeground(new java.awt.Color(0, 0, 0));

        Hapus.setBackground(new java.awt.Color(255, 0, 0));
        Hapus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setText("Hapus");
        Hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HapusMouseClicked(evt);
            }
        });
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        LoadFactor.setBackground(new java.awt.Color(255, 255, 255));
        LoadFactor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoadFactor.setForeground(new java.awt.Color(0, 0, 0));
        LoadFactor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LoadFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFactorActionPerformed(evt);
            }
        });

        Hitung.setBackground(new java.awt.Color(102, 255, 0));
        Hitung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Hitung.setForeground(new java.awt.Color(0, 0, 0));
        Hitung.setText("Hitung");
        Hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungMouseClicked(evt);
            }
        });
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout papanKalkulatorLayout = new javax.swing.GroupLayout(papanKalkulator);
        papanKalkulator.setLayout(papanKalkulatorLayout);
        papanKalkulatorLayout.setHorizontalGroup(
            papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, papanKalkulatorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoadFactorLabel)
                .addGap(60, 60, 60))
            .addGroup(papanKalkulatorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(papanKalkulatorLayout.createSequentialGroup()
                        .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KapasitasAngkutLabel)
                            .addComponent(JumlahPenumpangLabel)
                            .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(KapasitasAngkutInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JumlahPenumpangInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, papanKalkulatorLayout.createSequentialGroup()
                        .addComponent(Hitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hasil)
                            .addComponent(LoadFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        papanKalkulatorLayout.setVerticalGroup(
            papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(papanKalkulatorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LoadFactorLabel)
                .addGap(53, 53, 53)
                .addComponent(JumlahPenumpangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JumlahPenumpangInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(KapasitasAngkutLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KapasitasAngkutInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(Hasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hitung))
                .addGap(24, 24, 24)
                .addComponent(Hapus))
        );

        jPanel1.add(papanKalkulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 370, 440));

        slideBarIcon1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        slideBarIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu (1).png"))); // NOI18N
        slideBarIcon1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        slideBarIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slideBarIcon1MouseClicked(evt);
            }
        });
        jPanel1.add(slideBarIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 40));

        slideBarIcon2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        slideBarIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu (1).png"))); // NOI18N
        slideBarIcon2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(slideBarIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int x = 164;
    private void slideBarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideBarIconMouseClicked
        // TODO add your handling code here:
        
        if(x == 164)
        {
            slideBar.setSize(164, 552);
            
            Thread th = new Thread() 
            {
               @Override
               public  void run()
               {
                    try
                    {
                        for(int i = 164; i>= 0;i--)
                        {
                            Thread.sleep(1);
                            slideBar.setSize(i, 552);
                        }
                        
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
                   
               }
                
            }; th.start();
            x=0;
        }
      
    }//GEN-LAST:event_slideBarIconMouseClicked

    private void slideBarIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideBarIcon1MouseClicked

        if(x == 0)
        {
            slideBar.show();
            slideBar.setSize(x, 552);

            Thread th = new Thread()
            {
                @Override
                public  void run()
                {
                    try
                    {
                        for(int i = 0; i <= x;i++)
                        {
                            Thread.sleep(1);
                            slideBar.setSize(i, 552);

                        }

                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }

                }

            }; th.start();
            x=164;
        }
    }//GEN-LAST:event_slideBarIcon1MouseClicked

    private void HapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusMouseClicked
        // TODO add your handling code here:
        clearText();
    }//GEN-LAST:event_HapusMouseClicked

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

    private void LoadFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFactorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadFactorActionPerformed

    private void HitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungMouseClicked
        // TODO add your handling code here:
        double jp,c,hasil;
        
        try
        {
            InputKosongException();
            
            jp = Double.parseDouble(JumlahPenumpangInput.getText());
            c = Double.parseDouble(KapasitasAngkutInput.getText());
            DecimalFormat df=new DecimalFormat("#.##");
            
            hasil = Math.abs((jp/c));
            
            LoadFactor.setText( df.format(hasil) + " % ");
        }
        catch(inputKosongException e)
        {
             JOptionPane.showMessageDialog(this, e.message());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "INPUTAN HARUS BERUPA ANGKA !");
        }
        
    }//GEN-LAST:event_HitungMouseClicked

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HitungActionPerformed

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
            java.util.logging.Logger.getLogger(RumusLoadFactor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RumusLoadFactor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RumusLoadFactor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RumusLoadFactor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RumusLoadFactor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel Hasil;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField JumlahPenumpangInput;
    private javax.swing.JLabel JumlahPenumpangLabel;
    private javax.swing.JTextField KapasitasAngkutInput;
    private javax.swing.JLabel KapasitasAngkutLabel;
    private javax.swing.JTextField LoadFactor;
    private javax.swing.JLabel LoadFactorLabel;
    private javax.swing.JPanel header;
    private javax.swing.JPanel identitasHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kalkulatorJudul;
    private menu.menu menu1;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JPanel papanKalkulator;
    private javax.swing.JPanel slideBar;
    private javax.swing.JLabel slideBarIcon;
    private javax.swing.JLabel slideBarIcon1;
    private javax.swing.JLabel slideBarIcon2;
    // End of variables declaration//GEN-END:variables
}
