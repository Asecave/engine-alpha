/*
 * Engine Alpha ist eine anfängerorientierte 2D-Gaming Engine.
 *
 * Copyright (c) 2011 - 2014 Michael Andonie and contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package ea;

import ea.internal.ano.API;

/**
 * Ein KollisionsReagierbar-Objekt kann auf das aufeinandertreffen zweier Raum-Objekte reagieren.<br
 * /> Bei einer komplizierteren Aufgabe sieht das Anmelden bei einem <code>WorldHandler</code>-Objekt des
 * Listeners ungefaehr so aus:<br /> <br /><br /><br /><br /> <code> //Bereits Instanziiertes
 * WorldHandler-Objekt. WorldHandler physik;
 * <p/>
 * <p/>
 * </code><br />
 *
 * @author Michael Andonie
 */

public interface KollisionsReagierbar {
	/**
	 * Diese Methode wird dann aufgerufen, wenn die mit diesem Interface zusammen angemeldeten
	 * Raum-Objekte kollidieren.
	 *
	 * @param code
	 * 		Der bei der Anmeldung mit zwei Raum-Objekten mitgegebene Code zur Weiterverarbeitung bei
	 * 		Mehrfachanmeldung dieses Interfaces.
	 */
    @API
	public abstract void kollision (int code);

    /**
     * Diese Methode wird dann aufgerufen, wenn die mit diesem Interface zusammen angemeldeten
     * Raum-Objekte den Kollisionszustand verlassen.
     *
     * @param code
     *      Der bei der Anmeldung mit zwei Raum-Objekten mitgegebene Code zur Weiterverarbeitung bei
     * 		Mehrfachanmeldung dieses Interfaces.
     */
    @API
    public abstract void kollisionBeendet(int code);
}
