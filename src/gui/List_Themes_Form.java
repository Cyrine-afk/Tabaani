/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.codename1.components.SpanLabel;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;

/**
 *
 * @author DELL
 */
public class List_Themes_Form extends Form{
    public List_Themes_Form(Form previous) {
        setTitle("List of Themes");
        
        SpanLabel sp = new SpanLabel();
        /*sp.setText(ServiceTask.getInstance().getAllTasks().toString());
        add(sp);*/
        getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
}
