/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemsolving;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class OddPair_cc {
    
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0)
        {
            long a;
            a=sc.nextInt();
            if(a%2==0)
            {
                System.out.println(a*(a/2));
            }
            else
            {
                System.out.println((a-1)*(a/2+1));
            }
        }
        
    }
    
}
