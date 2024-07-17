package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nomeUsuario = scanner.next();

        System.out.println("Olá, " + nomeUsuario + "!");
        System.out.println("Tudo bem?");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("estudos:");

        int soma = 10 + 5;
        int subtacao = 10 - 5;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtacao);

    }
}