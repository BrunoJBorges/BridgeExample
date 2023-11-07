package pattern.classes;

import pattern.interfaces.ControleRemoto;
import pattern.interfaces.Dispositivo;

public class ControleRemotoBasico implements ControleRemoto {
	
	protected Dispositivo dispositivo;

    public ControleRemotoBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligarDispositivo() {
        dispositivo.ligar();
    }

    public void desligarDispositivo() {
        dispositivo.desligar();
    }

    public void ajustarCanalDispositivo(int canal) {
        dispositivo.ajustarCanal(canal);
    }
}
