import java.util.Scanner;
public class Tema4 {
    //Función comprobarNum
    public static void comprobarNum(int num){
        if(num > 0) System.out.println("La variable es un numero positivo");
        else if (num == 0) System.out.println("La variable es el numero 0");
        else System.out.println("La variable es un numero negativo");
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int numeroIf = cin.nextInt();

        //Función comprobar número (sentencias If-Else)
        comprobarNum(numeroIf);

        //Bucle While
        int numeroWhile = cin.nextInt();
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Bucle Do-While
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile != numeroWhile);

        //Bucle for
        for(int i = 0; i<=3 ; i++) System.out.println(i);

        //capturamos el salto de linea del Scanner
        cin.nextLine();

        //Bloque Switch-case
        String estacion = cin.nextLine();
        switch(estacion){
            case "Primavera":
                System.out.println("estamos en Pimavera");
                break;
            case "Verano":
                System.out.println("estamos en Verano");
                break;
            case "Otoño":
                System.out.println("estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("estamos en Invierno");
                break;
            default:
                throw new IllegalStateException("Se espera una estación como input: " + estacion);
        }

    }
}
