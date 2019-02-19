package boletin17_1;

public class Mamifero implements IPuedeCaminar, IPuedeNadar, IPuedeVolar {

    public void caminar() {

        System.out.println("*caminando*");

    }

    public void nadar() {

        System.out.println("*nadando*");

    }

    public void volar() {

        System.out.println("*volando*");

    }

}
