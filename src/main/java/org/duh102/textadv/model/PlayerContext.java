package org.duh102.textadv.model;

import org.duh102.textadv.model.actions.Action;

import java.util.Collection;

public class PlayerContext implements Describable, Container {
    private World world;
    private Space currentSpace;
    private Collection<Action> currentActions;
    private Collection<GameObject> inventory;
    private Collection<Attribute> attributes;
}
