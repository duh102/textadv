package org.duh102.textadv.model.event;

import org.duh102.textadv.model.Describable;
import org.duh102.textadv.model.actions.Action;
import org.duh102.textadv.model.text.block.RichTextBlock;

import java.util.Collection;
import java.util.Collections;

public class DescriptionEvent implements Event {
    private Describable describable;

    public DescriptionEvent(Describable describable) {
        this.describable = describable;
    }

    @Override
    public RichTextBlock getEventResponse() {
        RichTextBlock block;
    }

    @Override
    public Collection<Action> followupActions() {
        return Collections.emptyList();
    }
}
