
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maai Ham
 */
public class xxx extends javax.swing.JFrame {
        int x=0,puntuacion,intentos,can=1,segundos=0;
        boolean a,b,c,d,ee,f,G,H,I,w,v,u;
        Timer timer;

        public xxx(int puntuacion, int intentos,int segundos, boolean G, boolean H, boolean I) {
         this.puntuacion = puntuacion;
        this.intentos = intentos;
                this.segundos = segundos;
        this.G = G;
        this.H = H;
        this.I = I;
        initComponents();
         this.setShape(new RoundRectangle2D.Double(10, 10, 1200, 800, 30, 30));
      this.setSize(1300,900);
     this.setLocationRelativeTo(null);
        this.setNew();
       this.continuar();
       
        timer = new Timer (1000, new ActionListener () 
{ 
    public void actionPerformed(ActionEvent e) 
    {                   
                       
    
                        if (a&&ee&&u){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setG(false);
                            x1.setEnabled(false);
                            x5.setEnabled(false);
                            x9.setEnabled(false);
                            can=0;
                        }  
                        if (c&&d&&v){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setH(false);
                            x3.setEnabled(false);
                            x4.setEnabled(false);
                            x8.setEnabled(false);
                            can=0;
                        }  
                        
                        if (b&&f&&w){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setI(false);
                            x2.setEnabled(false);
                            x6.setEnabled(false);
                            x7.setEnabled(false);
                            can=0;
                        }  
                     
                        if(x>=3){
                            timer.restart();
                            if (isG()) {
                                x1.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                                 x5.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                                 x9.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                            }
                            
                            if (isH()) {
                              x4.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png"))); 
                              x3.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                              x8.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                            }
                            
                            if (isI()) {
                              x2.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png"))); 
                              x6.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                              x7.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            }
                            
                            if (isG()||isH()||isI()) {
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
                      ee=false;
                      f=false;
                      w=false;
                      v=false;
                      u=false;
                        x=0;
                       }
                                              setSegundos(getSegundos() + 1);
                        tiempo.setText(String.valueOf(getSegundos()));
                         if (isG() == false && isH() == false && isI() == false) {
            win.setVisible(true);
            x1.setEnabled(false);
            x2.setEnabled(false);
            x3.setEnabled(false);
            x4.setEnabled(false);
            x5.setEnabled(false);
            x6.setEnabled(false);
            x7.setEnabled(false);
            x8.setEnabled(false);
            x9.setEnabled(false);
            timer.stop();
        }
                      
    } 
}); 
          timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
        x5 = new javax.swing.JButton();
        x6 = new javax.swing.JButton();
        x7 = new javax.swing.JButton();
        x8 = new javax.swing.JButton();
        x9 = new javax.swing.JButton();
        puntuajedisplay1 = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();

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

        x5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x5ActionPerformed(evt);
            }
        });

        x6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x6ActionPerformed(evt);
            }
        });

        x7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x7ActionPerformed(evt);
            }
        });

        x8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x8ActionPerformed(evt);
            }
        });

        x9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java256.png"))); // NOI18N
        x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x9ActionPerformed(evt);
            }
        });

        puntuajedisplay1.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        puntuajedisplay1.setText("Segundos");

        tiempo.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        tiempo.setText("0");

        javax.swing.GroupLayout FONDOLayout = new javax.swing.GroupLayout(FONDO);
        FONDO.setLayout(FONDOLayout);
        FONDOLayout.setHorizontalGroup(
            FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDOLayout.createSequentialGroup()
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FONDOLayout.createSequentialGroup()
                                .addComponent(x1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(x2))
                            .addGroup(FONDOLayout.createSequentialGroup()
                                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(x4)
                                    .addComponent(x7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(x5)
                                    .addComponent(x8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x6)
                            .addComponent(x3)
                            .addComponent(x9))
                        .addGap(26, 26, 26)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(puntuajedisplay)
                            .addComponent(puntuajedisplay1)
                            .addComponent(intentodisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intento)
                            .addComponent(puntuaje)
                            .addComponent(tiempo)))
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addGap(954, 954, 954)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abandonar)
                            .addComponent(win))))
                .addContainerGap(451, Short.MAX_VALUE))
        );
        FONDOLayout.setVerticalGroup(
            FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FONDOLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(x1)
                    .addComponent(x2)
                    .addComponent(x3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(win)
                .addGap(176, 176, 176)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intentodisplay)
                    .addComponent(intento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntuajedisplay)
                    .addComponent(puntuaje))
                .addGap(27, 27, 27)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntuajedisplay1)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FONDOLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(abandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x5)
                            .addComponent(x6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FONDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(x9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(FONDOLayout.createSequentialGroup()
                        .addComponent(x4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x7)))
                .addContainerGap(1032, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FONDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FONDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abandonarActionPerformed
        try {
            dispose();
            mainm prin = new mainm();
            prin.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_abandonarActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
       x1.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png")));
        this.x ++;
        a = true;

    }//GEN-LAST:event_x1ActionPerformed

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        x2.setIcon(new ImageIcon(this.getClass().getResource("javaco.png")));
        this.x ++;
        b = true;
    }//GEN-LAST:event_x2ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        x3.setIcon(new ImageIcon(this.getClass().getResource("java256.png")));
        this.x ++;
        c = true;
    }//GEN-LAST:event_x3ActionPerformed

    private void x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4ActionPerformed
        x4.setIcon(new ImageIcon(this.getClass().getResource("java256.png")));
        this.x ++;
        d = true;
    }//GEN-LAST:event_x4ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        try {
            guardar guardar = new guardar();
            guardar.setVisible(true);
            guardar.puntuajeg.setText(String.valueOf(getPuntuacion()));
            guardar.intentog.setText(String.valueOf(getIntentos()));
            guardar.setSeleccion(3);
            guardar.setA(this.isG());
            guardar.setB(this.isH());
            guardar.setC(this.isI());
            guardar.setS(segundos);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_salirActionPerformed

    private void x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x5ActionPerformed
               x5.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png")));
               this.x ++;
               ee = true;
    }//GEN-LAST:event_x5ActionPerformed

    private void x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x6ActionPerformed
        x6.setIcon(new ImageIcon(this.getClass().getResource("javaco.png")));
        f= true;
        this.x ++;
