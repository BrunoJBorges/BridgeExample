package pattern.classes;

import pattern.interfaces.Dispositivo;

public class Radio implements Dispositivo {
	
	public void ligar() {
        System.out.println("Ligando o Rádio");
    }

    public void desligar() {
        System.out.println("Desligando o Rádio");
    }

    public void ajustarCanal(int canal) {
        System.out.println("Sintonizando na frequência " + canal);
    }
    
}
