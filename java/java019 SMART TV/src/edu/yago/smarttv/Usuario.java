package edu.yago.smarttv;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A tv esta Ligada? " + smartTv.ligada);
        System.out.println("O Volume da Tv esta em: " + smartTv.volume);
        System.out.println("A Tv esta no Canal: " + smartTv.canal);
        
        smartTv.ligar();
        System.out.println("Agora a tv esta Ligada?  " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Agora o volume Aumentou: " + smartTv.volume);
    }
    
}
