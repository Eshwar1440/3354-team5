package testPackage;

import org.junit.Test;

import testPackage.AccountManager.AccountManagerStatic;

import static org.junit.Assert.assertEquals;

public class TestJunit 
{
   @Test
   public void runTest() 
   {
	  //Valid account creation test cases
      assertEquals(0, AccountManagerStatic.createAccount("John", "12345"));
      assertEquals(0, AccountManagerStatic.createAccount("Katelyn", "abcde"));
      assertEquals(0, AccountManagerStatic.createAccount("Frank", "mypassword100%"));
      
      //Trying to create an account with a name that is already used (error code 1)
      assertEquals(1, AccountManagerStatic.createAccount("Frank", "12345"));
      assertEquals(1, AccountManagerStatic.createAccount("John", "abcde"));
      
      //Trying to create an account with an invalid password (error code 2)
      assertEquals(2, AccountManagerStatic.createAccount("George", "123"));
      assertEquals(2, AccountManagerStatic.createAccount("Greyson", ""));
      
      //Missing username input (error code 3)
      assertEquals(3, AccountManagerStatic.createAccount(null, "12345"));
      
    //Missing password input (error code 4)
      assertEquals(4, AccountManagerStatic.createAccount("Tyler", null));
   }
}