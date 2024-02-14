package com.standings.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que representa a un usuario en el sistema.
 * 
 * <p>
 * Esta clase almacena información sobre un usuario, incluyendo su identificador de sesión,
 * nombre, correo electrónico y contraseña.
 * </p>
 * 
 * <p>
 * Los métodos proporcionados permiten acceder y modificar esta información.
 * </p>
 * 
 * @author SomeOne
 * @version 1.0
 * @since 2024-02-02
 */
public class User implements Serializable{
	
	// Declaracion de las variables 
	private static final long serialVersionUID = -2123744883602981956L;
	private int sessionId;
	private String name;
	private String email;
	private String password;
	
	
	 /**
     * Constructor de la clase User.
     * 
     * @param name       Nombre del usuario.
     * @param email      Correo electrónico del usuario.
     * @param password   Contraseña del usuario.
     * @param sessionIds Lista de identificadores de sesión existentes.
     */
	public User(String name, String email, String password, ArrayList<Integer> sessionIds) {
		this.sessionId = checkForSessionId(sessionIds);
		this.name = name;
		this.email = email;
		this.password =	password;
	}
	
	
	
	// getters y setters
	public int getSessionId() {
		return sessionId;
	}


	public String getPassword() {
		return password;
	}




	public String getName() {
		return name;
	}

	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	public void setName(String name) {
		this.name = name;
	}



	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	
	/**
     * Genera un identificador de sesión único para el usuario.
     * 
     * @param sessionIds Lista de identificadores de sesión existentes.
     * @return Identificador de sesión único generado.
     */
	private int checkForSessionId(ArrayList<Integer> sessionIds) {
		int tempsessionId = 0;
		do {
			tempsessionId = (int) (Math.random() * 100);
		} while(sessionIds.contains(tempsessionId));
		
		return tempsessionId;
	}



	 /**
     * Representación en cadena (String) del usuario.
     * 
     * @return Cadena que representa al usuario.
     */
	@Override
	public String toString() {
		return "User [sessionId= " + sessionId + ", name= " + name + ", email= " + email + ", password= " + password + "]";
	}
	
	
	
}
