import java.util.ArrayList;
import java.util.Iterator;

public class TemaArrayList {

	public static void main(String[] args) 
	{
		
		/*LA CLASE ARRAY LIST EN JAVA NOS PERMITE ALMACENAR DATOS
		*EN MEMORIA DE MANERA SIMILAR A LOS ARRAY COMUNES CON LA VENTAJA
		*QUE EL NUMERO DE DATOS QUE ALMACENA LO HACE DEFORMA DINAMICA,
		*ES DECIR: NOS PERMITE AÑADIR, ELIMINAR O MODIFICAR ELEMENTOS
		*QUE PUEDEN SER DE CUALQUIER TIPO DE ELEMENTO U OBJETO
		*/
		
		ArrayList datos = new ArrayList();
		
		datos.add(6);
		datos.add("Alexis");
		datos.add(true);
		datos.add('@');
		
		// FOR EADGE
		for(Object item: datos){
			System.out.println(item);	
		}
			System.out.println(datos.get(1));

		
		// RECORRER 
		int i;
		
		for (i=0; i>=datos.size(); i++){
			System.out.println(datos.get(i));
			System.out.println("***");
		}
		
		// ARRAYLIST DE UN TIPO DE DATO
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Alexis");
		nombres.add("Mario");
		nombres.add("Patricia");
		nombres.add("Miguel");
		nombres.add("Pablo");
		nombres.add("Juana");
		
		//FOR EDGE QUE SI FUNCIONA 
		
		for(String conseguir: nombres){
			System.out.println(conseguir);	
		}
			System.out.println(nombres.get(1));
		
			/*
			 * UNA VEZ QUE TENEMOS NUESTRAS LISTAS, NOS BASTARA CON
			 * UTIIZAR LA CLASE ITERATOR .
			 * 
			 * PARA OBTNER UN PUNTERO QUE NOS REFERENCIE A LOS ELEMENTOS
			 * LA LISTA. EN ESTE PUNTO TENDREMOS QUE TENER EN CUENTA 
			 * 
			 * QUE EL METODO. HASNEXT NOS DICE SI HAY MAS ELEMENTOS Y EL
			 * METODO NEXT NOS PERMITE MOVERNOS AL SIGUIENTE ELEMENTO 
			 */
		
			//ITERATOR 
			
			Iterator iter = nombres.iterator();
			while(iter.hasNext()){
				
				System.out.println(iter.next());
			}
		
			//AÑADE UN ELEMENTO AL ARRAYLIST EN CUALQUIER POSICION
			
			nombres.add(3, "Nuevo Elemento");
			
			for(String conseguir: nombres){
				System.out.println(conseguir);
				System.out.println("******");
			}
			
			//DEVUELVE EL TAMAÑO DEL ARRAYLIST
			System.out.println(nombres.size());
			
			//DEVUELVE EL NUMERO QUE ESTA EN LA N POSICION DEL ARRAYLIST
			
			System.out.println(nombres.get(1));
			
			//COMPRUEB SI EXISTE EL ELEMENTO QUE SE LE PASA EN EL PARAMETRO
			
			System.out.println(nombres.contains("Alexis"));
			
			//DEVUELVE LA POSICIO DE LA PRIMERA OCURRENIA 
			
			System.out.println(nombres.indexOf("Miguel"));
			System.out.println(nombres.indexOf("Juana"));
			
			//DEVUELVE LA POSICION DE LA ULTIMA OCURRENCIA
			
			System.out.println(nombres.lastIndexOf("Miguel"));
			
			//BORRA EL ELEMENTO 
			
			System.out.println(nombres.remove("Juana"));
			
			for(String conseguir: nombres){
				System.out.println(conseguir);
				System.out.println("******");
			}
			
			
			//BORRA TODOS LOS ELEMNTOS DEL CLEAR
			
			nombres.clear();
			
			System.out.println(nombres.isEmpty());
			
			while(iter.hasNext()){
				
				System.out.println(iter.next());
			}
	}
	

}
