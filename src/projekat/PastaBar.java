package projekat;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {
		String[] stalneMusterije = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };

		String[] sastojci = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };

		int[] cena = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		Scanner s = new Scanner(System.in);

		System.out.println("Izvolite ");
		System.out.println("Izaberite sastojak za pastu");
		String porudzbina = s.next();
		int racun = 0;

		while (!porudzbina.equals("naruci")) {
			int cenaindex = indexSastojka(sastojci, porudzbina);
			racun = racun + cena[cenaindex];
			System.out.println("Izaberite sastojak za pastu");
			porudzbina = s.nextLine();

		}
		System.out.println("Unesite broj telefona");
		String broj = s.next();
		boolean stalnaMusterija = jeStalnaMusterija(stalneMusterije, broj);
		if (stalnaMusterija == true) {
			racun = racun - (racun * 10 / 100);

		}
		System.out.println("Vas racun iznosi " + racun + " dinara");
		System.out.println("Prijatno");

	}

	public static int indexSastojka(String[] sastojci, String sastojak) {
		int indeks = 0;
		for (int i = 0; i < sastojci.length; i++) {
			if (sastojci[i].equals(sastojak)) {

				indeks = i;
			}
		}
		return indeks;
	}

	public static boolean jeStalnaMusterija(String[] stalneMusterije, String brojTelefona) {
		boolean jeMusterija = false;
		for (int i = 0; i < stalneMusterije.length; i++) {
			if (brojTelefona.equals(stalneMusterije[i])) {
				jeMusterija = true;
			}
		}
		return jeMusterija;

	}

}
