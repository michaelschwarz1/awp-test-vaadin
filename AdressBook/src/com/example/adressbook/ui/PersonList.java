/**
 * © 2013 HS-Karlsruhe, Derichebourg, AWP Gruppe
 * @author Michael Schwarz
 * @version 00001
 */
package com.example.adressbook.ui;

import com.example.adressbook.data.PersonContainer;
import com.vaadin.ui.Table;

public class PersonList extends Table{
	public PersonList(AdressbookApp app) {
        setSizeFull();
        setContainerDataSource(app.getDataSource());
        setVisibleColumns(PersonContainer.NATURAL_COL_ORDER);
        setColumnHeaders(PersonContainer.COL_HEADERS_ENGLISH);
}
}
