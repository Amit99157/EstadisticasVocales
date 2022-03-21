package com.amit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        int a, e, j, o, u;
        a = 0;
        e = 0;
        j = 0;
        o = 0;
        u = 0;

        System.out.print("Escribe una frase: ");
        frase = entrada.nextLine();
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'a'){
                a++;
            } else if(frase.charAt(i) == 'e'){
                e++;
            } else if(frase.charAt(i) == 'i'){
                j++;
            } else if(frase.charAt(i) == 'o'){
                o++;
            } else if(frase.charAt(i) == 'u'){
                u++;
            } else;
        }

        System.out.println("Estadísticas:");
        System.out.println("- Número de a: "+a);
        System.out.println("- Número de e: "+e);
        System.out.println("- Número de i: "+j);
        System.out.println("- Número de o: "+o);
        System.out.println("- Número de u: "+u);
    }
}
