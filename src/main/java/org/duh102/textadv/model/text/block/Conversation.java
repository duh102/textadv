package org.duh102.textadv.model.text.block;

import org.duh102.textadv.model.text.RichString;

import java.util.Arrays;
import java.util.List;

public class Conversation implements RichTextBlock {
    RichString subject;
    RichString quote;

    public List<RichString> getBlockContents() {
        return Arrays.asList(subject, quote);
    }
}
