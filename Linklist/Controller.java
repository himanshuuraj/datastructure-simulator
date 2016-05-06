/*
 * Decompiled with CFR 0_114.
 */
package Linklist;

import Linklist.Model;
import Linklist.View;
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
        this.model.setVisible(true);
        this.model.des.add(this.view);
        this.view.setBounds(0, 0, 1100, 450);
        this.insert_inti = this.model.insert_int;
        this.front = this.model.front;
        this.rear = this.model.rear;
    }

    public static void main(String[] args) {
        new Controller();
    }
}

