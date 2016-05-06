/*
 * Decompiled with CFR 0_114.
 */
package Queue;

import Queue.Model;
import Queue.View;
import java.awt.Component;
import javax.swing.JPanel;

public class Controller {
    private View view = new View();
    Model model = new Model();
    Integer mark = 0;
    Integer insert_inti;
    Integer front = 0;
    Integer rear = 0;

    public Controller() {
        this.model.add_view(this.view);
        this.model.setVisible(true);
        this.model.des.add(this.view);
        this.view.setBounds(0, 0, 990, 380);
        this.front = this.model.front;
        this.rear = this.model.rear;
        this.view.fillqueue(this.front, this.rear);
    }
}

