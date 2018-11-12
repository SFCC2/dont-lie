
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus-PC
 */
public class Ejecutar {
    public static void main(String[] args) throws IOException {
        try {
            File f= new File("C:/Users/Asus-PC/Desktop/trabajo.txt");
            RandomAccessFile raf= new RandomAccessFile(f, "rw");
            raf.writeChar('a');
            raf.seek(0);
            System.out.println(raf.readChar());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejecutar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    
}