// TODO add your handling code here:
    }//GEN-LAST:event_x6ActionPerformed

    private void x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x7ActionPerformed
        this.x ++;
        w = true;
                x7.setIcon(new ImageIcon(this.getClass().getResource("javaco.png")));
    }//GEN-LAST:event_x7ActionPerformed

    private void x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x8ActionPerformed
               this.x ++;
        v = true;
                x8.setIcon(new ImageIcon(this.getClass().getResource("java256.png")));
    }//GEN-LAST:event_x8ActionPerformed

    private void x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x9ActionPerformed
               this.x ++;
                     u = true;
                             x9.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png")));
    }//GEN-LAST:event_x9ActionPerformed

    public void setNew(){
            x1.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x2.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x3.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x4.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x5.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x6.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x7.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x8.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
        x9.setIcon(new ImageIcon(this.getClass().getResource("pregunta.png")));
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
        x5.setOpaque(false);   
        x5.setContentAreaFilled(false);
        x5.setBorderPainted(false);
        x6.setOpaque(false);   
        x6.setContentAreaFilled(false);
        x6.setBorderPainted(false);
        win.setOpaque(false);   
        win.setContentAreaFilled(false);
        win.setBorderPainted(false);
        win.setVisible(false);
        x7.setOpaque(false);   
x7.setContentAreaFilled(false);
x7.setBorderPainted(false);
x8.setOpaque(false);   
x8.setContentAreaFilled(false);
x8.setBorderPainted(false);
x9.setOpaque(false);   
x9.setContentAreaFilled(false);
x9.setBorderPainted(false);
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
    
    public boolean isG() {
        return G;
    }

    public void setG(boolean G) {
        this.G = G;
    }

    public boolean isH() {
        return H;
    }

    public void setH(boolean H) {
        this.H = H;
    }

    public boolean isI() {
        return I;
    }

    public void setI(boolean I) {
        this.I = I;
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

    
        public void continuar(){
         puntuaje.setText(String.valueOf(getPuntuacion()));
       intento.setText(String.valueOf(getIntentos()));
                               tiempo.setText(String.valueOf(getSegundos()));

                          if(!isG()){
                           x1.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png"))); 
                           x5.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png")));
                           x9.setIcon(new ImageIcon(this.getClass().getResource("javaPC.png")));
                           x9.setEnabled(false);
                           x1.setEnabled(false);
                           x5.setEnabled(false);
                        }
        
                        if(!isH()){
                           x4.setIcon(new ImageIcon(this.getClass().getResource("java256.png"))); 
                           x3.setIcon(new ImageIcon(this.getClass().getResource("java256.png"))); 
                           x8.setIcon(new ImageIcon(this.getClass().getResource("java256.png"))); 
                           x4.setEnabled(false);
                           x8.setEnabled(false);
                           x3.setEnabled(false);
                        }
                        
                        if(!isI()){
                           x2.setIcon(new ImageIcon(this.getClass().getResource("javaco.png"))); 
                           x6.setIcon(new ImageIcon(this.getClass().getResource("javaco.png"))); 
                           x7.setIcon(new ImageIcon(this.getClass().getResource("javaco.png"))); 
                           x2.setEnabled(false);
                           x7.setEnabled(false);
                           x6.setEnabled(false);
                        }
                        
                        if (isG() == false && isH() == false && isI() == false) {
            win.setVisible(true);
            x1.setEnabled(false);
            x2.setEnabled(false);
            x3.setEnabled(false);
            x4.setEnabled(false);
            x5.setEnabled(false);
            x6.setEnabled(false);
            x7.setEnabled(false);
            x8.setEnabled(false);
            x9.setEnabled(false);
           // t.stop();
                        
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
            java.util.logging.Logger.getLogger(xxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton x5;
    private javax.swing.JButton x6;
    private javax.swing.JButton x7;
    private javax.swing.JButton x8;
    private javax.swing.JButton x9;
    // End of variables declaration//GEN-END:variables
}
