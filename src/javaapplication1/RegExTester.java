/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author somebody
 */
public class RegExTester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

      // String to be scanned to find the pattern.
      String line1 = "/sadieStatus/movie";
      String line2 = "/sadieStatus";
      String line3 = "/sadieStatus/movie,dinner,drinks";
      String line4 = "/";
      String line5 = "";
      String line6 = "/sadieStatus/movie";
      String line7 = "/sadieStatus/movie,";
      String line8 = "/sadieStatus/,";
      String pattern1 = "/";
      String pattern2 = "/([a-z]+[A-Z]+[a-z]+)";
      String pattern3 = "/([a-z]+[A-Z]+[a-z]+)(/)([[a-z]+[,]*]+)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern3);
      System.out.println("for pattern: "+pattern3);
      // Now create matcher object.
      Matcher m = r.matcher(line3);
      if (m.find( )) {
         System.out.println(line3);
         
         System.out.println("Found group 0: " + m.group(0) );
         System.out.println("Found group 1: " + m.group(1) );
         System.out.println("Found group 2: " + m.group(2) );
         System.out.println("Found group 3: " + m.group(3) );
      } else {
         System.out.println("NO MATCH");
      }
      
            // Now create matcher object.
      m = r.matcher(line6);
      if (m.find( )) {
         System.out.println(line6);
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) );
      } else {
         System.out.println("NO MATCH");
      }
                 // Now create matcher object.
      m = r.matcher(line7);
      if (m.find( )) {
         System.out.println(line7);
         System.out.println("Found group 0: " + m.group(0) );
         System.out.println("Found group 1: " + m.group(1) );
         System.out.println("Found group 2: " + m.group(2) );
         System.out.println("Found group 3: " + m.group(3) );
      } else {
         System.out.println("NO MATCH");
      }
      
                 // Now create matcher object.
      m = r.matcher(line8);
      if (m.find( )) {
         System.out.println(line8);
         System.out.println("Found group 0: " + m.group(0) );
         System.out.println("Found group 1: " + m.group(1) );
         System.out.println("Found group 2: " + m.group(2) );
         System.out.println("Found group 3: " + m.group(3) );
      } else {
         System.out.println("NO MATCH");
      }
   }
    }
    
