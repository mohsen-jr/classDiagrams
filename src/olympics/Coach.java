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
public class Coach extends Person {
    private int coachID;
    Player teamMember;
    Team teamName;
    public Coach(int coachid,Player x, Team y){
        coachid = coachID;
        teamMember = x;
        teamName = y;
    }
    public Coach(){
      
    }
    
    
}
