package ea.example.showcase.jump;

import ea.BoundingRechteck;
import ea.Scene;
import ea.actor.Image;
import ea.actor.Rectangle;
import ea.collision.CollisionEvent;
import ea.collision.CollisionListener;
import ea.handle.Physics;

import java.awt.*;

public class Platform
extends Rectangle
implements CollisionListener<PlayerCharacter> {


    /**
     * Konstruktor.
     *
     * @param width  Die Breite des Rechtecks
     * @param height Die Höhe des Rechtecks
     */
    public Platform(Scene parent, PlayerCharacter pc, float width, float height) {
        super(width, height);
        parent.add(this);


        setColor(new Color(130, 140, 255, 200));
        physics.setType(Physics.Type.STATIC);
        physics.setElasticity(0);

        addCollisionListener(this, pc);
    }

    @Override
    public void onCollision(CollisionEvent<PlayerCharacter> collisionEvent) {
        PlayerCharacter playerCharacter = collisionEvent.getColliding();
        //System.out.println("Collision!");
        if(playerCharacter.physics.getVelocity().y < 0) {
            collisionEvent.ignoreCollision();
        }
    }
}
