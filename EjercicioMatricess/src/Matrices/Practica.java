
package Matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Practica {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int m[][],nFilas,nCol;
        
        System.out.println("");
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas:"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas:"));
        
        m = new int [nFilas][nCol];
        
        System.out.println("Digite la matriz:");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print("Matriz ["+i+"]["+j+"]:");
                m[i][j] = entrada.nextInt();
            }
        
        }
        System.out.println("\nLa matriz es:");
        for (int i=0;i<nFilas;i++){//numero de filas
            for (int j=0;j<nCol;j++){//numero de columnas
                System.out.print(m[i][j]+"  ");
            }
                System.out.println("");
            
    }
    
}
}