public class SmartTv {
    boolean ligada = false;
    int volume = 15;
    int canal = 12;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }


    public void mudarVolume (int escolherVolume){ //Escolhe o volume desejado (qualquer um)
        volume = escolherVolume;
    }

    public void aumentarVolume(){
        volume++; // forma abreviada de "volume = volume + 1"
        System.out.println("aumentando o volume: " + volume);
    }
    public void diminuirVolume(){
        volume--; // forma abreviada de "volume = volume - 1"
        System.out.println("diminuindo o volume: " + volume);
    }

    
    public void mudarCanal (int escolherCanal){ //Escolhe o canal desejado (qualquer um)
        canal = escolherCanal; 
    }

    public void aumentarCanal(){
        canal++; // forma abreviada de "canal = canal + 1"
        System.out.println("aumento o canal: " + canal);
    }

    public void diminuirCanal(){
        canal--; // forma abreviada de "canal = canal - 1"
        System.out.println("diminuindo o canal: " + canal);
    }
}