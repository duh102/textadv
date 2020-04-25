package org.duh102.textadv.model.text.block;

import org.duh102.textadv.model.text.RichString;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextBlock implements RichTextBlock {
    private List<RichString> contents;

    public SimpleTextBlock(List<RichString> contents) {
        this.contents = contents;
    }
    public SimpleTextBlock(RichString singleString) {
        this();
        add(singleString);
    }
    public SimpleTextBlock() {
        this.contents = new ArrayList<>();
    }

    public SimpleTextBlock add(RichString component) {
        this.contents.add(component);
        return this;
    }
    public SimpleTextBlock remove(RichString component) {
        this.contents.remove(component);
        return this;
    }

    @Override
    public List<RichString> getBlockContents() {
        return contents;
    }
}
