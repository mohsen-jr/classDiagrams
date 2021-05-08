/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olympics;

/**
 *
 * @author mahmoud_mohsen
 */
public class Delegate {
    public String country;
    private int numPlayers;
    private Player player;
    private Coach coach;
    
    public Delegate(String country, Player player, Coach coach){
        this.country = country;
        this.player = player;
        this.coach = coach;
        numPlayers++;
    }
    public void addPlayer(int pID){
        player = new Player(pID);
    }
    
    public void addCoach(Coach coach){
        this.coach = coach;
    }
    
    public int getNumPlayers(){
        return this.numPlayers;
    }
}
