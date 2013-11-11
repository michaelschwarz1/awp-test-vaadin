/**
 * © 2013 HS-Karlsruhe, Derichebourg, AWP Gruppe
 * @author Michael Schwarz
 * @version 00001
 */
package com.example.adressbook.ui;

import javax.servlet.annotation.WebServlet;

import com.example.adressbook.data.PersonContainer;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.Sizeable;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.example.adressbook.ui.SearchView;


@SuppressWarnings("serial")
@Theme("runo")
public class AdressbookApp extends UI {
	
	
	private Button newContact = new Button("Add contact");
	private Button search = new Button("Search");
	private Button share = new Button("Share");
	private Button help = new Button("Help");
	private HorizontalSplitPanel horizontalSplit = new HorizontalSplitPanel();
	private NavigationTree tree = new NavigationTree();
	private ListView listView = null;
	private PersonList personList = null;
	private PersonForm personForm = null;
	private PersonContainer dataSource = PersonContainer.createWithTestData();
	final Button open = new Button("Open Sub");
	MySub sub = new MySub();
	private SearchView searchView = null;
	


	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = AdressbookApp.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		buildMainLayout();
		setMainComponent(getListView());
		
		
	}
	
	private void buildMainLayout() {
		VerticalLayout layout = new VerticalLayout();
		layout.setSizeFull();
		
		layout.addComponent(createToolbar());
		layout.addComponent(horizontalSplit);
		
		/* Allocate all available extra space to the horizontal split panel */
		
		layout.setExpandRatio(horizontalSplit, 1);
		/* Set the initial split position so we can have a 200 pixel menu to
		the left */
		horizontalSplit.setSplitPosition(200,Sizeable.UNITS_PIXELS);
		horizontalSplit.setFirstComponent(tree);
		setContent(layout);
		
		UI.getCurrent().addWindow(sub);
		
	}
	
	public HorizontalLayout createToolbar() {
		HorizontalLayout lo = new HorizontalLayout();
		lo.addComponent(newContact);
		lo.addComponent(search);
		lo.addComponent(share);
		lo.addComponent(help);
		return lo;
		}
	
	private void setMainComponent(Component c) {
		horizontalSplit.setSecondComponent(c);
		}

	private ListView getListView() {
		if (listView == null) {
			personList = new PersonList(this);
			personForm = new PersonForm();
			listView = new ListView(personList, personForm);
		}
		return listView;
		}

	public PersonContainer getDataSource() {
        return dataSource;
        

}
}