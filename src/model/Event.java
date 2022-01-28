/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author thewi
 */
public class Event {
    public String name;
    public String description;
    public String date;
    public String typeEvent;
    // Galeria de fotografias
    
    public Event(String name, String description, String date, String type){
        this.name = name;
        this.description = description;
        this.date = date;
        this.typeEvent = type;
        
    }
    
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getDate(){
        return this.date;
    }
    
}
