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

package ea.mouse;

import ea.Punkt;

/**
 * Das Listener-Interface fuer losgelassene Tasten auf der Maus. Einfach an dem aktiven
 * <code>Maus</code>-Objekt anzumelden:<br /><br /> <code> MausLosgelassenReagierbar listener; //<-
 * Mein Listener maus.mausLosgelassenReagierbarAnmelden(listener); </code>
 *
 * @author Michael Andonie
 */
public interface MausLosgelassenReagierbar {
	/**
	 * Diese Methode wird bei jedem an der aktiven Maus angemeldeten Listener ausgefuehrt, sobald
	 * eine Maustaste losgelassen wird.
	 *
	 * @param punkt
	 *			Der Punkt, der die Mausposition (Referenzpunkt: Hotspot) zum Zeitpunkt des Loslassens
	 *			der Maustaste angibt.
	 * @param linksklick
	 * 		Ist dieser Wert <code>true</code>, war die Losgelassene Maustaste die Linke. Ansonsten ist
	 * 		dieser Wert <code>false</code>.
	 */
	public abstract void mausLosgelassen (Punkt punkt, boolean linksklick);
}
