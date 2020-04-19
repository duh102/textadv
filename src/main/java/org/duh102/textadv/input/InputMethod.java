package org.duh102.textadv.input;

import org.duh102.textadv.model.PlayerContext;
import org.duh102.textadv.model.World;

public interface InputMethod {
    void register(World world, PlayerContext context);
}
