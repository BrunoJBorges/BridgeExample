package pattern;

import pattern.classes.ControleRemotoBasico;
import pattern.classes.Radio;
import pattern.classes.Televisao;
import pattern.interfaces.Dispositivo;

public class App {
	
	public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        Dispositivo radio = new Radio();

        ControleRemotoBasico controleTV = new ControleRemotoBasico(tv);
        ControleRemotoBasico controleRadio = new ControleRemotoBasico(radio);

        controleTV.ligarDispositivo();
        controleTV.ajustarCanalDispositivo(5);
        controleTV.desligarDispositivo();

        controleRadio.ligarDispositivo();
        controleRadio.ajustarCanalDispositivo(102);
        controleRadio.desligarDispositivo();
    }

}
