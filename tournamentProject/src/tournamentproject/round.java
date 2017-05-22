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

    /**
     * The round constructor takes an array list of competitors It calls
     * matchCount() with the size of competitors to get the bracketSize. It then
     * breaks the list at the number of matches. Then it assigns the first
     * number of competitors to the first slot in each match, then finds where
     * the list breaks and assigns those to the second slot in each match. If
     * there are no more names it will assign empty slots to "bye". adds each
     * match pair to the match arrayList
     *
     * @param competitors
     */
    public round(ArrayList<competitor> competitors) {
        System.out.println(competitors);
        int matchCount = bracketSize(competitors.size());
        System.out.println(matchCount);
        for (int j = 0; j < matchCount; j++) {
            if ((j + matchCount) <= competitors.size()) {
                match match = new match(competitors.get(j), competitors.get(j - 1 + matchCount));
                matches.add(match);
            } else {
                competitor bye = new competitor("bye");
                match match = new match(competitors.get(j), bye);
                matches.add(match);
            }

        }

    }

    /**
     * Takes the log of the size of the competitors and then takes that to the
     * power of two in order to determine how many matches we will have
     *
     * @param size
     * @return
     */
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
            competitor winner = m.determineWinner();
            getWinners().add(winner);
            if (m.determineWinner().getName().equals(m.getCompetitor1().getName())) {
                getLosers().add(m.getCompetitor2());
            } else {
                getLosers().add(m.getCompetitor1());
            }
        }

    }

    /**
     * Prints out the matches
     *
     * @return
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
