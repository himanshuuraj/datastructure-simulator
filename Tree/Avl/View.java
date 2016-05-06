/*
 * Decompiled with CFR 0_114.
 */
package Tree.Avl;

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
    int basic = 0;
    int rotate = 0;
    Timer timer;
    float[] dash3 = new float[]{4.0f, 0.0f, 2.0f};
    Graphics2D g2d;
    int paint_count;
    int j;
    int insert = 0;
    int p = 8;
    BasicStroke bs3;
    BasicStroke bs1;

    public View() {
        this.initComponents();
        this.timer = new Timer(3000, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                View.this.repaint();
            }
        });
        this.bs3 = new BasicStroke(2.0f, 0, 1, 1.0f, this.dash3, 2.0f);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            this.g2d = (Graphics2D)g;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                this.timer.start();
            }
            if (this.rotate == 1) {
                this.rotatecases(g);
                this.rotate = 0;
            }
            if (this.basic == 1) {
                this.basiccases(g);
                this.basic = 0;
            }
            if (this.insert == 1) {
                if (this.p == 1) {
                    this.timer.start();
                    System.out.println("Hello");
                    this.p = 5;
                }
                this.insertone(g);
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    void insertone(Graphics g) {
        ++this.paint_count;
        System.out.println("hit  " + this.paint_count);
        try {
            if (this.j > -1) {
                this.g2d.setColor(Color.red);
                this.g2d.setFont(new Font("Times New Roman", 1, 24));
                this.g2d.drawString("Insert 14,15,16,13,12,11,10", 150, 50);
                this.g2d.setColor(Color.black);
            }
            if (this.paint_count == 0) {
                this.g2d.drawString("Its balanced", 200, 100);
                this.drawcircle(g, "14", 500, 250);
            }
            if (this.paint_count == 1) {
                this.g2d.drawString("Its balanced", 200, 100);
                this.drawlline(500, 250, 560, 310);
                this.drawcircle(g, "15", 560, 310);
                this.drawcircle(g, "14", 500, 250);
            }
            if (this.paint_count == 2) {
                this.g2d.drawString("Its not balanced -- need to rotate ", 200, 100);
                this.drawlline(560, 310, 610, 370);
                this.drawcircle(g, "16", 610, 370);
                this.drawlline(500, 250, 560, 310);
                this.drawcircle(g, "15", 560, 310);
                this.drawcircle(g, "14", 500, 250);
            }
            if (this.paint_count == 3) {
                this.drawlline(560, 310, 610, 370);
                this.drawcircle(g, "16", 610, 370);
                this.drawlline(500, 250, 560, 310);
                this.drawcircle(g, "15", 560, 310);
                this.drawcircle(g, "14", 500, 250);
                this.g2d.drawString("Left rotation needed", 200, 100);
                this.drawshape(540, 290);
            }
            if (this.paint_count == 4) {
                this.g2d.drawString("Balanced", 200, 100);
                this.drawcircle(g, "16", 560, 310);
                this.drawcircle(g, "15", 500, 250);
                this.drawcircle(g, "14", 440, 310);
                this.drawlline(500, 250, 560, 310);
                this.drawlline(500, 250, 440, 310);
            }
            if (this.paint_count == 5) {
                this.g2d.drawString("Balanced", 200, 100);
                this.drawcircle(g, "16", 560, 310);
                this.drawcircle(g, "15", 500, 250);
                this.drawcircle(g, "14", 440, 310);
                this.drawlline(500, 250, 560, 310);
                this.drawlline(500, 250, 440, 310);
                this.drawcircle(g, "10", 380, 370);
                this.drawlline(440, 310, 380, 370);
            }
            if (this.paint_count == 6) {
                this.g2d.drawString("Balanced", 200, 100);
                this.drawcircle(g, "16", 560, 310);
                this.drawcircle(g, "15", 500, 250);
                this.drawcircle(g, "14", 440, 310);
                this.drawlline(500, 250, 560, 310);
                this.drawlline(500, 250, 440, 310);
                this.drawcircle(g, "10", 380, 370);
                this.drawlline(440, 310, 380, 370);
                this.drawcircle(g, "06", 320, 430);
                this.drawlline(380, 370, 320, 430);
            }
            if (this.paint_count == 7) {
                this.g2d.drawString("Balanced", 200, 100);
                this.drawcircle(g, "16", 560, 310);
                this.drawcircle(g, "15", 500, 250);
                this.drawcircle(g, "10", 440, 310);
                this.drawlline(500, 250, 560, 310);
                this.drawlline(500, 250, 440, 310);
                this.drawcircle(g, "06", 380, 370);
                this.drawlline(440, 310, 380, 370);
                this.drawcircle(g, "14", 500, 370);
                this.drawlline(440, 310, 500, 370);
            }
            if (this.paint_count == 8) {
                this.g2d.drawString("Balanced", 200, 100);
                this.drawcircle(g, "16", 560, 310);
                this.drawcircle(g, "15", 500, 250);
                this.drawcircle(g, "10", 440, 310);
                this.drawlline(500, 250, 560, 310);
                this.drawlline(500, 250, 440, 310);
                this.drawcircle(g, "06", 380, 370);
                this.drawlline(440, 310, 380, 370);
                this.drawcircle(g, "14", 500, 370);
                this.drawlline(440, 310, 500, 370);
                this.drawcircle(g, "8", 440, 430);
                this.drawlline(380, 370, 440, 430);
            }
            if (this.paint_count == 9) {
                this.g2d.drawString("Balanced", 200, 100);
                this.drawcircle(g, "16", 560, 310);
                this.drawcircle(g, "15", 500, 250);
                this.drawcircle(g, "10", 440, 310);
                this.drawlline(500, 250, 560, 310);
                this.drawlline(500, 250, 440, 310);
                this.drawcircle(g, "06", 380, 370);
                this.drawlline(440, 310, 380, 370);
                this.drawcircle(g, "14", 500, 370);
                this.drawlline(440, 310, 500, 370);
                this.drawcircle(g, "8", 440, 430);
                this.drawlline(380, 370, 440, 430);
                this.drawVerticalArrow(g, 460, 310, 460, 430);
                --this.paint_count;
            }
        }
        catch (Exception e) {
            System.out.println("illegal  " + e.getMessage());
        }
    }

    void basiccases(Graphics g) {
        try {
            this.g2d.setFont(new Font("Times New Roman", 1, 24));
            this.g2d.drawString("1.  AVL tree is similiar to BST", 150, 140);
            this.g2d.drawString("2.  Each node in AVL should have balance factor either 0,-1 or 1", 150, 180);
            this.g2d.drawString("3.  Balance factor =  depth(right) - depth(left)", 150, 220);
            this.g2d.drawString("4.  depth(right) of a node is the number of nodes from that node to", 150, 260);
            this.g2d.drawString("     longest leaf node in the right side", 150, 300);
            this.g2d.drawString("Example:  ", 180, 340);
            this.drawcircle(g, "45", 120, 430);
            this.g2d.drawString("a", 120, 430);
            this.drawcircle(g, "64", 170, 490);
            this.g2d.drawString("b", 180, 490);
            this.drawcircle(g, "96", 220, 550);
            this.g2d.drawString("c", 240, 550);
            this.drawcircle(g, "34", 60, 490);
            this.g2d.drawString("d", 70, 490);
            this.g2d.drawString("1.  Balance factor of a = depth(right)- depth(left)", 350, 380);
            this.g2d.drawString("                        = 2 - 1 = 1", 350, 410);
            this.g2d.drawString("2.  Balance factor of b = depth(right)- depth(left)", 350, 450);
            this.g2d.drawString("                        = 1 - 0 = 0", 350, 490);
            this.g2d.drawString("3.  Balance factor of c and d = depth(right)- depth(left)", 350, 530);
            this.g2d.drawString("                        = 0 - 0 = 0", 350, 570);
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    void drawcircle(Graphics g, String t, Integer x, Integer y) {
        this.g2d = (Graphics2D)g;
        this.g2d.setPaint(Color.CYAN);
        this.g2d.fillOval(x, y, 40, 40);
        this.g2d.setPaint(Color.BLACK);
        this.g2d.drawString(t, x + 15, y + 28);
    }

    void drawlline(int x1, int y1, int x2, int y2) {
        this.bs1 = (BasicStroke)this.g2d.getStroke();
        this.g2d.setStroke(this.bs3);
        this.g2d.drawLine(x1 += 20, y1 += 35, x2 += 20, y2 += 5);
        this.g2d.setStroke(this.bs1);
    }

    void drawrightline(int x1, int y1, int x2, int y2) {
        this.g2d.setStroke(this.bs3);
        this.g2d.drawLine(x1 += 20, y1 += 35, x2 += 20, y2 += 5);
        this.g2d.setStroke(this.bs1);
    }

    void drawVerticalArrow(Graphics g, Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.setColor(Color.GREEN);
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x1, y1, x1 - 7, y1 + 7);
        this.g2d.drawLine(x1, y1, x1 + 7, y1 + 7);
        this.g2d.setColor(Color.black);
        this.g2d.setStroke(new BasicStroke(2.0f));
    }

    void drawshape(int x, int y) {
        this.g2d.setStroke(this.bs1);
        this.g2d.setPaint(Color.red);
        this.g2d.drawOval(x, y, 12, 12);
        this.g2d.setPaint(Color.black);
    }

    void rotatecases(Graphics g) {
        this.g2d.setFont(new Font("Times New Roman", 1, 24));
        this.g2d.setPaint(new Color(255, 0, 0));
        this.g2d.drawString("Rotation 1 -- LR", 50, 25);
        this.g2d.drawString("Rotation 2 -- LL", 550, 25);
        this.g2d.drawString("Rotation 3 -- LR", 50, 350);
        this.g2d.drawString("Rotation 4 -- LL", 550, 350);
        this.bs1 = (BasicStroke)this.g2d.getStroke();
        this.g2d.setStroke(this.bs3);
        this.g2d.drawLine(500, 0, 500, 700);
        this.g2d.drawLine(0, 325, 1000, 325);
        this.g2d.setPaint(Color.GREEN);
        this.g2d.drawString("Valid only when abc", 50, 50);
        this.g2d.drawString("Valid only when abc", 550, 50);
        this.g2d.drawString("Valid only when abc", 50, 375);
        this.g2d.drawString("Valid only when abc", 550, 375);
        this.g2d.setPaint(Color.black);
        this.drawcircle(g, "85", 120, 130);
        this.drawcircle(g, "64", 70, 190);
        this.drawcircle(g, "36", 20, 250);
        this.drawlline(120, 130, 70, 190);
        this.drawlline(70, 190, 20, 250);
        this.drawshape(110, 175);
        this.drawcircle(g, "64", 320, 130);
        this.drawcircle(g, "85", 380, 190);
        this.drawcircle(g, "36", 260, 190);
        this.drawlline(320, 130, 260, 190);
        this.drawrightline(320, 130, 380, 190);
        this.g2d.setPaint(Color.blue);
        this.g2d.drawString("(2)", 120, 130);
        this.g2d.drawString("(1)", 60, 190);
        this.g2d.drawString("(0)", 10, 250);
        this.g2d.drawString("(1)", 310, 130);
        this.g2d.drawString("(0)", 390, 190);
        this.g2d.drawString("(0)", 250, 190);
        this.g2d.setPaint(Color.BLACK);
        this.drawcircle(g, "45", 520, 130);
        this.drawcircle(g, "64", 570, 190);
        this.drawcircle(g, "96", 620, 250);
        this.drawlline(520, 130, 570, 190);
        this.drawlline(570, 190, 620, 250);
        this.drawshape(670, 175);
        this.drawcircle(g, "45", 820, 130);
        this.drawcircle(g, "96", 880, 190);
        this.drawcircle(g, "64", 760, 190);
        this.drawlline(820, 130, 760, 190);
        this.drawrightline(820, 130, 880, 190);
        this.g2d.setPaint(Color.blue);
        this.g2d.drawString("(1)", 520, 130);
        this.g2d.drawString("(0)", 570, 190);
        this.g2d.drawString("(0)", 620, 250);
        this.g2d.drawString("(1)", 810, 130);
        this.g2d.drawString("(0)", 880, 190);
        this.g2d.drawString("(0)", 750, 190);
        this.g2d.setPaint(Color.BLACK);
        this.drawcircle(g, "45", 20, 480);
        this.drawcircle(g, "64", 70, 540);
        this.drawcircle(g, "56", 20, 600);
        this.drawVerticalArrow(g, 30, 520, 30, 600);
        this.drawlline(20, 480, 70, 540);
        this.drawlline(70, 540, 20, 600);
        this.drawcircle(g, "56", 320, 480);
        this.drawcircle(g, "64", 380, 540);
        this.drawcircle(g, "45", 260, 540);
        this.drawlline(320, 480, 260, 540);
        this.drawrightline(320, 480, 380, 540);
        this.g2d.setPaint(Color.blue);
        this.g2d.drawString("(1)", 20, 480);
        this.g2d.drawString("(0)", 70, 540);
        this.g2d.drawString("(0)", 20, 600);
        this.g2d.drawString("(1)", 310, 480);
        this.g2d.drawString("(0)", 380, 540);
        this.g2d.drawString("(0)", 250, 540);
        this.g2d.setPaint(Color.BLACK);
        this.drawcircle(g, "45", 570, 480);
        this.drawcircle(g, "56", 520, 540);
        this.drawcircle(g, "64", 570, 600);
        this.g2d.setPaint(Color.red);
        this.g2d.setPaint(Color.black);
        this.drawVerticalArrow(g, 600, 520, 600, 600);
        this.drawlline(570, 480, 520, 540);
        this.drawlline(520, 540, 570, 600);
        this.drawcircle(g, "64", 820, 480);
        this.drawcircle(g, "56", 880, 540);
        this.drawcircle(g, "45", 760, 540);
        this.drawlline(820, 480, 760, 540);
        this.drawrightline(820, 480, 880, 540);
        this.g2d.setPaint(Color.blue);
        this.g2d.drawString("(1)", 570, 480);
        this.g2d.drawString("(0)", 520, 540);
        this.g2d.drawString("(0)", 570, 600);
        this.g2d.drawString("(1)", 810, 480);
        this.g2d.drawString("(0)", 880, 540);
        this.g2d.drawString("(0)", 750, 540);
        this.g2d.setPaint(Color.BLACK);
    }

    private void initComponents() {
        this.setBackground(new Color(255, 204, 102));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 600, 32767));
    }

}

