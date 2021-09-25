import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testDeposite2 {
	private create_account obj;
	
	@BeforeEach
	public void setup() {
		obj = new create_account("Talat",12403, 50000, "saving");
	}
	//Deposit test cases
	@Test
			public void testdeposit() {
				   int money = 2500;
				   int a_num = 5092;
				   int expectedResult = obj.Acc_Balance + money;
				   int result = obj.deposite(5092, 2500);
				   Assert.assertEquals(expectedResult, result);
			}
	//////////////////////////
}