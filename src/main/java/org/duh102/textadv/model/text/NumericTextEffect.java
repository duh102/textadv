package org.duh102.textadv.model.text;

public class NumericTextEffect implements ValuatedTextEffect<Integer> {
    private TextEffectType textEffect;
    private Integer value;
    public TextEffectType getType() {
        return textEffect;
    }
    public Integer getValue() {
        return value;
    }
}
