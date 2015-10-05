/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asigment.pkg1.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nurul.Nadia.Idris
 */
public class Asigment1Java {
    private static Object test;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("NurulNadiaIdris.txt");
        
        try (BufferedWriter br = new BufferedWriter (new FileWriter (file))){
        br.write("Name:Nurul Nadia Idris");
        br.newLine();
        br.write("Matrix No:2014243398 ");
        br.newLine();
        br.write("Gender:Female ");
        br.newLine();
        br.write("Age:27 ");
        br.newLine();
        br.write("E-mails:n.nadiaidris@gmail.com ");
        br.newLine();
        br.write("Mobile number:013-4727861 ");
        br.newLine();
       
        }catch (IOException e){
            System.out.println("Unable to read file" + file.toString());
        }
    }
    
}
