package org.duh102.textadv.model.actions;

import org.duh102.textadv.model.conditions.Conditional;
import org.duh102.textadv.model.Event;
import org.duh102.textadv.model.GameObject;

public interface Action implements Conditional {
    Event perform(GameObject subject);
    String getName();
    Action aliasOf();
}
