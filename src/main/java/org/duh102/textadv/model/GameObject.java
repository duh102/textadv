package org.duh102.textadv.model;

import org.duh102.textadv.model.actions.Action;
import org.duh102.textadv.model.actions.Actionable;

import java.util.Collection;

public class GameObject implements Describable, Container, Actionable, Linkable {
    private Collection<GameObject> inventory;
    private Collection<Attribute> attributes;
    private Collection<Action> contextActions;
    private String linkIndex;
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

    public String getLinkIndex() {
        return linkIndex;
    }

    public Collection<Action> getAvailableContextActions() {
        return contextActions;
    }
}
