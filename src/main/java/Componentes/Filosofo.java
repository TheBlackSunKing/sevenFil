/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author José Emilio Yépez
 */
public class Filosofo implements Runnable{ //Un objeto se puede crear dentro de un
                                            // hilo cuando se implementa Runabble
    int tiempoPensando; //Tiempo que se toma el filosofo en pensar
    int tiempoComiendo; //Tiempo que debe tomar el filosofo en comida
    int comCont, penCont; //Veces que comío y penso respectivamente
    int tiempoEnEspera; //Cuanto tiempo el filosofo espera durante una ronda de comida
    int tiempoEnEsperaTotal; //Cuanto tiempo este filosofo a tenido que esperar en total en cada ronda
    boolean estaComiendo;
    boolean estaPensando;
    Palillo palilloIzq, palilloDer; //esto hace referencia a los palillos que el filosofo tiene a sus lados
    boolean usandoPalilloIzq, UsandoPalilloDer; // booleanos que indica si el filosofo esta usando alguno de los palillos


    @Override
    public void run() { //@TODO Implementar una repeticion para que esto se repita N veces cada segundo
        if (estaPensando) {
            if (tiempoPensando > 0) {
                tiempoPensando--;
            }
            else
                alTerminarDePensar();
        }
        if (estaComiendo) { //@TODO Debemos implementar una condicion que el tiempo comiendo solo se reduja si el Filosofo tiene acesso a los dos palillos y que de not ser asi buscarlos
            tiempoComiendo--;
        }
            else alTerminarDeComer();
    }
    public void obtenerPalilloIzq (Palillo palillo){
        palilloIzq = palillo;
    }
    public void obtenerPalilloDer (Palillo palillo){
        palilloDer = palillo;
    }
    private void alTerminarDeComer (){
        estaComiendo = false;
        estaPensando = true;
        tiempoPensando = 10; //@TODO Debemos agregar un tiempo aleatorio de 0 a 10
    }
    private void alTerminarDePensar (){
        estaComiendo = true;
        estaPensando = false;
        tiempoComiendo = 10; //@TODO Debemos agregar un tiempo aleatorio de 0 a 10
    }
}