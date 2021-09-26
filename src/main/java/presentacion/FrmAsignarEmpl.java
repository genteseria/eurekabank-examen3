
package presentacion;

import entidades.*;
import logica.EmpleadoBL;
import logica.SucursalBL;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author deerfox@debian
 */

public class FrmAsignarEmpl extends javax.swing.JFrame {

    /** Creates new form FrmMostrarEmpleado */
    public FrmAsignarEmpl(Empleado e) {
        initComponents();
        this.e = e;
        lblCodigo.setText(e.getCodigo());
        lblPaterno.setText(e.getPaterno());
        lblMaterno.setText(e.getMaterno());
        lblNombre.setText(e.getNombre());
        SucursalBL sucuBL = SucursalBL.INSTANCIA();
        String[] sucucodigos = sucuBL.obtenerSucucodigos().toArray(new String[0]);
        sucuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(sucucodigos));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblMaterno = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblPaterno = new javax.swing.JLabel();
        lblMaterno1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblCodigo1 = new javax.swing.JLabel();
        lblSucursal = new javax.swing.JLabel();
        lblPaterno2 = new javax.swing.JLabel();
        sucuCombo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignación de Empleado a Sucursal");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asignar.png"))); // NOI18N
        lblTitle.setText("Asignar Empleado");

        lblMaterno.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMaterno.setText("Apellido Materno:");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCodigo.setText("Código:");

        lblPaterno.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPaterno.setText("Apellido Paterno:");

        lblMaterno1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaterno1.setText("Apellido Materno:");

        lblNombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre1.setText("Nombre:");

        lblCodigo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo1.setText("Código:");

        lblSucursal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSucursal.setText("Sucursal asignada:");

        lblPaterno2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPaterno2.setText("Apellido Paterno:");

        sucuCombo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sucuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sucuCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucuComboActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        btnGuardar.setText("Asignar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblCodigo1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSucursal, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                    .addComponent(lblPaterno2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMaterno1)
                                    .addComponent(lblMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombre1)
                                    .addComponent(sucuCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterno1)
                    .addComponent(lblPaterno2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaterno)
                    .addComponent(lblMaterno))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSucursal)
                    .addComponent(sucuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sucuComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucuComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sucuComboActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String r;
        
        codigo = e.getCodigo();
        paterno = e.getPaterno();
        materno = e.getMaterno();
        nombre = e.getNombre();
        ciudad = e.getCiudad();
        direccion = e.getDireccion();
        usuario = e.getUsuario();
        clave = e.getClave();
        sucucodigo = sucuCombo.getSelectedItem().toString();

        r = EmpleadoBL.actualizarEmpleado(codigo, paterno, materno, nombre, ciudad, direccion, usuario, clave, sucucodigo);

        showMessageDialog(null, r, "Información sobre la operación", 1);
        
        if (r.equals("Datos actualizados")) {
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblMaterno1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblPaterno2;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JComboBox<String> sucuCombo;
    // End of variables declaration//GEN-END:variables
    private Empleado e;
    private String codigo, paterno, materno, nombre, ciudad, direccion, usuario, clave, sucucodigo;
}
