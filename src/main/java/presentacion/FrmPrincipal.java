package presentacion;

import entidades.*;
import com.formdev.flatlaf.FlatLightLaf;
import datos.Conexion;
import javax.swing.*;
import logica.EmpleadoBL;
import logica.SucursalBL;

/**
 *
 * @author deerfox@debian
 */
public class FrmPrincipal extends javax.swing.JFrame {

    public static boolean confirmar(String pregunta) {
        boolean confirmado = false;
        int resultado = JOptionPane.showConfirmDialog(null, pregunta, "Confirmación", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            confirmado = true;
        } else if (resultado == JOptionPane.NO_OPTION) {
            confirmado = false;
        }
        return confirmado;
    }

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        sucuPanel = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnListarSuc = new javax.swing.JButton();
        lblSucuTitle = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        emplPanel = new javax.swing.JPanel();
        btnAsignar = new javax.swing.JButton();
        lblEmplTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("EurekaBank Office Manager");
        setPreferredSize(new java.awt.Dimension(630, 420));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        sucuPanel.setToolTipText("Sucursales");
        sucuPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sucuPanel.setName("sucuPanel"); // NOI18N

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrar-suc.png"))); // NOI18N
        btnRegistrar.setText(" Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar-suc.png"))); // NOI18N
        btnModificar.setText(" Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListarSuc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListarSuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar-suc.png"))); // NOI18N
        btnListarSuc.setText("     Listar");
        btnListarSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarSucActionPerformed(evt);
            }
        });

        lblSucuTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSucuTitle.setText("Sucursales");

        javax.swing.GroupLayout sucuPanelLayout = new javax.swing.GroupLayout(sucuPanel);
        sucuPanel.setLayout(sucuPanelLayout);
        sucuPanelLayout.setHorizontalGroup(
            sucuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sucuPanelLayout.createSequentialGroup()
                .addComponent(lblSucuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
            .addGroup(sucuPanelLayout.createSequentialGroup()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        sucuPanelLayout.setVerticalGroup(
            sucuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sucuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSucuTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sucuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        getContentPane().add(sucuPanel);
        sucuPanel.setBounds(28, 117, 581, 113);
        sucuPanel.getAccessibleContext().setAccessibleName("Sucursales");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setText("Le damos la bienvenida a EurekaBank Office Manager");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(28, 32, 570, 30);

        lblDesc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblDesc.setText("Administre fácilmente las sucursales de su banco.");
        getContentPane().add(lblDesc);
        lblDesc.setBounds(28, 74, 790, 25);

        btnInfo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnInfo.setText("Información y Soporte");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo);
        btnInfo.setBounds(30, 360, 185, 28);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(530, 350, 72, 28);

        emplPanel.setToolTipText("Empleados");
        emplPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emplPanel.setName("emplPanel"); // NOI18N

        btnAsignar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asignar.png"))); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        lblEmplTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmplTitle.setText("Empleados");

        javax.swing.GroupLayout emplPanelLayout = new javax.swing.GroupLayout(emplPanel);
        emplPanel.setLayout(emplPanelLayout);
        emplPanelLayout.setHorizontalGroup(
            emplPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emplPanelLayout.createSequentialGroup()
                .addComponent(lblEmplTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emplPanelLayout.createSequentialGroup()
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        emplPanelLayout.setVerticalGroup(
            emplPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emplPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmplTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getContentPane().add(emplPanel);
        emplPanel.setBounds(28, 236, 171, 113);
        emplPanel.getAccessibleContext().setAccessibleName("Empleados");

        jButton1.setText("INGRESAR CONTRASEÑA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 280, 190, 30);

        setSize(new java.awt.Dimension(654, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (confirmar("¿Desea cerrar el programa?"))
            this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (confirmar("¿Desea cerrar el programa?"))
            this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        new FrmInfoSoporte().setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        new FrmRegistrarSuc().setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Sucursal suc;
        String codigo = JOptionPane.showInputDialog(null, "Ingrese el código de la sucursal a modificar", "Modificar sucursal", 3);
        if (codigo != null) {
            SucursalBL sucuBL = SucursalBL.INSTANCIA();
            suc = sucuBL.buscarSucursal(codigo);
            if (suc != null) {
                new FrmModificarSuc(suc).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ninguna sucursal está registrada con ese código.", "Código inválido", 1);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnListarSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarSucActionPerformed
        new FrmListarSuc().setVisible(true);
    }//GEN-LAST:event_btnListarSucActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        Empleado emp;
        String codigo = JOptionPane.showInputDialog(null, "Ingrese el código del empleado a modificar", "Modificar sucursal", 3);
        if (codigo != null) {
            empleadoBL = EmpleadoBL.INSTANCIA();
            emp = empleadoBL.buscarEmpleado(codigo);
            if (emp != null) {
                new FrmAsignarEmpl(emp).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ningún empleado está registrado con ese código.", "Código inválido", 1);
            }
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conexion.password = JOptionPane.showInputDialog(null,"Ingrese su contraseña MySQL","Contraseña",1);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the FlatLaf Light look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnListarSuc;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel emplPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblEmplTitle;
    private javax.swing.JLabel lblSucuTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel sucuPanel;
    // End of variables declaration//GEN-END:variables
    private EmpleadoBL empleadoBL;
}
