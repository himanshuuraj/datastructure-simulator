/*
 * Decompiled with CFR 0_114.
 */
package Tree.Avl;

import Tree.Avl.Model;
import Tree.Avl.View;
import java.awt.Component;
import javax.swing.JPanel;

public class Controller {
    private final View view = new View();
    Model model = new Model();
    Integer mark = 0;
    Integer insert_inti;
    Integer front = 0;
    Integer rear = 0;

    public Controller() {
        this.model.add_view(this.view);
        this.model.des.add(this.view);
        this.model.setVisible(true);
        this.view.setBounds(0, 0, 1000, 700);
    }

    public static void main(String[] args) {
        new Controller();
    }
}

