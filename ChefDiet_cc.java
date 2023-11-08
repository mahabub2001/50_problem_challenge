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
public class ChefDiet_cc {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0)
        {
             int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0,x=0;
        int p = 0;
        boolean flag=true;
        for(i=0;i<n;i++)
        {
            if(arr[i]+x>=k)
            {
                //flag=1;
                x+=arr[i]-k;
            }
            else
            {
                flag=false;
                p=i;
                break;
            }
            //i++;
        }
        if(flag==true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.print("NO");
            System.out.println(" "+(p+1));
        }
        t--;
        }
       
    }
}
