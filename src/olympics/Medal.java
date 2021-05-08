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
public class Medal {
    private int medalID;
    public Player playerRef;
    
    public Medal(int medal_id, Player pRef){
        medalID = medal_id;
        playerRef = pRef;
    }
    
}
