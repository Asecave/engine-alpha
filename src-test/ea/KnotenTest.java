package ea;

import ea.internal.phy.WorldHandler;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnotenTest {
	@Test
	public void basic () {
        Knoten k = new Knoten();
        k.updateWorld(new WorldHandler());
		Rechteck r = new Rechteck(100, 100);
        r.position.set(100, 100);


		k.add(r);
		assertTrue(k.besitzt(r));

		k.entfernen(r);
		assertFalse(k.besitzt(r));

		// TODO: Für Schüler evtl. unerwartetes Verhalten - Exception?
		k.add(r, r);
		assertEquals(2, k.alleElemente().length);

		k.position.verschieben(new Vektor(10, 10));
		assertEquals(new Punkt(120, 120), r.position.get());

		r.position.verschieben(new Vektor(10, 10));
		assertEquals(new Punkt(130, 130), r.position.get());

		k.entfernen(r);
		assertEquals(0, k.alleElemente().length);
	}
}
