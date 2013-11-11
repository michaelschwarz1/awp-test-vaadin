/**
 * © 2013 HS-Karlsruhe, Derichebourg, AWP Gruppe
 * @author Michael Schwarz
 * @version 00001
 */
package com.example.adressbook.ui;

import com.vaadin.ui.Tree;
public class NavigationTree extends Tree {

public static final Object SHOW_ALL = "Show all";
public static final Object SEARCH = "Search";
public NavigationTree() {
addItem(SHOW_ALL);
addItem(SEARCH);
}
}