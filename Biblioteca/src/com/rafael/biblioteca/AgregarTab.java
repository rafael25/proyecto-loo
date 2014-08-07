/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rafael.biblioteca;

import javax.swing.JFileChooser;

/**
 *
 * @author rafael
 */
public class AgregarTab extends javax.swing.JPanel {

	/**
	 * Creates new form agregarTab
	 */
	public AgregarTab() {
		initComponents();
	}
	
	public AgregarTab(Libro libro) {
		initComponents();
		// Leer los datos del libro y asignarlos a la interfaz
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitle = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        tituloText = new javax.swing.JTextField();
        autorLabel = new javax.swing.JLabel();
        resumenLabel = new javax.swing.JLabel();
        autorText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumenText = new javax.swing.JTextArea();
        archivoLabel = new javax.swing.JLabel();
        archivoButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();

        panelTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        panelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(panelTitle, org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.panelTitle.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(tituloLabel, org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.tituloLabel.text")); // NOI18N

        tituloText.setText(org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.tituloText.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(autorLabel, org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.autorLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(resumenLabel, org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.resumenLabel.text")); // NOI18N

        autorText.setText(org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.autorText.text")); // NOI18N

        resumenText.setColumns(20);
        resumenText.setRows(5);
        jScrollPane1.setViewportView(resumenText);

        org.openide.awt.Mnemonics.setLocalizedText(archivoLabel, org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.archivoLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(archivoButton, org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.archivoButton.text")); // NOI18N
        archivoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(guardarButton, org.openide.util.NbBundle.getMessage(AgregarTab.class, "AgregarTab.guardarButton.text")); // NOI18N
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloLabel)
                            .addComponent(resumenLabel)
                            .addComponent(autorLabel)
                            .addComponent(archivoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(archivoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tituloText)
                            .addComponent(autorText)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel)
                    .addComponent(tituloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorLabel)
                    .addComponent(autorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resumenLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archivoButton)
                    .addComponent(archivoLabel))
                .addGap(18, 18, 18)
                .addComponent(guardarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        BibliotecaWindow.removTab(1);
		BibliotecaWindow.setTabEnabled(0, true);
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void archivoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoButtonActionPerformed
        JFileChooser fc = new JFileChooser();
		if(fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			// Asignar la ruta del archivo
		}
    }//GEN-LAST:event_archivoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivoButton;
    private javax.swing.JLabel archivoLabel;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JTextField autorText;
    private javax.swing.JButton guardarButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel panelTitle;
    private javax.swing.JLabel resumenLabel;
    private javax.swing.JTextArea resumenText;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField tituloText;
    // End of variables declaration//GEN-END:variables
}
