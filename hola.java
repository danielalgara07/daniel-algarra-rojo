//pedir 10  ueros y hacer la media de los positivos y los negativos
import java.util.Scanner;
public class Ejercicio14 {
	
	public static void main (String[] args) {
		/*
		Scanner n1=new Scanner(System.in);
		System.out.println("dime 10 numeros");
		int numero1=n1.nextInt(),numero2=n1.nextInt(),numero3=n1.nextInt(), numero4=n1.nextInt();
		int numero5=n1.nextInt(), numero6=n1.nextInt(),numero7=n1.nextInt(), numero8=n1.nextInt();
		int numero9=n1.nextInt(),numero10=n1.nextInt();
		int num1=0 , num2=0 , N=0 , N1=0;
		if (numero1<0){
			num1=numero1;
			N=1;
		}else{
			num2=numero1;
			N1=1;
		}
		
		if (numero2<0){
			num1=num1+numero2;
			N=N+1;
		}else{
			num2=num2+numero2;
			N1=N1+1;
		}
		
		if (numero3<0){
			num1=num1+numero3;
			N=N+1;
		}else{
			num2=num2+numero3;
			N1=N1+1;
		}
		
		if (numero4<0){
			num1=num1+numero4;
			N=N+1;
		}else{
			num2=num2+numero4;
			N1=N1+1;
		}
		
		if (numero5<0){
			num1=num1+numero5;
			N=N+1;
		}else{
			num2=num2+numero5;
			N1=N1+1;
		}
		
		if (numero6<0){
			num1=num1+numero6;
			N=N+1;
		}else{
			num2=num2+numero6;
			N1=N1+1;
		}
		
		if (numero7<0){
			num1=num1+numero7;
			N=N+1;
		}else{
			num2=num2+numero7;
			N1=N1+1;
		}
		
		if (numero8<0){
			num1=num1+numero8;
			N=N+1;
		}else{
			num2=num2+numero8;
			N1=N1+1;
		}
		
		if (numero9<0){
			num1=num1+numero9;
			N=N+1;
		}else{
			num2=num2+numero9;
			N1=N1+1;
		}
		
		if (numero10<0){
			num1=num1+numero10;
			N=N+1;
		}else{
			num2=num2+numero10;
			N1=N1+1;
		}
		
		System.out.println("la media de positivos es: "+num2/N1);
		System.out.println("la media de negativos es: "+num1/N);
		*/
		int contadorpositivos=0,contadornegativos=0,contadorceros=0 ,positivos=0 ,negativos=0;
		Scanner n1=new Scanner(System.in);
		for (int i=1;i<=10;i++){
			System.out.print("dime un numero ");
			int numero=n1.nextInt();
			if (numero>0){
				positivos+=numero;
				contadorpositivos++;
			}else{
				if(numero<0){
					negativos+=numero;
					contadornegativos++;
				}else{
					contadorceros++;
				}
			}
		}
		System.out.println("la media de los numeros positivos es: "+positivos/contadorpositivos);
		System.out.println("la media de los numeros negativos es: "+negativos/contadornegativos);
		System.out.println("la suma de los ceros es: "+contadorceros);
	}
}

