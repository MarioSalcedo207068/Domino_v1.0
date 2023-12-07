package org.itson.Domain;

import java.lang.Thread.State;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Equipo 02
 */
public class Player {
    private int id;
    private String name;
    private String avatar;
    private List<playerToken> tokenList;
    private boolean playerState;
    
    //Métodos 
    //public Token removeToken(Token tokenList){return this.tokenList.remove(1);}
    
    public Player(String name, String avatar)
    {
        this.name = name;
        this.avatar = avatar;
        this.playerState = false;
        this.id = obtenerNumeroRandom(0,100);
        tokenList = new LinkedList();
    }
    public Player()
    {
        
    }
    
    public List<playerToken> removeToken(Token tokenToRemove){
        
        for (int i = 0; i < this.tokenList.size(); i++) {
            if(this.tokenList.get(i)==tokenToRemove)
            {
                this.tokenList.remove(i);
                return this.tokenList; 
            }
        }
        return null;
    }
    
    public List<playerToken>  addToken(Token tokenList){
        this.tokenList.add((playerToken) tokenList);
        return this.tokenList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<playerToken> getTokenList() {
        return tokenList;
    }

    public void setTokenList(List<playerToken> tokenList) {
        this.tokenList = tokenList;
    }

    public boolean getPlayerState() {
        return playerState;
    }

    public void setPlayerState(boolean playerState) {
        this.playerState = playerState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public int obtenerNumeroRandom(int min, int max)
    {
        int n =(int)(Math.random() * (max - min)) + min;
        
        return n;
    }
     
     public int highestMule()
     {
         int countOfMules = 0;
         
         Token[] mules = null;
         
         for(int i = 0;i<tokenList.size();i++)
         {
             if(tokenList.get(i).isDouble() == true)
             {
                 mules[countOfMules] = tokenList.get(i);
                 countOfMules++;
             }
         }
         
         Token highestMule = null;
         highestMule.setLowerSide(0);
         highestMule.setUpperSide(0);
         
         for(int i = 0;i<mules.length;i++)
         {
             if(mules[i].getSumaFicha()>highestMule.getSumaFicha())
             {
                 highestMule = mules[i];
             }
         }
         
         return tokenList.indexOf(highestMule);
         
     }
    

}