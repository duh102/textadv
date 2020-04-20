package org.duh102.textadv.model.actions;

import java.util.Collection;

public interface Actionable {
    Collection<Action> getAvailableContextActions();
}
