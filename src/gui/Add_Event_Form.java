/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextArea;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import entities.Events;
import services.Service_Event;

/**
 *
 * @author DELL
 */
public class Add_Event_Form extends Form{
    public Add_Event_Form(Form previous) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        
        setUIID("LoginForm"); 
        
        TextField eventName = new TextField("","Event Name");
        TextField nbrMaxPart = new TextField("", "Max Participants", 3, TextArea.NUMERIC);
        TextField description= new TextField("", "Description");
        TextField eventAddress= new TextField("", "Event Address");
        TextField eventTheme= new TextField("", "Theme", 3, TextArea.NUMERIC);
        Image eventImage;
        Button btnValider = new Button("Save Event");
        
        
        btnValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if ((eventName.getText().length()==0)||(nbrMaxPart.getText().length()==0)||(description.getText().length()==0)||(eventAddress.getText().length()==0))
                    Dialog.show("ALERT", "Please fill all the fields", "OK", "Cancel");
                else
                {
                    try {
                        //public Events(int nbrmaxpart, int eventtheme_id, String eventname, String imageevent, String description, String eventaddress) 
                        Events e = new Events(
                                Integer.parseInt(nbrMaxPart.getText()), 
                                Integer.parseInt(eventTheme.getText()), 
                                eventName.getText(), 
                                description.getText(), 
                                eventAddress.getText()
                                );
                        if(Service_Event.getInstance().addEvent(e))
                            Dialog.show("SUCCESS","Connection accepted","OK", "Cancel");
                        else
                            Dialog.show("ERROR", "Server error","OK", "Cancel");
                    } catch (NumberFormatException e) {
                        Dialog.show("ERROR", "Status must be a number", "OK", "Cancel");
                    }
                    
                }
                
                
            }
        });
        
        
        Container by = BoxLayout.encloseY(
                new Label("Add A New Event", "WelcomeWhite"),
                eventName,
                nbrMaxPart,
                description, 
                eventAddress, 
                eventTheme, 
                //imageEvent, 
                btnValider             
        );
        add(BorderLayout.CENTER, by); 
        
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());                 
    }
}
