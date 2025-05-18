
package com.umg.curso.controldepacientes.Vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import com.umg.curso.controldepacientes.Vista.Admin.FmrAdmin;
import com.umg.curso.controldepacientes.Vista.Doctores.FmrDoctor;
import com.umg.curso.controldepacientes.Vista.Recepcion.FmrRecepción;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;

public class FmrLogin extends javax.swing.JFrame implements MouseListener, MouseMotionListener{

    int xMause, yMause;
    public FmrLogin() {
        setUndecorated(true);
        initComponents();
        
        txtUser.addMouseListener(this);
        txtPassword.addMouseListener(this);
        Header.addMouseListener(this);
        Header.addMouseMotionListener(this);
        btnExit.addMouseListener(this);
        btnLogin.addMouseListener(this);
        btnLogin.setOpaque(true);
        btnExit.setOpaque(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Logo2 = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Header = new javax.swing.JPanel();
        ExitPanel = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        btnpanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        Labeliniciar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnLogin1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\vital care Cuidado y salud.png")); // NOI18N
        jPanel1.add(Logo);
        Logo.setBounds(660, 120, 220, 240);

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\Diseño sin título (1).png")); // NOI18N
        Fondo.setText("jLabel1");
        jPanel1.add(Fondo);
        Fondo.setBounds(630, 0, 270, 500);

        Logo2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Logo2.setForeground(new java.awt.Color(140, 205, 216));
        Logo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\icons8-hospital-70.png")); // NOI18N
        Logo2.setText("Vital Care");
        jPanel1.add(Logo2);
        Logo2.setBounds(40, 30, 170, 80);

        LabelUser.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        LabelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUser.setText("Usuario");
        jPanel1.add(LabelUser);
        LabelUser.setBounds(40, 180, 80, 24);

        LabelPassword.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        LabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPassword.setText("Contraseña");
        jPanel1.add(LabelPassword);
        LabelPassword.setBounds(40, 260, 110, 24);

        txtUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Ingrese su nombre de usuario");
        txtUser.setBorder(null);
        jPanel1.add(txtUser);
        txtUser.setBounds(40, 220, 410, 30);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("********");
        txtPassword.setBorder(null);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(40, 290, 410, 30);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(40, 250, 550, 10);

        Header.setBackground(new java.awt.Color(255, 255, 255));

        ExitPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ExitPanelLayout = new javax.swing.GroupLayout(ExitPanel);
        ExitPanel.setLayout(ExitPanelLayout);
        ExitPanelLayout.setHorizontalGroup(
            ExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitPanelLayout.setVerticalGroup(
            ExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 863, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(ExitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Header);
        Header.setBounds(0, 0, 900, 38);

        btnpanel.setBackground(new java.awt.Color(0, 134, 190));

        btnLogin.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Ingresar");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnpanelLayout = new javax.swing.GroupLayout(btnpanel);
        btnpanel.setLayout(btnpanelLayout);
        btnpanelLayout.setHorizontalGroup(
            btnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnpanelLayout.setVerticalGroup(
            btnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnpanel);
        btnpanel.setBounds(40, 400, 130, 40);

        Labeliniciar.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Labeliniciar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Labeliniciar.setText("Iniciar sesion");
        jPanel1.add(Labeliniciar);
        Labeliniciar.setBounds(40, 130, 139, 32);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(40, 320, 550, 10);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(40, 320, 550, 10);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(40, 320, 550, 10);

        btnLogin1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin1.setText("Limpiar");
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnLogin1);
        btnLogin1.setBounds(190, 410, 114, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMTMaterialLighterIJTheme.setup();
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
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExitPanel;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JLabel Labeliniciar;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnLogin1;
    private javax.swing.JPanel btnpanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == btnExit) {
            System.exit(0);
        } 
        if (e.getSource() == btnLogin) {
            javax.swing.JOptionPane.showMessageDialog(this, "intento de login con los datos\nUsuario: " + txtUser.getText() + "\nContraseña: " + String.valueOf(txtPassword.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             if (txtUser.getText().equals("Recepcion" ) && txtPassword.getText().equals("Recepcion" )) {
                FmrRecepción VistaRecepcion = new FmrRecepción();
                VistaRecepcion.setBounds(0, 0, 1015, 720);
                VistaRecepcion.setVisible(true);
                this.dispose();
            } else if (txtUser.getText().equals("Doctores") && txtPassword.getText().equals("Doctores")) {
                FmrDoctor VistaDoctores = new FmrDoctor();
                VistaDoctores.setBounds(0, 0, 1015, 720);
                VistaDoctores.setVisible(true);
                this.dispose();
            } else if (txtUser.getText().equals("Admin") && txtPassword.getText().equals("Admin")) {
                FmrAdmin VistaAdmin = new FmrAdmin();
                VistaAdmin.setBounds(0, 0, 900, 600);
                VistaAdmin.setVisible(true);
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrecta");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == txtUser) {
            if (txtUser.getText().equals("Ingrese su nombre de usuario")) {
                txtUser.setText("");
                txtUser.setForeground(Color.black);
            }
            if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
                txtPassword.setText("********");
                txtPassword.setForeground(Color.gray);
            }
        }
        if (e.getSource() == txtPassword) {
            if (String.valueOf(txtPassword.getPassword()).equals("********")) {
                txtPassword.setText("");
                txtPassword.setForeground(Color.black);
            }
            if (txtUser.getText().isEmpty()) {
                txtUser.setText("Ingrese su nombre de usuario");
                txtUser.setForeground(Color.gray);
            }
        }
        if (e.getSource() == Header) {
            xMause = e.getX();
            yMause = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == btnExit) {
            btnExit.setBackground(Color.red);
            ExitPanel.setForeground(Color.WHITE);
        }
        if (e.getSource() == btnLogin) {
            btnLogin.setBackground(new Color(0, 156, 223));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == btnLogin) {
            btnLogin.setBackground(new Color(0, 134, 190));
        }
        if (e.getSource() == btnExit) {
            btnExit.setBackground(Color.white);
            ExitPanel.setForeground(Color.BLACK);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == Header) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            this.setLocation(x - xMause, y - yMause);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
