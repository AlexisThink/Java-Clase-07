package mx.com.cetech;

public class TemaStatic {

	public static void main(String[] args) 
	{
		
		//NO SE DEBE INSTANCIAR UN OBJETO
		
		/*
		 * SI DELCARMAOS LA VRIABLE RESULTADO FUERA DEL METODO
		 * ENTONCES TENEMOS QU DECLARAR ESTA VARIABLE ESTATICA
		 * DEBIDO  QUE UN METODO ESTATICO SOLO PUEDE ACCEDER A VARIBLES
		 * ESTATICAS, DE LO CONTRARIO EL COMPILADOR MARCARA ERROR DE ESA
		 * VARIABLE O METODO QUE NO PUEDE HACER REFERENCIA.
		 */
		
		
		Operacion obtener = new Operacion();
		
		/*
		 * UN METODO ESTATICO SE PUEDE ACCEDER SIN LA NECESIDAD DE REALIZZAR
		 * UNA INSTANCIA DE LA CLASE
		 * 
		 * 
		 */
		Operacion.suma(26, 21);
		System.out.println(Operacion.resultado);
		

	}

}
