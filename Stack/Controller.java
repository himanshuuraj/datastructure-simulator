/*
 * Decompiled with CFR 0_114.
 */
package Stack;

import Stack.Design;
import Stack.Model;
import java.awt.Component;
import javax.swing.JPanel;

public class Controller {
    private final Design design = new Design();
    Model model = new Model();
    Integer mark = 0;
    Integer insert_inti;
    Integer top = 0;

    public Controller() {
        this.model.add_design(this.design);
        this.model.setVisible(true);
        this.model.des.add(this.design);
        this.design.setBounds(0, 0, 990, 325);
        this.insert_inti = this.model.insert_int;
        this.top = this.model.top;
        this.design.fillstack(this.top);
    }
}

