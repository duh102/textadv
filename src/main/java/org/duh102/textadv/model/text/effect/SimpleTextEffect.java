package org.duh102.textadv.model.text.effect;

public class SimpleTextEffect implements TextEffect {
    private TextEffectType effectType;
    public TextEffectType getType() {
        return effectType;
    }
    public SimpleTextEffect(TextEffectType effectType) {
        this.effectType = effectType;
    }
}
