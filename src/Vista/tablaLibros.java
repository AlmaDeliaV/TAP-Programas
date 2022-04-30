/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vargas Baltazar
 */
public class tablaLibros extends javax.swing.JPanel {

   static DefaultTableModel model = new DefaultTableModel();
    public tablaLibros() {
        initComponents();
        if(model.getColumnCount()==0){
            model.addColumn("Titulo");
            model.addColumn("Autor");
            model.addColumn("ISBN");
            model.addColumn("N de pag.");
            model.addColumn("Precio");
            model.addColumn("Ediccion");
        }
        this.tabla1.setModel(model);
    }
    public  void llenarT(String info[]){
        model.addRow(info);
    }
    public void limpiarT(){
        for (int x=0;x<tabla1.getRowCount();x++){
            model.removeRow(x);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setLabelFor(this);
        jLabel1.setText("LIBROS");
        jLabel1.setPreferredSize(new java.awt.Dimension(36, 50));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla1);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
