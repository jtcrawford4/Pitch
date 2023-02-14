package org.example.Service;

import org.example.Model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    public List<Player> initializePlayers() {
        List<Player> players = new ArrayList<>();
        //todo
        players.add(new Player(1));
        players.add(new Player(2));
        players.add(new Player(3));
        players.add(new Player(4));
        return players;
    }
}
