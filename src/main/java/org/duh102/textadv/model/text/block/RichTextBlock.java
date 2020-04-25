package org.duh102.textadv.model.text.block;

import org.duh102.textadv.model.text.RichString;

import java.util.List;

public interface RichTextBlock {
    List<RichString> getBlockContents();
}
