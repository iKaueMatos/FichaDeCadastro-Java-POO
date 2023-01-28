package JavaFicha;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaFIcha<leitura> {
    public static void main(String[] args) {
    String nome = null;
    int idade = 0;

    char sexo = 0;

    float altura = 0;

    float peso = 0;


      try {
          Pessoa pessoaDadosFicha = new Pessoa(nome,peso,sexo,altura,idade);

          Scanner leitura = new Scanner(System.in);

          System.out.println("Digite seu nome: ");
          nome = leitura.nextLine();
          pessoaDadosFicha.setNome(nome); // Metodos com tratamento de erros

          System.out.println("Digite sua idade: ");
          idade = leitura.nextInt();
          pessoaDadosFicha.setIdade(idade);
          System.out.println("Digite sua altura: ");
          altura = leitura.nextFloat();
          pessoaDadosFicha.setAltura(altura);  //Metodos com tratamento de erros

          System.out.println("Digite seu peso: ");
          peso = leitura.nextFloat();
          pessoaDadosFicha.setPeso(peso); // Metodos com tratamento de erros

          System.out.println("Digite seu sexo: ");
          pessoaDadosFicha.setSexo(sexo);
          pessoaDadosFicha.imprimirDados(); //Metodos com tratamento de erros

          sexo = (char) System.in.read();

          pessoaDadosFicha.imprimirDados();


          //Chamando  tratamento de erros!!
      } catch(IOException ex) {
          Logger.getLogger(JavaFIcha.class.getName()).log(Level.SEVERE, null, ex);
      }catch (IllegalArgumentException ex){
          System.out.println(ex.getMessage());
      }
    }
}
