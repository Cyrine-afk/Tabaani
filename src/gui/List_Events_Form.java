/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.components.SpanLabel;
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
public class List_Events_Form extends Form{
    public List_Events_Form(Form previous) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        
        setUIID("LoginForm"); 
        
        SpanLabel sp = new SpanLabel();
        /*sp.setText(ServiceTask.getInstance().getAllTasks().toString());
        add(sp);*/
        
        Container by = BoxLayout.encloseY(
                new Label("List of Events", "WelcomeWhite")
        );
        
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
}
