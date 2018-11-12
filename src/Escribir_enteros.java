
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus-PC
 */
public class Escribir_enteros {
       public static void main(String[] args) throws IOException {
        try {
            File f= new File("C:/Users/Asus-PC/Desktop/trabajo.txt");
            RandomAccessFile raf= new RandomAccessFile(f, "rw");
            File t= new File("C:/Users/Asus-PC/Desktop/trabajo.txt");
            RandomAccessFile raf1= new RandomAccessFile(t, "rw");
           
          int opc= Integer.parseInt(JOptionPane.showInputDialog("ingrese:\n1) para decifrar mensaje oculto\n. 2) para mirar el codigo del mensaje adjunto\n3) codigo de una imagen"));
          switch(opc){
              case 1:
                 codigo_frase(raf);
                 break;
              case 2:
                  frase_codigo(raf);
                  break;
              case 3:
                  imagen(raf1);
                  break;
              case 4:
                  String Hola=JOptionPane.showInputDialog("Ingrese letra o mensaje ");
                  traducir_letra(raf, Hola);
                  break;
              default:
                  JOptionPane.showMessageDialog(null, "digitacion errada");
                  break;
          }
            
           
           //
        } catch (Exception e) {
           // Logger.getLogger(Ejecutar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    public static void codigo_frase(RandomAccessFile raf){
        try{
        File f= new File("C:/Users/Asus-PC/Desktop/trabajo.txt");
        raf= new RandomAccessFile(f, "rw");
            raf.writeInt(4718671);
            raf.writeInt(5177420);
            raf.writeInt(4980801);
            raf.writeInt(4259917);
            raf.writeInt(5046357);
            raf.writeInt(5111876);
            raf.writeInt(4456527);
            raf.writeInt(5177377);
            for (int i = 0; i < raf.length(); i=i+2) { 
           raf.seek(i);
            System.out.println(i+"; "+raf.readChar());
               
                //System.out.print(raf.readChar()+" ");
             }
        }
        catch(Exception e){
            
        }
    }
     public static void frase_codigo(RandomAccessFile raf){
        try{
        File f= new File("C:/Users/Asus-PC/Desktop/trabajo.txt");
        raf= new RandomAccessFile(f, "rw");
        raf.writeChars("Hola mundo");
        for (int i = 0; i < raf.length(); i=i+2) { 
           raf.seek(i);
                System.out.println(i+"; "+raf.readInt());
             }
        }
        catch(Exception e){ 
        }
    }
     
     public static void imagen(RandomAccessFile raf){
         try{
        File f= new File("C:/Users/Asus-PC/Desktop/a.jpg");
        raf= new RandomAccessFile(f, "rw");
        for (int i = 0; i < 100; i=i+2) { 
           raf.seek(i);
                System.out.println(i+"; "+raf.readInt());
             }
        }
        catch(Exception e){ 
        }
     }
       public static void traducir_letra(RandomAccessFile raf, String hola){
         try{
        File f= new File("C:/Users/Asus-PC/Desktop/trabajo.txt");
         
        raf= new RandomAccessFile(f, "rw");
        raf.writeChars(hola);
        for (int i = 0; i < 100; i=i+2) { 
           raf.seek(i);
                System.out.println(i+"; "+raf.readInt());
             }
        }
        catch(Exception e){ 
        }
     }
}
