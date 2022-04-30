
package Vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vargas Baltazar
 */
public class tablaRevistas extends javax.swing.JPanel {

   static DefaultTableModel model = new DefaultTableModel();
    public tablaRevistas() {
        initComponents();
        if(model.getColumnCount()==0){
            model.addColumn("Titulo");
            model.addColumn("Autor");
            model.addColumn("ISNN");
            model.addColumn("N de pag.");
            model.addColumn("Precio");
            model.addColumn("Numero");
            model.addColumn("Año");
            model.addColumn("Periodicidad");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

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
        jScrollPane1.setViewportView(tabla1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Revistas");
        jLabel1.setPreferredSize(new java.awt.Dimension(36, 50));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
