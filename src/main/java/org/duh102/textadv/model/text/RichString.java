package org.duh102.textadv.model.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RichString {
    private List<RichStringComponent> components;

    public RichString(List<RichStringComponent> components) {
        this.components = components;
    }

    public RichString(RichStringComponent component) {
        this();
        add(component);
    }

    public RichString() {
        this.components = new ArrayList<>();
    }

    public RichString add(RichStringComponent component) {
        this.components.add(component);
        return this;
    }
    public RichString remove(RichStringComponent component) {
        this.components.remove(component);
        return this;
    }

    public List<RichStringComponent> getComponents() {
        return Collections.unmodifiableList(components);
    }
}
