/*
 * Decompiled with CFR 0_114.
 */
package Sort;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
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

public class View_Selection
extends JPanel {
    Graphics2D g2d;
    Integer paint_count = -2;
    Integer j = -1;
    String[] elements = new String[10];
    Timer timer;
    String check_element = "ggg";
    Integer found_counter = 0;
    Integer check_counter = 0;
    int tpx = 0;
    int i = 0;
    int swap = 0;
    int abc = 10;
    int swapping = 0;
    int final_swap = 10;
    Integer row = -2;
    Integer col = -2;
    Integer x = -2;
    Integer y = -2;
    private JPanel jPanel1;

    public View_Selection() {
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
                    View_Selection.this.repaint();
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
            Integer i;
            Integer n;
            Integer n2 = this.paint_count;
            Integer n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            this.g2d = (Graphics2D)g;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                i = 0;
                while (i < 10) {
                    this.g2d.setFont(new Font("Times New Roman", 0, 14));
                    this.g2d.drawString(i.toString(), 170 + 70 * i, 110);
                    this.drawSquare(g, 170 + 70 * i, 150);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                this.timer.start();
            }
            if (this.paint_count == 1) {
                this.x = 0;
                this.y = 0;
                this.row = 0;
                this.col = 0;
                this.swap = 0;
            }
            if (this.row == 8) {
                this.g2d.drawString("Elements Swapped", 200, 300);
                this.timer.stop();
                return;
            }
            if (this.y == this.abc) {
                i = this.x;
                n3 = this.x = Integer.valueOf(this.x + 1);
                i = this.row;
                n3 = this.row = Integer.valueOf(this.row + 1);
                this.y = this.row;
                this.col = this.row;
            }
            if (this.x == this.row && this.x > -2) {
                Integer fff = this.x + 1;
                this.g2d.drawString("Iteration No:  " + fff.toString(), 200, 50);
                if (this.y == this.col) {
                    Object t;
                    if (this.tpx == 55) {
                        this.swap = this.x;
                        this.tpx = 0;
                    }
                    this.drawVerticalArrow(g, 170 + 70 * this.x, 180, 170 + 70 * this.x, 250);
                    this.g2d.drawString("Selected", 140 + 70 * this.x, 270);
                    this.g2d.drawString("Element", 140 + 70 * this.x, 290);
                    this.drawVerticalArrow(g, 180 + 70 * this.swap, 180, 180 + 70 * this.swap, 310);
                    this.g2d.drawString("swap", 180 + 70 * this.swap, 330);
                    this.drawVerticalArrow(g, 160 + 70 * this.y, 180, 160 + 70 * this.y, 250);
                    this.g2d.drawString("counter", 160 + 70 * this.y, 280);
                    if (this.final_swap == 1) {
                        t = this.elements[this.swap];
                        this.elements[this.swap] = this.elements[this.x - 1];
                        this.elements[this.x.intValue() - 1] = t;
                        this.final_swap = 10;
                        this.swap = this.x;
                        return;
                    }
                    if (this.swapping == 1) {
                        this.swap = this.y;
                        this.swapping = 0;
                        return;
                    }
                    if (this.elements[this.swap].compareTo(this.elements[this.y]) > 0) {
                        this.g2d.drawString("element[counter]<element[swap]   So, swap = counter", 300, 400);
                        this.swapping = 1;
                        return;
                    }
                    if (this.elements[this.swap].compareTo(this.elements[this.y]) == 0) {
                        this.g2d.drawString("element[counter]=element[swap]  ", 300, 4000);
                    } else {
                        this.g2d.drawString("element[counter]>element[swap]  ", 300, 400);
                    }
                    if (this.y == 9) {
                        if (this.swap != this.x) {
                            this.final_swap = 1;
                            t = this.col;
                            n = this.col = Integer.valueOf(this.col + 1);
                            t = this.y;
                            n = this.y = Integer.valueOf(this.y + 1);
                        } else {
                            this.tpx = 55;
                        }
                    }
                    if (this.final_swap != 1) {
                        t = this.col;
                        n = this.col = Integer.valueOf(this.col + 1);
                        t = this.y;
                        n = this.y = Integer.valueOf(this.y + 1);
                    }
                }
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(new Color(255, 255, 153));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 450, 32767));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 450, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767))));
    }

}

