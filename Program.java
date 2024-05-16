/*

Fazer um programa para ler um número inteiro N e uma matriz de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e 
a quantidade de valores negativos da raiz. 

*/

import java.util.Scanner;
import java.util.Locale;

public class Program{
  public static void main(String[] args){
    Locale.setLocation(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int [][] mat = new int [n][n];

    for(i = 0; i < n; i++){
      for(j = 0; j < n; j++{
        mat [i][j] = sc.nextInt();
      }
    }

    System.out.printf("Main diagonal: ");
    for(int i = 0; i<n; i++){
      System.out.print(mat[i][i]);
      /*a lógica funciona da seguinte maneira, como a diagonal da matriz ocasionalmente eram posições cujo qual números são iguais, imprimindo as posições dele, da a diagonal perfeita*/
    }
    System.out.println();

    int count = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j<n; j++{
        if(mat[i][j] < 0){
          count++;
        }
      }
    }

    System.out.print("Negative numbers: " + count);
    
    sc.close();
  }
}
