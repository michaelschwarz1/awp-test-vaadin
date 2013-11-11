/**
 * © 2013 HS-Karlsruhe, Derichebourg, AWP Gruppe
 * @author Michael Schwarz
 * @version 00001
 */
package com.example.adressbook.ui;

import com.vaadin.ui.VerticalSplitPanel;

public class ListView extends VerticalSplitPanel {
		
	public ListView(PersonList personList, PersonForm personForm) {
		setFirstComponent(personList);
		setSecondComponent(personForm);
		setSplitPosition(40);
	}
	

}
