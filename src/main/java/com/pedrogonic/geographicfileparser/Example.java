package com.pedrogonic.geographicfileparser;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Coelho
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n==============BEGIN MAIN==============\n");

        File dir =  new File("Examples/");

        for (File file : dir.listFiles()) {

            try {

                Parser parser = new Parser(file);
                parser.parse();

            } catch (Exception ex) {
                Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("\n==============END MAIN==============\n");
        
    }
    
}
