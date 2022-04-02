/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author DELL
 */
public class Events {
    
    private int id, nbrmaxpart, eventtheme_id;  
    private String eventname, description,eventaddress ; 

    /*public Events(int id, int nbrmaxpart, int eventtheme_id, String eventname,  String description, String eventaddress) {
        this.id = id;
        this.nbrmaxpart = nbrmaxpart;
        this.eventtheme_id = eventtheme_id;
        this.eventname = eventname;
        this.description = description;
        this.eventaddress = eventaddress;
    }*/
    public Events(int nbrmaxpart, int eventtheme_id, String eventname, String description, String eventaddress) {
        this.nbrmaxpart = nbrmaxpart;
        this.eventtheme_id = eventtheme_id;
        this.eventname = eventname;
        this.description = description;
        this.eventaddress = eventaddress;
    }

    public Events() {
    }
    

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    

    public String getEventaddress() {
        return eventaddress;
    }
    public void setEventaddress(String eventaddress) {
        this.eventaddress = eventaddress;
    }
    

    public String getEventname() {
        return eventname;
    }
    public void setEventname(String eventname) {
        this.eventname = eventname;
    }
    

    public int getEventtheme_id() {
        return eventtheme_id;
    }
    public void setEventtheme_id(int eventtheme_id) {
        this.eventtheme_id = eventtheme_id;
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    

    public int getNbrmaxpart() {
        return nbrmaxpart;
    }
    public void setNbrmaxpart(int nbrmaxpart) {
        this.nbrmaxpart = nbrmaxpart;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", nbrmaxpart=" + nbrmaxpart + ", eventtheme_id=" + eventtheme_id + ", eventname =" + eventname  +  ", description=" + description + ", eventaddress=" + eventaddress + '}';
    }
    
    
    
    
}
