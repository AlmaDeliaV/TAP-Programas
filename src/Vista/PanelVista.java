/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Vargas Baltazar
 */
public class PanelVista extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form PanelVista
     */
    FrmAltaLibro libro = new FrmAltaLibro();
    FrmAltaRevista revis = new FrmAltaRevista();
    FrmAltaPeriodico periodic = new FrmAltaPeriodico();
    
    public PanelVista() {
        initComponents();
        
        btnLibros.addActionListener(this);
        btnRevista.addActionListener(this);
        btnPeriodic.addActionListener(this);
        
        Contenedor.add(libro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if(evt.equals(btnLibros)){
            Contenedor.add(libro);
            libro.setVisible(true);
            revis.setVisible(false);
            periodic.setVisible(false);
        }
        if(evt.equals(btnRevista)){
            Contenedor.add(revis);
            libro.setVisible(false);
            revis.setVisible(true);
            periodic.setVisible(false);
        }
        if(evt.equals(btnPeriodic)){
            Contenedor.add(periodic);
            libro.setVisible(false);
            revis.setVisible(false);
            periodic.setVisible(true);
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Botones = new javax.swing.JPanel();
        btnLibros = new javax.swing.JButton();
        btnRevista = new javax.swing.JButton();
        btnPeriodic = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        Contenedor.setBackground(new java.awt.Color(204, 255, 204));
        Contenedor.setMinimumSize(new java.awt.Dimension(450, 430));
        Contenedor.setPreferredSize(new java.awt.Dimension(450, 430));
        Contenedor.setLayout(new java.awt.BorderLayout());

        Botones.setBackground(new java.awt.Color(204, 255, 255));

        btnLibros.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        btnLibros.setText("Libros");
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        Botones.add(btnLibros);

        btnRevista.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        btnRevista.setText("Revistas");
        Botones.add(btnRevista);

        btnPeriodic.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        btnPeriodic.setText("Periodicos");
        Botones.add(btnPeriodic);

        Contenedor.add(Botones, java.awt.BorderLayout.PAGE_START);

        add(Contenedor, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed

    }//GEN-LAST:event_btnLibrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPeriodic;
    private javax.swing.JButton btnRevista;
    // End of variables declaration//GEN-END:variables
}
