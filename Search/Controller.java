/*
 * Decompiled with CFR 0_114.
 */
package Search;

import Search.Model;
import Search.View;
import Search.View1;

public class Controller {
    private final View view = new View();
    Model model = new Model();
    View1 view1 = new View1();
    Integer mark = 0;
    Integer insert_inti;
    Integer front = 0;
    Integer rear = 0;

    public Controller() {
        this.model.add_view(this.view);
        this.model.add_view1(this.view1);
        this.model.setVisible(true);
        this.view.setBounds(0, 0, 1000, 450);
        this.view1.setBounds(0, 0, 1000, 450);
    }

    public static void main(String[] args) {
        new Controller();
    }
}

