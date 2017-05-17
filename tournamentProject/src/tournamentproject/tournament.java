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

    public tournament(ArrayList<String> competitors) {
        for (String c : competitors) {
            competitor comp = new competitor(c);
            this.competitors.add(comp);
            remaining.add(comp);
        }
        System.out.println(this.competitors);

    }

    public competitor runTournament() {
        while (remaining.size() > 1) {
            round newRound = new round(remaining);
            newRound.runRound();
            remaining = newRound.getWinners();
            
        }
        return remaining.get(0);
    }

}
