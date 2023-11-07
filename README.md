# Exemplo de Padrão de Projeto Bridge em Java

Este projeto é um exemplo simples que demonstra a aplicação do padrão de projeto Bridge em Java. O padrão de projeto Bridge é usado para separar uma abstração de sua implementação, permitindo que ambas variem independentemente. Neste exemplo, exploramos o uso do padrão Bridge em um sistema de entretenimento que lida com diferentes dispositivos (TV, Rádio) e controles remotos (Controle Remoto Básico).

## Estrutura do Projeto

- `Dispositivo`: A interface que define a implementação do dispositivo, com métodos como ligar, desligar e ajustarCanal.

- `Televisão` e `Radio`: Classes que implementam a interface `Dispositivo`, representando diferentes tipos de dispositivos.

- `ControleRemoto`: A interface que define a abstração do controle remoto, com métodos como ligarDispositivo, desligarDispositivo e ajustarCanalDispositivo.

- `ControleRemotoBasico`: Uma implementação concreta da interface `ControleRemoto` que utiliza uma implementação do dispositivo.

- `Main`: Uma classe de exemplo que demonstra como criar diferentes combinações de dispositivos e controles remotos usando o padrão Bridge.