/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter;

/**
 *
 * @author Usuario
 */
public class Hamster extends Pet {
    private double peso;

    public Hamster(double peso, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.peso = peso;
    }


    @Override
    public String Sound() {
        return ("  ");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   @Override
    public String toString() {
        return "Pet{" + "id=" + getId() + ", name=" + getName() + ", peso=" + getPeso() +", hairColor=" + getHairColor() + ", due\u00f1o=" + getDueño()+  '}';
    }

    @Override
    public String guardarMemoria() {
        return "Hamster " + getId() + " " + getName()+ " "+ getHairColor()+" "+ getPeso()+"\n" + getDueño().getNombre() + " "+getDueño().getId()+"\n";
    }
    
}
