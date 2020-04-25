package org.duh102.textadv.input;

import org.duh102.textadv.game.GameConfiguration;
import org.duh102.textadv.model.PlayerContext;
import org.duh102.textadv.model.World;
import org.duh102.textadv.model.actions.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class CliInput implements InputMethod {
    private GameConfiguration configuration;
    private World world;
    private PlayerContext context;

    private AtomicBoolean inputEnabled = new AtomicBoolean(true);
    @Override
    public void register(GameConfiguration configuration, World world, PlayerContext context) {
        this.configuration = configuration;
        this.world = world;
        this.context = context;
    }

    @Override
    public void listenForInput() {
        if(inputEnabled.get()) {
            List<Action> availableActions = new ArrayList<>(context.getAvailableActions());
            // listen for some input

        }
    }

    @Override
    public void preventInput(boolean shouldInputBePrevented) {
        inputEnabled.getAndSet(shouldInputBePrevented);
    }
}
