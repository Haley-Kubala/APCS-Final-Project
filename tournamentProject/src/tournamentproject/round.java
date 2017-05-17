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
        System.out.println(competitors);
        int matchCount = bracketSize(competitors.size());
        System.out.println(matchCount);
        for (int j = 0; j < matchCount; j++) {
            if ((j + matchCount) <= competitors.size()) {
                match match = new match(competitors.get(j), competitors.get(j + matchCount));
                matches.add(match);
            } else {
                competitor bye = new competitor("bye");
                match match = new match(competitors.get(j), bye);
                matches.add(match);
            }

        }

    }

    public int bracketSize(int size) {
        int bracketSize = (int) (Math.log(size) / Math.log(2) + 0.99);
        return (int) (Math.pow(2, bracketSize));
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
            getWinners().add(winner);
            if (m.getWinner().getName().equals(m.getCompetitor1().getName())) {
                getLosers().add(m.getCompetitor2());
            } else {
                getLosers().add(m.getCompetitor1());
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
            output += "\n";
        }
        return output;
    }

    /**
     * @return the winners
     */
    public ArrayList<competitor> getWinners() {
        return winners;
    }

    /**
     * @param winners the winners to set
     */
    public void setWinners(ArrayList<competitor> winners) {
        this.winners = winners;
    }

    /**
     * @return the losers
     */
    public ArrayList<competitor> getLosers() {
        return losers;
    }

    /**
     * @param losers the losers to set
     */
    public void setLosers(ArrayList<competitor> losers) {
        this.losers = losers;
    }

}
