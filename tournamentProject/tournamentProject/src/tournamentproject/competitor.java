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
public class competitor {
    private String name;
    private int placement;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the placement
     */
    public int getPlacement() {
        return placement;
    }

    /**
     * @param placement the placement to set
     */
    public void setPlacement(int placement) {
        this.placement = placement;
    }
    
    public String toString(){
        String output = getName() + " " + " " + getPlacement() + "\n";
        return output;
    }
    
}
