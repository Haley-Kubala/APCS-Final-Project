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

        //make names into competitor objects
        //for each fighter in competitors
        competitor participant = new competitor("");
        competitors.add(participant);
        //set remaining = competitors

    }

    public void runTournament() {
        /*
        while remaining.size() > 1  - done
            create a new round and pass in remaining participants - done
            run the round - done
            set remaining = winners - uhm.. what? 
            
         */

        while (remaining.size() > 1) {
            //is this the right int for the size?
            round newRound = new round(competitors, competitors.size());
            newRound.runRound();

        }
    }

}
