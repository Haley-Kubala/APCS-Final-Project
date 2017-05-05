/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Haley
 */
public class tournament extends round {
    
   private ArrayList<> competitors = new ArrayList<>(); 
  

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("some file"));
        while (file.hasNextLine()) {
            int i = file.nextInt();
            competitors.add(i);
            /*
            intitialize a new tournament
            print out the winner(s)
             */

        }
        file.close();
    }
}