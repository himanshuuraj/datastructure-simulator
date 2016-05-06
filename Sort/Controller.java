/*
 * Decompiled with CFR 0_114.
 */
package Sort;

import Sort.Model;
import Sort.View_Bubble;
import Sort.View_Insertion;
import Sort.View_Selection;

public class Controller {
    private final View_Bubble view_bubble = new View_Bubble();
    Model model = new Model();
    Integer mark = 0;
    Integer insert_inti;
    Integer front = 0;
    Integer rear = 0;
    View_Insertion view_insertion = new View_Insertion();
    View_Selection view_selection = new View_Selection();

    public Controller() {
        this.model.add_viewbubble(this.view_bubble);
        this.model.add_viewinsertion(this.view_insertion);
        this.model.add_viewselection(this.view_selection);
        this.model.setVisible(true);
        this.view_bubble.setBounds(0, 0, 1000, 450);
        this.view_insertion.setBounds(0, 0, 1000, 450);
        this.view_selection.setBounds(0, 0, 1000, 450);
    }

    public static void main(String[] args) {
        new Controller();
    }
}

