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

/**
 *
 * @author DELL
 */
public class Events_Home_Form extends Form{
    Form current;    
    public Events_Home_Form(Form previous) {
       super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        
        current=this; 
        
        setUIID("LoginForm"); 

        //add(new Label("Choose an option"));
        Button btnAddEvent = new Button("Add an event");
        Button btnListEvents = new Button("List of events");

        btnAddEvent.addActionListener(e -> new Add_Event_Form(current).show());
        btnListEvents.addActionListener(e -> new List_Events_Form(current).show());
        //addAll(btnAddEvent, btnListEvents);

        Container by = BoxLayout.encloseY(
                new Label("Events Menu", "WelcomeWhite"),
                btnAddEvent,
                btnListEvents             
        );
        add(BorderLayout.CENTER, by); 
        
        
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
}
