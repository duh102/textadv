package org.duh102.textadv.model;

import org.duh102.textadv.model.actions.Action;
import org.duh102.textadv.model.text.RichTextBlock;

import java.util.Collection;

public interface Event {
    RichTextBlock getEventResponse();
    Collection<Action> followupActions();
}
