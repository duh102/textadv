package org.duh102.textadv.output;

import org.duh102.textadv.game.GameConfiguration;
import org.duh102.textadv.model.PlayerContext;
import org.duh102.textadv.model.World;
import org.duh102.textadv.model.actions.Action;

import java.util.Collection;

public class SimpleStringOutput implements OutputMethod {
    private GameConfiguration configuration;
    private World world;
    private PlayerContext playerContext;

    @Override
    public void register(GameConfiguration configuration, World world, PlayerContext playerContext) {
        this.configuration = configuration;
        this.world = world;
        this.playerContext = playerContext;
    }

    @Override
    public void displayMenu(Collection<Action> actions) {

    }

    @Override
    public void performAction(Action action) {

    }
}
