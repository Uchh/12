package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число для вычисления n=");
        int n = s.nextInt();
        int [] j = new int[100];
        j[0]=1;
        j[1]=1;
        if (n==1||n==2){
            System.out.print(1);
        }else{
            for (int i =2; i<n; i++){
                j[i]=j[i-1]+j[i-2];
                System.out.println("Значение:"+j[i]+" Иттерация №"+(i-1));
            }}
    }
}