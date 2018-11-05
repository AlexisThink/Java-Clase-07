package mx.com.cetech;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TemaDate {

	public static void main(String[] args) 
	{
		/*Date fecha;

			//QUEREMOS SACAR LA FECHA DEL SISITEMA 
		
		fecha = new Date();
		
		System.out.println(fecha);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String fechaformato = sdf.format(fecha);
		
		System.out.println(fechaformato);
		
		
		//METODOS DE LA CLASE DATE
		
		System.out.println(fecha.getYear());
		System.out.println(fecha.getMonth());
		System.out.println(fecha.getDay());
		*/
		
		Scanner entradaUsuario = new Scanner(System.in);
		
		int diaUsuario, mesUsuario, añoUsuario;
		int diaSistema, mesSistema, añoSistema;
		int diferencia;
		
		int edadFinal;
		
		Date fecha;
		fecha = new Date();
		
		//PREGUNTA AL USUARIO DE LA EDAD
		
		System.out.println("¿En que año nacio? (AAAA)");
		añoUsuario = entradaUsuario.nextInt();
		
		System.out.println("¿En que mes nacio? (MM)");
		mesUsuario = entradaUsuario.nextInt();
		
		System.out.println("¿En que dia nacio? (DD)");
		mesUsuario = entradaUsuario.nextInt();
		
		//OBTENCION DE LA FECHA
		añoSistema = fecha.getYear();
		mesSistema = fecha.getMonth();
		diaSistema = fecha.getDay();
		
		//Suma de 1900 al año
		diferencia = 1900;
		
		añoSistema = añoSistema + diferencia;
		
		//Mensaje Final
		edadFinal = añoSistema - añoUsuario;
		System.out.println("Su edad es: " + edadFinal);
		
		
	}

}
