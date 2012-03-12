package org.ubo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.ubo.model.User;


public class Login {
	private User currentUser;

	public Login() {
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public String login() {
		FacesMessage fm = new FacesMessage();
		fm.setSeverity(FacesMessage.SEVERITY_INFO);
		fm.setSummary("Validation");
		ExternalContext ctx = FacesContext.getCurrentInstance()
				.getExternalContext();
		List<User> listeUser = new ArrayList();
		Map mapusers = ctx.getApplicationMap();
		Inscription insc = (Inscription) mapusers.get("inscription");
		String k = "";

		Map map = ctx.getRequestMap();
		User user = (User) map.get("user");

		if (user != null) {
			

			boolean existe = false;
			for (int i = 0; i < insc.getUsers().size(); i++) {
				if (insc.getUsers().get(i).getLogin().equals(user.getLogin())
						&& insc.getUsers().get(i).getPassword()
								.equals(user.getPassword())) {
					currentUser = user;
					existe = true;
					
					k = "Home";

				}

			}
			if (!existe) {
				if (user.getLogin().equals("") || user.getPassword().equals("")) {
					
					fm.setDetail("Validation :  Veuillez remplir les deux champs !!");
					FacesContext.getCurrentInstance().addMessage(null,
							fm);
				
					k = "";
				} else {

					
					fm.setDetail("Validation :  Login ou Mot de passe est incorrect");
					FacesContext.getCurrentInstance().addMessage(
							null, fm);
			
					existe = false;
					k = "";

				}

			}
		}

		return k;

	}

	public String logout() {
		currentUser = null;
		return "Home";
	}

	public boolean isLoggedIn() {

		if (this.getCurrentUser() == null)

			return false;
		return true;

	}

}
