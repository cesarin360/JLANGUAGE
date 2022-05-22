/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.awt.Color;
import java.io.IOException;
import java.io.StringReader;

import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jefferson
 */
public class Lexico extends javax.swing.JFrame {

       
    int contador=0;
      public DefaultTableModel model = new DefaultTableModel();
   
     traductor tr ;
     
    public Lexico() {
        initComponents();
          this.setTitle("Analizador ");
        this.setLocationRelativeTo(null);
       
        
    }

public void analizarLexico() throws IOException{
        int cont = 1;
                        model.addColumn("ID");
                        model.addColumn("Lexema");
                        model.addColumn("Token");
        String expr = traductor.txttexto.getText();
        System.out.println(expr);
      Lexer lexer = new Lexer(new StringReader(expr)); 
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            
            if (token == null) {
                 resultado += "La expresión es válida";
                                  
                txtresultado.setText(resultado);
              
                return;
            }
            
              contador++;
             model.addRow(new Object[]{Integer.toString(contador),lexer.lexeme,token});  
             
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Sustantivos:
                    resultado += "  <Sustantivos>\t\t" + lexer.lexeme + "\n";
                    break;
            
                case AdPosesivos:
                    resultado += "  < AdPosesivos>\t\t" + lexer.lexeme + "\n";
                    break;
                    
                case AdCalificativos:
                    resultado += "  <AdCalificativos>\t\t" + lexer.lexeme + "\n";
                    break;
                    
                case AdNumCardinal:
                    resultado += "  <AdNumCardinal>\t\t" + lexer.lexeme + "\n";
                    break;
                    
                case AdNumOrdinal:
                    resultado += "  <AdNumOrdinal>\t\t" + lexer.lexeme + "\n";
                    break;
                    
                case AdIndefinidos:
                    resultado += "  <AdIndefinidos>\t\t" + lexer.lexeme + "\n";
                    break;
                    
                case ArtDefinidos:
                    resultado += "  <ArtDefinidos>\t\t" + lexer.lexeme + "\n";
                    break;
                    
                case ArtIndefinidos:
                    resultado += "  <ArtIndefinidos>\t\t" + lexer.lexeme + "\n";
                    break;
                    
                                  
                case PronPerSingulares:
                    resultado += "  <PronPerSingulares>\t\t" + lexer.lexeme + "\n";
                    break;
                case PronPerPlurales:
                    resultado += "  <PronPerPlurales>\t\t" + lexer.lexeme + "\n";
                    break;
              
                case PronPer:
                    resultado += "  <PronPer>\t\t" + lexer.lexeme + "\n";
                    break;
                case PronDemostrativos:
                    resultado += "  <PronDemostrativos>\t\t" + lexer.lexeme + "\n";
                    break;
                case PronInterrogativos:
                    resultado += "  <PronInterrogativos>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbAm:
                    resultado += "  <VerbAm>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbWas:
                    resultado += "  <VerbWas>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbWere:
                    resultado += "  <VerbWere>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbIs:
                    resultado += "  <VerbIs>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbAre:
                    resultado += "  <VerbAre>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbBe:
                    resultado += "  <VerbBe>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbBeing:
                    resultado += "  <VerbBeing>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbosRegPresent:
                    resultado += "  <VerbosRegPresent>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbosRegIng:
                    resultado += "  <VerbosRegIng>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbRegPast:
                    resultado += "  <VerbRegPast>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbosIrregPresent:
                    resultado += "  <VerbosIrregPresent>\t\t" + lexer.lexeme + "\n";
                    break;
               
                case VerbIrregIng:
                    resultado += "  <VerbIrregIng>\t\t" + lexer.lexeme + "\n";
                    break;
                case VerbIrregPast:
                    resultado += "  <VerbIrregPast>\t\t" + lexer.lexeme + "\n";
                    break;
                case AdvTiempo:
                    resultado += "  <AdvTiempo>\t\t" + lexer.lexeme + "\n";
                    break;
                case AdvLugar:
                    resultado += "  <AdvLugar>\t\t" + lexer.lexeme + "\n";
                    break;
                case AdvCantidad:
                    resultado += "  <AdvCantidad>\t\t" + lexer.lexeme + "\n";
                    break;
                case AdvModo:
                    resultado += "  <AdvModo>\t\t" + lexer.lexeme + "\n";
                    break;
                case AdvAfirmacion:
                    resultado += "  <AdvAfirmacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case AdvNegacion:
                    resultado += "  <AdvNegacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case AdvDuda:
                    resultado += "  <AdvDuda>\t\t" + lexer.lexeme + "\n";
                    break;
                case preposiciones:
                    resultado += "  <preposiciones>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CC_Explicativas:
                    resultado += "  <CC_Explicativas>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CC_Copulativas:
                    resultado += "  <CC_Copulativas>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CC_Distributivas:
                    resultado += "  <CC_Distributivas>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CC_Disyuntivas:
                    resultado += "  <CC_Disyuntivas>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CS_Condicionales:
                    resultado += "  <CS_Condicionales>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CS_Casuales:
                    resultado += "  <CS_Casuales>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CS_Consecutivas:
                    resultado += "  <CS_Consecutivas>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CS_Concesivas:
                    resultado += "  <CS_Concesivas>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CS_Finales:
                    resultado += "  <CS_Finales>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CS_Concetivas:
                    resultado += "  <CS_Concetivas>\t\t" + lexer.lexeme + "\n";
                    break;
                case  AuxGoing:
                    resultado += "  <AuxGoing>\t\t" + lexer.lexeme + "\n";
                    break;
                case  AuxWill:
                    resultado += "  <AuxWill>\t\t" + lexer.lexeme + "\n";
                    break;
                case  AuxDo:
                    resultado += "  <AuxDo>\t\t" + lexer.lexeme + "\n";
                    break;
                case  SigPunt:
                    resultado += "  <SigPunt>\t\t" + lexer.lexeme + "\n";
                    break;
                case  PronI:
                    resultado += "  <PronI>\t\t" + lexer.lexeme + "\n";
                    break;
                case  CC_Adversativas:
                    resultado += "  <CC_Adversativas>\t\t" + lexer.lexeme + "\n";
                    break;
                              
                case ERROR:
                    
                    resultado += "  <Error esta palabra no esta dentro del Traductor\t>" + lexer.lexeme+"\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }
    
   
     
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 150, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ANALIZADOR LEXICO ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "LEXEMA", "TOKEN"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 350, 340));

        txtresultado.setColumns(20);
        txtresultado.setRows(5);
        jScrollPane1.setViewportView(txtresultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 340));

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton1.setText("Tabla de Simbolos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTable1.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lexico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtresultado;
    // End of variables declaration//GEN-END:variables
}
