import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		int i;
		double[] reiskorn = new double[65];
		double[] gewicht_kg = new double[64];
		double[] gewicht_t = new double[64];
		double[] laenge_m = new double[64];
		double[] laenge_km = new double[64];
		String s;
		double summe, summe_gewicht_kg, summe_gewicht_t, summe_laenge_m, summe_laenge_km;
		
		DecimalFormat df = new DecimalFormat("00000000000000000000");
		DecimalFormat dff = new DecimalFormat("00");
		DecimalFormat df_koma = new DecimalFormat("00000000000000000000.00");
		
		reiskorn[0] = 1;
		summe = 1;
		summe_gewicht_kg = 0;
		summe_gewicht_t = 0;
		summe_laenge_m = 0;
		summe_laenge_km = 0;
		
		// Tabelle 1
		System.out.println("-------------------------------");
		System.out.println("         Tabelle 1");
		System.out.println("-------------------------------");
		System.out.println("Feld   " + "Reiskorn");
		System.out.println("-------------------------------");
		
		for (i = 0; i < reiskorn.length - 1; i++) {
			reiskorn[i] = Math.pow(2, i);
			summe = summe + reiskorn[i];
			System.out.print(dff.format(i + 1) + "      " + df.format(reiskorn[i]));
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		System.out.println("Summe   " + df.format(summe));
		System.out.println("-------------------------------");
		
		// Tabelle 2
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                                            Tabelle 2");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Feld   " + "Reiskorn                   " + "Gewicht, kg               " + "Gewicht, t                " + "Länge, m                  " + "Länge, km");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		
		for (i = 0; i < reiskorn.length - 1; i++) {
			reiskorn[i] = Math.pow(2, i);
			summe = summe + reiskorn[i];
			gewicht_kg[i] = reiskorn[i] / 100 * 5 / 1000;
			summe_gewicht_kg = summe_gewicht_kg + gewicht_kg[i];
			gewicht_t[i] = gewicht_kg[i] / 1000;
			summe_gewicht_t = summe_gewicht_t + gewicht_t[i];
			laenge_m[i] =  gewicht_t[i] / 100 * 20;
			summe_laenge_m = summe_laenge_m + laenge_m[i];
			laenge_km[i] = laenge_m[i] / 1000;
			summe_laenge_km = summe_laenge_km + laenge_km[i];
			System.out.print(dff.format(i + 1) + "      " + df.format(reiskorn[i]) + "      " + df_koma.format(gewicht_kg[i]) + "   " + df_koma.format(gewicht_t[i]) + "   " + df_koma.format(laenge_m[i]) + "   " + df_koma.format(laenge_km[i]));
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Summe   " + df.format(summe) + "      " + df_koma.format(summe_gewicht_kg) + "   " + df_koma.format(summe_gewicht_t) + "   " + df_koma.format(summe_laenge_m) + "   " + df_koma.format(summe_laenge_km));
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
	}

}
