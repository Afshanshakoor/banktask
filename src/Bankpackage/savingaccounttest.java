package Bankpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class savingaccounttest {

	@Test
	public void test() {
		savingaccount sa=new savingaccount();
		boolean ab=sa.withdraw(4.22);
		assertEquals(ab,false);
		
	}

}
