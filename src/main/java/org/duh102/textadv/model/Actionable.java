package org.duh102.textadv.model;

import java.util.Collection;

public interface Actionable {
    Collection<Action> getAllowedActions();

}
