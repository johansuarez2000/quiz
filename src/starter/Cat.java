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
public class Cat extends Pet{
    private boolean isHunter;

    public Cat(boolean isHunter, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }

    

    public boolean isIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    @Override
    public String Sound() {
         return ("miau");
    }
    @Override
    public String toString() {
        return "Pet{" + "id=" + getId() + ", name=" + getName() + ", IsHunter=" + isIsHunter() +", hairColor=" + getHairColor() + ", due\u00f1o=" + getDueño()+  '}';
    }

    @Override
    public String guardarMemoria() {
        return "Cat " + getId() + " " + getName()+ " "+ getHairColor()+" "+ isIsHunter()+"\n" + getDueño().getNombre() + " "+getDueño().getId()+"\n";
    }
    
    
}
