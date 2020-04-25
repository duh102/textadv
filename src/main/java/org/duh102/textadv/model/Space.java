package org.duh102.textadv.model;

import org.duh102.textadv.model.actions.Action;
import org.duh102.textadv.model.actions.Actionable;

import java.util.Collection;

public class Space implements Actionable, Describable, Container, Linkable {
    private Collection<GameObject> spaceContents;
    private Collection<Attribute> spaceAttributes;
    private String linkIndex;
    private Collection<Action> contextActions;
    @Override
    public Collection<GameObject> getContents() {
        return null;
    }

    @Override
    public Container addObject(GameObject gameObject) {
        return null;
    }

    @Override
    public Container removeObject(GameObject gameObject) {
        return null;
    }

    @Override
    public Collection<Attribute> getAttributes() {
        return null;
    }

    @Override
    public String getLinkIndex() {
        return null;
    }

    @Override
    public Collection<Action> getAvailableContextActions() {
        return null;
    }
}
