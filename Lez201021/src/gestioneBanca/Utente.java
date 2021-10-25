package gestioneBanca;

import java.security.*;
import java.nio.charset.StandardCharsets;



public class Utente {
	private String Username;
	private byte[] Password;
	private int UserId;
	
	private static int lastId=0;
	
	public Utente(String Username, String Password)
	{
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			this.Password=md.digest(Password.getBytes(StandardCharsets.UTF_8));
		} catch (Exception NoSuchAlgorithmException) {
			System.out.println("error");
		}
		Utente.lastId++;
		this.UserId=lastId;
		this.Username=Username;		
	}
	
	public String getName()
	{
		return this.Username;
	}
	
	public int getId()
	{
		return this.UserId;
	}
	
	public boolean authenticate(String Username, String Password)
	{
		boolean res=false;
		if (Username.equals(this.Username))
		{
			if(this.Password.equals(Password.getBytes(StandardCharsets.UTF_8)))
			{
				res = true;
			} else System.out.println("password errata");
		} else System.out.println("utente inesistente");
		
			return res;
	}

}
