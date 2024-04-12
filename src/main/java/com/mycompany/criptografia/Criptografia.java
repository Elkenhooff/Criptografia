package com.mycompany.criptografia;
import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        System.out.println("Insira o texto a ser criptografado");
        String frase = input.nextLine();
        char[] frasecriptografada = new char[frase.length()];
        
        for (int i = 0; i < frasecriptografada.length; i++){
            frasecriptografada[i] = frase.charAt(i);
            
            
        }
        
        for (char letra : frasecriptografada){
            System.out.print(letra);
        }
    }        
}
