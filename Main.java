package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
         float a = 48;
         float b = 7;
         float c = 2;
         float d = 24;
         float e = 18;
         float f = 5;
         float g = 2;
         float h = 12;
         float result1;
         float result2;

        int i = 48;
        int j = 7;
        int k = 2;
        int l = 24;
        int m = 18;
        int n = 5;
        int o = 2;
        int p = 12;
        int result3;
        int result4;

        result1 = a-b%c/d*e-f*g+h;
        System.out.println(result1);
        result3 = i-j%k/l*m-n*o+p;
        System.out.println(result3);
        result2 = ((a-(b%c))/d)*((e-f*g)+h);
        System.out.println(result2);
        result4 = ((i-(j%k))/l)*((m-n*o)+p);
        System.out.println(result4);

    }
}
