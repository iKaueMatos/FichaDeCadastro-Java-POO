package JavaFicha;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaFIcha<leitura> {
    public static void main(String[] args) {
    String nome;
    int idade;

    char sexo;

    float altura;

    float peso;



//Objetos
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();

        System.out.println("Digite sua idade: ");
        idade = leitura.nextInt();

        System.out.println("Digite sua altura: ");
        altura = leitura.nextFloat();

        System.out.println("Digite seu peso: ");
        peso = leitura.nextFloat();

        System.out.println("Digite seu sexo: ");

        // try 1 tratamento de erros sexo;
        //2 try tratamento de erros
      try {
          sexo = (char) System.in.read();
          Pessoa pessoaDadosFicha = new Pessoa(nome,peso,sexo,altura,idade);
          pessoaDadosFicha.imprimirDados();

      } catch(IOException ex) {
          Logger.getLogger(JavaFIcha.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
}
