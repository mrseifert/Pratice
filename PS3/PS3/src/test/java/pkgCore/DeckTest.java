package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;
public class DeckTest {

	@Test (expected = DeckException.class)
	public void TestEmptyDeck() throws DeckException{
		
		Deck var1 = new Deck();
		for (int S = 0; S == 53; S++);
		var1.Draw();

	}
	
	@Test
	public void TestDrawSuit() {
		
		Deck var2 = new Deck();
		Card var3 = var2.Draw(eSuit.HEARTS);
		assertTrue(var3.geteSuit() == eSuit.HEARTS);

	}
	
	@Test
	public void TestDrawRank() {
		
		Deck var4 = new Deck();
		Card var5 = var4.Draw(eRank.JACK);
		assertTrue(var5.geteRank() == eRank.JACK);

	}
	
	public void TestDeckRankCount() {
		
		Deck var6 = new Deck();
		assertTrue(var6.Count(eRank.TEN) == 4);
		

	}
	
	public void TestDeckSuitCount() {
		
		Deck var7 = new Deck();
		assertTrue(var7.Count(eSuit.SPADES) == 13);

	}

}
