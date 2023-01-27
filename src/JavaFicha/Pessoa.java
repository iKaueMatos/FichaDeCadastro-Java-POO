package JavaFicha;

public class Pessoa {
    private String nome;  //O nome tem que ser maior ou igual a 6
    private int idade;
    private float altura;
    private float peso;
    private char sexo;

///Todos os metodos set São publicos porque não vao retornar nada!!
    public void setNome(String nome){
        if(nome.length() < 6 || nome.length() > 30){
            throw  new IllegalArgumentException("Nome invalido.Minimo 6 caracteres o maximo 30 caracteres");
        }else{
            this.nome = nome;
        }

    }

    public void setIdade(int idade){
        if(idade <= 0 || idade >= 100){
            throw new IllegalArgumentException("Idade invalida.Digite uma idade valida");
        }else{
            this.idade = idade;
        }

    }

    public void setPeso(float peso){

    }

    public void setAltura(float altura){

    }

    public void setSexo(){

    }


    //Get retornando informações
    public String getNome(){
        return this.nome;
    }


    public int getIdade(){
        return this.idade;
    }

    public float getAltura(){
        return this.altura;
    }

    public float getPeso(){
        return this.peso;
    }

    public char getSexo(){
            return this.sexo;
    }



}
