/*
 * Decompiled with CFR 0_114.
 */
package Tree.Mway;

import java.awt.Container;
import java.awt.LayoutManager;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

public class View
extends JPanel {
    public View() {
        this.initComponents();
    }

    private void initComponents() {
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 400, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 300, 32767));
    }
}

