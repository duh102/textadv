package org.duh102.textadv.model.conditions;

import org.duh102.textadv.model.GameObject;
import org.duh102.textadv.model.PlayerContext;

public interface Condition {
    boolean isSatisfied(GameObject subject, PlayerContext playerContext);
}
