package com.escuela.usuario.valido.usuario;

import java.util.HashMap;
import java.util.Map;

public class DummyBase {

	private static Map<String, Usuario> mapa;

	static {

		mapa = new HashMap<String, Usuario>();
		mapa.put("flor", new Usuario("flor", "1234", "florencia", "sat", "sasa@sdfs.com", 26));
		mapa.put("lore", new Usuario("lore", "1000", "Lorena", "Fior", "asdas@asd.com", 23));
		mapa.put("vale", new Usuario("vale", "1000", "Valentina", "Mora", "anda@asd.com", 20));
	}

	public static Map<String, Usuario> getMap() {
		return mapa;
	}

	public static void setMap(String userN, Usuario user) {
		mapa.put(userN, user);
	}

}