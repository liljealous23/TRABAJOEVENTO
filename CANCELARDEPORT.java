/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO2;

import java.util.Calendar;
import PROYECTO2.DEPORTE.depor;
import eventos.Editardeportec;
import eventos.cancelardeporte;
import java.util.Date;
import javax.swing.JOptionPane;
import porsiacaso.primerusuario;

/**
 *
 * @author 50496
 */
public class CANCELARDEPORT extends javax.swing.JFrame {

    /**
     * Creates new form CANCELARDEPORT
     */
    BUSCARCODIGO3 op = new BUSCARCODIGO3();
    
    public CANCELARDEPORT() {
        initComponents();
        llenado();
        llenar();
        
        codigo1.setEditable(false);
        MONTO.setEditable(false);
        asistir.setEditable(false);
        descrip.setEditable(false);
        total.setEditable(false);
        fecha.setEnabled(false);
        equipo1.setEditable(false);
        equipo2.setEditable(false);
        nombres1.setEditable(false);
        nombres2.setEditable(false);
        tipodeporte.setEditable(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextArea();
        titulo1 = new javax.swing.JTextField();
        codigo1 = new javax.swing.JTextField();
        tipodeporte = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        equipo1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        equipo2 = new javax.swing.JTextField();
        guardardepor = new javax.swing.JButton();
        regreso1 = new javax.swing.JButton();
        asistir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nombres1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        nombres2 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        MONTO = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CODIGO:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 90, 76, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TITULO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 140, 69, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DESCRIPCION:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 210, 123, 25);
        jPanel1.add(fecha);
        fecha.setBounds(150, 330, 226, 29);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FECHA:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 330, 62, 25);

