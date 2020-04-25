package org.duh102.textadv.model;

import org.duh102.textadv.model.actions.Action;
import org.duh102.textadv.model.actions.Actionable;

import java.util.Collection;

public class PlayerContext implements Describable, Container, Actionable {
    private World world;
    private Space currentSpace;
    private Collection<Action> currentActions;
    private Collection<GameObject> inventory;
    private Collection<Attribute> attributes;

    public Collection<GameObject> getContents() {
        return inventory;
    }

    public Container addObject(GameObject gameObject) {
        inventory.add(gameObject);
        return this;
    }

    public Container removeObject(GameObject gameObject) {
        inventory.remove(gameObject);
        return this;
    }

    public Collection<Attribute> getAttributes() {
        return attributes;
    }

    public Collection<Action> getAvailableActions() {
        return currentActions;
    }

    @Override
    public Collection<Action> getAvailableContextActions() {
        return null;
    }
}
