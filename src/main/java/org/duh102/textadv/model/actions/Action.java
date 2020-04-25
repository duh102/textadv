package org.duh102.textadv.model.actions;

import org.duh102.textadv.model.event.Event;

public interface Action {
    Event perform();
    String getName();
    Action aliasOf();
}
