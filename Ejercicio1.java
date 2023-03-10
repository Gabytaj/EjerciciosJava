package practica1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
	// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3
	// lados ingresados
// Revisar si es un triángulo válido
	static void areaTri(int a, int b, int c) {
		System.out.println("*******Ejercicio 1*********************************************************");
		System.out.println("Área de un triángulo, cuyas medidas son: " + a + ", " + b + ", " + c);
		// int cat=(int) (Math.sqrt((Math.pow(c, 2))+(Math.pow((b/2), 2)))) ;
		int cat = (int) (Math.sqrt(Math.pow(c, 2) - Math.pow((b / 2), 2)));
		// int cat=(int) (b/2) ;
		int area = (b * cat) / 2;
		System.out.println("El area es: " + area);
		System.out.println("**************************************************************************");
	}

// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
// Utilizar PI de la libreria de Java
	static void circuloAreaPerimetro(double rad) {
		System.out.println("********Ejercicio 2********************************************************");
		double area = Math.PI * Math.pow(rad, 2);
		double perim = Math.PI * rad * 2;
		System.out.println("El area es: " + area + "\nEl perimetro es: " + perim);
		System.out.println("**************************************************************************");
	}

// 3 Escribir un metodo que muestre por consola la hora del sistema
// Utilizar e investigar la libreria de Java
	static void hora() {
		System.out.println("********Ejercicio 3*************************************************************");
		String dateTime = DateTimeFormatter.ofPattern(" hh:mm:ss a").format(LocalDateTime.now());
		System.out.println("La Hora actual es: ");
		System.out.println(dateTime);
		System.out.println("**************************************************************************");
	}

// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
// ej 3600 = "1 hora = 60 min = 3600 seg"
	static void convertirSHM(int seg) {
		System.out.println("********Ejercicio 4***********************************************************");
		double hora = seg / 3600;
		double min = seg / 60;
		System.out.println(seg + " segundos son equivalentes a:\n" + min + " minutos\n" + hora + " hora(s)");
		System.out.println("**************************************************************************");
	}

// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	static void volumenEsfera(int rad) {
		System.out.println("*******Ejercicio 5*********************************************************");
		double volum = (Math.PI * Math.pow(rad, 3)) * 4 / 3;
		System.out.println("El volumen de la esfera cuyo radio es " + rad + " es: " + volum);
		System.out.println("**************************************************************************");
	}

// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	static void volumenCono(double rad, double alt) {
		System.out.println("*******Ejercicio 6********************************************************");
		double volumen = Math.PI * Math.pow(rad, 2) * alt / 3;
		System.out
				.println("El volumen del cono cuyo radio es " + rad + " y cuya altura es: " + alt + " es: " + volumen);
		System.out.println("**************************************************************************");
	}

// 7 Encontrar el area superficial de un cubo dado un lado a
	static void areaSupCubo(double lado) {
		System.out.println("********Ejercicio 7**********************************************************");
		double areaS = Math.pow(lado, 2) * 6;
		System.out.println("El área superficial del cubo cuyo lado mide " + lado + " es: " + areaS);
		System.out.println("**************************************************************************");
	}

// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	static void aBisiesto(int anio) {
		System.out.println("********Ejercicio 8*******************************************************");
		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
			System.out.println(anio + " Es año bisiesto");
		} else {
			System.out.println(anio + " No es año bisiesto");
		}
		System.out.println("**************************************************************************");
	}

	// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
	static void nPrimos() {
		System.out.println("********Ejercicio 9*******************************************************");
		int pn = 0;
		int cp=1;
		for ( int i = 2; cp <= 100; i++) {
			pn = 0;
			for (int j = 2; j <= i; j++) {
				if ((i != j) && (i % j == 0)) {
					pn++;
				}
			}
			if (pn < 1) {
				System.out.println(cp+" número primo: " + i);				
				if(cp<=100) {
					cp++;
				}
			}
		}
		System.out.println("**************************************************************************");
	}

	// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
	static void suma(int n1, int n2) {
		System.out.println("********Ejercicio 10*******************************************************");
		int sum=0;
		for(int i=0; i<n1; i++) {
			sum++;
		}
		for(int i=0; i<n2; i++) {
			sum++;
		}
		System.out.println("La suma de "+n1+"+"+n2+"="+sum);
		System.out.println("**************************************************************************");
	}
	
	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
	static void palind(int num) {
		System.out.println("********Ejercicio 11*******************************************************");
		if(num>9 && num<100) {
			char[] sNum=(Integer.toString(num)).toCharArray();
			if(sNum[0]==sNum[1]) {
				System.out.println(sNum+" es Palindromo"); 
			}else {
				
			}
		}else {
			System.out.println(num+" NO es un numero de dos digitos");
		}
		System.out.println("**************************************************************************");
	}
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	static void sumaSLoop() {
		System.out.println("********Ejercicio 12*******************************************************");
		
		
		//		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
//			System.out.println(anio + " Es año bisiesto");
//		} else {
//			System.out.println(anio + " No es año bisiesto");
//		}
		System.out.println("**************************************************************************");
	}
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	static void quitarEspacios() {
		System.out.println("********Ejercicio 13*******************************************************");
		
		
		//		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
//			System.out.println(anio + " Es año bisiesto");
//		} else {
//			System.out.println(anio + " No es año bisiesto");
//		}
		System.out.println("**************************************************************************");
	}
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	static void invertirString(int n1, int n2) {
		System.out.println("********Ejercicio 14*******************************************************");
		
		
		//		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
//			System.out.println(anio + " Es año bisiesto");
//		} else {
//			System.out.println(anio + " No es año bisiesto");
//		}
		System.out.println("**************************************************************************");
	}
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
	static void factorialSLoop(int n1, int n2) {
		System.out.println("********Ejercicio 15*******************************************************");
		
		
		//		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
//			System.out.println(anio + " Es año bisiesto");
//		} else {
//			System.out.println(anio + " No es año bisiesto");
//		}
		System.out.println("**************************************************************************");
	}
	static void primerMetodo() {
		System.out.println("Mensaje de metodo");
	}

	public static void main(String[] args) {
//		areaTri(10, 16, 10);
//		circuloAreaPerimetro(6);
//		hora();
//		convertirSHM(3600);
//		volumenEsfera(5);
//		volumenCono(8, 18);
//		areaSupCubo(5);
//		aBisiesto(2023);
//		aBisiesto(2088);
//		nPrimos();
//		suma(22, 5);
		palind(20);
		// TODO Auto-generated method stub

	}

}
