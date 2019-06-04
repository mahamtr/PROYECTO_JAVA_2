
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maai Ham
 */
public class m2 extends javax.swing.JFrame  {
       private int seleccion;
    
    
    
       public m2() {
        initComponents();
     this.setShape(new RoundRectangle2D.Double(10, 10, 400, 600, 30, 30));
         this.setSize(500,800);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(220, 221, 225));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 800));

        jLabel1.setBackground(new java.awt.Color(220, 221, 225));
        jLabel1.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 54, 64));
        jLabel1.setText("Menu Secundario");

        Continuar.setBackground(new java.awt.Color(251, 197, 49));
        Continuar.setFont(new java.awt.Font("Siemens AD Sans", 1, 18)); // NOI18N
        Continuar.setText("Continuar");
        Continuar.setBorder(null);
        Continuar.setBorderPainted(false);
        Continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Continuar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Continuar.setFocusPainted(false);
        Continuar.setRequestFocusEnabled(false);
        Continuar.setSelected(true);
        Continuar.setVerifyInputWhenFocusTarget(false);
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(232, 65, 24));
        salir.setFont(new java.awt.Font("Siemens AD Sans", 1, 18)); // NOI18N
        salir.setText("Salir");
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        salir.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        salir.setFocusPainted(false);
        salir.setRequestFocusEnabled(false);
        salir.setSelected(true);
        salir.setVerifyInputWhenFocusTarget(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        NUEVO.setBackground(new java.awt.Color(76, 209, 55));
        NUEVO.setFont(new java.awt.Font("Siemens AD Sans", 1, 18)); // NOI18N
        NUEVO.setText("Nuevo");
        NUEVO.setBorder(null);
        NUEVO.setBorderPainted(false);
        NUEVO.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        NUEVO.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        NUEVO.setFocusPainted(false);
        NUEVO.setRequestFocusEnabled(false);
        NUEVO.setSelected(true);
        NUEVO.setVerifyInputWhenFocusTarget(false);
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(NUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        try {
            dispose();
            
            switch (seleccion) {
                case 2:
                    this.ContinuarX2();
                    break;
                case 3:
                    this.ContinuarX3();
                    break;
                case 4:
                    this.ContinuarX4();
                    break;
            }
        } catch (Exception e) {
             System.out.println(e);
        }
    }//GEN-LAST:event_ContinuarActionPerformed


    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        try {
            dispose();
            mainm m = new mainm();
            m.setVisible(true);
        } catch (Exception e) { System.out.println(e);
        }
        
    }//GEN-LAST:event_salirActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        try {
            dispose();
            switch (seleccion) {
                case 2:
                    xx x2 = new xx(0, 0,0, true, true);
                    x2.setVisible(true);
                    break;
                case 3:
                    xxx x3 = new xxx(0, 0,0, true, true, true);
                    x3.setVisible(true);
                    break;
                case 4:
                    xxxx x4 = new xxxx(0, 0,0, true, true, true, true);
                    x4.setVisible(true);
                    break;
            }
            
        } catch (Exception e) { System.out.println(e);
        }
 
    }//GEN-LAST:event_NUEVOActionPerformed

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    public void ContinuarX2(){
           try {
        dispose();
        int c,d,f;
        boolean a,b;
      
            FileReader fileReader = new FileReader("C:\\Temp\\x2.txt");
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            
            c = Integer.parseInt(bufferedReader.readLine());
            d = Integer.parseInt(bufferedReader.readLine());
            a = Boolean.valueOf(bufferedReader.readLine());
            b = Boolean.valueOf(bufferedReader.readLine());
            f = Integer.parseInt(bufferedReader.readLine());

            bufferedReader.close();      
            
            xx x2 = new xx(d,c,f,a,b);
            x2.setVisible(true); 
        }
        catch(IOException ex) {
            System.out.println("error");                  
        }
    
    }
    
    public void ContinuarX3(){
           try {
        dispose();
        int c,d,f;
        boolean a,b,x;
      
            FileReader fileReader = new FileReader("C:\\Temp\\x3.txt");
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            
            c = Integer.parseInt(bufferedReader.readLine());
            d = Integer.parseInt(bufferedReader.readLine());
            a = Boolean.valueOf(bufferedReader.readLine());
            b = Boolean.valueOf(bufferedReader.readLine());
            x = Boolean.valueOf(bufferedReader.readLine());
                        f = Integer.parseInt(bufferedReader.readLine());

            bufferedReader.close();      
            
            xxx x3 = new xxx(d,c,f,a,b,x);
            x3.setVisible(true); 
        }
        catch(IOException ex) {
            System.out.println("error");                  
        }
    
    }
    
    public void ContinuarX4(){
          try {
        dispose();
        int c,d,f;
        boolean a,b,x,y;
      
            FileReader fileReader = new FileReader("C:\\Temp\\x4.txt");
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            
            c = Integer.parseInt(bufferedReader.readLine());
            d = Integer.parseInt(bufferedReader.readLine());
            a = Boolean.valueOf(bufferedReader.readLine());
            b = Boolean.valueOf(bufferedReader.readLine());
            x = Boolean.valueOf(bufferedReader.readLine());
            y = Boolean.valueOf(bufferedReader.readLine());
                        f = Integer.parseInt(bufferedReader.readLine());

            
              
            bufferedReader.close();      
            
            xxxx x4 = new xxxx(d,c,f,a,b,x,y);
            x4.setVisible(true); 
        }
        catch(IOException ex) {
            System.out.println("error");                  
        }
    
    }
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
            java.util.logging.Logger.getLogger(m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(m2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new m2().setVisible(true);
            }
        
        
        
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JButton NUEVO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
