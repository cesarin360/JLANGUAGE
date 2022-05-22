package Clases;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.StringReader;
import java_cup.runtime.Symbol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefferson
 */
public class traductor extends javax.swing.JFrame {

   String nomNuevo,dirNuevo;
    public traductor() {
        initComponents();
        this.setTitle("JLANGUAGE");
        setLocationRelativeTo(null);	
        this.getContentPane().setBackground(Color.darkGray);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane5 = new javax.swing.JScrollPane();
        txttexto = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txttraductor = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        txttexto.setColumns(20);
        txttexto.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        txttexto.setRows(5);
        jScrollPane5.setViewportView(txttexto);

        txttraductor.setColumns(20);
        txttraductor.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        txttraductor.setRows(5);
        jScrollPane6.setViewportView(txttraductor);

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Traduccion Español");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Texto en Ingles");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background.png"))); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo.png"))); // NOI18N
        jMenuItem2.setText("Nuevo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abrir.png"))); // NOI18N
        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ejecutar.png"))); // NOI18N
        jMenu2.setText("Ejecutar");
        jMenu2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analizar.png"))); // NOI18N
        jMenuItem4.setText("Analizador Lexico");
        jMenuItem4.setToolTipText("");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analizar.png"))); // NOI18N
        jMenuItem5.setText("Analizador Sintactico");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Translation-80_icon-icons.com_57255.png"))); // NOI18N
        jMenuItem6.setText("Traducir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 736, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 542, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        
        
        try{
            
        String ST = new String(Files.readAllBytes(archivo.toPath()));
        txttexto.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(traductor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(traductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       if(Guardar())
          JOptionPane.showMessageDialog(this,"JRR COMPILER PRO3 - Guardado con exito");
       else
           JOptionPane.showMessageDialog(this,"JRR COMPILER PRO3 - No pudo Guardar el archivo");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       Sintactico nuevo = new Sintactico();
      nuevo.setVisible(true);
       nuevo.sintactico();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
   
       Lexico abrir = new Lexico();
       abrir.setVisible(true);
          try {
           abrir.analizarLexico();
       } catch (IOException ex) {
           Logger.getLogger(traductor.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       try {
           traducirfrace();
       } catch (IOException ex) {
           Logger.getLogger(traductor.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    public void habilitarcampo(String dirnuevo,String nomnuevo){
      this.setTitle("JRR COMPILER PRO3");
      this.nomNuevo = nomnuevo;
      this.dirNuevo = dirnuevo+nomNuevo+".txt";
      this.setTitle(this.getTitle()+" - "+dirNuevo);
      txttexto.enable(true);
      contarfila();
      
    }
    
    public void habilitarcampo(String dirnovo) throws IOException{
       this.setTitle("JRR COMPILER PRO3");
       this.dirNuevo=dirnovo;
       try {
           FileInputStream escribir = new FileInputStream(dirNuevo);
           DataInputStream entrar = new DataInputStream(escribir);
           this.txttexto.setText("");
           while (entrar.available() !=0){
               this.txttexto.setText(this.txttexto.getText()+entrar.readLine()+"\n");
           }
           entrar.close();
           this.enable(true);
           contarfila();
           
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,"El archivo es erroneo");
       }
    }
    
    public boolean Guardar(){
        FileOutputStream out;
        PrintStream p;
        
       try {
           out= new FileOutputStream(dirNuevo);
           p=new PrintStream(out);
           p.close();
           this.setTitle(this.getTitle().replace("*", ""));
           return true;
       } catch (FileNotFoundException ex) {

           return false;
       }
    }
    
    public void contarfila(){
        int totalfilas = txttexto.getLineCount();
        txttexto.setText("1\n");
        for(int i =2; i <= totalfilas;i++){
            txttexto.setText(txttexto.getText()+i+"\n");
        }
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
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(traductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new traductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    public static javax.swing.JTextArea txttexto;
    public javax.swing.JTextArea txttraductor;
    // End of variables declaration//GEN-END:variables

    private void traducirfrace() throws IOException {
       
     
                       
        String expr = txttexto.getText();
        System.out.println(expr);
      Español lexer = new Español(new StringReader(expr)); 
        String resultado = "" + "\n";
        while (true) {
            Tokens2 token = lexer.yylex();
            
            if (token == null) {
                 
                                  
                txttraductor.setText(resultado);
              
                return;
            }
            
             
            
             
            switch (token) {
                case Linea:
                   
                    resultado +=  " \n";
                    break;
               
case cama:
case bicicleta:
case ave:
case libro:
case bote:
case edificio:
case bulvo:
case carro:
case gato:
case silla:
case cargador:
case nube:
case pais:
case condado:
case Guatemala:
case ciclista:
case dia:
case año:
case mes:
case semana:
case escritorio:
case perro:
case vestido:
case audicular:
case anillo:
case cara:
case padre:
case campo:
case dedo:
case flor:
case folder:
case comida:
case futbol:
case novia:
case sapo:
case vidrio:
case lentes:
case guantes:
case abuelo:
case abuela:
case Comestibles:
case guitarra:
case mano:
case Secundaria:
case hogar:
case casa:
case inteligencia:
case justicia:
case llave:
case teclado:
case letra:
case luz:
case leon:
case amor:
case memoria:
case suegra:
case suegro:
case cuñada:
case cuñado:
case boca:
case cine:
case pelicula:
case musica:
case cancion:
case collar:
case periodico:
case noticias:
case noticiasDeUltimoMomento:
case celular:
case piña:
case papa:
case cuaderno:
case clase:
case compañero:
case maestro:
case dolor:
case pincel:
case captura:
case foto:
case camara:

case manzana:
case luvia:
case camino:
case tristeza:
case mar:
case barco:
case zapatos:
case hermana:
case cielo:
case sol:
case calcetin:
case sonido:
case tienda:
case calle:
case internet:
case video:
case videojuegos:
case computadora:
case Daniel:
case Douglas:
case Mynor:
case Cristopher:
case Byron:
case pantalones:
case camisa:
case dinero:
case ropa:
case bus:
case araña:
case hombre:
case mujer:
case hombres:
case mujeres:
case mochila:
case paquete:
case corona:
case controlador:
case aire:
case oceano:
case ciudad:
case america:
case centroamerica:
case europa:
case asia:
case africa:
case covid_19:
case minutes:
case horas:
case dias:
case segundos:
case arboles:
case nombre:
case arbol:
case bosque:
case mamiferos:
case anfibios:
case pescado:
case crustaceos:
case toro:
case vaca:
case gallina:
case gallo:
case burro:
case cabra:
case caballo:
case cerdo:
case conejo:
case oveja:
case pavo:
case ganso:
case llama:
case gamba:
case camaron:
case cangrejo:
case delfin:
case tiburon:
case langosta:
case ballena:
case pulpo:
case tortugaMarina:
case calamar:
case EstrellaMarina:
case aguila:
case pinguino:
case dorado:
case plateado:
case rosa:
case celeste:
case verdeClaro:
case rojo:
case amarillo:
case azul:
case marron:
case verde:
case naranja:
case morado:
case blanco:
case negro:
case gris:
case mi:
case su:
case nuestro:
case eso:
case esto:
case estos:
case esos:
case honesto:
case inteligente:
case optimista:
case valiente:
case amigable:
case tolerante:
case sensible:
case generoso:
case responsable:
case trabajador:
case adorable:
case deshonesto:
case tonto:
case pesimista:
case cobarde:
case grocero:
case intolerante:
case insensible:
case egoísta:
case irresponsable:
case peresozo:
case detestable:
case grande:
case enorme:
case pesado:

case grueso:
case altura:
case alto:
case profundo:
case pequeño:
case diminuto:
case ligero:
case delgado:
case bajo:
case corto:
case superficial:
case viejo:
case moderno:
case actualizado:
case lento:
case futuro:
case frio:
case calido:
case caliente:
case fria:
case hermosos:
case limpio:
case elegante:
case gordito:
case bonito:
case atractivo:
case horrible:
case sucio:
case informal:
case flaco:
case feo:
case noAtractivo:
case enfermo:
case borracho:
case dromido:
case ambriento:
case energetic:
case muerto:
case abierto:
case soltero:
case cuerdo:
case saludable:
case sobrio:
case despierto:
case lleno:
case cansado:
case vivo:
case cerrado:
case casado:
case duro:
case aspero:
case solido:
case mojado:
case resbaladizo:
case suave:
case liso:
case liquido:
case seco:
case pegajoso:
case feliz:
case enojado:
case orgulloso:
case gruñona:
case celoso:
case asustadizo:
case triste:
case calamdo:
case embarasozo:
case bonita:
case fiel:
case pacifico:
case uno:
case dos:
case tres:
case cuatro:
case cinco:
case seis:
case siete:
case ocho:
case nueve:
case diez:
case once:
case doce:
case trece:
case catorce:
case quince:
case dieciseis:
case diecisiete:
case dieciocho:
case diecinueve:
case veinte:
case treinta:
case cuarenta:
case cincuenta:
case sesenta:
case setenta:
case ochenta:
case noventa:
case cien:
case ciento:
case doscientos:
case mil:
case diezMil:
case millon:
case unMillon:
case primero:
case segundo:
case tercero:
case cuarto:
case quinto:
case sexto:
case septimo:
case octavo:
case noveno:
case decimo:
case undecimo:
case duodecimo:
case decimotercera:
case decimoquienta:
case decimocuarta:
case decimosexta:
case decimoseptima:
case decimoctava:
case decimonovena:
case vigesimo:
case trigesimo:
case cuadragesima:
case sexagesima:
case quincuagesima:
case septuagesima:
case octuagesima:
case nonagesimo:
case centesimo:
case millonesimo:
case algunos:
case pocos:
case menos:
case malo:
case enfermos:
case lejos:
case bueno:
case bien:
case tarde:
case many:
case muchos:
case mucho:
case otro:
case otros:
case tanto:
case ambos:
case los:
case un:
case yo:
case tu:
case ella:
case el:
case nosotros:
case ellos:
case porque:
case ninguno:
case unos:
case donde:
case cuando:
case como:
case quien:
case cuyo:
case que:
case cual:
case estoy:
case estaba:
case estabas:
case es:
case estaban:
case estar:
case estando:

case aceptar:
case agregar:
case admitir:
case permitir:
case deAcuerdo:
case responder:
case llegar:
case aparecer:
case pedir:
case creer:
case serDe:
case cepillar:
case llamar:
case cancelar:
case cambiar:
case cerrar:
case limpiar:
case quejar:
case completar:
case cocinar:
case copiar:
case contar:
case llorar:
case bailar:
case decidir:
case decorar:
case destruir:
case soltar:
case secar:
case disfrutar:
case excapar:
case explicar:
case terminar:
case repara:
case seguir:
case adivinar:
case suceder:
case odiar:
case ayudar:
case imaginar:
case mejorar:
case incrementar:
case inventar:
case unirse:
case saltar:
case matar:
case besar:
case reir:
case aprender:
case gustar:
case escuchar:
case vivir:
case mirar:
case amar:
case medir:
case mencionar:
case nesecitar:
case notificar:
case ofrecer:
case abrir:
case ordenar:
case organizar:
case pintar:
case colocar:
case pagar:
case agradar:
case practicar:
case preparar:
case calificar:
case llover:
case recibir:
case recordar:
case recuerda:
case repetir:
case reportar:
case requerir:
case retornar:
case buscar:
case firmar:
case sonreir:
case comenzar:
case detener:
case estudiar:
case hablar:
case tocar:
case traducir:
case viajar:
case probar:
case usar:
case visitar:
case esperar:
case caminar:
case querer:
case ver:
case desear:
case trabajar:
case preocuparse:
case actuar:
case mendigar:
case pertenecerA:
case cargar:
case vestir:
case morir:
case esperanza:
case extrañar:
case casar:
case preferir:
case prometer:
case fumar:
case agradecer:
case lavar:

case aceptando:
case agregando:
case admitiendo:
case permitiendo:
case convenido:
case respondiendo:
case llegando:
case apareciendo:
case pidiendo:
case creendo:
case siendoDe:
case cepillando:
case llamando:
case cancelando:
case cambiando:
case cerrando:
case limpiando:
case quejandose:
case completando:
case cocinando:
case copiando:
case contando:
case llorando:
case bailando:
case decidiendo:
case decorando:
case destruyendo:
case soltando:
case secando:
case disfrutando:
case excapando:
case explicando:
case terminando:
case reparando:
case seguiendo:
case adivinando:
case sucediendo:
case odiaando:
case ayudando:
case imaginando:
case mejorando:
case incrementando:
case inventando:
case uniendose:
case saltando:
case matando:
case besando:
case reindose:
case aprendiendo:
case gustando:
case escuchando:
case viviendo:
case mirando:
case amando:
case midiendo:
case mencionando:
case nesecitando:
case notificando:
case ofreciendo:
case abriendo:
case ordenando:
case organizando:
case pintando:
case colocando:
case pagando:
case agradando:
case practicando:
case preparando:
case calificando:
case lloviendo:
case recibiendo:
case recordando:
case recordo:
case repitiendo:
case reportando:
case requeriendo:
case retornando:
case buscando:
case firmando:
case sonriendo:
case comenzando:
case deteniendo:
case estudiando:
case hablando:
case tocando:
case traduciendo:
case viajando:
case probando:
case usando:
case visitando:
case esperando:
case caminando:
case queriendo:
case viendo:
case deseando:
case trabajando:
case preocupandose:
case actuando:
case mendigando:
case perteneciendoA:
case cargando:
case vistiendo:
case muriendo:
case extrañando:
case casando:
case prefiriendo:
case prometiendo:
case fumando:
case agradeciendo:
case lavando:

case aceptado:
case agregado:
case admitido:
case permitido:
case acordar:
case respondido:
case llegado:
case aparecido:
case pedido:
case creido:
case sidoDe:
case cepillado:
case llamado:
case cancelado:
case cambiado:

case limpiado:
case quejado:
case completado:
case cocinado:
case copiado:
case contado:
case llorado:
case bailado:
case decidido:
case decorado:
case destruido:
case soltado:
case secado:
case disfrutado:
case excapado:
case explicado:
case terminado:
case reparado:
case seguido:
case adivinado:
case sucedido:
case odiado:
case ayudado:
case imaginado:
case mejorado:
case incrementado:
case inventado:
case unido:
case saltado:
case matado:
case besado:
case reido:
case aprendedo:
case gustado:
case escuchado:
case vivido:
case mirado:
case amado:
case medido:
case mencionado:
case nesecitado:
case notificado:
case ofrecido:
case abrido:
case ordenado:
case organizado:
case pintado:
case colocado:
case pagado:
case agradado:
case practicado:
case preparado:
case calificado:
case llovido:
case recibido:
case recordado:

case repetido:
case reportado:
case requerido:
case retornado:
case buscado:
case firmado:
case sonreido:
case comenzado:
case detenido:
case estudiado:
case hablado:
case tocado:
case traducido:
case viajado:
case probado:
case usado:
case visitado:
case esperado:
case caminado:
case querido:
case visto:
case deseado:
case trabajado:
case preocupado:
case actuado:
case mendigado:
case pertenecioA:
case cargado:
case vestidos:
case murio:

case extrañado:
case preferido:
case prometido:
case fumado:
case agradecido:
case lavado:
case surgir:
case oso:
case golpear:
case volverse:
case empezar:
case curva:
case apuesta:
case oferta:
case enlazar:
case mordedura:
case sangrar:
case soplo:
case rotura:
case raza:
case traer:
case construir:
case quemar:
case estallar:
case comprar:
case emitir:
case imagen:
case escoger:
case adherirse:
case ven:
case costo:
case arrastrarse:
case cortar:
case acuerdo:
case cavar:
case hacer:
case dibujar:
case sueño:
case beber:
case conducir:
case comer:
case otoño:
case alimentar:
case sensación:
case lucha:
case encontrar:
case huir:
case volar:
case prohibir:
case olvidar:
case perdonar:
case congelar:
case obtener:
case dar:
case vamos:

case surgiendo:
case despertando:
case Llevando:
case golpeando:
case convirtiéndose:
case comienzo:
case doblar:
case apostando:
case aguardando:
case unión:
case mordiendo:
case sangrado:
case pausa:
case cría:
case trayendo:
case ardiente:
case muylleno:
case comprando:
case fundición:
case elegir:
case pegajosa:
case viniendo:
case costando:
case progresivo:
case corte:
case trato:
case excavación:
case haciendo:
case dibujo:
case soñando:
case bebiendo:
case conducción:
case comiendo:
case quecae:
case alimentación:

case luchando:
case hallazgo:
case huyendo:
case volador:
case forjar:
case indulgente:
case congelación:
case consiguiendo:
case dando:
case yendo:
case narración:
case surgió:
case despertó:
case aburrir:
case convirtió:
case empezó:
case doblado:
case obligado:
case poco:
case Sangrado:
case sopló:
case rompió:
case pan:
case trajo:
case construido:
case quemado:
case compró:

case atrapado:
case eligió:
case aferrado:
case vino:

case repartido:
case excavado:
case hizo:
case dibujó:
case soñado:
case bebió:
case condujo:
case comió:
case cayó:
case alimentado:
case sintió:
case luchó:
case encontró:
case huyó:
case voló:
case prohibió:
case olvidó:
case perdonado:
case secongeló:
case tiene:
case dio:
case sefue:
case dicho:
case temprano:

case mástemprano:
case mástarde:
case entonces:
case antesde:
case después:

case ahora:
case hoyendía:
case estosdías:
case actualmente:
case enelpresente:
case hoy:
case mañana:
case ayer:
case todavía:
case ya:

case notodavía:
case nomás:
case sólo:
case siempre:
case pronto:
case denuevo:
case despuésdeeso:
case últimamente:
case recientemente:
case antes:
case enactualidad:
case enelpasado:
case enelfuturo:
case estasemana:
case lapróximasemana:
case lasemanapasada:
case esteaño:
case elañopasado:
case elpróximoaño:
case mientrastanto:
case algúndía:
case dentrodepoco:
case hace:
case aquí:
case allí:
case cerca:
case extranjero:
case en:
case fuera:
case dentro:
case fuerade:
case adentro:
case alairelibre:
case encima:
case abajo:
case debajo:

case adelante:
case detrás:
case alfrente:
case opuesto:
case alrededor:
case másallá:
case aparte:
case oblicuo:
case espalda:
case acabado:
case portodaspartes:
case porahí:
case aqui:
case aquímismo:
case justoahí:
case aquíarriba:
case aquíabajo:
case arriba:

case unpoco:
case unospocos:
case casi:
case suficiente:
case enteramente:
case bastante:
case apenas:
case unmontón:

case más:
case másbien:

case también:
case muy:

case despacio:
case fácilmente:
case cuidadosamente:
case simplemente:
case felizmente:
case naturalmente:

case rápido:

case mal:
case peor:
case porseparado:
case descuidadamente:
case incorrecto:
case ciertamente:
case claramente:
case enefecto:
case obviamente:
case porsupuesto:
case seguramente:
case si:
case exactamente:
case no:

case nunca:
case quizás:
case talvez:
case probablemente:
case abordo:
case acercade:
case deacuerdoa:
case atravésde:
case encontra:
case alolargo:
case juntoa:
case enmediode:
case entre:

case hasta:
case apartirde:
case encuantoa:
case apartede:
case ahorcajadas:
case a:
case enelfondode:
case enlacimade:
case transversalmente:
case lejosde:
case excepto:
case pero:
case por:
case pormediode:

case Relativo:
case cercade:
case Apesarde:

case debidoa:
case durante:

case exceptopor:
case excluyendo:
case defecto:

case para:
case afinde:
case desde:
case ademásde:


case siguiente:

case de:

case yaque:

case y:
case nosolo:
case perotambién:

case noantes:

case sinembargo:

case aúnasí:
case enlugar:
case delocontrario:
case tanpronto:

case obueno:
case o:
case yasea:
case ni:
case sio:
case sino:
case deotramanera:
case esdecir:
case esmás:
case enfrentede:
case estoes:
case insecto:
case mientras:
case loquesea:
case yaporque:

case desdequeyo:

case queeso:
case deestemodo:
case porlotanto:
case inclusosi:
case pormásde:

case megusta:
case asíqueeso:

case bateria: 
   
case SigPunt:
    
    resultado += token+" ";
    break;
                case ERROR:
                    
                    resultado += "  <Error esta palabra no esta dentro del Traductor\t>" + lexer.lexeme+"\n";
                    break;
                default:
                    resultado += "  < " + token + " >\n";
                    break;
            }
        }
    
    }
}
