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
public class Themes {
    private int id;
    private String themename;

    public Themes(int id, String themename) {
        this.id = id;
        this.themename = themename;
    }    
    public Themes(String themename) {
        this.themename = themename;
    }

    public Themes() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getThemename() {
        return themename;
    }
    public void setThemename(String themename) {
        this.themename = themename;
    }

    @Override
    public String toString() {
        return "Theme{" + "id=" + id + ", themename=" +	themename + '}';
    }
    
    
    
}