        descrip.setColumns(20);
        descrip.setRows(5);
        jScrollPane1.setViewportView(descrip);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 210, 286, 83);

        titulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo1ActionPerformed(evt);
            }
        });
        jPanel1.add(titulo1);
        titulo1.setBounds(120, 140, 286, 33);
        jPanel1.add(codigo1);
        codigo1.setBounds(120, 80, 286, 34);

        tipodeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodeporteActionPerformed(evt);
            }
        });
        jPanel1.add(tipodeporte);
        tipodeporte.setBounds(150, 400, 226, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Deporte:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 390, 74, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CANCELAR EVENTO DEPORTIVO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 10, 410, 32);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad de personas:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 480, 254, 32);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Equipo 2:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 580, 79, 25);
        jPanel1.add(equipo1);
        equipo1.setBounds(290, 530, 189, 36);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Equipo 1:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 530, 79, 33);
        jPanel1.add(equipo2);
        equipo2.setBounds(290, 580, 189, 33);

        guardardepor.setBackground(new java.awt.Color(0, 204, 255));
        guardardepor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/floppy.png"))); // NOI18N
        guardardepor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardardeporActionPerformed(evt);
            }
        });
        jPanel1.add(guardardepor);
        guardardepor.setBounds(920, 650, 112, 116);

        regreso1.setBackground(new java.awt.Color(0, 204, 255));
        regreso1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regreso1.setForeground(new java.awt.Color(0, 0, 0));
        regreso1.setText("Atras");
        regreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regreso1ActionPerformed(evt);
            }
        });
        jPanel1.add(regreso1);
        regreso1.setBounds(30, 690, 96, 59);

        asistir.setForeground(new java.awt.Color(0, 0, 0));
        asistir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                asistirKeyTyped(evt);
            }
        });
        jPanel1.add(asistir);
        asistir.setBounds(300, 480, 129, 32);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombres de Equipo 1:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(550, 70, 200, 25);

        nombres1.setColumns(20);
        nombres1.setRows(5);
        jScrollPane2.setViewportView(nombres1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(520, 110, 270, 220);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nombres de equipo 2:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(560, 350, 190, 25);

        nombres2.setColumns(20);
        nombres2.setRows(5);
        jScrollPane3.setViewportView(nombres2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(520, 380, 270, 250);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("MONTO:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(830, 120, 75, 25);

        MONTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MONTOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MONTOKeyTyped(evt);
            }
        });
        jPanel1.add(MONTO);
        MONTO.setBounds(910, 114, 150, 30);

        total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalKeyTyped(evt);
            }
        });
        jPanel1.add(total);
        total.setBounds(910, 160, 150, 33);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total Lps:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(820, 160, 82, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo1ActionPerformed

    private void tipodeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodeporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodeporteActionPerformed

    private void guardardeporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardardeporActionPerformed
        // TODO add your handling code here:

        String user = "";
        String codigo = op.codigo;
        String code = codigo1.getText();
        String titulos = titulo1.getText();
        String descripcion = descrip.getText();
        Calendar fecha1 = fecha.getCalendar();
        String tipo = (String) tipodeporte.getSelectedItem();
        String equipo11 = equipo1.getText();
        String equipo22 = equipo2.getText();
        String nombres11 = nombres1.getText();
        String nombres22 = nombres2.getText();
        
        int personas = Integer.parseInt(asistir.getText());
        double monto = Double.parseDouble(MONTO.getText());
        double totalid = Double.parseDouble(total.getText());
        String Estado = "ACTIVO";
        
        cancelardeporte dp = new cancelardeporte("s", user, code, titulos, descripcion, fecha1, personas, monto, totalid, Estado, tipo, equipo11, equipo22, nombres11, nombres22);
        
        dp.cancelar(code);
        new buscarcodigo().setVisible(true);
        this.dispose();
        

    }//GEN-LAST:event_guardardeporActionPerformed

    private void regreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regreso1ActionPerformed
        // TODO add your handling code here:
        new buscarcodigo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regreso1ActionPerformed

    private void asistirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_asistirKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_asistirKeyTyped

    private void MONTOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MONTOKeyReleased
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            
        }
        
        String montotext = MONTO.getText();
        if (montotext.equals("") == false) {
            double montos = Double.parseDouble(montotext);
            double porcentaje = montos * 0.3;
            
            double totale = montos + porcentaje;
            String totalid = Double.toString(totale);
            total.setText(totalid);
        } else {
            total.setText("0");
        }
    }//GEN-LAST:event_MONTOKeyReleased

    private void MONTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MONTOKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_MONTOKeyTyped
    public void llenado() {
        for (depor object : depor.values()) {
            tipodeporte.addItem(object.getDeportess());
        }

    }
    public void llenar() {
        Calendar fecha1 = fecha.getCalendar();
        primerusuario p = new primerusuario("s", "s", "s", "s", 1);
        
        String code = op.codigo;
        String user = p.userin.get(0).getUser();
        
        Editardeportec ob = new Editardeportec("s", "s", "s", "s", "s", fecha1, 1, 1, 1, "s", "s", "s", "s", "s", "s");
        
        if (ob.mostrar(code, user) == true) {
            String monto = Double.toString(ob.montoM);
            String totalid = Double.toString(ob.totalidM);
            System.out.println("no escrible");
            codigo1.setText(ob.codigoM);
            titulo1.setText(ob.tituloM);
            descrip.setText(ob.descripcionM);
            fecha.setCalendar(ob.fechaM);
            String personas = Integer.toString(ob.personasM);
            tipodeporte.setSelectedItem(ob.tipoM);
            MONTO.setText(monto);
            total.setText(totalid);
            asistir.setText(personas);
            equipo1.setText(ob.equipo1M);
            equipo2.setText(ob.equipo2M);
            nombres1.setText(ob.nombres1M);
            nombres2.setText(ob.nombres2M);
            
        }
        
    }
    private void totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_totalKeyTyped

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
            java.util.logging.Logger.getLogger(CANCELARDEPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CANCELARDEPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CANCELARDEPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CANCELARDEPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CANCELARDEPORT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MONTO;
    private javax.swing.JTextField asistir;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextArea descrip;
    private javax.swing.JTextField equipo1;
    private javax.swing.JTextField equipo2;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton guardardepor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea nombres1;
    private javax.swing.JTextArea nombres2;
    private javax.swing.JButton regreso1;
    private javax.swing.JComboBox<String> tipodeporte;
    private javax.swing.JTextField titulo1;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
