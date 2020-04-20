package org.duh102.textadv.model;

import java.util.Collection;

public interface Container {
    Collection<GameObject> getContents();
    Container addObject(GameObject gameObject);
    Container removeObject(GameObject gameObject);
}
