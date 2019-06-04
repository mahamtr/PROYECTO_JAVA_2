
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class xx extends javax.swing.JFrame {
     int x=0,puntuacion,intentos,can=1,segundos=0;
    Timer t,f;
    boolean a,b,c,d,e,F;
    

    

    public xx(int puntuacion,int intentos,int segundos, boolean e, boolean F) {
        this.puntuacion = puntuacion;
        this.intentos = intentos;
        this.segundos = segundos;
        this.e = e;
        this.F = F;
        initComponents();
        this.setShape(new RoundRectangle2D.Double(10, 10, 700, 720, 30, 30));
        this.setSize(800,820);
        this.setLocationRelativeTo(null);
       this.setNew();
      this.continuar();
     
     
   t = new Timer (1000, new ActionListener () 
{ 
    public void actionPerformed(ActionEvent e) 
    {                   
             
    
                        if (a&&d){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setE(false);
                            x1.setEnabled(false);
                            x4.setEnabled(false);
                            can =0;
                        }  
                        if (c&&b){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setF(false);
                            x2.setEnabled(false);
                            x3.setEnabled(false);
                            can =0;
                        }  
                        
                       setSegundos(getSegundos() + 1);
                        tiempo.setText(String.valueOf(getSegundos()));
                        if(x>=2){
                            t.restart();
                            if (isE()) {
                                x1.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                                 x4.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                            }
                            
                            if (isF()) {
                              x2.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png"))); 
                              x3.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                            }
                            
                            if (isE()||isF()) {
                                if(can == 1){
                                          setPuntuacion(getPuntuacion()-1);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                                }
                            }
                             can =1;
                            setIntentos(getIntentos()  + 1);
                            intento.setText(String.valueOf(getIntentos()));
                      a=false;
                      b=false;
                      c=false;
                      d=false;
                        x=0;
                       }
                         if (isE() == false && isF() == false) {
            win.setVisible(true);
            x1.setEnabled(false);
            x2.setEnabled(false);
            x3.setEnabled(false);
            x4.setEnabled(false);
            t.stop();
        }
                        
                      
    } 
}); 
          t.start();
    }
    
          
           

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FONDO = new javax.swing.JPanel();
        intentodisplay = new javax.swing.JLabel();
        puntuajedisplay = new javax.swing.JLabel();
        intento = new javax.swing.JLabel();
        puntuaje = new javax.swing.JLabel();
        abandonar = new javax.swing.JButton();
        x1 = new javax.swing.JButton();
        x2 = new javax.swing.JButton();
        x3 = new javax.swing.JButton();
        x4 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        win = new javax.swing.JButton();
        tiempo = new javax.swing.JLabel();
        puntuajedisplay1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FONDO.setBackground(new java.awt.Color(127, 143, 166));

        intentodisplay.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        intentodisplay.setText("Intentos");

        puntuajedisplay.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        puntuajedisplay.setText("Puntuaje");

        intento.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        intento.setText("0000000");

        puntuaje.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        puntuaje.setText("0000000");

        abandonar.setBackground(new java.awt.Color(232, 65, 24));
        abandonar.setFont(new java.awt.Font("Siemens AD Sans", 0, 36)); // NOI18N
        abandonar.setText("Abandonar");
        abandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abandonarActionPerformed(evt);
            }
        });

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });

        x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });

        x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });

        x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x4ActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(251, 197, 49));
        salir.setFont(new java.awt.Font("Siemens AD Sans", 0, 36)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ganar.png"))); // NOI18N

        tiempo.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        tiempo.setText("0");

        puntuajedisplay1.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        puntuajedisplay1.setText("Segundos");

        javax.swing.GroupLayout FONDOLayout = new javax.swing.GroupLayout(FONDO);
        FONDO.setLayout(FONDOLayout);
        FONDOLayout.setHorizontalGroup(
            FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDOLayout.createSequentialGroup()
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x1)
                            .addComponent(x3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(x4)
                            .addComponent(x2)))
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FONDOLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(puntuajedisplay))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FONDOLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intentodisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(puntuajedisplay1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intento)
                            .addComponent(puntuaje)
                            .addComponent(tiempo))
                        .addGap(69, 69, 69)
                        .addComponent(win)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abandonar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1197, Short.MAX_VALUE))
        );
        FONDOLayout.setVerticalGroup(
            FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDOLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(x1)
                    .addComponent(x2))
                .addGap(31, 31, 31)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(x3)
                    .addComponent(x4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(abandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(win)))
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intentodisplay)
                            .addComponent(intento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntuajedisplay)
                            .addComponent(puntuaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puntuajedisplay1))))
                .addContainerGap(1016, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FONDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FONDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        try {
            x1.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png")));            
            this.x++;
            a = true;
            
        } catch (Exception e) { System.out.println(e);
        }
    }//GEN-LAST:event_x1ActionPerformed

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
     x2.setIcon(new ImageIcon(this.getClass().getResource("java256.png"))); 
          this.x ++;
          b = true;
    }//GEN-LAST:event_x2ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        x3.setIcon(new ImageIcon(this.getClass().getResource("java256.png"))); 
          this.x ++; 
          c = true;
    }//GEN-LAST:event_x3ActionPerformed

    private void x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4ActionPerformed
        x4.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png"))); 
          this.x ++; 
          d = true;
    }//GEN-LAST:event_x4ActionPerformed

    private void abandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abandonarActionPerformed
        try {
            dispose();
            mainm prin = new mainm();
            prin.setVisible(true);
            
        } catch (Exception e) { System.out.println(e);
        }
    }//GEN-LAST:event_abandonarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        try {
            guardar guardar = new guardar();
            guardar.setVisible(true);
            guardar.puntuajeg.setText(String.valueOf(getPuntuacion()));
            guardar.intentog.setText(String.valueOf(getIntentos()));
            guardar.setSeleccion(2);
            guardar.setA(this.isE());
            guardar.setB(this.isF());
            guardar.setSeleccion(2);
            guardar.setS(segundos);
            this.dispose();
            
        } catch (Exception e) { System.out.println(e);
        }
    }//GEN-LAST:event_salirActionPerformed

    
    public void continuar(){
         puntuaje.setText(String.valueOf(getPuntuacion()));
       intento.setText(String.valueOf(getIntentos()));
                               tiempo.setText(String.valueOf(getSegundos()));
         if(!isE()){
                           x1.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png"))); 
                           x4.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png"))); 
                           x1.setEnabled(false);
                           x4.setEnabled(false);
                        }
        
                        if(!isF()){
                           x2.setIcon(new ImageIcon(this.getClass().getResource("java256.png"))); 
                           x3.setIcon(new ImageIcon(this.getClass().getResource("java256.png"))); 
                           x2.setEnabled(false);
                           x3.setEnabled(false);
                        }
                        
                        if (isE() == false && isF() == false) {
            win.setVisible(true);
            x1.setEnabled(false);
            x2.setEnabled(false);
            x3.setEnabled(false);
            x4.setEnabled(false);
           // t.stop();
                        
        }
    }
    
    public boolean isF() {
        return F;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    
    public void setF(boolean F) {
        this.F = F;
    }

    
    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean isE() {
        return e;
    }

    public void setE(boolean e) {
        this.e = e;
    }

    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setNew(){
         x1.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        win.setIcon(new ImageIcon(this.getClass().getResource("ganar.png")));
        x2.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x3.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x4.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));        
        win.setOpaque(false);   
        win.setContentAreaFilled(false);
        win.setBorderPainted(false);
        win.setVisible(false);
        x1.setOpaque(false);   
        x1.setContentAreaFilled(false);
        x1.setBorderPainted(false);
        x2.setOpaque(false);   
        x2.setContentAreaFilled(false);
        x2.setBorderPainted(false);
        x3.setOpaque(false);   
        x3.setContentAreaFilled(false);
        x3.setBorderPainted(false);
        x4.setOpaque(false);   
        x4.setContentAreaFilled(false);
        x4.setBorderPainted(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        
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
            java.util.logging.Logger.getLogger(xx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
              
                
            }
        });
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FONDO;
    private javax.swing.JButton abandonar;
    private javax.swing.JLabel intento;
    private javax.swing.JLabel intentodisplay;
    private javax.swing.JLabel puntuaje;
    private javax.swing.JLabel puntuajedisplay;
    private javax.swing.JLabel puntuajedisplay1;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tiempo;
    private javax.swing.JButton win;
    private javax.swing.JButton x1;
    private javax.swing.JButton x2;
    private javax.swing.JButton x3;
    private javax.swing.JButton x4;
    // End of variables declaration//GEN-END:variables
}
