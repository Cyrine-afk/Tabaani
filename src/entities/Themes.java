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
    private String themename, imagetheme;

    public Themes(int id, String themename, String imagetheme) {
        this.id = id;
        this.themename = themename;
        this.imagetheme = imagetheme;
    }    
    public Themes(String themename, String imagetheme) {
        this.themename = themename;
        this.imagetheme = imagetheme;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getImagetheme() {
        return imagetheme;
    }
    public void setImagetheme(String imagetheme) {
        this.imagetheme = imagetheme;
    }

    public String getThemename() {
        return themename;
    }
    public void setThemename(String themename) {
        this.themename = themename;
    }

    @Override
    public String toString() {
        return "Theme{" + "id=" + id + ", themename=" +	themename + ", imagetheme=" + imagetheme + '}';
    }
    
    
    
}
