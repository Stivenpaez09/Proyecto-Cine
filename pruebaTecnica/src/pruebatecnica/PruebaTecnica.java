
package pruebatecnica;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PruebaTecnica {

    public static void main(String[] args) {
        String cancelar="";
        String rta="";
        String map[][]= new String[10][10];
        Scanner teclado= new Scanner(System.in);
        for(int f=0; f<10; f++){
            for(int c=0; c<10; c++){
                map[f][c]="L";
            }
        }
        
        
        
        while (!"salir".equalsIgnoreCase(cancelar)) {
            int fila = 0;
            int columna = 0;
            System.out.println("¿Desea ver los asientos? S o cualquier otra letra no");
            rta=teclado.next();
            if ("s".equalsIgnoreCase(rta)){
                System.out.println("Estos son los asientas de la sala en este momento, tenga en cuenta que las sillas que tienen una L son las que se pueden escoger, si escoge la que tiene la letra X no se cmpletara la transaccion ");
                System.out.println(""); //salto de linea
                dibujarMapa(map);
                System.out.println(""); //salto de linea
            }
            
            System.out.println("Ingrese la fila que desea en el teatro: ");
            fila = teclado.nextInt();
            System.out.println("Ingrese la columna que desea en el teatro: ");
            columna = teclado.nextInt();
            if (fila <= 10 && fila >= 0) {
                if (columna <= 10 && columna >= 0) {
                    if ("L".equalsIgnoreCase(map[fila][columna])) {
                        map[fila][columna] = "X";
                        System.out.println("Su asiento ha sido escogido con exito!");
                    } else {
                        System.out.println("El asiento no puede ser escogido porque ya esta asignado");
                    }

                } else {
                    System.out.println("Esa columna NO existe");
                }
            } else {
                System.out.println("Esa fila NO existe");
            }

            System.out.println("¿Desea continuar eligiendo asientos? si desea salir del programa escriba a continuacion la palabra 'salir'");
            cancelar = teclado.next();
        }

    }
    
    static void dibujarMapa(String map[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f+" ");
            for (int c = 0; c < 10; c++) {
                System.out.print(" ["+map[f][c]+"]");
                
            }
            System.out.println();
        }
    }

}
