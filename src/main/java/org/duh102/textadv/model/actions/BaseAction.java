package org.duh102.textadv.model.actions;

import org.duh102.textadv.model.conditions.Condition;
import org.duh102.textadv.model.conditions.Conditional;

import java.util.Collection;
import java.util.Collections;

public abstract class BaseAction implements Action, Conditional {
    @Override
    public Action aliasOf() {
        return null;
    }

    @Override
    public Collection<Condition> getConditions() {
        return Collections.emptyList();
    }
}
