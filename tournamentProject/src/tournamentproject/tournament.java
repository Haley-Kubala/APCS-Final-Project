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
public class tournament {

    private ArrayList<competitor> competitors = new ArrayList<>();
    private ArrayList<competitor> remaining = new ArrayList<>();

    /**
     * For each competitor in the competitors arraylist we 
     * create a new competitor and then reference this classes
     * competitor and then add the newly created competitor to 
     * the list. then adds the competitors to remaining
     * 
     * @param competitors
     */
    public tournament(ArrayList<String> competitors) {
        for (String c : competitors) {
            competitor comp = new competitor(c);
            this.competitors.add(comp);
            remaining.add(comp);
        }
        System.out.println(this.competitors);

    }
    /**
     * This method runs the tournament. While the remaining 
     * arrayList is greater than one we instantiate a new round
     * and then run that round. After we run the round we set
     * remaining to the winners of that round
     * after the while loop we return the first competitor in 
     * remaining
     * @return 
     */
    public competitor runTournament() {
        while (remaining.size() > 1) {
            round newRound = new round(remaining);
            newRound.runRound();
            remaining = newRound.getWinners();

        }
        return remaining.get(0);
    }

}
