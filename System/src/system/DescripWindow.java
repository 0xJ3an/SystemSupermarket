/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system;

import java.text.DecimalFormat;

/**
 *
 * @author j3anp
 */
public class DescripWindow extends javax.swing.JFrame {

    /**
     * Creates new form DescripWindow
     */
    public DescripWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Detalles de venta");
        this.setResizable(false);
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
        btnSalir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtPagar1 = new javax.swing.JLabel();
        txtPrecioIva1 = new javax.swing.JLabel();
        txtPagar2 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JLabel();
        txtPrecioIva2 = new javax.swing.JLabel();
        txtPagar3 = new javax.swing.JLabel();
        txtPrecioIva3 = new javax.swing.JLabel();
        txtPrecio3 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JLabel();
        txtCantidad3 = new javax.swing.JLabel();
        txtCantidad4 = new javax.swing.JLabel();
        txtPrecio4 = new javax.swing.JLabel();
        txtPrecioIva4 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPagar4 = new javax.swing.JLabel();
        txtPagar6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Productos");

        btnSalir.setBackground(new java.awt.Color(28, 28, 28));
        btnSalir.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSalir)
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel24.setText("Artículo");

        jLabel25.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel25.setText("Artículo");

        jLabel26.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel26.setText("Artículo");

        jLabel27.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel27.setText("Artículo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalles de la Venta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel3.setText("Artículo");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel4.setText("Total a pagar");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setText("Cantidad");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel6.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel7.setText("Precio + IVA");

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel8.setText("Huevos");

        txtPrecio1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecio1.setText("$0");

        jLabel10.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel10.setText("Leche de vaca");

        jLabel11.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel11.setText("Atun en lata");

        jLabel12.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel12.setText("Aceite Oliva");

        txtCantidad1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtCantidad1.setText("0");

        txtPagar1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPagar1.setText("$0");

        txtPrecioIva1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecioIva1.setText("$0");

        txtPagar2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPagar2.setText("$0");

        txtCantidad2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtCantidad2.setText("0");

        txtPrecio2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecio2.setText("$0");

        txtPrecioIva2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecioIva2.setText("$0");

        txtPagar3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPagar3.setText("$0");

        txtPrecioIva3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecioIva3.setText("$0");

        txtPrecio3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecio3.setText("$0");

        txtTotalPagar.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtTotalPagar.setText("$0");

        txtCantidad3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtCantidad3.setText("0");

        txtCantidad4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtCantidad4.setText("0");

        txtPrecio4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecio4.setText("$0");

        txtPrecioIva4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPrecioIva4.setText("$0");

        btnRegresar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnPagar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel9.setText("Total a pagar");

        txtPagar4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPagar4.setText("$0");

        txtPagar6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtPagar6.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad1)
                                    .addComponent(txtCantidad2)
                                    .addComponent(txtCantidad3)
                                    .addComponent(txtCantidad4)
                                    .addComponent(txtPagar6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(txtTotalPagar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPrecio4)
                                    .addComponent(txtPrecio2)
                                    .addComponent(txtPrecio1)
                                    .addComponent(txtPrecio3))))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPrecioIva4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrecioIva3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPrecioIva2)
                                            .addComponent(txtPrecioIva1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPagar3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPagar2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtPagar1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(txtPagar4))
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel9)
                                .addContainerGap(49, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio1)
                    .addComponent(txtPagar1)
                    .addComponent(txtCantidad1)
                    .addComponent(txtPrecioIva1)
                    .addComponent(jLabel12))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPagar2)
                    .addComponent(txtCantidad2)
                    .addComponent(txtPrecio2)
                    .addComponent(txtPrecioIva2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPrecio3)
                    .addComponent(txtPrecioIva3)
                    .addComponent(txtPagar3)
                    .addComponent(txtCantidad3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCantidad4)
                    .addComponent(txtPrecio4)
                    .addComponent(txtPrecioIva4)
                    .addComponent(txtPagar4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTotalPagar)
                            .addComponent(txtPagar6))
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code e:
        
      
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        Cambio ventana4 = new Cambio();
        
        this.setVisible(false);
        ventana4.setVisible(true);
        String totales =txtTotalPagar.getText();
        ventana4.Cambio(totales);
        ventana4.setVisible(true);
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        Menu ventana2 = new Menu();
        this.setVisible(false);
        ventana2.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(DescripWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescripWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescripWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescripWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescripWindow().setVisible(true);
            }
        });
    }
    
    public void cantidades(String cantidad1, String cantidad2, String cantidad3, String cantidad4){
        DecimalFormat df = new DecimalFormat("#.##");
        //Cantidad
        txtCantidad1.setText(cantidad1);
        txtCantidad2.setText(cantidad2);
        txtCantidad3.setText(cantidad3);
        txtCantidad4.setText(cantidad4);
        
        //precios
        txtPrecio1.setText("$15");
        txtPrecio2.setText("$2.50");
        txtPrecio3.setText("$2");
        txtPrecio4.setText("$3.50");
        //precios + iva
        float p1 = 15.0f + (15.0f*0.12f);
        float p2 = 2.50f + (2.50f*0.12f);
        float p3 = 2.0f + (2.0f*0.12f);
        float p4 = 3.50f + (3.50f*0.12f);
        
        String prec1 = df.format(p1);
        String prec2 = df.format(p2);
        String prec3 = df.format(p3);
        String prec4 = df.format(p4);
        
        txtPrecioIva1.setText("$"+prec1);
        txtPrecioIva2.setText("$"+prec2);
        txtPrecioIva3.setText("$"+prec3);
        txtPrecioIva4.setText("$"+prec4);
        // descuentos
        int cantidadp1 = Integer.valueOf(cantidad1);
        int cantidadp2 = Integer.valueOf(cantidad2);
        int cantidadp3 = Integer.valueOf(cantidad3);
        int cantidadp4 = Integer.valueOf(cantidad4);
        
        
        float aPagar1;
        float aPagar2;
        float aPagar3;
        float aPagar4;
        
        
        float cant1= Float.valueOf(cantidadp1);
        aPagar1= p1*cant1;
        String total1= String.valueOf(aPagar1);
        txtPagar1.setText("$"+total1);
        
        float cant2= Float.valueOf(cantidadp2);
        aPagar2= p2*cant2;
        String total2= String.valueOf(aPagar2);
        txtPagar2.setText("$"+total2);
        
        float cant3= Float.valueOf(cantidadp3);
        aPagar3= p3*cant3;
        String total3= String.valueOf(aPagar3);
        txtPagar3.setText("$"+total3);
        
        float cant4= Float.valueOf(cantidadp4);
        aPagar4= p4*cant4;
        String total4= String.valueOf(aPagar4);
        txtPagar4.setText("$"+total4);
        
        float pagoTotal= aPagar1 + aPagar2 + aPagar3 + aPagar4;
        String pagoTotalS = df.format(pagoTotal);
        txtTotalPagar.setText(pagoTotalS);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    private javax.swing.JLabel txtCantidad4;
    private javax.swing.JLabel txtPagar1;
    private javax.swing.JLabel txtPagar2;
    private javax.swing.JLabel txtPagar3;
    private javax.swing.JLabel txtPagar4;
    private javax.swing.JLabel txtPagar6;
    private javax.swing.JLabel txtPrecio1;
    private javax.swing.JLabel txtPrecio2;
    private javax.swing.JLabel txtPrecio3;
    private javax.swing.JLabel txtPrecio4;
    private javax.swing.JLabel txtPrecioIva1;
    private javax.swing.JLabel txtPrecioIva2;
    private javax.swing.JLabel txtPrecioIva3;
    private javax.swing.JLabel txtPrecioIva4;
    private javax.swing.JLabel txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
