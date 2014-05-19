import java.util.Scanner;


public class CadenaDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner text = new Scanner(System.in);
		System.out.println("Cadena De Texto");
		
		//Comenzamos por dictar cuantas repeticiones queremos
		System.out.println("Ingresar un Numero");
		
		int w;
		w= text.nextInt();
		
		//Dictamos el texto que se estara repitiendo
		System.out.println("Ingresar una Cadena de Texto");
		
		String a;
		a= text.next();
		
		//Dictamos el ciclo con las condiciones.
		int x=0;
		while (x<w)
		{
		System.out.println(a);
		x++;
		}
	}

}
