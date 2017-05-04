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
public class round extends match {

    private ArrayList<match> matches = new ArrayList<>();

    /*
    ArrayList<match> winners = new ArrayList<>();
    is this the correct way to reference winners... or is it just a competitor object
    instead of a match object? 
    is this a list of winners from each round?
    what class/method/whatever uses this list? 
    does it need to be ordered?
     */
    public round() {

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
    
    /*
    determineWinner() method:
    what data type?
    does it need user input(i think so)
   
    
    */
    public competitor deterineWinner(){
        return competitor;
    }
    
    /*
    should this print out the winners list and or the matches list?
    
    */
    public String toString(){
        String output = "";
        return output;
    }

}
