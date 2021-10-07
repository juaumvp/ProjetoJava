package jogo;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String escolha;
        int n;
        int tartaruga = 0;


        Personagem[] t = new Personagem[7]; // Declaração de Array de personagem

        t[0] = new Personagem("Leonardo", 100, "Espadas");
        t[1] = new Personagem("Raphael", 100, "Sai");
        t[2] = new Personagem("Donatello", 100, "Bastão");
        t[3] = new Personagem("Michelangello", 100, "Nunchaku");
        t[4] = new Personagem("Cabeça-de-Couro", 100, "Mordida");
        t[5] = new Personagem("Karai", 100, "Espadas");
        t[6] = new Personagem("Cabeça-de-couro", 100, "Garras");

        int cc = 0;
        while (cc < 1) {

            System.out.println("\n------------------------------\n");
            System.out.println("Digite: ''START'' para começar o jogo:");

            escolha = scan.nextLine();

            if (escolha.equalsIgnoreCase("START")) {


                cc++;

                while (cc < 2) {

                    System.out.println("\n------------------------------\n");
                    System.out.println("ESCOLHA UM PERSONAGEM:");
                    System.out.println("1- Leonardo");
                    System.out.println("2- Raphael");
                    System.out.println("3- Donatello");
                    System.out.println("4- Michelangello");
                    System.out.println("\n---------------- --------------\n");
                    n = scan.nextInt();


                    if (n == 1) {

                        t[0].apresentar();
                        cc++;
                        tartaruga = 0;
                    } else if (n == 2) {
                        t[1].apresentar();
                        cc++;
                        tartaruga = 1;
                    } else if (n == 3) {
                        t[2].apresentar();
                        cc++;
                        tartaruga = 2;
                    } else if (n == 4) {
                        t[3].apresentar();
                        cc++;
                        tartaruga = 3;

                    } else {


                        System.out.println("VALOR INVÁLIDO");


                    }

                }
            } else {
                System.out.println("VALOR INVÁLIDO");
            }
        }


        System.out.println("\n-------------TARTARUGA NINJA GAME-----------------\n");
        System.out.println("Você é :" + t[tartaruga].getNome());
        System.out.println("Você está em seu esconderijo secreto no esgoto.");
        System.out.println("O Mestre Splinter está parado na sua frente");
        System.out.println(" ");
        while (cc < 3) {
            System.out.println("Oque você faz?");
            System.out.println("1- Falar com o Mestre");
            System.out.println("2- Ignorar o Mestre ");
            System.out.println("\n-------------------------------------------------\n");
            n = scan.nextInt();

            if (n == 1) {
                System.out.println("Mestre Splinter: Se acalme, " + t[tartaruga].getNome() + ". Seus irmãos foram capturados, você estava muito ferido mais graças ao rémedio que eu fiz o seu 'HP' recuperou");
                System.out.println("Mestre Splinter: Seu HP:" + t[tartaruga].getVida());
                System.out.println("Mestrer Splinter: Venha sempre para o esconderijo no esgoto quando quiser recuperar seu 'HP'!");
                cc++;
            } else if (n == 2) {
                System.out.println("Mestre Splinter: " + t[tartaruga].getNome() + " Não vire as costas pra mim rapaz!");
                System.out.println("Mestre Splinter: Eu sei que está querendo  vingar os irmãos que foram capturados, você estava muito ferido mais graças ao rémedio que eu fiz o seu 'HP' foi restaurado");
                System.out.println("Mestre Splinter: Seu HP:" + t[tartaruga].getVida());
                System.out.println("Mestrer Splinter: Venha sempre para o esconderijo no esgoto quando quiser recuperar seu 'HP'!");
                cc++;

            } else {
                System.out.println("VALOR INVALIDO");
            }

            System.out.println("\n------------------------------------------\n");
            System.out.println("Pra onde você vai?");
            System.out.println("1- Sair do esgoto");
            System.out.println("2- Vasculhar o esgoto");
            n = scan.nextInt();

            if (n == 1) {
                System.out.println(" Você saiu do esgoto e um vilão estava te esperando!");
                System.out.println("                      ");
                t[5].apresentar();
                System.out.println("                      ");
                System.out.println("Karai: Torturamos seus irmãos!  um deles não aguentou e acabou revelando seu esconderijo!");
                System.out.println("Karai: Você é a última das tartarugas!");
                System.out.println("                      ");
                System.out.println("               BATALHAR!!!!!!!!!!!!!          ");

            
                int level;
                level = 0;
                int pizza =  1;
                while (level < 1) {


                        System.out.println("\n-------------------------------------\n");
                        System.out.println("Sua vida atual é: " + t[tartaruga].getVida());
                        System.out.println("Vida da Karai: " + t[5].getVida());
                        System.out.println("Oque você faz?");
                        System.out.println("1- Atacar");
                        System.out.println("2- Defender");
                        System.out.println("3 - Comer Pizza");
                        n = scan.nextInt();


                    if (n == 1) {
                        t[tartaruga].atacar();
                        t[5].setVida(t[5].getVida() - t[tartaruga].getDano());

                    } else if (n == 2) {

                        System.out.println("Você entrou no seu casco e bloqueou metade do dano do inimigo");
                    }else if (n == 3) {

                        if(pizza >= 1){
                            int curar = 0;
                            curar = new java.util.Random().nextInt(30)+10;
                            System.out.println("Você se curou: " + curar);
                            t[tartaruga].setVida(t[tartaruga].getVida() + curar);
                            System.out.println("Sua vida Atual é: " + t[tartaruga].getVida());
                            pizza--;


                        }else if (pizza <= 0) {
                            System.out.println("Você não tem mais pizzas!!");
                        
                        }

                        
                    }

                    if (t[5].getVida() < 1) {
                        vencer();
                        level++;
                    } else if (t[5].getVida() > 0) {
                        if (n == 1) {
                            int vilaoDano = 0;
                            vilaoDano = new java.util.Random().nextInt(13);
                            System.out.println(t[5].getNome() + "Atacou você e deu " + vilaoDano + " de dano!");
                            t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano);
                        } else if (n == 2) {
                            int vilaoDano = 0;

                            vilaoDano = new java.util.Random().nextInt(15);
                            System.out.println(t[5].getNome() + "Atacou você e deu " + vilaoDano + " de dano!");
                            t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano/2);
                        }
                    }

                    if (t[tartaruga].getVida() < 1) {
                        morreu();
                        level++;
                    }

                    System.out.println("\n------------------------------\n");
                    int tirmao;
                    tirmao = 0;

                }

            }
            if (n == 2);
            System.out.println("Você estava vasculhando o esgoto e deu de cara com um temido crocodilo");
            System.out.println("               ");
            t[6].apresentar();
            System.out.print("                 ");
            System.out.println("Cabeça-de-couro: O ESGOTO É MEU, SAIA DAQUI!!");
            System.out.println("                      ");
            System.out.println("               BATALHAR!!!!!!!!!!!!!          ");
            
            int level;
                level = 0;
                int pizza =  1;
                while (level < 1) {


                        System.out.println("\n-------------------------------------\n");
                        System.out.println("Sua vida atual é: " + t[tartaruga].getVida());
                        System.out.println("Vida do cabeça-de-couro: " + t[6].getVida());
                        System.out.println("Oque você faz?");
                        System.out.println("1- Atacar");
                        System.out.println("2- Defender");
                        System.out.println("3 - Comer Pizza");
                 
                            n = scan.nextInt();

                            if (n == 1) {
                                t[tartaruga].atacar();
                                t[6].setVida(t[6].getVida() - t[tartaruga].getDano());
        
                            } else if (n == 2) {
        
                                System.out.println("Você entrou no seu casco e bloqueou metade do dano do inimigo");
                            }else if (n == 3) {
        
                                if(pizza >= 1){
                                    int curar = 0;
                                    curar = new java.util.Random().nextInt(30)+10;
                                    System.out.println("Você se curou: " + curar);
                                    t[tartaruga].setVida(t[tartaruga].getVida() + curar);
                                    System.out.println("Sua vida Atual é: " + t[tartaruga].getVida());
                                    pizza--;
        
        
                                }else if (pizza <= 0) {
                                    System.out.println("Você não tem mais pizzas!!");
                                
                                }
        
                            }
        
                            if (t[6].getVida() < 1) {
                                vencer();
                                level++;
                            } else if (t[6].getVida() > 0) {
                                if (n == 1) {
                                    int vilaoDano = 0;
                                    vilaoDano = new java.util.Random().nextInt(13);
                                    System.out.println(t[6].getNome() + "Atacou você e deu " + vilaoDano + " de dano!");
                                    t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano);
                                } else if (n == 2) {
                                    int vilaoDano = 0;
        
                                    vilaoDano = new java.util.Random().nextInt(15);
                                    System.out.println(t[6].getNome() + "Atacou você e deu " + vilaoDano + " de dano!");
                                    t[tartaruga].setVida(t[tartaruga].getVida() - vilaoDano/2);
                                }
                            }
        
                            if (t[tartaruga].getVida() < 1) {
                                morreu();
                                level++;
                            }
        
                            System.out.println("\n------------------------------\n");
                            int tirmao;
                            tirmao = 0;
            }        
   
        }


    }




    private static void vencer() {
        System.out.println("\n------------------------------\n");
        System.out.println("Você venceu!!");
        System.out.println("\n------------------------------\n");
    }

    private static void morreu() {

        System.out.println("\n------------------------------\n");
        System.out.println("Você morreu!!!");
        System.out.println("\n\n GAME OVER");
        System.out.println("\n------------------------------\n");


        
    }


}


