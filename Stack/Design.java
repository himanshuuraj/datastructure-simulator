/*
 * Decompiled with CFR 0_114.
 */
package Stack;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

public class Design
extends JPanel {
    Graphics2D g2d;
    Integer mark = 0;
    Integer top = 0;
    Integer insert_top = 0;
    String added_string = "abc";
    String[] array = new String[10];
    float[] dash1 = new float[]{2.0f, 0.0f, 2.0f};
    float[] dash2 = new float[]{1.0f, 1.0f, 1.0f};
    float[] dash3 = new float[]{4.0f, 0.0f, 2.0f};
    float[] dash4 = new float[]{4.0f, 4.0f, 1.0f};

    public Design() {
        this.initComponents();
        this.setVisible(true);
        for (int i = 0; i < 10; ++i) {
            this.array[i] = "ab";
        }
    }

    private void doDrawing(Graphics g) throws InterruptedException {
        Integer n;
        int i;
        this.mark = 0;
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(10.0f));
        this.g2d.drawLine(40, 145, 940, 145);
        this.g2d.drawLine(40, 270, 940, 270);
        for (i = 0; i < 10; ++i) {
            this.g2d.drawLine(40 + 90 * i, 145, 40 + 90 * i, 270);
        }
        g.setFont(new Font("Times New Roman", 1, 18));
        for (i = 0; i < 10; ++i) {
            this.g2d.drawString(this.mark.toString(), 95 + 90 * i, 290);
            n = this.mark;
            Integer n2 = this.mark = Integer.valueOf(this.mark + 1);
        }
        this.mark = this.top;
        if (this.top == 10) {
            this.mark = 9;
        }
        if (this.top != 0) {
            Integer i2 = this.mark = this.top;
            n = this.mark = Integer.valueOf(this.mark - 1);
            this.g2d.drawString("TOP", 65 + 90 * this.mark, 50);
            this.g2d.setStroke(new BasicStroke(2.0f));
            this.g2d.setPaint(Color.green);
            this.g2d.drawLine(78 + 90 * this.mark, 55, 78 + 90 * this.mark, 140);
            System.out.println(this.top);
            for (int j = 0; j < this.top; ++j) {
                this.g2d.drawString(this.array[j].toString(), 85 + 90 * j, 210);
                this.g2d.drawString("  ", 175 + 90 * j, 210);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            this.doDrawing(g);
        }
        catch (InterruptedException ex) {
            Logger.getLogger(Design.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 153));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 980, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 322, 32767));
    }

    void process() {
    }

    void fillstack(Integer x) {
        this.top = x;
        this.repaint();
    }

    void add_string() {
        int g = this.top;
        this.array[--g] = this.added_string;
    }
}

