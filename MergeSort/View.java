/*
 * Decompiled with CFR 0_114.
 */
package MergeSort;

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
    Integer tpx;
    Integer jjj = 0;

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

    void copy() {
        for (int i = 0; i < 10; ++i) {
            this.elements3[i] = this.elements4[i] = this.elements[i];
            this.elements2[i] = this.elements4[i];
            this.elements1[i] = this.elements4[i];
        }
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

    void drawVerticalArrow(Graphics g, Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x2, y2, x2 - 7, y2 - 7);
        this.g2d.drawLine(x2, y2, x2 + 7, y2 - 7);
        this.g2d.setColor(Color.GREEN);
        this.g2d.setStroke(new BasicStroke(2.0f));
    }

    void drawLeftArrow(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d.setStroke(new BasicStroke(4.0f));
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x1, y1, x2 - 75, y2 + 75);
    }

    void drawRightArrow(Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d.setStroke(new BasicStroke(4.0f));
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x1, y1, x2 + 75, y2 + 75);
    }

    void level4(Graphics g) {
        Integer n;
        Integer n2;
        Integer i = 0;
        while (i < 1) {
            this.drawSquare(g, 130 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 130 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        i = 1;
        while (i < 2) {
            this.drawSquare(g, 200 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 200 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        i = 2;
        while (i < 3) {
            this.drawSquare(g, 240 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 240 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        i = 3;
        while (i < 5) {
            this.drawSquare(g, 310 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 310 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        i = 5;
        while (i < 6) {
            this.drawSquare(g, 370 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 370 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        i = 6;
        while (i < 7) {
            this.drawSquare(g, 430 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 430 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        i = 7;
        while (i < 8) {
            this.drawSquare(g, 470 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 470 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
        i = 8;
        while (i < 10) {
            this.drawSquare(g, 570 + 70 * i, 380);
            this.g2d.setFont(new Font("Times New Roman", 1, 20));
            this.g2d.drawString(this.elements[i].toString(), 570 + 70 * i, 380);
            n = i;
            n2 = i = Integer.valueOf(i + 1);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            String t;
            Integer i;
            Integer j2;
            String gh;
            Integer n;
            Object t2;
            Integer n2 = this.paint_count;
            Integer n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            this.tpx = this.paint_count;
            this.paint_count = 0;
            this.g2d = (Graphics2D)g;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                i = 0;
                while (i < 10) {
                    this.drawSquare(g, 320 + 70 * i, 80);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements[i].toString(), 320 + 70 * i, 80);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                this.timer.start();
            }
            if (this.paint_count < this.tpx) {
                i = 0;
                while (i < 5) {
                    this.drawSquare(g, 220 + 70 * i, 180);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements1[i].toString(), 220 + 70 * i, 180);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 5;
                while (i < 10) {
                    this.drawSquare(g, 440 + 70 * i, 180);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements1[i].toString(), 440 + 70 * i, 180);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = this.paint_count;
                n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 0;
                while (i < 2) {
                    this.drawSquare(g, 180 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements2[i].toString(), 180 + 70 * i, 280);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 2;
                while (i < 5) {
                    this.drawSquare(g, 270 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements2[i].toString(), 270 + 70 * i, 280);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 5;
                while (i < 7) {
                    this.drawSquare(g, 400 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements2[i].toString(), 400 + 70 * i, 280);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 7;
                while (i < 10) {
                    this.drawSquare(g, 490 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements2[i].toString(), 490 + 70 * i, 280);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = this.paint_count;
                n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 0;
                while (i < 1) {
                    this.drawSquare(g, 130 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 130 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 1;
                while (i < 2) {
                    this.drawSquare(g, 200 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 200 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 2;
                while (i < 3) {
                    this.drawSquare(g, 240 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 240 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 3;
                while (i < 5) {
                    this.drawSquare(g, 310 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 310 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 5;
                while (i < 6) {
                    this.drawSquare(g, 370 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 370 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 6;
                while (i < 7) {
                    this.drawSquare(g, 430 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 430 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 7;
                while (i < 8) {
                    this.drawSquare(g, 470 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 470 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 8;
                while (i < 10) {
                    this.drawSquare(g, 570 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 570 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = this.paint_count;
                n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 3;
                while (i < 4) {
                    this.drawSquare(g, 280 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements4[i].toString(), 280 + 70 * i, 480);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 4;
                while (i < 5) {
                    this.drawSquare(g, 350 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements4[i].toString(), 350 + 70 * i, 480);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 8;
                while (i < 9) {
                    this.drawSquare(g, 540 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements4[i].toString(), 540 + 70 * i, 480);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 9;
                while (i < 10) {
                    this.drawSquare(g, 620 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements4[i].toString(), 620 + 70 * i, 480);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = this.paint_count;
                n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 3;
                while (i < 4) {
                    this.drawWhiteSquare(g, 280 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 4;
                while (i < 5) {
                    this.drawWhiteSquare(g, 350 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                if (this.elements4[3].compareTo(this.elements4[4]) > 0) {
                    t = this.elements4[4];
                    this.elements4[4] = this.elements4[3];
                    this.elements4[3] = t;
                }
                i = 3;
                while (i < 5) {
                    this.drawSquare(g, 310 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements4[i].toString(), 310 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                this.copy4();
                i = this.paint_count;
                n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 8;
                while (i < 9) {
                    this.drawWhiteSquare(g, 540 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                if (this.elements4[8].compareTo(this.elements4[9]) > 0) {
                    t = this.elements4[8];
                    this.elements4[8] = this.elements4[9];
                    this.elements4[9] = t;
                }
                i = 9;
                while (i < 10) {
                    this.drawWhiteSquare(g, 620 + 70 * i, 480);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 8;
                while (i < 10) {
                    this.drawSquare(g, 570 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements4[i].toString(), 570 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                this.copy4();
                i = this.paint_count;
                n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 0;
                while (i < 1) {
                    this.drawWhiteSquare(g, 130 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = 1;
                while (i < 2) {
                    this.drawWhiteSquare(g, 200 + 70 * i, 380);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                if (this.elements3[0].compareTo(this.elements[1]) > 0) {
                    gh = this.elements3[0];
                    this.elements3[0] = this.elements3[1];
                    this.elements3[1] = gh;
                }
                i = 0;
                while (i < 2) {
                    this.drawSquare(g, 180 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 180 + 70 * i, 280);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                i = this.paint_count;
                n3 = this.paint_count = Integer.valueOf(this.paint_count + 1);
                this.copy3();
            }
            if (this.paint_count < this.tpx) {
                i = 2;
                while (i < 3) {
                    this.drawWhiteSquare(g, 240 + 70 * i, 380);
                    n3 = i;
                    n = i = Integer.valueOf(i + 1);
                }
                for (int i2 = 2; i2 < 5; ++i2) {
                    for (int j2 = 2; j2 < 4; ++j2) {
                        if (this.elements3[j2].compareTo(this.elements3[j2 + 1]) <= 0) continue;
                        t2 = this.elements3[j2];
                        this.elements3[j2] = this.elements3[j2 + 1];
                        this.elements3[j2 + 1] = t2;
                    }
                }
                i = 3;
                while (i < 5) {
                    this.drawWhiteSquare(g, 310 + 70 * i, 380);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = 2;
                while (i < 5) {
                    this.drawSquare(g, 270 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 270 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                this.copy3();
                i = this.paint_count;
                j2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 5;
                while (i < 6) {
                    this.drawWhiteSquare(g, 370 + 70 * i, 380);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = 6;
                while (i < 7) {
                    this.drawWhiteSquare(g, 430 + 70 * i, 380);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                if (this.elements3[5].compareTo(this.elements[6]) > 0) {
                    gh = this.elements3[5];
                    this.elements3[5] = this.elements3[6];
                    this.elements3[6] = gh;
                }
                i = 5;
                while (i < 7) {
                    this.drawSquare(g, 400 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 400 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                this.copy3();
                i = this.paint_count;
                j2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 7;
                while (i < 8) {
                    this.drawWhiteSquare(g, 470 + 70 * i, 380);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = 8;
                while (i < 10) {
                    this.drawWhiteSquare(g, 570 + 70 * i, 380);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = 7;
                while (i < 10) {
                    this.drawSquare(g, 490 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 490 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                for (int i3 = 7; i3 < 10; ++i3) {
                    for (int j3 = 7; j3 < 9; ++j3) {
                        if (this.elements3[j3].compareTo(this.elements3[j3 + 1]) <= 0) continue;
                        t2 = this.elements3[j3];
                        this.elements3[j3] = this.elements3[j3 + 1];
                        this.elements3[j3 + 1] = t2;
                    }
                }
                i = 7;
                while (i < 10) {
                    this.drawSquare(g, 490 + 70 * i, 280);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements3[i].toString(), 490 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                this.copy3();
                i = this.paint_count;
                j2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 0;
                while (i < 2) {
                    this.drawWhiteSquare(g, 180 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = 2;
                while (i < 5) {
                    this.drawWhiteSquare(g, 270 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                for (int i4 = 0; i4 < 5; ++i4) {
                    for (int j4 = 0; j4 < 4; ++j4) {
                        if (this.elements2[j4].compareTo(this.elements2[j4 + 1]) <= 0) continue;
                        t2 = this.elements2[j4];
                        this.elements2[j4] = this.elements2[j4 + 1];
                        this.elements2[j4 + 1] = t2;
                    }
                }
                i = 0;
                while (i < 5) {
                    this.drawSquare(g, 220 + 70 * i, 180);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements2[i].toString(), 220 + 70 * i, 180);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                this.copy2();
                i = this.paint_count;
                j2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 5;
                while (i < 7) {
                    this.drawWhiteSquare(g, 400 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = 7;
                while (i < 10) {
                    this.drawWhiteSquare(g, 490 + 70 * i, 280);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                for (int i5 = 5; i5 < 10; ++i5) {
                    for (int j5 = 5; j5 < 9; ++j5) {
                        if (this.elements2[j5].compareTo(this.elements2[j5 + 1]) <= 0) continue;
                        t2 = this.elements2[j5];
                        this.elements2[j5] = this.elements2[j5 + 1];
                        this.elements2[j5 + 1] = t2;
                    }
                }
                i = 5;
                while (i < 10) {
                    this.drawSquare(g, 440 + 70 * i, 180);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements2[i].toString(), 440 + 70 * i, 180);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                this.copy2();
                i = this.paint_count;
                j2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                i = 0;
                while (i < 5) {
                    this.drawWhiteSquare(g, 220 + 70 * i, 180);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = 5;
                while (i < 10) {
                    this.drawWhiteSquare(g, 440 + 70 * i, 180);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                Arrays.sort(this.elements1);
                this.copy1();
                Arrays.sort(this.elements);
                i = 0;
                while (i < 10) {
                    this.drawSquare(g, 320 + 70 * i, 80);
                    this.g2d.setFont(new Font("Times New Roman", 1, 20));
                    this.g2d.drawString(this.elements1[i].toString(), 320 + 70 * i, 80);
                    j2 = i;
                    t2 = i = Integer.valueOf(i + 1);
                }
                i = this.paint_count;
                Integer j5 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            if (this.paint_count < this.tpx) {
                this.g2d.setFont(new Font("Times New Roman", 1, 24));
                this.g2d.drawString("Elements Swapped", 300, 200);
                this.timer.stop();
            }
            this.paint_count = this.tpx;
            System.out.println(this.paint_count);
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    void copy4() {
        for (int i = 0; i < 10; ++i) {
            this.elements3[i] = this.elements4[i];
        }
    }

    void copy3() {
        for (int i = 0; i < 10; ++i) {
            this.elements2[i] = this.elements3[i];
        }
    }

    void copy2() {
        for (int i = 0; i < 10; ++i) {
            this.elements1[i] = this.elements2[i];
        }
    }

    void copy1() {
        for (int i = 0; i < 10; ++i) {
            this.elements[i] = this.elements1[i];
        }
    }

    void shrinking() {
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 153));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1078, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 622, 32767));
    }

}

