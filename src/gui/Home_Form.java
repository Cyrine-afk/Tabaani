/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;

/**
 *
 * @author DELL
 */
public class Home_Form extends Form{
    Form current;    
    public Home_Form(Resources theme) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        
        current=this; 
        
        setUIID("LoginForm");
        
        Image profilePic = theme.getImage("tabaani-logo.png");
        Image mask = theme.getImage("round-mask.png");
        profilePic = profilePic.fill(mask.getWidth(), mask.getHeight());
        Label profilePicLabel = new Label(profilePic, "ProfilePic");
        profilePicLabel.setMask(mask.createMask());
        
        Button btnEvents = new Button("MENU EVENTS");
        btnEvents.setUIID("LoginButton");
        
        Button btnThemes = new Button("MENU THEMES");
        btnThemes.setUIID("LoginButton");

        btnEvents.addActionListener(e -> new Events_Home_Form(current).show());
        btnThemes.addActionListener(e -> new Themes_Home_Form(current,theme).show());
        
        Container by = BoxLayout.encloseY(
                new Label("Welcome To Tabaani !", "WelcomeWhite"),
                profilePicLabel,
                btnEvents,
                btnThemes                
        );
        add(BorderLayout.CENTER, by);        

    }
}
