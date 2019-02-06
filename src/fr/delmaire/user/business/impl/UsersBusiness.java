package fr.delmaire.user.business.impl;

import java.util.ArrayList;

import fr.delmaire.user.bean.user;
import fr.delmaire.user.business.IUserBusiness;

public class UsersBusiness implements IUserBusiness{
	public ArrayList<user> getUser() {

		String dossierImages = "ressources/images/user/";

		user pl = new user("Lapin", "Pierre", dossierImages + "peter.jpg", 2);
		user miffy = new user("Lapin", "Miffy", dossierImages + "miffy.jpg", 35);
		user bob = new user("Sponge", "Bob", dossierImages + "bob.jpg", 12);
		user gc = new user("Slump", "Gatchan", dossierImages + "gatchan.jpg", 120);
		user gz = new user("Go", "Zilla", dossierImages + "gozilla.jpg", 70);
		user arale = new user("Slump", "Arale", dossierImages + "arale.jpg", 4);
		user patrick = new user("Star", "Patrick", dossierImages + "patrick.jpg", 12);
		user slump = new user("Slump", "Asao", dossierImages + "slump.jpg", 38);

		ArrayList<user>users = new ArrayList<user>();

		users.add(pl);
		users.add(miffy);
		users.add(bob);
		users.add(gc);
		users.add(gz);
		users.add(arale);
		users.add(patrick);
		users.add(slump);
		
		return users;
		
	}

	@Override
	public ArrayList<user> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
