package aplicacao;

import java.text.ParseException;

import entidades.Menus;

public class Programa {

	public static void main(String[] args) {
		
		Menus menu = new Menus();
		
		try {
			menu.menuInicio();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
