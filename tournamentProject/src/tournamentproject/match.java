/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentproject;

import java.util.Scanner;

/**
 *
 * @author Haley
 */
public class match {

    private competitor competitor1;
    private competitor competitor2;

    /**
     * sets the competitors to
     *
     * @param one
     * @param two
     */
    public match(competitor one, competitor two) {
        competitor1 = one;
        competitor2 = two;
    }

    /**
     * @return the competitor1
     */
    public competitor getCompetitor1() {
        return competitor1;
    }

    /**
     * @param competitor1 the competitor1 to set
     */
    public void setCompetitor1(competitor competitor1) {
        this.competitor1 = competitor1;
    }

    /**
     * @return the competitor2
     */
    public competitor getCompetitor2() {
        return competitor2;
    }

    /**
     * @param competitor2 the competitor2 to set
     */
    public void setCompetitor2(competitor competitor2) {
        this.competitor2 = competitor2;
    }

    /**
     * Uses a scanner to take a user inputed string then takes the string and
     * compares it to competitor string name. Before that though it checks to
     * see if the name is 'bye' if it is it will automatically return competitor
     * with a name. if a user gives the program some other crap besides a string
     * name of a competitor it will give them an error message
     *
     * @return
     */
    public competitor getWinner() {

        if (competitor1.getName().equals("bye")) {
            return competitor2;
        } else if (competitor2.getName().equals("bye")) {
            return competitor1;
        }
        Scanner sc = new Scanner(System.in);
        do {
            //print out competitors to choose from
            System.out.println("");
            System.out.println("Who won? Enter Winner");
            String name = sc.nextLine();
            if (name.equals(competitor1.getName())) {
                return competitor1;
            } else if (name.equals(competitor2.getName())) {
                return competitor2;
            } else {
                System.out.println("Invalid name. No such competitor");
            }
        } while (sc.hasNext());
        return null;
    }

    /**
     * prints out each competitors name and their placement
     *
     * @return
     */
    public String toString() {
        String output = "competitor one : " + getCompetitor1() + " " + "competitor two: " + getCompetitor2();
        return output;
    }
}
