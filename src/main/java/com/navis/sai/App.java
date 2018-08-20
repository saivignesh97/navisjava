package com.navis.sai;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App{
public static void main(String[] args)
        {


        int n=10,max=0,i,temp;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<n;i++)
        {
        temp=sc.nextInt();
        if(temp>max)
        {
        max=temp;
        }
        }
        System.out.println(max);
        }}



