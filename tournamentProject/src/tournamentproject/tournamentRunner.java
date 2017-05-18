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
 * @author Kubala.Haley17
 */
public class tournamentRunner {

    public static void main(String args[]) throws IOException {
        competitor c1 = new competitor("jive");
        competitor c2 = new competitor("wumple");
        ArrayList<competitor> a = new ArrayList<competitor>();
        a.add(c1);
        a.add(c2);
        //round r = new round(a);h
        //
        //r.runRound();
        match m = new match(c1, c2);
        //m.getWinner();
        System.out.println(m.getWinner());
        //System.out.println(m);
        /*     Scanner file = new Scanner(new File("names.dat"));
        ArrayList<String> participants = new ArrayList<String>();
        
        while (file.hasNextLine()) {
            participants.add(file.nextLine());
        }
        file.close();
        System.out.println(participants);
        tournament tourney = new tournament(participants);
        System.out.println(tourney.runTournament());*/
    }

}
