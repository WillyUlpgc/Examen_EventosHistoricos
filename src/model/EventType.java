/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author thewi
 */
public class EventType {
    public ArrayList<String> types;
    
    public EventType(){
        this.types = new ArrayList<String>();
        this.types.add("Guerras");
        this.types.add("Políticos");
        this.types.add("Sociales");
        this.types.add("Culturales");
        this.types.add("Económicos");
        this.types.add("Religiosos");
        this.types.add("Descubrimientos");
    }
    
    public ArrayList<String> getTypes(){
        return this.types;
    }
}
