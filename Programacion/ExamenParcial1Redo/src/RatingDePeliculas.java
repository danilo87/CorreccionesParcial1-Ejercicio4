import java.util.Scanner;
public class RatingDePeliculas {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner text = new Scanner (System.in);

System.out.println("Rating de Pelicula");
//ingresamos el nombre de la pelicula para que de esta manera demos rating e imprima
System.out.println("Ingresar Nombre De Pelicula:");
String nombre = text.next();

System.out.println("Ingresar Rating: ");
int rating = text.nextInt();
if(rating ==1)
{
System.out.println ("Pesima");	
}
else if (rating ==2)
{
System.out.println ("Mala");	
}
else if (rating ==3)
{
System.out.println ("Regular");	
}
else if (rating ==4)
{
System.out.println ("Buena");	
}
else if (rating ==5)
{
System.out.println ("Excelente");	
}


}

}