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
public class RumusKecepatanTempuh extends javax.swing.JFrame {

    /**
     * Creates new form kalkulatorvVew
     */private String nama="";
    public RumusKecepatanTempuh() {
        initComponents();
        KecepatanTempuh.setEditable(false);
        
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
  
          if(nama.equalsIgnoreCase("Headway"))
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
         }else if(nama.equalsIgnoreCase("Load Factory"))
         {
             RumusLoadFactor LoadFactor = new RumusLoadFactor();
             this.dispose();
             LoadFactor.setVisible(true);
         }
         
    }

      public void clearText()
    {
        PanjangRuteInput.setText("");
        WaktuTempuhInput.setText("");
        KecepatanTempuh.setText("");
        
    }
     
     public void InputKosongException() throws inputKosongException
      {
          if( PanjangRuteInput.getText().isEmpty() && WaktuTempuhInput.getText().isEmpty())
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        slideBar = new javax.swing.JPanel();
        slideBarIcon = new javax.swing.JLabel();
        menu1 = new menu.menu();
        header = new javax.swing.JPanel();
        kalkulatorJudul = new javax.swing.JLabel();
        identitasHeader = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        papanKalkulator = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanjangRuteLabel = new javax.swing.JLabel();
        PanjangRuteInput = new javax.swing.JTextField();
        WaktuTempuhLabel = new javax.swing.JLabel();
        WaktuTempuhInput = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        KecepatanTempuh = new javax.swing.JTextField();
        Hasil = new javax.swing.JLabel();
        Hapus = new javax.swing.JButton();
        slideBarIcon1 = new javax.swing.JLabel();
        slideBarIcon2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

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

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("EUNIKE M.MACPAL");

        javax.swing.GroupLayout identitasHeaderLayout = new javax.swing.GroupLayout(identitasHeader);
        identitasHeader.setLayout(identitasHeaderLayout);
        identitasHeaderLayout.setHorizontalGroup(
            identitasHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(identitasHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        identitasHeaderLayout.setVerticalGroup(
            identitasHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, identitasHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(identitasHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel)
                    .addComponent(jLabel2))
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
                .addContainerGap(188, Short.MAX_VALUE))
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

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 110));

        papanKalkulator.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("KECEPATAN TEMPUH");

        PanjangRuteLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PanjangRuteLabel.setForeground(new java.awt.Color(0, 0, 0));
        PanjangRuteLabel.setText("Panjang Rute (Km)");

        PanjangRuteInput.setBackground(new java.awt.Color(255, 255, 255));
        PanjangRuteInput.setForeground(new java.awt.Color(0, 0, 0));

        WaktuTempuhLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WaktuTempuhLabel.setForeground(new java.awt.Color(0, 0, 0));
        WaktuTempuhLabel.setText("Waktu Tempuh (Jam)");

        WaktuTempuhInput.setBackground(new java.awt.Color(255, 255, 255));
        WaktuTempuhInput.setForeground(new java.awt.Color(0, 0, 0));

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

        KecepatanTempuh.setBackground(new java.awt.Color(255, 255, 255));
        KecepatanTempuh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        KecepatanTempuh.setForeground(new java.awt.Color(0, 0, 0));
        KecepatanTempuh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KecepatanTempuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KecepatanTempuhActionPerformed(evt);
            }
        });

        Hasil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Hasil.setForeground(new java.awt.Color(0, 0, 0));
        Hasil.setText("HASIL");

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

        javax.swing.GroupLayout papanKalkulatorLayout = new javax.swing.GroupLayout(papanKalkulator);
        papanKalkulator.setLayout(papanKalkulatorLayout);
        papanKalkulatorLayout.setHorizontalGroup(
            papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, papanKalkulatorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, papanKalkulatorLayout.createSequentialGroup()
                .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(papanKalkulatorLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WaktuTempuhLabel)
                            .addComponent(WaktuTempuhInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanjangRuteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanjangRuteLabel)))
                    .addGroup(papanKalkulatorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Hitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hasil)
                    .addComponent(KecepatanTempuh, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        papanKalkulatorLayout.setVerticalGroup(
            papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(papanKalkulatorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(PanjangRuteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanjangRuteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(WaktuTempuhLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WaktuTempuhInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Hasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(papanKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KecepatanTempuh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hitung))
                .addGap(22, 22, 22)
                .addComponent(Hapus)
                .addGap(34, 34, 34))
        );

        jPanel1.add(papanKalkulator, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 350, 440));

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

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HitungActionPerformed

    private void HitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungMouseClicked
        // TODO add your handling code here:
         double s,t,hasil;
        
        try
        {
            InputKosongException();
            DecimalFormat df=new DecimalFormat("#.##");
            s = Double.parseDouble( PanjangRuteInput.getText());
            t = Double.parseDouble(WaktuTempuhInput.getText());
            
            hasil = Math.abs((s/t));
            
           
            KecepatanTempuh.setText(df.format(hasil) + " Km/Jam ");
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

    private void KecepatanTempuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KecepatanTempuhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KecepatanTempuhActionPerformed

    private void HapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HapusMouseClicked
        // TODO add your handling code here:
        clearText();
    }//GEN-LAST:event_HapusMouseClicked

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(RumusKecepatanTempuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RumusKecepatanTempuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RumusKecepatanTempuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RumusKecepatanTempuh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RumusKecepatanTempuh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel Hasil;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField KecepatanTempuh;
    private javax.swing.JTextField PanjangRuteInput;
    private javax.swing.JLabel PanjangRuteLabel;
    private javax.swing.JTextField WaktuTempuhInput;
    private javax.swing.JLabel WaktuTempuhLabel;
    private javax.swing.JPanel header;
    private javax.swing.JPanel identitasHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel kalkulatorJudul;
    private menu.menu menu1;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JPanel papanKalkulator;
    private javax.swing.JPanel slideBar;
    private javax.swing.JLabel slideBarIcon;
    private javax.swing.JLabel slideBarIcon1;
    private javax.swing.JLabel slideBarIcon2;
    // End of variables declaration//GEN-END:variables
}
