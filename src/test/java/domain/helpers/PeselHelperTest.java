package domain.helpers;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeselHelperTest {


	
	@Test
	public void checkPeselTest() {
		String correctPesel = "96061010469";
		boolean isCorrect = PeselHelper.check(correctPesel);
		assertTrue(isCorrect);
	}
	
	@Test
	public void checkPeselWithInvalidCharacterTest(){
	 
		assertFalse(PeselHelper.check("sdzjkbnfsdkjnjk"));
	}
	
	@Test
	public void checkPeselWithInvalidlengthTest(){
		assertFalse(PeselHelper.check("960610104691"));
	}
	
	@Test
	public void checkPeselWithInvalidCheckSumTest(){
		assertFalse(PeselHelper.check("96061010468"));
	}

}
