package org.itson.Interfaces;

/**
 *
 * @author Equipo 02
 */
public interface IMenu 
{
    public void returnToMenu();
    public void addPlayer(String playerName,String playerAvatar);
    public void createNewGame(int numPlayers, int numTokensPerPlayers); 
}
