package JavaFicha;

public class Pessoa {
    String nome;  //O nome tem que ser maior ou gual a 6
    int idade;
    float altura;
    float peso;

    char sexo;

    //Construtor
    Pessoa(String nome, float peso, char sexo, float altura,int idade){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }


    //Construtores padrão
    public Pessoa(String nome) {

    }

    public Pessoa(int idade){

    }

  public Pessoa(float altura){

  }



  
    public void setNome(String nome){
        if(nome.length() < 6 || nome.length() > 30){
            throw  new IllegalArgumentException("Nome invalido.Minimo 6 caracteres o maximo 30 caracteres");
        }else{
            this.nome = nome;
        }

    }

    public void setIdade(int idade){
        if(idade <= 17 || idade >= 100){
            throw new IllegalArgumentException("Idade invalida. Digite uma idade valida Minimo 18 a 99");
        }else{
            this.idade = idade;
        }

    }

    public void setPeso(float peso){
        if(peso <= 0 ){
            throw  new IllegalArgumentException("Peso deve ser maior do que 0");
        }else{
            this.peso = peso;
        }
    }

    public void setAltura(float altura){
        if(altura <= 0  ){
            throw new IllegalArgumentException("Altura deve ser maior do que 0");
        }else{
            this.altura = altura;
        }

    }

    public void setSexo(char sexo){
            if (sexo != 'M' || sexo != 'F'){
                throw new IllegalArgumentException("Digite um sexo valido,'M'- Masculino  ou F- Feminino");
            }else{
                this.sexo = sexo;
            }
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

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso );
        System.out.println("Sexo: " + sexo);
    }


}
