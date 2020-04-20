package org.duh102.textadv.input;

import org.duh102.textadv.game.GameConfiguration;
import org.duh102.textadv.model.PlayerContext;
import org.duh102.textadv.model.World;

public interface InputMethod {
    void register(GameConfiguration configuration, World world, PlayerContext context);
    void listenForInput();
    void preventInput(boolean shouldInputBePrevented);
}
