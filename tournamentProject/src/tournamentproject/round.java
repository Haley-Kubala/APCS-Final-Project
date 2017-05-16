/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentproject;

import java.util.ArrayList;

/**
 *
 * @author Haley
 */
public class round {

    private ArrayList<match> matches = new ArrayList<>();
    private ArrayList<competitor> winners = new ArrayList<>();
    private ArrayList<competitor> losers = new ArrayList<>();

    public round(ArrayList<competitor> competitors) {
        /*needs to figure out how many matches there are going to be
        assign competitors in order
        this is how we populate matches
        
         */

    }

    /**
     * @return the matches
     */
    public ArrayList<match> getMatches() {
        return matches;
    }

    /**
     * @param matches the matches to set
     */
    public void setMatches(ArrayList<match> matches) {
        this.matches = matches;
    }

    /**
     * calls getWinner() for each match. stores winner in winners array list and
     * then stores the loser in the loser list
     */
    public void runRound() {

        for (match m : matches) {
            competitor winner = m.getWinner();
            winners.add(winner);
            if (m.getWinner() == m.getCompetitor1()) {
                losers.add(m.getCompetitor2());
            } else {
                losers.add(m.getCompetitor1());
            }
        }

    }

    /*
    print out all matches
     */
    public String toString() {
        String output = " ";
        for (match m : matches) {
            output += m;
        }
        return output;
    }

}
