/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkmastermind;

/**
 *
 * @author Ignacio
 */
public class VentanaOpciones extends javax.swing.JDialog {

    private static final String OBJT_GATO  = "gato";
    private static final String OBJT_COLOR = "color";
    private static final String OBJT_LETRA = "letra";
    private static final String OBJT_NUMER = "numero";
    
    //
    private int     nivel      = 1;
    private boolean automatico = true;
    private boolean duplicados = false;
    private int     longitud   = 3;
    private int     numObjetos = 6;    
    private String  tipObjeto  = OBJT_GATO;
    private String  tipObjAux  = OBJT_GATO;
    private boolean indCambios = false;

    public VentanaOpciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        //Inicializa Componentes
        initComponents();
        
        //Centramos la ventana
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBIconos = new javax.swing.JButton();
        jBColores = new javax.swing.JButton();
        jBLetras = new javax.swing.JButton();
        jBNumeros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCBObjetos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBLongitud = new javax.swing.JComboBox();
        jChkNivAuto = new javax.swing.JCheckBox();
        jCBDuplicados = new javax.swing.JCheckBox();
        jBCancelar = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opciones MasterMind");

        jBIconos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gato_1.png"))); // NOI18N
        jBIconos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jBIconos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIconosActionPerformed(evt);
            }
        });

        jBColores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/color_1.png"))); // NOI18N
        jBColores.setBorder(null);
        jBColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBColoresActionPerformed(evt);
            }
        });

        jBLetras.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBLetras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/letra_1.png"))); // NOI18N
        jBLetras.setBorder(null);
        jBLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLetrasActionPerformed(evt);
            }
        });

        jBNumeros.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBNumeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/numero_1.png"))); // NOI18N
        jBNumeros.setBorder(null);
        jBNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNumerosActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione Tipo de Iconos:");

        jCBObjetos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6", "7", "8", "9", "10" }));
        jCBObjetos.setEnabled(false);
        jCBObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBObjetosActionPerformed(evt);
            }
        });

        jLabel3.setText("Num. Objetos:");

        jLabel2.setText("Longitud:");

        jCBLongitud.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "4", "5", "6", "7", "8" }));
        jCBLongitud.setEnabled(false);
        jCBLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLongitudActionPerformed(evt);
            }
        });

        jChkNivAuto.setSelected(true);
        jChkNivAuto.setText("Nivel Automático");
        jChkNivAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChkNivAutoActionPerformed(evt);
            }
        });

        jCBDuplicados.setText("Permitir Duplicados");
        jCBDuplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDuplicadosActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBDuplicados)
                    .addComponent(jChkNivAuto)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCBLongitud, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBObjetos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBIconos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBColores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBAceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jChkNivAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBDuplicados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBColores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBIconos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAceptar)
                    .addComponent(jBCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setBotonPulsado(String tipoObjeto){
        
        //Por defecto Desactivamos Todos los Bordes
        jBIconos.setBorder(null);
        jBColores.setBorder(null);
        jBLetras.setBorder(null);
        jBNumeros.setBorder(null);
        
        //Activamos solo el Borde del que hemos pulsado
        switch(tipoObjeto){
            case OBJT_GATO:
                jBIconos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
                break;
            case OBJT_COLOR:
                jBColores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
                break;
            case OBJT_LETRA:
                jBLetras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
                break;
            case OBJT_NUMER:
                jBNumeros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
                break;
        }
    }
    
    private void jBIconosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIconosActionPerformed
        //Establecemos los Iconos como Tipo de Objeto
        setTipObjAux(OBJT_GATO);
        
        //Activamos el Borde del que hemos pulsado
        setBotonPulsado(OBJT_GATO);
    }//GEN-LAST:event_jBIconosActionPerformed

    private void jBColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBColoresActionPerformed
        //Establecemos los Colores como Tipo de Objeto
        setTipObjAux(OBJT_COLOR);

       //Activamos el Borde del que hemos pulsado
        setBotonPulsado(OBJT_COLOR);
    }//GEN-LAST:event_jBColoresActionPerformed

    private void jBLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLetrasActionPerformed
        //Establecemos las Letras como Tipo de Objeto
        setTipObjAux(OBJT_LETRA);

       //Activamos el Borde del que hemos pulsado
        setBotonPulsado(OBJT_LETRA);
    }//GEN-LAST:event_jBLetrasActionPerformed

    private void jBNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNumerosActionPerformed
        //Establecemos los Numeros como Tipo de Objeto
        setTipObjAux(OBJT_NUMER);

       //Activamos el Borde del que hemos pulsado
        setBotonPulsado(OBJT_NUMER);
    }//GEN-LAST:event_jBNumerosActionPerformed

    private void jCBObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBObjetosActionPerformed
        //Valida si hay alguna incongluencia en las Opciones
        validaOpciones();
    }//GEN-LAST:event_jCBObjetosActionPerformed

    private void jCBLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLongitudActionPerformed
        //Valida si hay alguna incongluencia en las Opciones
        validaOpciones();
    }//GEN-LAST:event_jCBLongitudActionPerformed

    //Valida si hay alguna incongluencia en las Opciones
    private void validaOpciones(){
        //Si hay mas Filas que Objetos -> Permitimos Duplicados
        if (Integer.valueOf(jCBLongitud.getSelectedItem().toString()) > Integer.valueOf(jCBObjetos.getSelectedItem().toString())) {
            jCBDuplicados.setSelected(true);
            jCBDuplicados.setEnabled(false);
        } else {
            jCBDuplicados.setEnabled(true);
        }
    }
    
    private void jChkNivAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChkNivAutoActionPerformed
        //Si ponemos el Nivel Automático Desactivamos el ComboBox
        if (this.jChkNivAuto.isSelected()) {
            jCBLongitud.setEnabled(false);
            jCBObjetos.setEnabled(false);
            jCBLongitud.setSelectedIndex(0);
            jCBObjetos.setSelectedIndex(0);
        } else {
            jCBLongitud.setEnabled(true);
            jCBObjetos.setEnabled(true);
        }
        //Queda pendiente establecer los Niveles
    }//GEN-LAST:event_jChkNivAutoActionPerformed

    private void jCBDuplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDuplicadosActionPerformed
        //Valida si hay alguna incongluencia en las Opciones
        validaOpciones();
    }//GEN-LAST:event_jCBDuplicadosActionPerformed

    //Reestablecemos los valores anteriores
    //Despues de esto salimos
    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        
        //Inicializamos Variable
        setIndCambios(false);
        
        //Modificamos el Valor del Indicador de Modo Automatico al Anterior
        jChkNivAuto.setSelected(isAutomatico());
        
        //Modificamos el Valor del Indicador de Duplicados al Anterior
        jCBDuplicados.setSelected(isDuplicados());

        //Modificamos el Valor de la Longitud al Anterior
        jCBLongitud.setSelectedIndex(getLongitud() - 3);        
        
        //Modificamos el Valor de Numero de Objetos al Anterior
        jCBObjetos.setSelectedIndex(getNumObjetos() - 6);
        
        //Modificamos el Valor del Tipo de Objeto al Anterior
        setTipObjAux(getTipObjeto());
        
       //Activamos el Borde del que hemos pulsado
        setBotonPulsado(getTipObjeto());
        
        //Salimos de la Ventan Modal
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    //Comprobamos si se ha cambiado algo y en ese caso establecemos los Cambios
    //Despues de esto salimos
    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        
        //Inicializamos Variable
        setIndCambios(false);

        //Comprobamos si ha cambiado el Indicador de Automatico
        if (isAutomatico() != jChkNivAuto.isSelected()){
            
            //Modificamos el Valor del Indicador de Modo Automatico
            setAutomatico(jChkNivAuto.isSelected());
            
            //Indicamos que se ha cambiado algo
            setIndCambios(true);
        }
        
        //Comprobamos si ha cambiado el Indicador de Duplicados
        if (isDuplicados() != jCBDuplicados.isSelected()){
            
            //Modificamos el Valor del Indicador de Duplicados
            setDuplicados(jCBDuplicados.isSelected());
            
            //Indicamos que se ha cambiado algo
            setIndCambios(true);
        }

        //Comprobamos si ha cambiado la Longitud
        if (getLongitud() != Integer.valueOf(jCBLongitud.getSelectedItem().toString())){

            //Modificamos el Valor de la Longitud
            setLongitud(Integer.valueOf(jCBLongitud.getSelectedItem().toString()));
            
            //Indicamos que se ha cambiado algo
            setIndCambios(true);
        }
        
        //Comprobamos si ha cambiado la Variedad de Objetos Seleccionables
        if (getNumObjetos() != Integer.valueOf(jCBObjetos.getSelectedItem().toString())){

            //Modificamos el Valor de Numero de Objetos
            setNumObjetos(Integer.valueOf(jCBObjetos.getSelectedItem().toString()));
            
            //Indicamos que se ha cambiado algo
            setIndCambios(true);
        }
        
        //Comprobamos si ha cambiado el Tipo de Objeto Seleccionable
        if (!getTipObjeto().equals(getTipObjAux())){

            //Modificamos el Valor del Tipo de Objeto
            setTipObjeto(getTipObjAux());
            
            //Indicamos que se ha cambiado algo
            setIndCambios(true);
        }
        
        //Salimos de la Ventan Modal
        this.dispose();
    }//GEN-LAST:event_jBAceptarActionPerformed

    public void incrementaNivel(){
        
        //Si Esta Activo el Nivel Automatico
        if (jChkNivAuto.isSelected()){
            //Incrementamos el Nivel
            if (nivel < 6)
                nivel ++;        
            if (numObjetos < 10)
                numObjetos++;        
            if (longitud < 8)
                longitud++;

            jCBLongitud.setSelectedIndex(longitud - 3);
            jCBObjetos.setSelectedIndex(numObjetos - 6);
        }
    }
    public int getNivel(){
        if (jChkNivAuto.isSelected())
            return this.nivel;
        else
            return 0;
    }
    
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
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaOpciones dialog = new VentanaOpciones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBColores;
    private javax.swing.JButton jBIconos;
    private javax.swing.JButton jBLetras;
    private javax.swing.JButton jBNumeros;
    private javax.swing.JCheckBox jCBDuplicados;
    private javax.swing.JComboBox jCBLongitud;
    private javax.swing.JComboBox jCBObjetos;
    private javax.swing.JCheckBox jChkNivAuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the automatico
     */
    public boolean isAutomatico() {
        return automatico;
    }

    /**
     * @param automatico the automatico to set
     */
    private void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    /**
     * @return the duplicados
     */
    public boolean isDuplicados() {
        return duplicados;
    }

    /**
     * @param duplicados the duplicados to set
     */
    private void setDuplicados(boolean duplicados) {
        this.duplicados = duplicados;
    }

    /**
     * @return the longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    private void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the numObjetos
     */
    public int getNumObjetos() {
        return numObjetos;
    }

    /**
     * @param numObjetos the numObjetos to set
     */
    private void setNumObjetos(int numObjetos) {
        this.numObjetos = numObjetos;
    }

    /**
     * @return the tipObjeto
     */
    public String getTipObjeto() {
        return tipObjeto;
    }

    /**
     * @param tipObjeto the tipObjeto to set
     */
    private void setTipObjeto(String tipObjeto) {
        this.tipObjeto = tipObjeto;
    }

    /**
     * @return the tipObjAux
     */
    public String getTipObjAux() {
        return tipObjAux;
    }

    /**
     * @param tipObjAux the tipObjAux to set
     */
    private void setTipObjAux(String tipObjAux) {
        this.tipObjAux = tipObjAux;
    }

    /**
     * @return the indCambios
     */
    public boolean isIndCambios() {
        return indCambios;
    }

    /**
     * @param indCambios the indCambios to set
     */
    private void setIndCambios(boolean indCambios) {
        this.indCambios = indCambios;
    }

}
