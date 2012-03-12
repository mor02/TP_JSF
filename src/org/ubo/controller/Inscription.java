package org.ubo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.ubo.model.User;


public class Inscription {
	private List<User> users = new ArrayList();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String ajouter() {

		String k = "";
		ExternalContext ctx = FacesContext.getCurrentInstance()
				.getExternalContext();
		FacesMessage fm = new FacesMessage();
		fm.setSeverity(FacesMessage.SEVERITY_INFO);
		fm.setSummary("Validation");
		Map map = ctx.getRequestMap();
		User user = (User) map.get("user");

		if (user != null) {

			boolean trouve = false;

			for (int i = 0; i < users.size(); i++) {
				if (users.get(i).getLogin().equals(user.getLogin())) {
					trouve = true;
					
					fm.setDetail("Validation : Login deja existant !!");
					FacesContext.getCurrentInstance().addMessage(null, fm);
				}
			}
			if (!trouve) {
				if (user.getLogin().equals("") || user.getPassword().equals("")) {
					
					fm.setDetail("Validation :  Veuillez remplir les deux champs !!");
					FacesContext.getCurrentInstance().addMessage(null, fm);

					k = "";
				} else {
					users.add(user);
					k = "Home";
					fm.setDetail("Validation :  Utilisateur ajouté avec succés");
					FacesContext.getCurrentInstance().addMessage(null, fm);
				}

			}

		}

		
		return k;
	}
}
