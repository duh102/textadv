package org.duh102.textadv.model.text;

import org.duh102.textadv.model.GameObject;

public class LinkTextEffect implements ValuatedTextEffect<GameObject> {
    GameObject linkedObject;
    public GameObject getValue() {
        return linkedObject;
    }

    public TextEffectType getType() {
        return TextEffectType.LINK;
    }
}
