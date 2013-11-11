/**
 * © 2013 HS-Karlsruhe, Derichebourg, AWP Gruppe
 * @author Michael Schwarz
 * @version 00001
 */
package com.example.adressbook.ui;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class MySub extends Window {
	
	public MySub(){
		super("Subs");
		center();
		// Some basic content for the window
        VerticalLayout content = new VerticalLayout();
        content.addComponent(new Label("Just say it's OK!"));
        content.setMargin(true);
        setContent(content);
        
        // Disable the close button
        setClosable(false);

        // Trivial logic for closing the sub-window
        Button ok = new Button("OK");
        ok.addClickListener(new ClickListener() {
            public void buttonClick(ClickEvent event) {
                close(); // Close the sub-window
            }
        });
        content.addComponent(ok);
    }
	


//	@Override
//	protected void init(VaadinRequest request) {
//		
//        // Some other UI content
//        setContent(new Label("Here's my UI"));
//        
//        // Create a sub-window and set the content
//        Window subWindow = new Window("Sub-window");
//        VerticalLayout subContent = new VerticalLayout();
//        subContent.setMargin(true);
//        subWindow.setContent(subContent);
//        
//        // Put some components in it
//        subContent.addComponent(new Label("Meatball sub"));
//        subContent.addComponent(new Button("Awlright"));
//        
//        // Center it in the browser window
//        subWindow.center();
//        
//        // Open it in the UI
//        addWindow(subWindow);
//	}

}
