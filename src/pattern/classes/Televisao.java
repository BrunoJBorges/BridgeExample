package pattern.classes;

import pattern.interfaces.Dispositivo;

public class Televisao implements Dispositivo {
	
	public void ligar() {
        System.out.println("Ligando a TV");
    }

    public void desligar() {
        System.out.println("Desligando a TV");
    }

    public void ajustarCanal(int canal) {
        System.out.println("Mudando para o canal " + canal);
    }

}
