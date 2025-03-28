package UD1;

import entrada.Teclado;

public class Actividad2x09 {

	public static void main(String[] args) {
		int salario = 0;

		int turno = Teclado.leerEntero("Turno de Trabajo (1-diurno 2-vespertino): \n");
		boolean turnoValido = (turno == 1 || turno == 2);

		int horasOrdinarias = Teclado.leerEntero("Numero de horas ordinarias?: \n");
		boolean horas = (horasOrdinarias >= 40 || horasOrdinarias <= 20);

		int horasExtraordinarias = Teclado.leerEntero("Numero de horas extraordinarias?: \n");
		boolean horasExtra = (horasExtraordinarias >= 5 || horasExtraordinarias <= 0);

		if (!turnoValido) {
			System.out.println("El turno de trabajo debe estar comprendido entre 1 y 2.");
		}

		if (!horas) {
			System.out.println("El número de horas ordinarias debe estar comprendido entre 20 y 40.");
		}
		
		if (!horasExtra) {
			System.out.println("El número de horas extraordinarias debe estar comprendido entre 0 y 5.");
		}

		if (turnoValido && horas && horasExtra) {
			
			if (turno == 1) {
				horasOrdinarias *= 5;
				horasExtraordinarias *= 7;

			} else {
				horasOrdinarias *= 8;
				horasExtraordinarias *= 11;
			}

			salario = horasExtraordinarias + horasOrdinarias;
			System.out.println("Salario Semanal: " + salario);
		}

	}
}
