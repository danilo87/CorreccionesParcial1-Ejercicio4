import java.util.Scanner;


public class PreguntaVoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//en cada una de las preguntas declaro la variable correspondiente asi mismo el valor de cada pregunta con su respuesta correcta en caso de no responder correctamente.
		//doy credito a FabianTr13, por su aporte con la completacion de las respuestas en strings, "if(xx.equals("yy"));!
		Scanner text = new Scanner (System.in);
		int Puntaje=0;
		System.out.println("Quiz: Cultura General");
		
		System.out.println("Pregunta 1: Gojira es Japones para?");
	    
		String gojira;
	    gojira=text.next();
	    
	   if(gojira.equals("Godzilla"))
	   {
	       Puntaje=Puntaje+20;
	       System.out.println("Correcto: Eres un conocedor de los Kaiju!");
	   }
	   else
	   {
	    System.out.println("Incorrecto: Godzilla, te falta mucho por vivir.");
	   }
	   
	   System.out.println("Pregunta 2: Que compania compro recientemente a Nokia?");
	    
		String nokia;
	    nokia=text.next();
	    
	   if(nokia.equals("Microsoft"))
	   {
	       Puntaje=Puntaje+20;
	       System.out.println("Correcto: Bill Gates estaria orgulloso!");
	   }
	   else
	   {
	    System.out.println("Incorrecto: Microsoft, estas desactualizado!");
	   }
	   						
		System.out.println("Pregunta 3: Cuantos planetas tiene el Sistema Solar?");
	    int planeta;
		planeta=text.nextInt();
	    if(planeta==8)
	    {
	    	Puntaje=Puntaje+20;
	        System.out.println("Correcto: Tienes el conocimiento para ser Astronauta!");
	    }
	    else
	    {
	    	System.out.println("Incorrecto: el Sistema Solar tiene 8 planetas!");
	    }
	    
	    System.out.println("Pregunta 4: Cuantos departamentos tiene Honduras");
	    int departamentos;
		departamentos=text.nextInt();
	    if(departamentos==18)
	    {
	    	Puntaje=Puntaje+20;
	        System.out.println("Correcto: Conoces tu pais!");
	    }
	    else
	    {
	    	System.out.println("Incorrecto: Tiene 18 departamaneto, deberias de estar avergonzado!");
	    }
	    
	    System.out.println("Pregunta 5: Cual es la sede de la Copa Mundial de Futbol 2014?");
	    String mundial;
		mundial=text.next();
	    if(mundial.equals("Brazil"))
	    {
	    	Puntaje=Puntaje+20;
	        System.out.println("Correcto: Conoces de futbol!");
	    }
	    else
	    {
	    	System.out.println("Incorrecto: Brazil, tu falta de conocimiento es atemorizante!");
    }
	    System.out.print("Puntaje Final: "+Puntaje);
	
	}
}
