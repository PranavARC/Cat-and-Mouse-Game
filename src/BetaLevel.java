
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author class11
 */
public class BetaLevel extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public BetaLevel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Field = new javax.swing.JTextField();
        Field1 = new javax.swing.JTextField();
        HaxField = new javax.swing.JTextField();
        BaitField = new javax.swing.JTextField();
        LeftButton = new javax.swing.JButton();
        DownButton = new javax.swing.JButton();
        RightButton = new javax.swing.JButton();
        UpButton = new javax.swing.JButton();
        Chez = new javax.swing.JLabel();
        Chez1 = new javax.swing.JLabel();
        Mouse = new javax.swing.JLabel();
        Cat = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        BaitButton = new javax.swing.JButton();
        Bait = new javax.swing.JLabel();

        HaxField.setText("0");

        BaitField.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(943, 423));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        LeftButton.setText("Left");
        LeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftButtonActionPerformed(evt);
            }
        });

        DownButton.setText("Down");
        DownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownButtonActionPerformed(evt);
            }
        });

        RightButton.setText("Right");
        RightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightButtonActionPerformed(evt);
            }
        });
        RightButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RightButtonKeyPressed(evt);
            }
        });

        UpButton.setText("Up");
        UpButton.setVerifyInputWhenFocusTarget(false);
        UpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpButtonActionPerformed(evt);
            }
        });
        UpButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UpButtonKeyPressed(evt);
            }
        });

        Chez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chez.png"))); // NOI18N

        Chez1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chez.png"))); // NOI18N

        Mouse.setBackground(new java.awt.Color(255, 255, 255));
        Mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smol Jerry.jpg"))); // NOI18N
        Mouse.setToolTipText("");
        Mouse.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                MouseComponentShown(evt);
            }
        });

        Cat.setBackground(new java.awt.Color(204, 204, 204));
        Cat.setForeground(new java.awt.Color(204, 204, 204));
        Cat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cat.png"))); // NOI18N

        ExitButton.setBackground(new java.awt.Color(255, 0, 51));
        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        BaitButton.setText("Bait");
        BaitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaitButtonActionPerformed(evt);
            }
        });

        Bait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Placeholder.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chez, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(Bait, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Chez1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BaitButton)
                                .addGap(478, 478, 478))
                            .addComponent(Mouse, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(DownButton)
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(RightButton))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Chez, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(Bait, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Chez1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(UpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DownButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BaitButton)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mouse, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_formMouseMoved

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formFocusGained

    private void RightButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RightButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RightButtonKeyPressed

    private void RightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightButtonActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_RightButtonActionPerformed

    private void DownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownButtonActionPerformed
        // TODO add your handling code here:
        int hax=Integer.parseInt(HaxField.getText());
        int ri= Mouse.getX();
        int y= Mouse.getY();
        int xchez= Chez.getX();
        int ychez= Chez.getY();
        int y1= y+10;
        Mouse.setLocation(ri, y1);
        System.out.println("Location: ");
        System.out.println("X: "+ ri);

        System.out.println("Y: "+ y1);
        System.out.println(" ");
        if(y1>=-39 && y1<=161)
        {
            if(ri>=542 && ri<=812)
            {
                Chez.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Eaten Chez.png"));
                Field.setText("1");
            }
        }
        if(y1>=-89 && y1<=121)
        {
            if(ri>=-38 && ri<=192)
            {
                Chez1.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Eaten Chez.png"));
                Field1.setText("1");
            }
        }
        if(ri<=-148)
        {
            Mouse.setLocation(932, y1);
            hax++;
        }
        if(ri>=952)
        {
            Mouse.setLocation(-128, y1);
            hax++;
        }
        if(y1<=-129)
        {
            Mouse.setLocation(ri, 411 );
            hax++;
        }
        if(y1>=431)
        {
            Mouse.setLocation(ri, -109 );
            hax++;
        }
        if(hax==10)
        {
            Mouse.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Sad Jerry.jpg")); 
            JOptionPane.showMessageDialog(null, "Don't cheat.");
            System.exit(0);
        }
        if(Field1.getText().equals("1") && Field.getText().equals("1") )
        {
            JOptionPane.showMessageDialog(null, "YOU WIN");
            JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING");
            System.exit(0);
        }
        HaxField.setText(""+hax);
        int mx= Mouse.getX();
        int my= Mouse.getY();
        int cx= Cat.getX();
        int cy= Cat.getY();
        if(cx!=mx || cy!=my)
        {
            int difx=0;
            int dify=0;        
            int firstdifx=cx-mx;
            if(firstdifx<0)
            {
                difx= firstdifx * (-1);
            }
            else
            {
                difx= firstdifx ;
            }
            int firstdify=cy-my;
            if(firstdify<0)
            {
                dify= firstdify * (-1);
            }
            else
            {
                dify= firstdify;
            }
            if(difx>dify)
            {
              if(firstdifx>0)
              {
                  Cat.setLocation(cx-15, cy);
              }
              else
              {
                  Cat.setLocation(cx+15,cy);
              }
            }
            else if(difx<dify)
            {
                if(firstdify>0)
                {
                    Cat.setLocation(cx,cy-15);
                }
                else 
                {
                    Cat.setLocation(cx,cy+15);
                }
            }
        }
        if((mx>cx-60&& mx<cx+60) && (my>cy-60 && my<cy+60))
                {
                   Mouse.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Sad Jerry.jpg")); 
                   for(long che=1; che!=500000000; che++)
                   {
                       ;
                   }
                   JOptionPane.showMessageDialog(null, "YOU LOSE");
                   JOptionPane.showMessageDialog(null, "GIT GUD");
                   System.exit(0);
                }
    }//GEN-LAST:event_DownButtonActionPerformed

    private void LeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftButtonActionPerformed
        // TODO add your handling code here:
        int hax=Integer.parseInt(HaxField.getText());
        int ri= Mouse.getX();
        int y= Mouse.getY();
        int xchez= Chez.getX();
        int ychez= Chez.getY();
        int n= ri-10;
        Mouse.setLocation(n, y);
        System.out.println("Location: ");
        System.out.println("X: "+ n);
        System.out.println("Y: "+ y);
        System.out.println(" ");
        if(y>=-39 && y<=161)
        {
            if(n>=542 && n<=812)
            {
                Chez.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Eaten Chez.png"));
                Field.setText("1");
            }
        }
        if(y>=-89 && y<=121)
        {
            if(n>=-38 && n<=192)
            {
                Chez1.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Eaten Chez.png"));
                Field1.setText("1");
            }
        }
        if(n<=-148)
        {
            Mouse.setLocation(932, y);
            hax++;
        }
        if(n>=952)
        {
            Mouse.setLocation(-128, y);
            hax++;
        }
        if(y<=-129)
        {
            Mouse.setLocation(n, 411 );
            hax++;
        }
        if(y>=431)
        {
            Mouse.setLocation(n, -109 );
            hax++;
        }
        if(hax==10)
        {
            Mouse.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Sad Jerry.jpg")); 
            JOptionPane.showMessageDialog(null, "Don't cheat.");
            System.exit(0);
        }
        if(Field1.getText().equals("1") && Field.getText().equals("1") )
        {
            JOptionPane.showMessageDialog(null, "YOU WIN");
            JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING");
            System.exit(0);
        }
        HaxField.setText(""+hax);
        int mx= Mouse.getX();
        int my= Mouse.getY();
        int cx= Cat.getX();
        int cy= Cat.getY();
        if(cx!=mx || cy!=my)
        {
            int difx=0;
            int dify=0;        
            int firstdifx=cx-mx;
            if(firstdifx<0)
            {
                difx= firstdifx * (-1);
            }
            else
            {
                difx= firstdifx ;
            }
            int firstdify=cy-my;
            if(firstdify<0)
            {
                dify= firstdify * (-1);
            }
            else
            {
                dify= firstdify;
            }
            if(difx>dify)
            {
              if(firstdifx>0)
              {
                  Cat.setLocation(cx-15, cy);
              }
              else
              {
                  Cat.setLocation(cx+15,cy);
              }
            }
            else if(difx<dify)
            {
                if(firstdify>0)
                {
                    Cat.setLocation(cx,cy-15);
                }
                else 
                {
                    Cat.setLocation(cx,cy+15);
                }
            }
        }
        if((mx>cx-60&& mx<cx+60) && (my>cy-60 && my<cy+60))
           {
                Mouse.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Sad Jerry.jpg")); 
                for(long che=1; che!=500000000; che++)
                    {
                        ;
                    }
                JOptionPane.showMessageDialog(null, "YOU LOSE");
                JOptionPane.showMessageDialog(null, "GIT GUD");
                System.exit(0);
           }
    }//GEN-LAST:event_LeftButtonActionPerformed

    private void UpButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpButtonKeyPressed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_UpButtonKeyPressed

    private void UpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpButtonActionPerformed
        // TODO add your handling code here:
        int hax=Integer.parseInt(HaxField.getText());
        int ri= Mouse.getX();
        int y= Mouse.getY();
        int xchez= Chez.getX();
        int ychez= Chez.getY();
        int y1= y-10;
        Mouse.setLocation(ri, y1);
        System.out.println("Location: ");
        System.out.println("X: "+ ri);

        System.out.println("Y: "+ y1);
        System.out.println(" ");

        if(y1>=-39 && y1<=161)
        {
            if(ri>=542 && ri<=812)
            {
                Chez.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Eaten Chez.png"));
                Field.setText("1");
            }
        }
        if(y1>=-89 && y1<=121)
        {
            if(ri>=-38 && ri<=192)
            {
                Chez1.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Eaten Chez.png"));
                Field1.setText("1");
            }
        }
        if(ri<=-148)
        {
            Mouse.setLocation(932, y1);
            hax++;
        }
        if(ri>=952)
        {
            Mouse.setLocation(-128, y1);
            hax++;
        }
        if(y1<=-129)
        {
            Mouse.setLocation(ri, 411 );
            hax++;
        }
        if(y1>=431)
        {
            Mouse.setLocation(ri, -109 );
            hax++;
        }
        if(hax==10)
        {
            Mouse.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Sad Jerry.jpg")); 
            JOptionPane.showMessageDialog(null, "Don't cheat.");
            System.exit(0);
        }
        if(Field1.getText().equals("1") && Field.getText().equals("1") )
        {
            JOptionPane.showMessageDialog(null, "YOU WIN");
            JOptionPane.showMessageDialog(null, "THANKS FOR PLAYING");
            System.exit(0);
        }
        HaxField.setText(""+hax);
        int mx= Mouse.getX();
        int my= Mouse.getY();
        int cx= Cat.getX();
        int cy= Cat.getY();
        if(cx!=mx || cy!=my)
        {
            int difx=0;
            int dify=0;        
            int firstdifx=cx-mx;
            if(firstdifx<0)
            {
                difx= firstdifx * (-1);
            }
            else
            {
                difx= firstdifx ;
            }
            int firstdify=cy-my;
            if(firstdify<0)
            {
                dify= firstdify * (-1);
            }
            else
            {
                dify= firstdify;
            }
            if(difx>dify)
            {
              if(firstdifx>0)
              {
                  Cat.setLocation(cx-15, cy);
              }
              else
              {
                  Cat.setLocation(cx+15,cy);
              }
            }
            else if(difx<dify)
            {
                if(firstdify>0)
                {
                    Cat.setLocation(cx,cy-15);
                }
                else 
                {
                    Cat.setLocation(cx,cy+15);
                }
            }
        }
        if((mx>cx-60&& mx<cx+60) && (my>cy-60 && my<cy+60))
                {
                   Mouse.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Sad Jerry.jpg")); 
                   for(long che=1; che!=500000000; che++)
                   {
                       ;
                   }
                   JOptionPane.showMessageDialog(null, "YOU LOSE");
                   JOptionPane.showMessageDialog(null, "GIT GUD");
                   System.exit(0);
                }

    }//GEN-LAST:event_UpButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void MouseComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MouseComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_MouseComponentShown

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseEntered

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        new ExitConfirmed().setVisible(true);        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void BaitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaitButtonActionPerformed
        // TODO add your handling code here:
        int mx= Mouse.getX();
        int my= Mouse.getY();
        Bait.setIcon(new ImageIcon("D:\\Pranav Charkupalli\\Bait.png"));
        Bait.setLocation(mx, my);
        if(Integer.parseInt(BaitField.getText())==0)
        {
            BaitField.setText("3");
        }
    }//GEN-LAST:event_BaitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bait;
    private javax.swing.JButton BaitButton;
    private javax.swing.JTextField BaitField;
    private javax.swing.JLabel Cat;
    private javax.swing.JLabel Chez;
    private javax.swing.JLabel Chez1;
    private javax.swing.JButton DownButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField Field;
    private javax.swing.JTextField Field1;
    private javax.swing.JTextField HaxField;
    private javax.swing.JButton LeftButton;
    private javax.swing.JLabel Mouse;
    private javax.swing.JButton RightButton;
    private javax.swing.JButton UpButton;
    // End of variables declaration//GEN-END:variables
}
