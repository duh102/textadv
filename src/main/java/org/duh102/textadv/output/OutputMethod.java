package org.duh102.textadv.output;

import org.duh102.textadv.game.GameConfiguration;
import org.duh102.textadv.model.actions.Action;
import org.duh102.textadv.model.PlayerContext;
import org.duh102.textadv.model.World;

import java.util.Collection;

public interface OutputMethod {
    void register(GameConfiguration configuration, World world, PlayerContext playerContext);
    void displayMenu(Collection<Action> actions);
    void performAction(Action action);
}
