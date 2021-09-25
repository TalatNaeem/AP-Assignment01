import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testWithdraw3 {
	private create_account obj;
	
	@BeforeEach
	public void setup() {
		obj = new create_account("Talat",12403, 50000, "saving");
	}
//Withdraw test cases
	@Test
	public void testwithdraw() {
		   int money = 25000;
		   int total_bal = obj.Acc_Balance;
		   int expectedResult = 0;
		   if(total_bal-money>0)
		   {
			   expectedResult=total_bal-money;
		   }
		   int result = obj.withdraw(money);
		   Assertions.assertEquals(expectedResult,result);
			//fail("Not yet implemented");
		}
//////////////////

//////////////////////////
}