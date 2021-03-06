package Materii;

import Persoane.Profesor;

public class Romana extends Materie{
    private String fiseDeLectura;

    public Romana(Profesor profesor, String fiseDeLectura) {
        super(profesor);
        this.fiseDeLectura=fiseDeLectura;
    }
    public Romana ()
    {}

    public String getFiseDeLectura() {
        return fiseDeLectura;
    }

    public void setFiseDeLectura(String fiseDeLectura) {
        this.fiseDeLectura = fiseDeLectura;
    }

    @Override
    public void afisare() {
        System.out.println(" Ora de romana este sustinuta de profesorul "+this.profesor.getNume()+" care a cerut urmatoarele fise de lectura: "+this.fiseDeLectura);
        System.out.println("Media clasei este: "+this.getMedie());
    }

}
