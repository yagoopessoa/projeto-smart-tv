public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada); //irá mostrar a TV inicalmnente desligada
        

        smartTv.ligar();
        System.out.println("Novo Status - Ligada? " + smartTv.ligada); //Irá "ligar" a TV

        System.out.println("Canal Atual? " + smartTv.canal); //irá mostrar o canal inicial (12)
        System.out.println("Volume Atual: " + smartTv.volume); //irá mostrar o volume  inicial (25)


        smartTv.aumentarVolume(); // aumenta o volume da TV em 1
        smartTv.aumentarVolume(); // aumenta o volume da TV em 1
        smartTv.aumentarVolume(); // aumenta o volume da TV em 1
        smartTv.diminuirVolume(); // diminui o volume da TV em 1
        System.out.println("Volume atual da TV: " + smartTv.volume);

        smartTv.diminuirCanal(); // dimininui o canal da TV em 1
        smartTv.diminuirCanal(); // dimininui o canal da TV em 1
        smartTv.diminuirCanal(); // dimininui o canal da TV em 1
        smartTv.aumentarCanal(); // aumenta o canal da TV em 1
        System.out.println("Canal atual da TV: " + smartTv.canal);

        smartTv.mudarCanal(7);
        System.out.println("Canal atual da TV: " + smartTv.canal);

        
        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);


    }



}
