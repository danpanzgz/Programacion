package UD1;

import entrada.Teclado;

public class Actividad3x03 {
	public static void main(String[] args) {

		int horas = Teclado.leerEntero("Horas?: ");
		boolean vhoras = (horas >= 0 && horas <= 23);

		int minutos = Teclado.leerEntero("Minutos?: ");
		boolean vminutos = (minutos >= 0 && minutos <= 59);

		int segundos = Teclado.leerEntero("Segundos?: ");
		boolean vsegundos = (segundos >= 0 && segundos <= 59);

		if (!vhoras) {
			System.out.println("Las horas deben estar comprendidas entre 0 y 23.\r\n");
		}

		if (!vminutos) {
			System.out.println("Los minutos deben estar comprendidos entre 0 y 59.\r\n");
		}

		if (!vsegundos) {
			System.out.println("Los segundos deben estar comprendidos entre 0 y 59.\r\n");
		}

		if (vhoras && vminutos && vsegundos) {
			int hc = horas;
			int mc = minutos;
			int sc = segundos;

			sc++;
			if (sc == 60) {
				sc = 0;
				mc++;
				if (mc == 60) {
					mc = 0;
					hc++;
					if (hc == 24) {
						hc = 0;
						System.out.println(horas + "h " + minutos + "m " + segundos + "s + 1s =" + " 1 dia " + hc + "h "
								+ mc + "m " + sc + "s");
					}
				}
			} else {
				System.out.println(
						horas + "h " + minutos + "m " + segundos + "s + 1s = " + hc + "h " + mc + "m " + sc + "s");

			}

		}
	}

}
