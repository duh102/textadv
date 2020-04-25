package org.duh102.textadv.model.actions;

import org.duh102.textadv.model.Describable;
import org.duh102.textadv.model.event.Event;

public class Inspect<T extends Describable> extends BaseAction {
    // If we ever get translation, put it here!
    public static String NAME = "Inspect";
    private T toInspect;

    public Inspect(T toInspect) {
        this.toInspect = toInspect;
    }

    @Override
    public Event perform() {
        return null;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
