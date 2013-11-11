package com.example.adressbook.ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class SharingOptions extends VerticalLayout{

	public SharingOptions(){

	setCaption("Sharing options");
	addComponent(new Label(
	        "With these setting you can modify contact sharing "
	                + "options. (non-functional, example of modal dia-log)"));
	addComponent(new CheckBox("Gmail"));
	addComponent(new CheckBox(".Mac"));
	Button close = new Button("OK");
	addComponent(close);
	}
	
	

}
