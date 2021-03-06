package nl.paulinternet.gtasaveedit.view.selectable;

import nl.paulinternet.gtasaveedit.event.Event;
import nl.paulinternet.gtasaveedit.event.EventHandler;

import javax.swing.*;

public class SelectionSizeLabel extends JLabel implements EventHandler {
    private SelectableItems<?> items;
    private String name;

    public SelectionSizeLabel(SelectableItems<?> items, String name) {
        this.items = items;
        this.name = name;

        items.onSelectionChange().addHandler(this);
        handleEvent((Event) null);
    }

    @Override
    public void handleEvent(Event e) {
        int total = items.getItems().size();
        int selected = items.getSelectedItems().getSize();

        setText(selected + " / " + total + " " + name + " selected");
    }
}
