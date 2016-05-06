/*
 * Decompiled with CFR 0_114.
 */
package Sort;

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

public class View_Insertion
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
    int abc = -1;
    Integer row = -2;
    Integer col = -2;
    Integer x = -2;
    Integer y = -2;

    public View_Insertion() {
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
                    View_Insertion.this.repaint();
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
            }
            if (this.y == this.abc) {
                i = this.row;
                n3 = this.row = Integer.valueOf(this.row + 1);
                i = this.x;
                n3 = this.x = Integer.valueOf(this.x + 1);
                this.y = this.col = this.row;
            }
            if (this.row == 9) {
                this.g2d.drawString("Elements Swapped", 200, 300);
                this.timer.stop();
                return;
            }
            if (this.x == this.row && this.x > -2) {
                Integer fff = this.x + 1;
                this.g2d.drawString("Iteration No:  " + fff.toString(), 200, 50);
                this.g2d.drawString("Iteration begins from " + fff.toString() + " and leftwards", 450, 50);
                if (this.y == this.col) {
                    Object t;
                    this.drawShape(170 + 70 * this.y, 180);
                    if (this.swap == 1) {
                        this.g2d.drawString("Swapped", 200 + 70 * this.y, 240);
                        this.swap = 0;
                    } else {
                        if (this.elements[this.y].compareTo(this.elements[this.y + 1]) > 0) {
                            this.g2d.drawString(">", 200 + 70 * this.y, 240);
                            this.g2d.drawString("element[i]>element[i+1]   So, swap it", 300, 300);
                            t = this.elements[this.y];
                            this.elements[this.y.intValue()] = this.elements[this.y + 1];
                            this.elements[this.y.intValue() + 1] = t;
                            this.swap = 1;
                            return;
                        }
                        if (this.elements[this.y].compareTo(this.elements[this.y + 1]) == 0) {
                            this.g2d.drawString("=", 200 + 70 * this.y, 240);
                            this.g2d.drawString("element[i]=element[i+1]  ", 300, 300);
                        } else {
                            this.g2d.drawString("<", 200 + 70 * this.y, 240);
                            this.g2d.drawString("element[i]<element[i+1]  ", 300, 300);
                        }
                    }
                    t = this.col;
                    n = this.col = Integer.valueOf(this.col - 1);
                    t = this.y;
                    n = this.y = Integer.valueOf(this.y - 1);
                    return;
                }
            }
        }
        catch (Exception r) {
            // empty catch block
        }
    }

    public void drawShape(Integer x1, Integer y1) {
        this.g2d.drawLine(x1, y1, x1, y1 + 15);
        this.g2d.drawLine(x1, y1 + 15, x1 + 70, y1 + 15);
        this.g2d.drawLine(x1 + 70, y1 + 15, x1 + 70, y1);
    }

    private void initComponents() {
        this.setBackground(new Color(153, 153, 0));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 450, 32767));
    }

}

