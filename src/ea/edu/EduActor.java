package ea.edu;

import ea.Point;
import ea.actor.Actor;
import ea.internal.ano.NoExternalUse;

public interface EduActor {

    /**
     * Gibt den Actor aus. Standardimplementierung: return this;
     * @return  Das Core-Engine-Actor-Objekt
     */
    @NoExternalUse
    Actor getActor();

    /**
     * Standard-Ausführung im Konstruktor. Meldet das Objekt unmittelbar in der aktuell aktiven Szene an.
     */
    @NoExternalUse
    default void eduSetup() {
        Spiel.getActiveScene().add(getActor());
    }

    default void entfernen() {
        Spiel.getActiveScene().remove(getActor());
    }

    default void verschieben(float dX, float dY) {
        getActor().position.move(dX, dY);
    }

    default void drehen(float drehwinkelInWinkelgrad) {
        getActor().position.rotate(drehwinkelInWinkelgrad);
    }

    default float nenneWinkel() {
        return getActor().position.getRotation();
    }

    default void setzeMittelpunkt(float mX, float mY) {
        getActor().position.setCenter(mX, mY);
    }

    default void setzeSichtbar(boolean sichtbar) {
        getActor().setVisible(sichtbar);
    }

    default float nenneMx() {
        return getActor().position.getCenter().x;
    }

    default float nenneMy() {
        return getActor().position.getCenter().y;
    }

    default boolean beinhaltetPunkt(float pX, float pY) {
        return getActor().contains(new Point(pX, pY));
    }

    default Point mittelPunkt() {
        return getActor().position.getCenter();
    }

    default Point zentrum() {
        return mittelPunkt();
    }

    default boolean schneidet(Actor actor) {
        return getActor().overlaps(actor);
    }
}
