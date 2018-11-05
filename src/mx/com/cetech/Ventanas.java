package mx.com.cetech;

import javax.swing.JOptionPane;

public class Ventanas {

	public static void main(String[] args) 
	{
		/*String nombre = JOptionPane.showInputDialog("ESCRIBA SU NOMBRE");
		
		System.out.println("Bienvenido " + nombre);
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		
		//Ventana 2
		
		JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titutlo", JOptionPane.ERROR_MESSAGE, JOptionPane.ERROR_MESSAGE, null, new Object[]{"CANCELAR"}, "No Jalo");
	
		//Ventana 3
		
		JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titutlo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"OK"}, "OK2");
	
		//VENTANA 4
		
		int opcion = JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titutlo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI", "NO"}, "NO");
	
		//VENTANA 5
	
		System.out.println(opcion);*/
		
		//ULTIMA VENTANA
		
		JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titutlo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI", "NO", "CANCELAR"}, "SI");
	
	
	}

}
