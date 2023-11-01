package org.itson.Domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class Player {
    private int id;
    private String name;
    private String avatar;
    private List<playerToken> tokenList = new LinkedList();
    private boolean playerState;
    
    //Métodos 
    //public Token removeToken(Token tokenList){return this.tokenList.remove(1);}
    
    public Player(){}
    
    public List removeToken(Token tokenList){
        this.tokenList.remove(tokenList);
        for (int i = 0; i < this.tokenList.size(); i++) {
            if(this.tokenList.get(i)==tokenList){this.tokenList.remove(i);
            return this.tokenList; 
            }
        }
        return null;
    }
    
    public List addToken(Token tokenList){
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

    public List getAllTokenList() {
        return tokenList;
    }

    public void setTokenList(List tokenList) {
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
    
    
    
    
    
}