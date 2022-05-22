/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Jefferson
 */
public class GenerarArchivos {
    public static void main(String[] args) throws Exception {
    String ruta1 = "C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/Lexer.flex";
        String ruta2 = "C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/LexerCup.flex";
        String ruta3 = "C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/Español.flex";
        String[] rutas={"-parser","Sintax","C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/Sintax.cup"};
        generar(ruta1,ruta2,ruta3,rutas);
    }
    
    public static void generar(String ruta1,String ruta2,String ruta3,String[] rutas) throws IOException, Exception{
        File archivo ;
        archivo= new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo= new File(ruta2);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta3);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutas);
        
      Path rutaSym = Paths.get("C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
      
      Files.move(
                Paths.get("C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/sym.java"), 
                Paths.get("C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/sym.java")
        );
      
        Path rutaSin = Paths.get("C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/Sintax.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
          Files.move(
                Paths.get("C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/Sintax.java"), 
                Paths.get("C:/Users/Jefferson/Documents/NetBeansProjects/PROYECTOFINAL_COMPILADOR/src/Clases/Sintax.java")
        );
    }
}
