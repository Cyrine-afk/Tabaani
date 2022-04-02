/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;

/**
 *
 * @author DELL
 */
public class Themes_Home_Form extends Form{
    Form current;    
    public Themes_Home_Form(Form previous, Resources theme) {
       super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        
        current=this; 
        
        setUIID("LoginForm"); 

        //add(new Label("Choose an option"));
        Button btnAddTheme = new Button("Add a theme");
        Button btnListThemes = new Button("List of themes");

        btnAddTheme.addActionListener(e -> new Add_Theme_Form(current).show());
        btnListThemes.addActionListener(e -> new List_Themes_Form(current).show());
        //addAll(btnAddTheme, btnListThemes);

        Container by = BoxLayout.encloseY(
                new Label("Themes Menu", "WelcomeWhite"),
                btnAddTheme,
                btnListThemes             
        );
        add(BorderLayout.CENTER, by); 
        
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
}
