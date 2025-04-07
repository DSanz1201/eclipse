import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalDateTime {

	public static void main(String[] args) {
		// Obtener la fecha y hora actual
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Fecha y hora actual: " + ahora);

		// Obtener una fecha y hora específica
		LocalDateTime fechaHoraEspecifica = LocalDateTime.of(2025, 3, 21, 15, 30, 0);
		System.out.println("Fecha y hora específica: " + fechaHoraEspecifica);

		// Sumar 5 días y 3 horas a la fecha y hora actual
		LocalDateTime nuevaFechaHora = ahora.plusDays(5).plusHours(3);
		System.out.println("Fecha y hora después de 5 días y 3 horas: " + nuevaFechaHora);

		// Restar 2 horas a la fecha y hora específica
		LocalDateTime fechaRestada = fechaHoraEspecifica.minusHours(2);
		System.out.println("Fecha y hora después de restar 2 horas: " + fechaRestada);

		// Formatear la fecha y hora en un formato específico
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String fechaFormateada = ahora.format(formatter);
		System.out.println("Fecha y hora formateada: " + fechaFormateada);

		// Obtener el año, mes, día, hora, minuto y segundo individualmente
		int año = ahora.getYear();
		int mes = ahora.getMonthValue();
		int dia = ahora.getDayOfMonth();
		int hora = ahora.getHour();
		int minuto = ahora.getMinute();
		int segundo = ahora.getSecond();

		System.out.println("Año: " + año);
		System.out.println("Mes: " + mes);
		System.out.println("Día: " + dia);
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);

		// Modificar la fecha y hora (ajustar)
		LocalDateTime nuevaFecha = ahora.withYear(2026).withMonth(5).withDayOfMonth(15);
		System.out.println("Nueva fecha (con año, mes y día modificados): " + nuevaFecha);

		// Sumar o restar tiempo (días, horas, etc.)
		LocalDateTime masTiempo = ahora.plusDays(10).plusHours(3).plusMinutes(45);
		System.out.println("Fecha y hora después de sumar 10 días, 3 horas y 45 minutos: " + masTiempo);

		LocalDateTime menosTiempo = ahora.minusWeeks(2).minusDays(3);
		System.out.println("Fecha y hora después de restar 2 semanas y 3 días: " + menosTiempo);

		// Obtener la diferencia entre dos fechas (en unidades de tiempo específicas)
		long diasDiferencia = ChronoUnit.DAYS.between(menosTiempo, ahora);
		System.out.println("Diferencia en días entre las fechas: " + diasDiferencia);

		long horasDiferencia = ChronoUnit.HOURS.between(menosTiempo, ahora);
		System.out.println("Diferencia en horas entre las fechas: " + horasDiferencia);

		// Comprobar si una fecha es antes o después que otra
		LocalDateTime fechaFutura = ahora.plusDays(5);
		if (ahora.isBefore(fechaFutura)) {
			System.out.println("La fecha actual es antes de la fecha futura.");
		}

		// Formatear la fecha y hora en un formato específico
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String fechaFormateada1 = ahora.format(formatter1);
		System.out.println("Fecha y hora formateada: " + fechaFormateada1);

		// Obtener la fecha sin la parte de la hora
		LocalDateTime soloFecha = ahora.toLocalDate().atStartOfDay();
		System.out.println("Solo la fecha, con la hora ajustada a medianoche: " + soloFecha);

		// Verificar si el año es bisiesto
		boolean esBisiesto = ahora.toLocalDate().isLeapYear();
		System.out.println("¿Es el año bisiesto? " + esBisiesto);
	}

}