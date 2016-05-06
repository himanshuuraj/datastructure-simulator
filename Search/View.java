/*
 * Decompiled with CFR 0_114.
 */
package Search;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.Timer;

public class View
extends JPanel {
    Graphics2D g2d;
    Integer paint_count = -2;
    Integer j = -1;
    String[] elements = new String[10];
    Timer timer;
    String check_element = "ggg";
    Integer found_counter = 0;
    Integer check_counter = 0;

    public View() {
        this.initComponents();
        Integer i = 0;
        while (i < 10) {
            this.elements[i.intValue()] = i.toString();
            Integer n = i;
            Integer n2 = i = Integer.valueOf(i + 1);
        }
        this.timer = new Timer(3000, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    View.this.repaint();
                }
                catch (Exception ex) {
                    // empty catch block
                }
            }
        });
    }

    void drawSquare(Graphics g, Integer x, Integer y) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.setPaint(Color.ORANGE);
        this.g2d.fillRect(x - 30, y - 30, 70, 50);
        this.g2d.setColor(Color.red);
        this.g2d.setStroke(new BasicStroke(6.0f));
        this.g2d.setFont(new Font("Times New Roman", 1, 24));
        this.g2d.drawString(this.elements[this.j].toString(), (int)x, (int)y);
        Integer n = this.j;
        Integer n2 = this.j = Integer.valueOf(this.j + 1);
        this.g2d.setPaint(Color.black);
    }

    void drawVerticalArrow(Graphics g, Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x2, y2, x2 - 7, y2 - 7);
        this.g2d.drawLine(x2, y2, x2 + 7, y2 - 7);
        this.g2d.setColor(Color.GREEN);
        this.g2d.setStroke(new BasicStroke(2.0f));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Integer i2;
            Integer n = this.paint_count;
            Integer n2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            this.g2d = (Graphics2D)g;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                for (int i2 = 0; i2 < 10; ++i2) {
                    this.drawSquare(g, 170 + 70 * i2, 150);
                }
                this.timer.start();
            }
            if (this.paint_count == 1) {
                this.drawVerticalArrow(g, 170, 180, 170, 270);
                this.g2d.drawString(this.check_element, 170, 300);
                if (this.check_element.equals(this.elements[0])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 2) {
                this.drawVerticalArrow(g, 240, 180, 240, 270);
                this.g2d.drawString(this.check_element, 240, 300);
                if (this.check_element.equals(this.elements[1])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 3) {
                this.drawVerticalArrow(g, 310, 180, 310, 270);
                this.g2d.drawString(this.check_element, 310, 300);
                if (this.check_element.equals(this.elements[2])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 4) {
                this.drawVerticalArrow(g, 380, 180, 380, 270);
                this.g2d.drawString(this.check_element, 380, 300);
                if (this.check_element.equals(this.elements[3])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 5) {
                this.drawVerticalArrow(g, 450, 180, 450, 270);
                this.g2d.drawString(this.check_element, 450, 300);
                if (this.check_element.equals(this.elements[4])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 6) {
                this.drawVerticalArrow(g, 520, 180, 520, 270);
                this.g2d.drawString(this.check_element, 520, 300);
                if (this.check_element.equals(this.elements[5])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 7) {
                this.drawVerticalArrow(g, 590, 180, 590, 270);
                this.g2d.drawString(this.check_element, 590, 300);
                if (this.check_element.equals(this.elements[6])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 8) {
                this.drawVerticalArrow(g, 660, 180, 660, 270);
                this.g2d.drawString(this.check_element, 660, 300);
                if (this.check_element.equals(this.elements[7])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 9) {
                this.drawVerticalArrow(g, 730, 180, 730, 270);
                this.g2d.drawString(this.check_element, 730, 300);
                if (this.check_element.equals(this.elements[8])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 10) {
                this.drawVerticalArrow(g, 800, 180, 800, 270);
                this.g2d.drawString(this.check_element, 800, 300);
                if (this.check_element.equals(this.elements[9])) {
                    i2 = this.found_counter;
                    n2 = this.found_counter = Integer.valueOf(this.found_counter + 1);
                    i2 = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.g2d.drawString("Element matches Found " + this.found_counter.toString() + " times", 200, 350);
                } else {
                    this.g2d.drawString("Element not matches", 200, 350);
                }
            }
            if (this.paint_count == 11) {
                this.paint_count = 10;
                if (this.check_counter != 0) {
                    this.g2d.drawString("Elements found " + this.found_counter.toString() + " times", 300, 75);
                }
                return;
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 153));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 450, 32767));
    }

}

