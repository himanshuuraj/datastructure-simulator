/*
 * Decompiled with CFR 0_114.
 */
package Quick;

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
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.Timer;

public class View
extends JPanel {
    Graphics2D g2d;
    Integer paint_count = -2;
    Integer j = -1;
    String[] elements = new String[10];
    String[] elements1 = new String[10];
    String[] elements2 = new String[10];
    String[] elements3 = new String[10];
    String[] elements4 = new String[10];
    Timer timer;
    String check_element = "ggg";
    Integer found_counter = 0;
    Integer check_counter = 0;
    int tpx = 0;
    int check = 0;
    int i = 0;
    int level_counter = 0;
    int timer_counter = 0;
    int swap = 0;
    int abc = -1;
    Integer row = -2;
    Integer col = -2;
    Integer x = -2;
    Integer y = -2;
    int counter = 0;
    int lef_rig = 0;
    int first = 0;
    int last = 9;
    int mid;
    int change_end;
    int level = 0;

    public View() {
        this.initComponents();
        Integer i = 0;
        while (i < 10) {
            this.elements[i.intValue()] = i.toString();
            this.elements1[i.intValue()] = i.toString();
            this.elements2[i.intValue()] = i.toString();
            this.elements3[i.intValue()] = i.toString();
            this.elements4[i.intValue()] = i.toString();
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
        this.counter = this.mid = (this.first + this.last) / 2;
    }

    public void copy1() {
        Integer i = 0;
        while (i < 10) {
            this.elements1[i.intValue()] = this.elements[i];
            Integer n = i;
            Integer n2 = i = Integer.valueOf(i + 1);
        }
    }

    public void copy2() {
        Integer i = 5;
        while (i < 10) {
            this.elements1[i.intValue()] = this.elements[i];
            Integer n = i;
            Integer n2 = i = Integer.valueOf(i + 1);
        }
    }

    public void copy3() {
        Integer i = 5;
        while (i < 10) {
            this.elements1[i.intValue()] = this.elements[i];
            Integer n = i;
            Integer n2 = i = Integer.valueOf(i + 1);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Integer i;
            String s;
            Integer n;
            Integer n2 = this.paint_count;
            Integer n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            this.tpx = this.paint_count;
            this.g2d = (Graphics2D)g;
            if (this.level == 0) {
                if (this.swap == 1) {
                    s = this.elements[this.mid];
                    this.elements[this.mid] = this.elements[this.y];
                    this.elements[this.y.intValue()] = s;
                    this.mid = this.y;
                }
                if (this.j == 10) {
                    this.j = 0;
                }
                if (this.j > -1) {
                    i = 0;
                    while (i < 10) {
                        this.drawSquare(g, 320 + 70 * i, 180);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements[i].toString(), 320 + 70 * i, 180);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    this.drawVerticalArrow(g, 320 + 70 * this.mid, 180, 320 + 70 * this.mid, 280);
                    this.g2d.drawString("selected", 300 + 70 * this.mid, 300);
                    if (this.timer_counter == 0) {
                        this.timer.start();
                        System.out.println("hello");
                        ++this.timer_counter;
                    }
                }
                if (this.swap == 1) {
                    this.swap = 0;
                    this.g2d.drawString("Elements Swapped", 250, 500);
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                    return;
                }
                if (this.paint_count == 1) {
                    this.x = 0;
                    this.col = 0;
                    this.row = 0;
                    this.y = 0;
                    this.change_end = this.mid;
                }
                if (this.y == this.mid) {
                    ++this.check;
                    if (this.check == 2) {
                        this.check = 0;
                        this.level = 1;
                        this.g2d.drawString("Elements Sorted", 250, 600);
                        this.copy1();
                        this.mid = 2;
                        this.y = 0;
                        this.paint_count = 0;
                        this.lef_rig = 0;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                    return;
                }
                if (this.x == this.row && this.x > -2 && this.y == this.col) {
                    this.drawVerticalArrow(g, 320 + 70 * this.y, 180, 320 + 70 * this.y, 280);
                    this.g2d.drawString("counter", 300 + 70 * this.y, 300);
                    if (this.elements[this.y].compareTo(this.elements[this.mid]) > 0 && this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] > Element[mid] So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] < Element[mid]", 250, 500);
                    }
                    if (this.elements[this.y].compareTo(this.elements[this.mid]) < 0 && this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] < Element[mid]  So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] > Element[mid]", 250, 500);
                    }
                    if (this.lef_rig == 0) {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y + 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col + 1);
                    } else {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y - 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col - 1);
                    }
                }
            }
            if (this.level == 1) {
                if (this.swap == 1) {
                    s = this.elements1[this.mid];
                    this.elements1[this.mid] = this.elements1[this.y];
                    this.elements1[this.y.intValue()] = s;
                    this.mid = this.y;
                }
                if (this.j == 10) {
                    this.j = 0;
                }
                if (this.j > -1) {
                    i = 0;
                    while (i < 10) {
                        this.drawSquare(g, 320 + 70 * i, 180);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements[i].toString(), 320 + 70 * i, 180);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    i = 0;
                    while (i < 5) {
                        this.drawSquare(g, 120 + 70 * i, 280);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements1[i].toString(), 120 + 70 * i, 280);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    this.drawVerticalArrow(g, 120 + 70 * this.mid, 280, 120 + 70 * this.mid, 380);
                    this.g2d.drawString("selected", 100 + 70 * this.mid, 400);
                }
                if (this.swap == 1) {
                    this.swap = 0;
                    this.g2d.drawString("Elements Swapped", 250, 500);
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                    return;
                }
                if (this.paint_count == 1) {
                    this.x = 0;
                    this.col = 0;
                    this.row = 0;
                    this.y = 0;
                    this.change_end = this.mid;
                    this.mid = 2;
                    this.last = 4;
                    this.first = 0;
                }
                if (this.y == this.mid) {
                    ++this.check;
                    if (this.check == 2) {
                        this.level = 2;
                        this.g2d.drawString("Elements Sorted", 250, 600);
                        this.copy2();
                        this.mid = 8;
                        this.y = 0;
                        this.paint_count = 0;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                }
                if (this.x == this.row && this.x > -2 && this.y == this.col) {
                    this.drawVerticalArrow(g, 120 + 70 * this.y, 280, 120 + 70 * this.y, 380);
                    this.g2d.drawString("counter", 100 + 70 * this.y, 400);
                    if (this.elements1[this.y].compareTo(this.elements1[this.mid]) > 0 && this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] > Element[mid] So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] < Element[mid]", 250, 500);
                    }
                    if (this.elements1[this.y].compareTo(this.elements1[this.mid]) < 0 && this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] < Element[mid]  So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] > Element[mid]", 250, 500);
                    }
                    if (this.lef_rig == 0) {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y + 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col + 1);
                    } else {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y - 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col - 1);
                    }
                }
            }
            if (this.level == 2) {
                if (this.swap == 1) {
                    s = this.elements1[this.mid];
                    this.elements1[this.mid] = this.elements1[this.y];
                    this.elements1[this.y.intValue()] = s;
                    this.mid = this.y;
                }
                if (this.j == 10) {
                    this.j = 0;
                }
                if (this.j > -1) {
                    i = 0;
                    while (i < 10) {
                        this.drawSquare(g, 320 + 70 * i, 180);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements[i].toString(), 320 + 70 * i, 180);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    i = 0;
                    while (i < 5) {
                        this.drawSquare(g, 120 + 70 * i, 280);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements1[i].toString(), 120 + 70 * i, 280);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    i = 6;
                    while (i < 10) {
                        this.drawSquare(g, 520 + 70 * i, 280);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements1[i].toString(), 520 + 70 * i, 280);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    this.drawVerticalArrow(g, 520 + 70 * this.mid, 280, 520 + 70 * this.mid, 380);
                    this.g2d.drawString("selected", 500 + 70 * this.mid, 400);
                }
                if (this.swap == 1) {
                    this.swap = 0;
                    this.g2d.drawString("Elements Swapped", 250, 500);
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                    return;
                }
                if (this.paint_count == 1) {
                    this.x = 0;
                    this.col = 6;
                    this.row = 0;
                    this.y = 6;
                    this.change_end = this.mid;
                    this.mid = 8;
                    this.last = 9;
                    this.first = 6;
                    this.lef_rig = 0;
                    this.check = 0;
                }
                if (this.y == this.mid) {
                    ++this.check;
                    if (this.check == 2) {
                        this.level = 3;
                        this.g2d.drawString("Elements Sorted", 250, 600);
                        this.copy2();
                        this.mid = 7;
                        this.y = 0;
                        this.paint_count = 0;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                }
                if (this.x == this.row && this.x > -2 && this.y == this.col) {
                    this.drawVerticalArrow(g, 520 + 70 * this.y, 280, 520 + 70 * this.y, 380);
                    this.g2d.drawString("counter", 500 + 70 * this.y, 400);
                    if (this.elements1[this.y].compareTo(this.elements1[this.mid]) > 0 && this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] > Element[mid] So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] < Element[mid]", 250, 500);
                    }
                    if (this.elements1[this.y].compareTo(this.elements1[this.mid]) < 0 && this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] < Element[mid]  So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] > Element[mid]", 250, 500);
                    }
                    if (this.lef_rig == 0) {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y + 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col + 1);
                    } else {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y - 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col - 1);
                    }
                }
            }
            if (this.level == 3) {
                if (this.swap == 1) {
                    s = this.elements1[this.mid];
                    this.elements1[this.mid] = this.elements1[this.y];
                    this.elements1[this.y.intValue()] = s;
                    this.mid = this.y;
                }
                if (this.j == 10) {
                    this.j = 0;
                }
                if (this.j > -1) {
                    i = 0;
                    while (i < 10) {
                        this.drawSquare(g, 320 + 70 * i, 180);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements[i].toString(), 320 + 70 * i, 180);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    i = 0;
                    while (i < 5) {
                        this.drawSquare(g, 120 + 70 * i, 280);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements1[i].toString(), 120 + 70 * i, 280);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    i = 6;
                    while (i < 10) {
                        this.drawSquare(g, 520 + 70 * i, 280);
                        this.g2d.setFont(new Font("Times New Roman", 1, 20));
                        this.g2d.drawString(this.elements1[i].toString(), 520 + 70 * i, 280);
                        n3 = i;
                        n = i = Integer.valueOf(i + 1);
                    }
                    this.drawVerticalArrow(g, 520 + 70 * this.mid, 280, 520 + 70 * this.mid, 380);
                    this.g2d.drawString("selected", 500 + 70 * this.mid, 400);
                }
                if (this.swap == 1) {
                    this.swap = 0;
                    this.g2d.drawString("Elements Swapped", 250, 500);
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                    return;
                }
                if (this.paint_count == 1) {
                    this.x = 0;
                    this.col = 6;
                    this.row = 0;
                    this.y = 6;
                    this.change_end = this.mid;
                    this.mid = 8;
                    this.last = 9;
                    this.first = 6;
                    this.lef_rig = 0;
                    this.check = 0;
                }
                if (this.y == this.mid) {
                    ++this.check;
                    if (this.check == 2) {
                        this.level = 3;
                        this.g2d.drawString("Elements Sorted", 250, 600);
                        this.copy2();
                        this.mid = 7;
                        this.y = 0;
                        this.paint_count = 0;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.mid = this.y;
                        this.y = this.last;
                        this.lef_rig = 1;
                        this.col = this.last;
                    } else {
                        this.mid = this.y;
                        this.y = this.first;
                        this.lef_rig = 0;
                        this.col = this.first;
                    }
                }
                if (this.x == this.row && this.x > -2 && this.y == this.col) {
                    this.drawVerticalArrow(g, 520 + 70 * this.y, 280, 520 + 70 * this.y, 380);
                    this.g2d.drawString("counter", 500 + 70 * this.y, 400);
                    if (this.elements1[this.y].compareTo(this.elements1[this.mid]) > 0 && this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] > Element[mid] So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 0) {
                        this.g2d.drawString("Element[i] < Element[mid]", 250, 500);
                    }
                    if (this.elements1[this.y].compareTo(this.elements1[this.mid]) < 0 && this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] < Element[mid]  So,swap it", 250, 500);
                        this.swap = 1;
                        return;
                    }
                    if (this.lef_rig == 1) {
                        this.g2d.drawString("Element[i] > Element[mid]", 250, 500);
                    }
                    if (this.lef_rig == 0) {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y + 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col + 1);
                    } else {
                        i = this.y;
                        n3 = this.y = Integer.valueOf(this.y - 1);
                        i = this.col;
                        n3 = this.col = Integer.valueOf(this.col - 1);
                    }
                }
            }
        }
        catch (Exception e) {
            // empty catch block
        }
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

    void drawSquare(Graphics g, Integer x, Integer y) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.setPaint(Color.ORANGE);
        this.g2d.fillRect(x - 30, y - 30, 70, 50);
        this.g2d.setPaint(Color.black);
    }

    void drawWhiteSquare(Graphics g, Integer x, Integer y) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.setPaint(new Color(255, 255, 153));
        this.g2d.fillRect(x - 30, y - 30, 70, 50);
        this.g2d.setPaint(Color.black);
    }

    private void initComponents() {
        this.setBackground(new Color(255, 204, 153));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1503, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 680, 32767));
    }

}

