/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemsolving;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Candies_cc {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int t;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0)
        {
            int n;
            n=sc.nextInt();
            int size=n*2;
            int[] arr=new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int i,s=0,m=0;
            /*while(i!=size)
            {
                if(arr[i]==arr[i+1])
                {
                    s++;
                    if(s>m)
                    {
                        m=s;
                    }
                }
                else
                {
                    s=0;
                }
                i++;
            }*/
        for( i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                    s++;
                if(s>m)
                    m=s;
            }}
            if(m+1>2)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
            t--;
        }
    }
}
