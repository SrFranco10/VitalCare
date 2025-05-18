
package com.umg.curso.controldepacientes.Vista.Doctores;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import com.umg.curso.controldepacientes.Vista.FmrLogin;
import com.umg.curso.controldepacientes.paneles.Altas;
import com.umg.curso.controldepacientes.paneles.Citas;
import com.umg.curso.controldepacientes.paneles.Pacientes;
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

public class FmrDoctor extends javax.swing.JFrame implements ActionListener, MouseListener {

   
    public FmrDoctor() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
        btnAlta.addActionListener(this);
        btnPacientes.addActionListener(this);
        btnCitas.addActionListener(this);
        btnSalir1.addMouseListener(this);
    }
    
       private void InitContent(){
        ShowJPanel(new bienvenida());
    };
    
    
    private void ShowJPanel(JPanel p){
        p.setSize(720, 530);
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
        btnCitas = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        logoPeque = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(140, 205, 216));
        jPanel2.setMinimumSize(new java.awt.Dimension(282, 683));
        jPanel2.setPreferredSize(new java.awt.Dimension(282, 683));

        tituloMenus.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        tituloMenus.setForeground(new java.awt.Color(255, 255, 255));
        tituloMenus.setText("Digitacion Medica");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\vital care Cuidado y salud.png")); // NOI18N

        btnCitas.setBackground(new java.awt.Color(169, 205, 216));
        btnCitas.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnCitas.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\icons8-tiempo-de-amor-40.png")); // NOI18N
        btnCitas.setText("Citas pendientes");
        btnCitas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCitas.setBorderPainted(false);
        btnCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCitas.setIconTextGap(10);

        btnPacientes.setBackground(new java.awt.Color(169, 205, 216));
        btnPacientes.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\icons8-máscara-de-oxígeno-para-pacientes-40.png")); // NOI18N
        btnPacientes.setText("Pacientes actuales");
        btnPacientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPacientes.setBorderPainted(false);
        btnPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPacientes.setIconTextGap(10);

        btnAlta.setBackground(new java.awt.Color(169, 205, 216));
        btnAlta.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnAlta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlta.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\icons8-health-checkup-40.png")); // NOI18N
        btnAlta.setText("Pacientes en alta");
        btnAlta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAlta.setBorderPainted(false);
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlta.setIconTextGap(10);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\Un éxito más en tu vida..png")); // NOI18N

        btnSalir1.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\cerrar-sesion-de-usuario(1).png")); // NOI18N
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tituloMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tituloMenus))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        header.setBackground(new java.awt.Color(78, 196, 197));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        titulo.setFont(new java.awt.Font("Roboto Condensed Black", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Administracion Hospitalaria y Clinica VitalCare");

        logoPeque.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Escritorio\\Semestre 5\\Programas\\Imagenes Proyecto\\logopequeno.png")); // NOI18N

        fecha.setFont(new java.awt.Font("Roboto SemiCondensed Black", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(logoPeque))
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logoPeque))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mensaje.setFont(new java.awt.Font("Roboto Black", 2, 14)); // NOI18N
        mensaje.setText("\"Bendice, alma mía, al Señor, y no olvides ninguno de sus beneficios.\". Salmo 103:2");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(718, 718, 718))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(mensaje))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(580, 580, 580))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 700);

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
            java.util.logging.Logger.getLogger(FmrDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrDoctor().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JLabel btnSalir1;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
        if(e.getSource()==btnCitas){
             ShowJPanel(new Citas());
        }
        if(e.getSource()==btnPacientes){
             ShowJPanel(new Pacientes());
        }
        if(e.getSource()==btnAlta){
            ShowJPanel(new Altas());
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
