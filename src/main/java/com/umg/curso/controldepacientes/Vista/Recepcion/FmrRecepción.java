
package com.umg.curso.controldepacientes.Vista.Recepcion;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import com.umg.curso.controldepacientes.Vista.FmrLogin;
import com.umg.curso.controldepacientes.paneles.Agendar;
import com.umg.curso.controldepacientes.paneles.Ingresar;
import com.umg.curso.controldepacientes.paneles.bienvenida;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;


public class FmrRecepción extends javax.swing.JFrame implements ActionListener, MouseListener {

    
    public FmrRecepción() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
        btnIngresar.addActionListener(this);
        btnAgendar.addActionListener(this);
        btnSalir1.addMouseListener(this);
        
    }
     private void InitContent(){
        ShowJPanel(new bienvenida());
    }
    

    
    private void ShowJPanel(JPanel p){
        p.setSize(650, 420);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
     private void InitStyles () {
        mensaje.setForeground(Color.black);
        
    }

    private void SetDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale ("es", "ES");
        fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' YYYY", spanishLocale)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tituloMenus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        logoPeque = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(140, 205, 216));
        jPanel2.setMinimumSize(new java.awt.Dimension(282, 425));
        jPanel2.setLayout(null);

        tituloMenus.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        tituloMenus.setForeground(new java.awt.Color(255, 255, 255));
        tituloMenus.setText("Pre consulta");
        jPanel2.add(tituloMenus);
        tituloMenus.setBounds(40, 50, 210, 47);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(40, 100, 203, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\vital care Cuidado y salud.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 120, 218, 200);

        btnIngresar.setBackground(new java.awt.Color(169, 205, 216));
        btnIngresar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\IngresarPaciente.png")); // NOI18N
        btnIngresar.setText("Ingresar Paciente");
        btnIngresar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIngresar.setIconTextGap(10);
        jPanel2.add(btnIngresar);
        btnIngresar.setBounds(0, 360, 280, 51);

        btnAgendar.setBackground(new java.awt.Color(169, 205, 216));
        btnAgendar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\AgendarCita.png")); // NOI18N
        btnAgendar.setText("Agendar Cita");
        btnAgendar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAgendar.setBorderPainted(false);
        btnAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgendar.setIconTextGap(10);
        jPanel2.add(btnAgendar);
        btnAgendar.setBounds(0, 410, 280, 51);

        btnSalir1.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\cerrar-sesion-de-usuario(1).png")); // NOI18N
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnSalir1);
        btnSalir1.setBounds(0, 0, 40, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 280, 700);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(641, 389));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.add(content);
        content.setBounds(280, 170, 720, 530);

        header.setBackground(new java.awt.Color(78, 196, 197));
        header.setPreferredSize(new java.awt.Dimension(750, 150));
        header.setLayout(null);

        titulo.setFont(new java.awt.Font("Roboto Condensed Black", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Administracion Hospitalaria y Clinica VitalCare");
        header.add(titulo);
        titulo.setBounds(50, 30, 492, 32);

        logoPeque.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\logopequeno.png")); // NOI18N
        header.add(logoPeque);
        logoPeque.setBounds(550, 10, 55, 55);

        fecha.setFont(new java.awt.Font("Roboto SemiCondensed Black", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Hoy es {dayname} {day} de {month} de {year}");
        header.add(fecha);
        fecha.setBounds(50, 50, 517, 71);

        jPanel1.add(header);
        header.setBounds(260, 40, 740, 130);

        mensaje.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        mensaje.setText("\"Y conoceréis la verdad y la verdad os hará libres”. Juan 8:32");
        jPanel1.add(mensaje);
        mensaje.setBounds(300, 10, 410, 19);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(FmrRecepción.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrRecepción.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrRecepción.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrRecepción.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrRecepción().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel btnSalir1;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoPeque;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloMenus;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnIngresar){
            ShowJPanel(new Ingresar());
        }
        if(e.getSource()==btnAgendar){
            ShowJPanel(new Agendar());
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == btnSalir1){
            FmrLogin Credenciales = new FmrLogin();
            Credenciales.setBounds(0, 0, 900, 500);
            Credenciales.setVisible(true);
            this.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
