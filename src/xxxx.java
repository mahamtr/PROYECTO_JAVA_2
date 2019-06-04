
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class xxxx extends javax.swing.JFrame {
    private int x=0,puntuacion,intentos,can=1,segundos=0;
    private boolean a,b,c,d,ee,f,g,h,i,j,k,l,m,n,o,p,Q,R,S,T;
    Timer timer;

    public xxxx(int puntuacion, int intentos,int segundos, boolean Q, boolean R, boolean S, boolean T) {
        initComponents();
        this.puntuacion = puntuacion;
        this.intentos = intentos;
        this.segundos = segundos;
        this.Q = Q;
        this.R = R;
        this.S = S;
        this.T = T;
          this.setShape(new RoundRectangle2D.Double(10, 10,900, 700, 30, 30));
      this.setSize(1000,800);
     this.setLocationRelativeTo(null);
     this.setNew();
     this.continuar();
     
      timer = new Timer (1000, new ActionListener () 
{ 
    public void actionPerformed(ActionEvent e) 
    {                   
                   
    
                        if (d&&g&&j&&m){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setQ(false);
                            x4.setEnabled(false);
                            x7.setEnabled(false);
                            x10.setEnabled(false);
                            x13.setEnabled(false);
                            can=0;
                        }  
                        if (c&&f&&k&&a){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setR(false);
                            x3.setEnabled(false);
                            x6.setEnabled(false);
                            x11.setEnabled(false);
                            x1.setEnabled(false);
                            can=0;
                        }  
                        
                        if (b&&ee&&h&&l){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setS(false);
                            x5.setEnabled(false);
                            x2.setEnabled(false);
                            x8.setEnabled(false);
                            x12.setEnabled(false);
                            can=0;
                        }  
                        
                        if (n&&o&&p&&i){
                            setPuntuacion(getPuntuacion()+5);
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            setT(false);
                            x14.setEnabled(false);
                            x15.setEnabled(false);
                            x16.setEnabled(false);
                            x9.setEnabled(false);
                            can=0;
                        }  
                     
                        if(x>=4){
                            timer.restart();
                            if (isQ()) {
                                x4.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                                 x7.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                                 x10.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                                 x13.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                            }
                            
                            if (isR()) {
                              x1.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png"))); 
                              x3.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                              x6.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                              x11.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                            }
                            
                            if (isS()) {
                              x2.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png"))); 
                              x5.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                              x8.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                              x12.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            }
                            
                            if (isT()) {
                              x9.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png"))); 
                              x14.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                              x15.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                              x16.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
                            puntuaje.setText(String.valueOf(getPuntuacion()));
                            }
                             
                                if (isQ()||isR()||isS()||isT()) {
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
                      g=false;
                      h=false;
                      i=false;
                      j=false;
                      k=false;
                      l=false;
                      m=false;
                      n=false;
                      o=false;
                      p=false;
                   
                        x=0;
                       }
                       setSegundos(getSegundos() + 1);

                                               tiempo.setText(String.valueOf(getSegundos()));
if (isQ() == false && isR() == false && isS() == false && isT() == false) {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        x1 = new javax.swing.JButton();
        x2 = new javax.swing.JButton();
        x3 = new javax.swing.JButton();
        x4 = new javax.swing.JButton();
        x5 = new javax.swing.JButton();
        x6 = new javax.swing.JButton();
        x7 = new javax.swing.JButton();
        x8 = new javax.swing.JButton();
        x9 = new javax.swing.JButton();
        x10 = new javax.swing.JButton();
        x11 = new javax.swing.JButton();
        x12 = new javax.swing.JButton();
        x13 = new javax.swing.JButton();
        x14 = new javax.swing.JButton();
        x15 = new javax.swing.JButton();
        x16 = new javax.swing.JButton();
        win = new javax.swing.JButton();
        abandonar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        intentodisplay = new javax.swing.JLabel();
        puntuajedisplay = new javax.swing.JLabel();
        puntuaje = new javax.swing.JLabel();
        intento = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        puntuajedisplay1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(127, 143, 166));

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });

        x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });

        x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });

        x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x4ActionPerformed(evt);
            }
        });

        x5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x5ActionPerformed(evt);
            }
        });

        x6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x6ActionPerformed(evt);
            }
        });

        x7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x7ActionPerformed(evt);
            }
        });

        x8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x8ActionPerformed(evt);
            }
        });

        x9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x9ActionPerformed(evt);
            }
        });

        x10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x10ActionPerformed(evt);
            }
        });

        x11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x11ActionPerformed(evt);
            }
        });

        x12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x12ActionPerformed(evt);
            }
        });

        x13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x13ActionPerformed(evt);
            }
        });

        x14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x14ActionPerformed(evt);
            }
        });

        x15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x15ActionPerformed(evt);
            }
        });

        x16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4x-1.png"))); // NOI18N
        x16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x16ActionPerformed(evt);
            }
        });

        win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ganar.png"))); // NOI18N
        win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winActionPerformed(evt);
            }
        });

        abandonar.setBackground(new java.awt.Color(232, 65, 24));
        abandonar.setFont(new java.awt.Font("Siemens AD Sans", 0, 36)); // NOI18N
        abandonar.setText("Abandonar");
        abandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abandonarActionPerformed(evt);
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

        intentodisplay.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        intentodisplay.setText("Intentos");

        puntuajedisplay.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        puntuajedisplay.setText("Puntuaje");

        puntuaje.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        puntuaje.setText("0000000");

        intento.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        intento.setText("0000000");

        tiempo.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        tiempo.setText("0");

        puntuajedisplay1.setFont(new java.awt.Font("Siemens AD Sans", 0, 34)); // NOI18N
        puntuajedisplay1.setText("Segundos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(x5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(x1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(abandonar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(x9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(intentodisplay)
                            .addComponent(puntuajedisplay)
                            .addComponent(puntuajedisplay1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intento)
                            .addComponent(puntuaje)
                            .addComponent(tiempo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(680, 680, 680)
                        .addComponent(win)))
                .addContainerGap(531, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x4)
                            .addComponent(x3)
                            .addComponent(x2)
                            .addComponent(x1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(abandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x5)
                            .addComponent(x6)
                            .addComponent(x7)
                            .addComponent(x8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intentodisplay)
                            .addComponent(intento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntuajedisplay)
                            .addComponent(puntuaje))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntuajedisplay1)
                            .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(x9)
                            .addComponent(x10)
                            .addComponent(x11)
                            .addComponent(x12))
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(x13)
                        .addComponent(x14)
                        .addComponent(x15)
                        .addComponent(x16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
               x1.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png")));
               x ++;
        a= true;
    }//GEN-LAST:event_x1ActionPerformed

    private void x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4ActionPerformed
      x4.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png")));
               x ++;
        d= true;   // TODO add your handling code here:
    }//GEN-LAST:event_x4ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
         x3.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png")));
               x ++;
        c= true;
    }//GEN-LAST:event_x3ActionPerformed

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        x2.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png")));
               x ++;
        b= true; // TODO add your handling code here:
    }//GEN-LAST:event_x2ActionPerformed

    private void x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x5ActionPerformed
         x5.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png")));
               x ++;
        ee= true;// TODO add your handling code here:
    }//GEN-LAST:event_x5ActionPerformed

    private void x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x6ActionPerformed
         x6.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png")));
               x ++;
        f = true;
    }//GEN-LAST:event_x6ActionPerformed

    private void x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x7ActionPerformed
       x7.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png")));
               x ++;
        g = true;  // TODO add your handling code here:
    }//GEN-LAST:event_x7ActionPerformed

    private void x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x8ActionPerformed
         x8.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png")));
               x ++;
        h= true;
    }//GEN-LAST:event_x8ActionPerformed

    private void x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x9ActionPerformed
        x9.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png")));
               x ++;
        i = true; // TODO add your handling code here:
    }//GEN-LAST:event_x9ActionPerformed

    private void x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x10ActionPerformed
         x10.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png")));
               x ++;
        j= true;// TODO add your handling code here:
    }//GEN-LAST:event_x10ActionPerformed

    private void x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x11ActionPerformed
         x11.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png")));
               x ++;
        k= true;// TODO add your handling code here:
    }//GEN-LAST:event_x11ActionPerformed

    private void x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x12ActionPerformed
         x12.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png")));
               x ++;
        l= true;// TODO add your handling code here:
    }//GEN-LAST:event_x12ActionPerformed

    private void x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x13ActionPerformed
       x13.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png")));
               x ++;
        m= true;  // TODO add your handling code here:
    }//GEN-LAST:event_x13ActionPerformed

    private void x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x14ActionPerformed
         x14.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png")));
               x ++;
        n= true;// TODO add your handling code here:
    }//GEN-LAST:event_x14ActionPerformed

    private void x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x15ActionPerformed
         x15.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png")));
               x ++;
        o = true;// TODO add your handling code here:
    }//GEN-LAST:event_x15ActionPerformed

    private void x16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x16ActionPerformed
         x16.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png")));
               x ++;
         p = true;// TODO add your handling code here:
    }//GEN-LAST:event_x16ActionPerformed

    private void winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_winActionPerformed

    private void abandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abandonarActionPerformed
        try {
            dispose();
            mainm prin = new mainm();
            prin.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_abandonarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        try {
            guardar guardar = new guardar();
            guardar.setVisible(true);
            guardar.puntuajeg.setText(String.valueOf(getPuntuacion()));
            guardar.intentog.setText(String.valueOf(getIntentos()));
            guardar.setSeleccion(4);
            guardar.setA(this.isQ());
            guardar.setB(this.isR());
            guardar.setC(this.isS());
            guardar.setD(this.isT());
            guardar.setS(segundos);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_salirActionPerformed

    public void continuar(){
                                tiempo.setText(String.valueOf(getSegundos()));

         puntuaje.setText(String.valueOf(getPuntuacion()));
       intento.setText(String.valueOf(getIntentos()));

                        if(!isR()){
                           x1.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png"))); 
                           x3.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png"))); 
                           x6.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png"))); 
                           x11.setIcon(new ImageIcon(this.getClass().getResource("4x-2.png"))); 
                           x1.setEnabled(false);
                           x3.setEnabled(false);
                           x6.setEnabled(false);
                           x11.setEnabled(false);
                           
                        }
        
                        if(!isQ()){
                           x4.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png"))); 
                           x7.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png"))); 
                           x10.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png"))); 
                           x13.setIcon(new ImageIcon(this.getClass().getResource("4x-1.png"))); 
                           x4.setEnabled(false);
                           x7.setEnabled(false);
                           x10.setEnabled(false);
                           x13.setEnabled(false);
                        }
                        
                        if(!isS()){
                           x2.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png"))); 
                           x5.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png"))); 
                           x8.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png"))); 
                           x12.setIcon(new ImageIcon(this.getClass().getResource("4x-3.png"))); 
                           x2.setEnabled(false);
                           x5.setEnabled(false);
                           x8.setEnabled(false);
                           x12.setEnabled(false);
                        }
                        
                        if(!isT()){
                           x9.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png"))); 
                           x14.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png"))); 
                           x15.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png"))); 
                           x16.setIcon(new ImageIcon(this.getClass().getResource("4x-4.png"))); 
                           x9.setEnabled(false);
                           x14.setEnabled(false);
                           x15.setEnabled(false);
                           x16.setEnabled(false);
                        }
                        
                        if (isQ() == false && isR() == false && isS() == false && isT() == false) {
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
            x10.setEnabled(false);
            x11.setEnabled(false);
            x12.setEnabled(false);
            x13.setEnabled(false);
            x14.setEnabled(false);
            x15.setEnabled(false);
            x16.setEnabled(false);
           // t.stop();
                        
        }
    }
    public void setNew(){
        x1.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x2.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x3.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x4.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x5.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x6.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x7.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x8.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x9.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x10.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x11.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x12.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x13.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x14.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x15.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
x16.setIcon(new ImageIcon(this.getClass().getResource("preguntas.png")));
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
        x7.setOpaque(false);   
x7.setContentAreaFilled(false);
x7.setBorderPainted(false);
x7.setOpaque(false);   
x7.setContentAreaFilled(false);
x7.setBorderPainted(false);
x8.setOpaque(false);   
x8.setContentAreaFilled(false);
x8.setBorderPainted(false);
x9.setOpaque(false);   
x9.setContentAreaFilled(false);
x9.setBorderPainted(false);
x10.setOpaque(false);   
x10.setContentAreaFilled(false);
x10.setBorderPainted(false);
x11.setOpaque(false);   
x11.setContentAreaFilled(false);
x11.setBorderPainted(false);
x12.setOpaque(false);   
x12.setContentAreaFilled(false);
x12.setBorderPainted(false);
x13.setOpaque(false);   
x13.setContentAreaFilled(false);
x13.setBorderPainted(false);
x14.setOpaque(false);   
x14.setContentAreaFilled(false);
x14.setBorderPainted(false);
x15.setOpaque(false);   
x15.setContentAreaFilled(false);
x15.setBorderPainted(false);
x16.setOpaque(false);   
x16.setContentAreaFilled(false);
x16.setBorderPainted(false);
        win.setOpaque(false);   
        win.setContentAreaFilled(false);
        win.setBorderPainted(false);
        win.setVisible(false);
        x7.setOpaque(false);   
    
}

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean isQ() {
        return Q;
    }

    public void setQ(boolean Q) {
        this.Q = Q;
    }

    public boolean isR() {
        return R;
    }

    public void setR(boolean R) {
        this.R = R;
    }

    public boolean isS() {
        return S;
    }

    public void setS(boolean S) {
        this.S = S;
    }

    public boolean isT() {
        return T;
    }

    public void setT(boolean T) {
        this.T = T;
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
            java.util.logging.Logger.getLogger(xxxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xxxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xxxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xxxx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abandonar;
    private javax.swing.JLabel intento;
    private javax.swing.JLabel intentodisplay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel puntuaje;
    private javax.swing.JLabel puntuajedisplay;
    private javax.swing.JLabel puntuajedisplay1;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tiempo;
    private javax.swing.JButton win;
    private javax.swing.JButton x1;
    private javax.swing.JButton x10;
    private javax.swing.JButton x11;
    private javax.swing.JButton x12;
    private javax.swing.JButton x13;
    private javax.swing.JButton x14;
    private javax.swing.JButton x15;
    private javax.swing.JButton x16;
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
