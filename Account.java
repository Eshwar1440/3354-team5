package testPackage;

import testPackage.AccountManager.AccountManagerStatic;

public class Account {
	private String username;
	private String password;
	
	public Account(String n, String p)
	{
		username = n;
		password = p;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setUsername(String newName)
	{
		if (AccountManagerStatic.checkForExistingUser(newName)) { return; }
		username = newName;
	}
	
	public boolean resetPassword(String oldPassword, String newPassword)
	{
		if (password != oldPassword) { return false; }
		
		password = newPassword;
		return true;
	}
}
