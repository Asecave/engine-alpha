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

package ea.internal.gui;

import ea.internal.util.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Nachricht ist ein modaler Dialog, der einfach eine Nachricht an den Benutzer ausgibt.<br /> Diese
 * KLasse wird innerhalb des Fensters gehandelt. Hierzu muss nur folgendes passieren:
 * <b>Beispiel:</b><br /> <br /> <code> //Das instanziierte Fenster<br /> Fenster fenster;<br /> <br
 * /> //Senden einer Fensternachricht<br /> fenster.nachrichtAusgeben("Hallo Benutzer", true);<br />
 * </code><br /> Das <code>true</code> bei der Methode sorgt dafuer, das die Nachricht erst beendet
 * werden muss, bevor die Methode beendet ist. Fuer naeheres siehe die Dokumentation der Methode in
 * der Klasse Fenster.
 *
 * @author Michael Andonie
 */
@SuppressWarnings ("serial")
public class Nachricht extends EngineDialog {

	/**
	 * Der Konstruktor der Klasse Nachricht.
	 *
	 * @param parent
	 * 		Das noetige Parent-Fenster
	 * @param modal
	 * 		Ob die Nachricht modal ist oder nicht.
	 * @param nachricht
	 * 		Die Nachricht, die angezeigt werden soll.
     * @param titel
     *      Der Titel für den Dialog.
	 * @param font
	 * 		Der Darstellungsfont
	 */
	public Nachricht (Frame parent, boolean modal, String nachricht, String titel, Font font) {
		super(parent, titel, modal);
		setLayout(new BorderLayout());
		JLabel l = new JLabel(nachricht);
		l.setFont(font);
		getContentPane().add(l, BorderLayout.CENTER);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton b = new JButton("OK");
		b.setFont(font);
		b.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				dispose();
			}
		});
		p.add(b);
		getContentPane().add(p, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}
}
