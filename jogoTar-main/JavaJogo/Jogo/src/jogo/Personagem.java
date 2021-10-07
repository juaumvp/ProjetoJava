package jogo;
import java.util.Scanner;
public class Personagem {

    private String nome;
    private int vida;
    private String arma;
    private int dano;


    public Personagem (String no, int vi, String ar) {
        this.nome = no;
        this.vida = vi;
        this.arma = ar;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;    
    }

    public int getVida () {
        return vida;
    }

    public void setVida (int vida){
        this.vida = vida;
    }

    public String getArma (){
        return arma;
    }

    public void setArma(String arma){

        this.arma = arma;
    }

    public int getDano() {
        return dano;
    }

    public void setDano (int dano){
        this.dano = dano;
    }
    

    public void atacar (){
        Scanner scan1 = new Scanner(System.in);
        int dano;
        dano = 0;

        if( this.arma.equals("Bastão")) {
            setDano(dano = new java.util.Random().nextInt(8));
        }else if (this.arma.equals("Espadas")) {
            setDano(dano = new java.util.Random().nextInt(12));
            System.out.println(getDano());
        }else if (this.arma.equals("Sai")){
            setDano(dano = new java.util.Random().nextInt(10));
        }else if (this.arma.equals("Nunchaku")){
            setDano(dano = new java.util.Random().nextInt(9));
        }
        System.out.println("Você atacou o inimigo e deu " + dano + " de dano!");

    }


   public void apresentar(){



    if(this.nome.equals("Leonardo")){
        System.out.println("Boa escolha!");
        System.out.println("Você escolheu " + this.getNome() + ":");

        System.out.println("Leonardo, Leo é o líder das quatro tartarugas,  usa bandana azul e tem como armas duas katanas.");
    } else if(this.nome.equals("Raphael")){
        System.out.println("Boa escolha!");
        System.out.println("Você escolheu " + this.getNome() + ":");

        System.out.println("Raphael, Raph é o anti-herói do grupo, nervoso, rebelde, ele sempre se impõe as ordens de Leonardo e tem um mau-humor característico. Usa bandana vermelha e tem duas sais como armas.");
    }else if(this.nome.equals("Michelangello")) {
        System.out.println("Boa escolha!");
        System.out.println("Você escolheu " + this.getNome() + ":");

        System.out.println("Michelangello, Mikey, é o caçula dos irmãos e o mais engraçado. Devorador de pizzas ele sempre tem piadas para fazer e usa uma bandana laranja e um par de nunchakus como arma.");
     }else if(this.nome.equals("Donatello")){
        System.out.println("Boa escolha!");
        System.out.println("Você escolheu " + this.getNome() + ":");
         System.out.println("Donatello, Donnie é o gênio do grupo, responsável pela parte tecnológica da base e inventor de muitos apetrechos. Usa uma bandana roxa e tem um cajado bô (ou bastão) como arma predileta.");

    }else if(this.nome.equals("Karai")){
        System.out.println("Honra e dever são aspectos integrais para a vilã misteriosa conhecida como Karai.");
        System.out.println("As habilidades de artes marciais e esgrima tornaram a vilã muito perigosa para as tartarugas, \n principalmente Leonardo. \n Sendo uma filha adotada do Destruidor,\n uma aprendiz, ou a próxima pessoa na linha de sucessão para a liderança do Clã do Pé,\n sua reputação como vilã é temida por todos.");

    }else if(this.nome.equals("Cabeça-de-couro")){
        System.out.println("Leatherhead ou Cabeça-de-couro é um mutante crocodilo, que foi utilizado como um rato de laboratório (ou, neste caso, um réptil) pelo Kraang.");
        System.out.println("Ele usa suas garras implacáveis para derrotar os inimigos");

    }


       }

}





    

