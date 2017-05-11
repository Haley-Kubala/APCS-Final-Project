/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentproject;

/**
 *
 * @author Haley
 */
public class match {

    private competitor competitor1;
    private competitor competitor2;

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
    
    /*
    getWinner() method? what does match even do if it
    doesn't determine the winner between the two competitors
    how does round do this instead?
    how does match even reference round if it doesn't extend it?
    what should this toString() return? the winner?
    
    */
    public String toString() {
        
        String output = "competitor one : "  + ;
        return output;
    }
}
