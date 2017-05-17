/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kubala.Haley17
 */
public class tournamentRunner {
    public static void main(String args[]) throws IOException {

        Scanner file = new Scanner(new File("some file"));
        while (file.hasNextLine()) {
            int i = file.nextInt();
            competitors.add(i);
            /* pass in list of competitors?? or should
            i call match instead?
     */
            round round = new round(competitors);

        }
        file.close();
    }

}
