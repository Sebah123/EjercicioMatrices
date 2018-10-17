
package Matrices;

import java.util.Scanner;


public class SumaMatrices {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int mat1[][] = new int[50][50];
        int mat2[][] = new int[50][50];
        int res[][] = new int[50][50];
        int limite,i,j;
        
        System.out.println("Ingrese el tamaño de la Primera matriz a sumar:");
        limite = lector.nextInt();
        
        System.out.println("Ingrese elementos de la Primera matriz:");
        for(i=0;i<limite;i++){
            for(j=0;j<limite;j++){
                System.out.println("Columna"+(i+1)+"Fila"+(j+1)+" = ");
                mat1[i][j]= lector.nextInt();
            }
        }
        
        System.out.println("Ingrese el tamaño de la Segunda matriz a sumar:");
        limite = lector.nextInt();
        for(i=0;i<limite;i++){
            for(j=0;j<limite;j++){
                System.out.println("Columna["+(i+1)+"]Fila["+(j+1)+"] = ");
                mat2[i][j]= lector.nextInt();
            }
        }
        
        System.out.println("La suma de las dos matrices es :");
        for(i=0;i<limite;i++){
            for(j=0;j<limite;j++){
                res[i][j] = mat1[i][j] + mat2[i][j];
                
            }
        
            
        }
        for(i=0;i<limite;i++){
            for(j=0;j<limite;j++){
                System.out.print(res[i][j] + " ");
            }
                System.out.println("");
        }
        
        
    }
    
}
