package org.duh102.textadv.output;

import org.duh102.textadv.model.Action;
import org.duh102.textadv.model.PlayerContext;
import org.duh102.textadv.model.Space;

import java.util.Collection;

public interface OutputMethod {
    void displayMenu(Collection<Action> actions);
    void describeSpace(Space space, PlayerContext playerContext);
    void performAction(Action action);
}
