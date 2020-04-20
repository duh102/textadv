package org.duh102.textadv.model.text;

public enum TextEffectType {
    ITALIC(false),
    BOLD(false),
    SIZE(true),
    COLOR(true),
    LINK(true);
    private boolean requiresValue;
    TextEffectType(boolean requiresValue) {
        this.requiresValue = requiresValue;
    }
    public boolean requiresValue() {
        return requiresValue;
    }
}
