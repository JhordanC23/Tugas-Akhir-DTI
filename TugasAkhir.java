/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.akhir;

/**
 *
 * @author Lenovo
 */
public class TugasAkhir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        for(int i=1;i<=n;i++) 
        {
           for(int j=1;j<=n;j++)
           {
               if (i==1||i==n||j==1||j==n)
                    System.out.print("* ");
               else 
                   System.out.print("  ");
               
           }
           System.out.print(" ");
           for (int j=1;j<=2;j++)
           {
               if (j==1)
                   System.out.print("* ");
               if (j==2)
                   System.out.print(" ");
           }
           for (int j=1;j<=n;j++)
           {
               if (i==1||i==5||j==5)
                   System.out.print("* ");
               else
                   System.out.print("  ");
           }
   
            System.out.println(" ");
        }
       

    
        
        }
    
}
