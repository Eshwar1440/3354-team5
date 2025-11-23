package testPackage;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	public static class AccountManagerStatic {
		public static List<Account> activeAccounts = new ArrayList<>();
		
		public static int createAccount(String username, String password)
		{
			if (username == null) { return 3; }
			if (password == null) { return 4; }
			if (checkForExistingUser(username)) { return 1; }
			if (!validatePassword(password)) { return 2; }
			
			Account newAccount = new Account(username, password);
			activeAccounts.add(newAccount);
			return 0;
		}
		
		public static boolean checkForExistingUser(String username)
		{
			for (Account a : activeAccounts)
			{
				if (a.getUsername().equals(username)) { return true; }
			}
			return false;
		}
		
		private static boolean validatePassword(String password)
		{
			return password.length() >= 5;
		}
	}
}
