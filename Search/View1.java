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
import java.io.PrintStream;
import java.util.Arrays;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.Timer;

public class View1
extends JPanel {
    Graphics2D g2d;
    Integer paint_count = -2;
    Integer j = -1;
    String[] elements = new String[10];
    Timer timer;
    float[] dash3 = new float[]{4.0f, 0.0f, 2.0f};
    String check_element = "ggg";
    Integer found_counter = 0;
    Integer check_counter = 0;
    BasicStroke bs3;
    Integer total = 9;
    Integer tot = 5;
    Integer first = 0;
    Integer last = 9;

    public View1() {
        this.initComponents();
        Integer i = 0;
        while (i < 10) {
            this.elements[i.intValue()] = i.toString();
            Integer n = i;
            Integer n2 = i = Integer.valueOf(i + 1);
        }
        this.timer = new Timer(5000, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    View1.this.repaint();
                }
                catch (Exception ex) {
                    // empty catch block
                }
            }
        });
        this.bs3 = new BasicStroke(1.0f, 0, 1, 1.0f, this.dash3, 2.0f);
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
            Integer i;
            Integer n = this.paint_count;
            Integer n2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            this.g2d = (Graphics2D)g;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                i = 0;
                while (i < 10) {
                    this.g2d.setFont(new Font("Times New Roman", 0, 14));
                    this.g2d.drawString(i.toString(), 170 + 70 * i, 120);
                    this.drawSquare(g, 170 + 70 * i, 150);
                    n2 = i;
                    Integer n3 = i = Integer.valueOf(i + 1);
                }
                this.timer.start();
            }
            if (this.paint_count == 0) {
                this.g2d.setStroke(new BasicStroke(4.0f));
                this.g2d.drawString("Sort the elements. Since Binary Search works on sorted elements", 175, 50);
                this.sort();
            }
            if (this.paint_count == 1) {
                this.tot = this.first + (this.last - this.first) / 2;
                this.g2d.drawString("First= " + this.first.toString() + "     Last= " + this.last.toString() + "     Mid=first+(last-first)/2= " + this.tot.toString(), 175, 50);
                this.drawVerticalArrow(g, 135 + 70 * (this.first + 1) - 15, 180, 135 + 70 * (this.first + 1) - 15, 260);
                this.g2d.drawString("First", 135 + 70 * (this.first + 1) - 15, 280);
                this.g2d.setColor(Color.GREEN);
                this.drawVerticalArrow(g, 135 + 70 * (this.tot + 1) - 15, 180, 135 + 70 * (this.tot + 1) - 15, 260);
                this.g2d.drawString(this.check_element.toString(), 135 + 70 * (this.tot + 1) - 15, 275);
                this.g2d.drawString("(mid)", 135 + 70 * (this.tot + 1) - 15, 295);
                this.g2d.setColor(Color.BLACK);
                this.drawVerticalArrow(g, 135 + 70 * (this.last + 1) - 15, 180, 135 + 70 * (this.last + 1) - 15, 260);
                this.g2d.drawString("Last", 135 + 70 * (this.last + 1) - 15, 280);
                if (this.check_element.equals(this.elements[this.tot])) {
                    i = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.paint_count = 11;
                } else if (this.check_element.compareTo(this.elements[this.tot]) < 0) {
                    this.g2d.drawString("Element not matches.Since search_element<mid_element  So,Last= " + this.tot.toString(), 200, 75);
                    this.last = this.tot;
                } else {
                    this.g2d.drawString("Element not matches.Since search_element>mid_element  So,First= " + this.tot.toString(), 200, 75);
                    this.first = this.tot;
                }
            }
            if (this.paint_count == 2) {
                this.tot = this.first + (this.last - this.first) / 2;
                this.g2d.drawString("First= " + this.first.toString() + "     Last= " + this.last.toString() + "     Mid=first+(last-first)/2= " + this.tot.toString(), 175, 50);
                this.drawVerticalArrow(g, 135 + 70 * (this.first + 1) - 15, 180, 135 + 70 * (this.first + 1) - 15, 260);
                this.g2d.drawString("First", 135 + 70 * (this.first + 1) - 15, 280);
                this.g2d.setColor(Color.GREEN);
                this.drawVerticalArrow(g, 135 + 70 * (this.tot + 1) - 15, 180, 135 + 70 * (this.tot + 1) - 15, 260);
                this.g2d.drawString(this.check_element.toString(), 135 + 70 * (this.tot + 1) - 15, 275);
                this.g2d.drawString("(mid)", 135 + 70 * (this.tot + 1) - 15, 295);
                this.g2d.setColor(Color.BLACK);
                this.drawVerticalArrow(g, 135 + 70 * (this.last + 1) - 15, 180, 135 + 70 * (this.last + 1) - 15, 260);
                this.g2d.drawString("Last", 135 + 70 * (this.last + 1) - 15, 280);
                if (this.check_element.equals(this.elements[this.tot])) {
                    i = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.paint_count = 11;
                } else if (this.check_element.compareTo(this.elements[this.tot]) < 0) {
                    this.g2d.drawString("Element not matches.Since search_element<mid_element  So,Last=" + this.tot.toString(), 200, 75);
                    this.last = this.tot;
                } else {
                    this.g2d.drawString("Element not matches.Since search_element>mid_element  So,First= " + this.tot.toString(), 200, 75);
                    this.first = this.tot;
                }
            }
            if (this.paint_count == 3) {
                this.tot = this.first + (this.last - this.first) / 2;
                this.g2d.drawString("First= " + this.first.toString() + "    Last= " + this.last.toString() + "      Mid=first+(last-first)/2= " + this.tot.toString(), 175, 50);
                this.drawVerticalArrow(g, 135 + 70 * (this.first + 1) - 15, 180, 135 + 70 * (this.first + 1) - 15, 260);
                this.g2d.drawString("First", 135 + 70 * (this.first + 1) - 15, 280);
                this.g2d.setColor(Color.GREEN);
                this.drawVerticalArrow(g, 135 + 70 * (this.tot + 1) - 15, 180, 135 + 70 * (this.tot + 1) - 15, 260);
                this.g2d.drawString(this.check_element.toString(), 135 + 70 * (this.tot + 1) - 15, 275);
                this.g2d.drawString("(mid)", 135 + 70 * (this.tot + 1) - 15, 295);
                this.g2d.setColor(Color.BLACK);
                this.drawVerticalArrow(g, 135 + 70 * (this.last + 1) - 15, 180, 135 + 70 * (this.last + 1) - 15, 260);
                this.g2d.drawString("Last", 135 + 70 * (this.last + 1) - 15, 280);
                if (this.check_element.equals(this.elements[this.tot])) {
                    i = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.paint_count = 11;
                } else if (this.check_element.compareTo(this.elements[this.tot]) < 0) {
                    this.g2d.drawString("Element not matches.Since search_element<mid_element  So,Last=" + this.tot.toString(), 200, 75);
                    this.last = this.tot;
                } else {
                    this.g2d.drawString("Element not matches.Since search_element>mid_element  So,First= " + this.tot.toString(), 200, 75);
                    this.first = this.tot;
                }
            }
            if (this.paint_count == 4) {
                this.tot = this.first + (this.last - this.first) / 2;
                this.g2d.drawString("First= " + this.first.toString() + "     Last= " + this.last.toString() + "     Mid=first+(last-first)/2= " + this.tot.toString(), 175, 50);
                this.drawVerticalArrow(g, 135 + 70 * (this.first + 1) - 15, 180, 135 + 70 * (this.first + 1) - 15, 260);
                this.g2d.drawString("First", 135 + 70 * (this.first + 1) - 15, 280);
                this.g2d.setColor(Color.GREEN);
                this.drawVerticalArrow(g, 135 + 70 * (this.tot + 1) - 15, 180, 135 + 70 * (this.tot + 1) - 15, 260);
                this.g2d.drawString(this.check_element.toString(), 135 + 70 * (this.tot + 1) - 15, 275);
                this.g2d.drawString("(mid)", 135 + 70 * (this.tot + 1) - 15, 295);
                this.g2d.setColor(Color.BLACK);
                this.drawVerticalArrow(g, 135 + 70 * (this.last + 1) - 15, 180, 135 + 70 * (this.last + 1) - 15, 260);
                this.g2d.drawString("Last", 135 + 70 * (this.last + 1) - 15, 280);
                if (this.check_element.equals(this.elements[this.tot])) {
                    i = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.paint_count = 11;
                } else if (this.check_element.compareTo(this.elements[this.tot]) < 0) {
                    this.g2d.drawString("Element not matches.Since search_element<mid_element  So,Last=" + this.tot.toString(), 200, 75);
                    this.last = this.tot;
                } else {
                    this.g2d.drawString("Element not matches.Since search_element>mid_element  So,First= " + this.tot.toString(), 200, 75);
                    this.first = this.tot;
                }
            }
            if (this.paint_count == 5) {
                this.tot = this.first + (this.last - this.first) / 2;
                this.g2d.drawString("First= " + this.first.toString() + "     Last= " + this.last.toString() + "     Mid=first+(last-first)/2= " + this.tot.toString(), 175, 50);
                this.drawVerticalArrow(g, 135 + 70 * (this.first + 1) - 15, 180, 135 + 70 * (this.first + 1) - 15, 260);
                this.g2d.drawString("First", 135 + 70 * (this.first + 1) - 15, 280);
                this.g2d.setColor(Color.GREEN);
                this.drawVerticalArrow(g, 135 + 70 * (this.tot + 1) - 15, 180, 135 + 70 * (this.tot + 1) - 15, 260);
                this.g2d.drawString(this.check_element.toString(), 135 + 70 * (this.tot + 1) - 15, 275);
                this.g2d.drawString("(mid)", 135 + 70 * (this.tot + 1) - 15, 295);
                this.g2d.setColor(Color.BLACK);
                this.drawVerticalArrow(g, 135 + 70 * (this.last + 1) - 15, 180, 135 + 70 * (this.last + 1) - 15, 260);
                this.g2d.drawString("Last", 135 + 70 * (this.last + 1) - 15, 280);
                if (this.check_element.equals(this.elements[this.tot])) {
                    i = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.paint_count = 11;
                } else if (this.check_element.compareTo(this.elements[this.tot]) < 0) {
                    this.g2d.drawString("Element not matches.Since search_element<mid_element  So,Last=" + this.tot.toString(), 200, 75);
                    this.last = this.tot;
                } else {
                    this.g2d.drawString("Element not matches.Since search_element>mid_element  So,First= " + this.tot.toString(), 200, 75);
                    this.first = this.tot;
                }
            }
            if (this.paint_count == 6) {
                this.tot = this.first + (this.last - this.first) / 2;
                this.g2d.drawString("First= " + this.first.toString() + " Last= " + this.last.toString() + " Mid=first+(last-first)/2= " + this.tot.toString(), 175, 50);
                this.drawVerticalArrow(g, 135 + 70 * (this.first + 1) - 15, 180, 135 + 70 * (this.first + 1) - 15, 260);
                this.g2d.drawString("First", 135 + 70 * (this.first + 1) - 15, 280);
                this.g2d.setColor(Color.GREEN);
                this.drawVerticalArrow(g, 135 + 70 * (this.tot + 1) - 15, 180, 135 + 70 * (this.tot + 1) - 15, 260);
                this.g2d.drawString(this.check_element.toString(), 135 + 70 * (this.tot + 1) - 15, 275);
                this.g2d.drawString("(mid)", 135 + 70 * (this.tot + 1), 295);
                this.g2d.setColor(Color.BLACK);
                this.drawVerticalArrow(g, 135 + 70 * (this.last + 1) - 15, 180, 135 + 70 * (this.last + 1) - 15, 260);
                this.g2d.drawString("Last", 135 + 70 * (this.last + 1) - 15, 280);
                if (this.check_element.equals(this.elements[this.tot])) {
                    i = this.check_counter;
                    n2 = this.check_counter = Integer.valueOf(this.check_counter + 1);
                    this.paint_count = 11;
                } else if (this.check_element.compareTo(this.elements[this.tot]) < 0) {
                    this.g2d.drawString("Element not matches.Since search_element<mid_element  So,Last=" + this.tot.toString(), 200, 75);
                    this.last = this.tot;
                } else {
                    this.g2d.drawString("Element not matches.Since search_element>mid_element  So,First= " + this.tot.toString(), 200, 75);
                    this.first = this.tot;
                }
            }
            if (this.paint_count == 11) {
                this.paint_count = 10;
                if (this.check_counter != 0) {
                    this.g2d.drawString("Elements found ", 300, 75);
                } else {
                    this.g2d.drawString("Elements not  found ", 300, 75);
                }
                this.timer.stop();
                return;
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    void sort() {
        Arrays.sort(this.elements);
        for (int i = 0; i < 10; ++i) {
            System.out.println(this.elements[i]);
        }
    }

    private void initComponents() {
        this.setBackground(new Color(255, 204, 102));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 650, 32767));
    }

}

