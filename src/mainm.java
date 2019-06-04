
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;


public class mainm extends javax.swing.JFrame {

    public mainm() {
        initComponents();
      this.setShape(new RoundRectangle2D.Double(10, 10, 400, 600, 30, 30));
       this.setSize(500,800);
        this.setLocationRelativeTo(null);
        
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
        jLabel1 = new javax.swing.JLabel();
        xxb = new javax.swing.JButton();
        xxxb = new javax.swing.JButton();
        xxxxb = new javax.swing.JButton();
        salirb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(220, 221, 225));

        jLabel1.setBackground(new java.awt.Color(220, 221, 225));
        jLabel1.setFont(new java.awt.Font("Siemens AD Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 54, 64));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Juego de Memoria/Pares");

        xxb.setBackground(new java.awt.Color(0, 151, 230));
        xxb.setFont(new java.awt.Font("Siemens AD Sans", 1, 18)); // NOI18N
        xxb.setText("2x2");
        xxb.setBorder(null);
        xxb.setBorderPainted(false);
        xxb.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        xxb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        xxb.setFocusPainted(false);
        xxb.setRequestFocusEnabled(false);
        xxb.setSelected(true);
        xxb.setVerifyInputWhenFocusTarget(false);
        xxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xxbActionPerformed(evt);
            }
        });

        xxxb.setBackground(new java.awt.Color(0, 151, 230));
        xxxb.setFont(new java.awt.Font("Siemens AD Sans", 1, 18)); // NOI18N
        xxxb.setText("3x3");
        xxxb.setBorder(null);
        xxxb.setBorderPainted(false);
        xxxb.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        xxxb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        xxxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xxxbActionPerformed(evt);
            }
        });

        xxxxb.setBackground(new java.awt.Color(0, 151, 230));
        xxxxb.setFont(new java.awt.Font("Siemens AD Sans", 1, 18)); // NOI18N
        xxxxb.setText("4x4");
        xxxxb.setBorder(null);
        xxxxb.setBorderPainted(false);
        xxxxb.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        xxxxb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        xxxxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xxxxbActionPerformed(evt);
            }
        });

        salirb.setBackground(new java.awt.Color(232, 65, 24));
        salirb.setFont(new java.awt.Font("Siemens AD Sans", 1, 18)); // NOI18N
        salirb.setText("Salir");
        salirb.setBorder(null);
        salirb.setBorderPainted(false);
        salirb.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        salirb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        salirb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(xxxb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xxb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xxxxb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salirb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(xxb, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(xxxb, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(xxxxb, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(salirb, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
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

    private void xxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xxbActionPerformed
        try {
            dispose();
            m2 segundo = new m2();
            segundo.setVisible(true);
            segundo.setSeleccion(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_xxbActionPerformed

    private void xxxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xxxbActionPerformed
        try {
            dispose();
            m2 segundo = new m2();
            segundo.setVisible(true);
            segundo.setSeleccion(3);
        } catch (Exception e) {
             System.out.println(e);
        }
    }//GEN-LAST:event_xxxbActionPerformed

    private void xxxxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xxxxbActionPerformed
        try {
            dispose();
            m2 segundo = new m2();
            segundo.setVisible(true);
            segundo.setSeleccion(4);
        } catch (Exception e) {
             System.out.println(e);
        }
    }//GEN-LAST:event_xxxxbActionPerformed

    private void salirbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbActionPerformed
        dispose();
    }//GEN-LAST:event_salirbActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainm().setVisible(true);




                
                
            }
        });
        
        
        
        
    }



    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salirb;
    private javax.swing.JButton xxb;
    private javax.swing.JButton xxxb;
    private javax.swing.JButton xxxxb;
    // End of variables declaration//GEN-END:variables
}
