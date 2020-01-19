package de.upb.codingpirates.battleships.logic;

import javax.annotation.Nonnull;
import java.io.Serializable;

/**
 * Represents a player.
 *
 * This class implements {@link Serializable} in order to allow it to be serialized and transferred via the
 * {@link javafx.scene.input.Clipboard} or any of its subclasses using the {@code application/x-java-serialized-object}
 * MIME type.
 *
 * @author Interdoc committee
 * @author Paul Becker
 * @author Andre Blanke
 */
public class Client extends AbstractClient {

    private boolean dead;

    public Client(final int id, @Nonnull final String name) {
        super(id, name);
    }

    @Nonnull
    @Override
    public ClientType getClientType() {
        return ClientType.PLAYER;
    }

    @Nonnull
    @Override
    public ClientType handleClientAs() {
        return dead ? ClientType.SPECTATOR : ClientType.PLAYER;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
