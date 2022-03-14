package ru.netology.repository;

import ru.netology.domain.Player;

import java.util.*;

public class GameRepository {

    private Map<String,Player> playersListHash = new HashMap<>();

    public void addPlayer(Player name) {
        playersListHash.put(name.getName(),name);
    }

    public Player[] showPlayers() {
        return  playersListHash.values().toArray(new Player[0]);
    }

    public Player findByName(String Name) {
       return playersListHash.get(Name);

    }

    public void removePlayer(String name) {
        playersListHash.remove(name);
   }

}
