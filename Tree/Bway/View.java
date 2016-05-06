/*
 * Decompiled with CFR 0_114.
 */
package Tree.Bway;

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
    Integer operation = 5;
    Integer showone = 1;
    int cases = 0;
    int repaint_counter = 0;
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
        this.timer = new Timer(5000, new ActionListener(){

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

    void drawSquare(Graphics g, Integer x, Integer y, String[] s1, int n) {
        int i;
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        int z = 0;
        for (i = 0; i < n; ++i) {
            this.g2d.setStroke(new BasicStroke(4.0f));
            this.g2d.setPaint(Color.ORANGE);
            this.g2d.drawRect(x + 50 * i, y, 50, 50);
            this.g2d.fillRect(x + 50 * i, y, 50, 50);
            this.g2d.setPaint(Color.black);
            try {
                this.g2d.drawString(s1[i], x + 25 + 50 * i, y + 25);
            }
            catch (Exception e) {
                // empty catch block
            }
            this.g2d.drawLine(x + 50 * i, y, x + 50 * (i + 1), y);
            this.g2d.drawLine(x + 50 * i, y, x + 50 * i, y + 50);
            z = x + 50 * (i + 1);
        }
        this.g2d.drawLine(z, y, z, y + 50);
        y = y + 50;
        x = x - 25;
        for (i = 0; i < n + 1; ++i) {
            this.g2d.setPaint(Color.CYAN);
            this.g2d.fillRect(x + 50 * i, y, 50, 50);
            this.g2d.setPaint(Color.black);
            this.g2d.drawLine(x + 50 * i, y, x + 50 * (i + 1), y);
            this.g2d.drawLine(x + 50 * i, y + 50, x + 50 * (i + 1), y + 50);
            this.g2d.drawLine(x + 50 * i, y, x + 50 * i, y + 50);
            z = x + 50 * (i + 1);
        }
        this.g2d.drawLine(z, y, z, y + 50);
        this.g2d.setColor(Color.red);
        this.g2d.setFont(new Font("Times New Roman", 1, 24));
        this.g2d.setPaint(Color.black);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Integer n = this.paint_count;
        Integer n2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
        this.g2d = (Graphics2D)g;
        if (this.j == 10) {
            this.j = 0;
        }
        if (this.cases == 1) {
            this.caseone(g);
        }
        if (this.cases == 2) {
            this.casetwo(g);
        }
        if (this.cases == 3) {
            this.casethree(g);
        }
    }

    void casethree(Graphics g) {
        try {
            if (this.paint_count >= 0) {
                String[] s5;
                String[] s2;
                String[] s1;
                String[] s4;
                String[] s3;
                if (this.paint_count == 2) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("Since,8>3  So,move to next node", 150, 50);
                    this.g2d.drawString("------->", 260, 180);
                    this.g2d.setColor(Color.black);
                    this.showone = 1;
                }
                if (this.paint_count == 3) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("Since,8<3  So,move to left key node", 150, 50);
                    this.g2d.drawString("------------>", 260, 180);
                    this.g2d.setColor(Color.black);
                    this.showone = 1;
                }
                if (this.paint_count == 4) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("Since,8>4  So,move to next node", 150, 50);
                    this.g2d.drawString("------->", 310, 420);
                    this.g2d.setColor(Color.black);
                    this.showone = 1;
                }
                if (this.paint_count == 5) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("Since,8>5  So,move to next node", 150, 50);
                    this.g2d.drawString("------------>", 310, 420);
                    this.g2d.setColor(Color.black);
                    this.showone = 1;
                }
                if (this.paint_count == 6) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("Since,8>7  So,move to next node", 150, 50);
                    this.g2d.drawString("------------------->", 310, 420);
                    this.g2d.setColor(Color.black);
                    this.showone = 1;
                }
                if (this.paint_count == 7) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("8 should be inserted after this... But the node gets full", 150, 50);
                    this.g2d.drawString("Let's first insert 8 - case 2", 150, 80);
                    this.g2d.drawString("------------------->", 310, 420);
                    this.g2d.setColor(Color.black);
                    this.showone = 1;
                }
                if (this.paint_count == 9) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("Pop out the middle element and put in the previous node", 150, 50);
                    this.drawVerticalArrow(g, 375, 350, 375, 400);
                    this.g2d.setColor(Color.black);
                    this.showone = 2;
                }
                if (this.paint_count == 10) {
                    this.g2d.setColor(Color.red);
                    this.g2d.setFont(new Font("Times New Roman", 1, 24));
                    this.g2d.drawString("------->", 150, 175);
                    this.g2d.drawString("Since the node is full.Pop out the middle element", 150, 50);
                    this.drawVerticalArrow(g, 375, 100, 375, 150);
                    this.g2d.setColor(Color.black);
                    this.showone = 3;
                }
                if (this.paint_count == 11) {
                    this.showone = 4;
                }
                if (this.repaint_counter == 0) {
                    this.repaint_counter = 1;
                    this.repaint();
                    return;
                }
                if (this.showone == 1) {
                    this.g2d.setColor(Color.green);
                    this.g2d.setFont(new Font("Times New Roman", 1, 18));
                    this.g2d.drawString("8  is to be inserted", 80, 24);
                    this.g2d.setColor(Color.black);
                    s1 = new String[]{"3", "9", "13"};
                    this.drawSquare(g, 300, 150, s1, 3);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"1", "2"};
                    this.drawSquare(g, 100, 400, s2, 2);
                    this.g2d.drawLine(350, 225, 375, 400);
                    s3 = new String[]{"4", "5", "7"};
                    this.drawSquare(g, 350, 400, s3, 3);
                    this.g2d.drawLine(400, 225, 625, 400);
                    s4 = new String[]{"10", "12"};
                    this.drawSquare(g, 600, 400, s4, 2);
                    this.g2d.drawLine(450, 225, 825, 400);
                    s5 = new String[]{"21"};
                    this.drawSquare(g, 800, 400, s5, 1);
                }
                if (this.showone == 2) {
                    this.g2d.setColor(Color.green);
                    this.g2d.setFont(new Font("Times New Roman", 1, 18));
                    this.g2d.drawString("8  is to be inserted", 80, 24);
                    this.g2d.setColor(Color.black);
                    s1 = new String[]{"3", "9", "13"};
                    this.drawSquare(g, 300, 150, s1, 3);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"1", "2"};
                    this.drawSquare(g, 100, 400, s2, 2);
                    this.g2d.drawLine(350, 225, 325, 400);
                    s3 = new String[]{"4", "5", "7", "8"};
                    this.drawSquare(g, 300, 400, s3, 4);
                    this.g2d.drawLine(400, 225, 625, 400);
                    s4 = new String[]{"10", "12"};
                    this.drawSquare(g, 600, 400, s4, 2);
                    this.g2d.drawLine(450, 225, 825, 400);
                    s5 = new String[]{"21"};
                    this.drawSquare(g, 800, 400, s5, 1);
                }
                if (this.showone == 3) {
                    this.g2d.setColor(Color.green);
                    this.g2d.setFont(new Font("Times New Roman", 1, 18));
                    this.g2d.drawString("8  is to be inserted", 80, 24);
                    this.g2d.setColor(Color.black);
                    s1 = new String[]{"3", "5", "9", "13"};
                    this.drawSquare(g, 300, 150, s1, 4);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"1", "2"};
                    this.drawSquare(g, 100, 400, s2, 2);
                    this.g2d.drawLine(350, 225, 325, 400);
                    s3 = new String[]{"4"};
                    this.drawSquare(g, 300, 400, s3, 1);
                    String[] s6 = new String[]{"7", "8"};
                    this.drawSquare(g, 425, 400, s6, 2);
                    this.g2d.drawLine(400, 225, 450, 400);
                    String[] s42 = new String[]{"10", "12"};
                    this.drawSquare(g, 600, 400, s42, 2);
                    this.g2d.drawLine(450, 225, 625, 400);
                    String[] s52 = new String[]{"21"};
                    this.drawSquare(g, 800, 400, s52, 1);
                    this.g2d.drawLine(500, 225, 825, 400);
                }
                if (this.showone == 4) {
                    this.g2d.setColor(Color.green);
                    this.g2d.setFont(new Font("Times New Roman", 1, 18));
                    this.g2d.drawString("8  is to be inserted", 80, 24);
                    this.g2d.setColor(Color.black);
                    String[] s8 = new String[]{"5"};
                    this.drawSquare(g, 400, 25, s8, 1);
                    this.g2d.drawLine(400, 100, 325, 175);
                    String[] s12 = new String[]{"3"};
                    this.drawSquare(g, 300, 175, s12, 1);
                    this.g2d.drawLine(450, 100, 525, 175);
                    String[] s7 = new String[]{"9", "13"};
                    this.drawSquare(g, 500, 175, s7, 2);
                    this.g2d.drawLine(300, 250, 125, 400);
                    String[] s22 = new String[]{"1", "2"};
                    this.drawSquare(g, 100, 400, s22, 2);
                    this.g2d.drawLine(350, 250, 325, 400);
                    String[] s32 = new String[]{"4"};
                    this.drawSquare(g, 300, 400, s32, 1);
                    String[] s6 = new String[]{"7", "8"};
                    this.drawSquare(g, 425, 400, s6, 2);
                    this.g2d.drawLine(500, 250, 450, 400);
                    String[] s43 = new String[]{"10", "12"};
                    this.drawSquare(g, 600, 400, s43, 2);
                    this.g2d.drawLine(550, 250, 625, 400);
                    String[] s53 = new String[]{"21"};
                    this.drawSquare(g, 800, 400, s53, 1);
                    this.g2d.drawLine(600, 250, 825, 400);
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

    void casetwo(Graphics g) {
        try {
            if (this.paint_count >= 0) {
                String[] s2;
                String[] s1;
                String[] s3;
                if (this.showone == 1) {
                    this.g2d.setColor(Color.green);
                    this.g2d.setFont(new Font("Times New Roman", 1, 18));
                    this.g2d.drawString("6  is to be inserted", 80, 24);
                    this.g2d.setColor(Color.black);
                    s1 = new String[]{"12", "", "", ""};
                    this.drawSquare(g, 300, 150, s1, 4);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"2", "5", "7", "8"};
                    this.drawSquare(g, 100, 400, s2, 4);
                    this.g2d.drawLine(350, 225, 525, 400);
                    s3 = new String[]{"13", "15", "", ""};
                    this.drawSquare(g, 500, 400, s3, 4);
                }
                this.timer.start();
                if (this.showone == 2) {
                    s1 = new String[]{"12", "", "", ""};
                    this.drawSquare(g, 300, 150, s1, 4);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"2", "5", "6", "7", "8"};
                    this.drawSquare(g, 100, 400, s2, 5);
                    this.g2d.drawLine(350, 225, 525, 400);
                    s3 = new String[]{"13", "15", "", ""};
                    this.drawSquare(g, 500, 400, s3, 4);
                }
                if (this.showone == 3) {
                    s1 = new String[]{"6", "12", "", ""};
                    this.drawSquare(g, 300, 150, s1, 4);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"2", "5", "", ""};
                    this.drawSquare(g, 100, 400, s2, 4);
                    String[] s4 = new String[]{"7", "8", "", ""};
                    this.drawSquare(g, 400, 400, s4, 4);
                    this.g2d.drawLine(350, 225, 425, 400);
                    this.g2d.drawLine(400, 225, 775, 400);
                    String[] s32 = new String[]{"13", "15", "", ""};
                    this.drawSquare(g, 750, 400, s32, 4);
                }
            }
            if (this.paint_count == 3) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Since,6<12  So,move to left key node", 150, 50);
                this.g2d.drawString("------->", 200, 160);
                this.g2d.setColor(Color.black);
            }
            if (this.paint_count == 4) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Since,6>2  So,move to next node", 150, 50);
                this.g2d.drawString("------->", 30, 425);
                this.g2d.setColor(Color.black);
            }
            if (this.paint_count == 5) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Since,6>5  So,move to next node", 150, 50);
                this.g2d.drawString("-------------->", 30, 425);
                this.g2d.setColor(Color.black);
            }
            if (this.paint_count == 6) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Since,6<7  So,this is the perfect place to insert in... But its already full", 150, 50);
                this.g2d.drawString("Let's first insert 6", 150, 90);
                this.g2d.setColor(Color.black);
                this.showone = 2;
            }
            if (this.paint_count == 7) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Now take out the middle element and divide the rest into two halves", 150, 50);
                this.g2d.setColor(Color.black);
                this.showone = 3;
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    void caseone(Graphics g) {
        try {
            if (this.paint_count == 0) {
                this.g2d.setColor(Color.green);
                Font f = this.g2d.getFont();
                this.g2d.setFont(new Font("Times New Roman", 1, 24));
                this.g2d.drawString("Case 1: A key is placed into a leaf that still has a room", 100, 50);
                this.g2d.drawString("Case 2: The leaf in which a key is to be placed is full", 100, 200);
                this.g2d.drawString("Case 3: A leaf in which a key is to be placed is full while the parent is also full", 100, 350);
                this.g2d.setColor(Color.black);
                this.g2d.setFont(f);
                this.timer.start();
            }
            if (this.paint_count > 0) {
                String[] s2;
                String[] s1;
                String[] s3;
                if (this.showone == 1) {
                    this.g2d.setColor(Color.green);
                    this.g2d.setFont(new Font("Times New Roman", 1, 18));
                    this.g2d.drawString("7  is to be inserted", 80, 20);
                    this.g2d.setColor(Color.black);
                    s1 = new String[]{"12", "", "", ""};
                    this.drawSquare(g, 300, 150, s1, 4);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"5", "8", "", ""};
                    this.drawSquare(g, 100, 400, s2, 4);
                    this.g2d.drawLine(350, 225, 525, 400);
                    s3 = new String[]{"13", "15", "", ""};
                    this.drawSquare(g, 500, 400, s3, 4);
                }
                if (this.showone == 2) {
                    s1 = new String[]{"12", "", "", ""};
                    this.drawSquare(g, 300, 150, s1, 4);
                    this.g2d.drawLine(300, 225, 125, 400);
                    s2 = new String[]{"5", "7", "8", ""};
                    this.drawSquare(g, 100, 400, s2, 4);
                    this.g2d.drawLine(350, 225, 525, 400);
                    s3 = new String[]{"13", "15", "", ""};
                    this.drawSquare(g, 500, 400, s3, 4);
                    this.g2d.setColor(Color.red);
                    int i = 1;
                    int x = 100;
                    int y = 400;
                    this.g2d.drawString(s2[i], x + 25 + 50 * i, y + 25);
                    this.g2d.drawString("  So,now  7  is inserted", 150, 50);
                    this.g2d.setColor(Color.black);
                }
            }
            if (this.paint_count == 3) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Since,7<12  So,move to left key node", 150, 50);
                this.g2d.drawString("------->", 200, 160);
                this.g2d.setColor(Color.black);
            }
            if (this.paint_count == 4) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Since,7>5  So,move to next node", 150, 50);
                this.g2d.drawString("------->", 30, 425);
                this.g2d.setColor(Color.black);
            }
            if (this.paint_count == 5) {
                this.g2d.setColor(Color.red);
                this.g2d.drawString("Since,7<8  So,this is the perfect place to insert in...", 150, 50);
                this.g2d.drawString("-------------->", 30, 425);
                this.g2d.setColor(Color.black);
                this.showone = 2;
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 102));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 550, 32767));
    }

}

