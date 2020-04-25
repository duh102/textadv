package org.duh102.textadv.model.event;

import org.duh102.textadv.model.actions.Action;
import org.duh102.textadv.model.text.block.RichTextBlock;

import java.util.Collection;

public interface Event {
    RichTextBlock getEventResponse();
    Collection<Action> followupActions();
}
