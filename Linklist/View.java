/*
 * Decompiled with CFR 0_114.
 */
package Linklist;

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
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class View
extends JPanel
implements ActionListener {
    int rear = 1;
    int front = 0;
    Graphics2D g2d;
    String[] link = new String[10];
    Timer timer;

    public View() {
        this.initComponents();
        this.setSize(1100, 450);
        Integer i = 0;
        while (i < 10) {
            this.link[i.intValue()] = new String(i.toString());
            Integer n = i;
            Integer n2 = i = Integer.valueOf(i + 1);
        }
        this.timer = new Timer(1000, this);
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 102));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 980, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 450, 32767));
    }

    private void doDrawing(Graphics g) throws InterruptedException {
        this.g2d = (Graphics2D)g;
    }

    void drawSquare(Graphics g, Integer x, Integer y) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.setPaint(Color.ORANGE);
        this.g2d.fillRect(x - 30, y - 30, 70, 50);
        x = x + 70;
        this.g2d.setPaint(Color.CYAN);
        this.g2d.fillRect(x - 30, y - 30, 70, 50);
        this.g2d.setPaint(Color.black);
    }

    void drawArrow(Graphics g, Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x2, y2, x2 - 7, y2 - 7);
        this.g2d.drawLine(x2, y2, x2 - 7, y2 + 7);
    }

    void drawVerticalArrow(Graphics g, Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d = (Graphics2D)g;
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x2, y2, x2 - 7, y2 - 7);
        this.g2d.drawLine(x2, y2, x2 + 7, y2 - 7);
    }

    void drawRightArrow(Graphics g, Integer x1, Integer y1, Integer x2, Integer y2) {
        this.g2d = (Graphics2D)g;
        this.g2d.drawLine(x1, y1, x2, y2);
        this.g2d.drawLine(x2, y2, x2 + 7, y2 - 7);
        this.g2d.drawLine(x2, y2, x2 + 7, y2 + 7);
    }

    void drawOppositeSquare(Graphics g, Integer x, Integer y) {
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(2.0f));
        this.g2d.setPaint(Color.cyan);
        this.g2d.fillRect(x - 30, y - 30, 70, 50);
        x = x + 70;
        this.g2d.setPaint(Color.orange);
        this.g2d.fillRect(x - 30, y - 30, 70, 50);
        this.g2d.setPaint(Color.black);
    }

    public void draw(Graphics g, int n, int rear) throws InterruptedException {
        System.out.println("" + n + "     " + rear);
        int i = rear;
        if (this.front < rear) {
            ++this.front;
        }
        if (i == 1 && i <= n) {
            this.drawSquare(g, 50, 150);
            this.drawArrow(g, 160, 147, 250, 147);
            this.g2d.setFont(new Font("Times New Roman", 0, 18));
            Thread.sleep(1000);
            this.timer.setRepeats(false);
            this.timer.setCoalesce(true);
            this.timer.setInitialDelay(1000);
            this.timer.start();
            g.drawString(this.link[i - 1].toString(), 120, 150);
            g.drawString("x1", 85, 185);
            g.drawString("XX", 50, 150);
            this.timer.stop();
            ++i;
        }
        if (i == 2 && i <= n) {
            this.drawSquare(g, 285, 150);
            this.drawArrow(g, 395, 147, 485, 147);
            g.drawString(this.link[i - 1].toString(), 355, 150);
            g.drawString("x1", 285, 150);
            g.drawString("x2", 320, 185);
            ++i;
        }
        if (i == 3 && i <= n) {
            this.drawSquare(g, 520, 150);
            this.drawArrow(g, 630, 147, 720, 147);
            g.drawString(this.link[i - 1].toString(), 590, 150);
            g.drawString("x2", 520, 150);
            g.drawString("x3", 555, 185);
            ++i;
        }
        if (i == 4 && i <= n) {
            this.drawSquare(g, 755, 150);
            this.drawArrow(g, 865, 147, 955, 147);
            g.drawString(this.link[i - 1].toString(), 825, 150);
            g.drawString("x3", 755, 150);
            g.drawString("x4", 790, 185);
            ++i;
        }
        if (i == 5 && i <= n) {
            this.drawSquare(g, 990, 150);
            g.drawString("x4", 990, 150);
            g.drawString("x5", 1025, 185);
            g.drawString(this.link[i - 1].toString(), 1060, 150);
            ++i;
        }
        if (i == 6 && i <= n) {
            this.drawOppositeSquare(g, 990, 275);
            this.drawVerticalArrow(g, 990, 170, 990, 245);
            g.drawString(this.link[i - 1].toString(), 990, 275);
            g.drawString("x5", 1060, 275);
            g.drawString("x6", 1025, 310);
            ++i;
        }
        if (i == 7 && i <= n) {
            this.drawOppositeSquare(g, 755, 275);
            this.drawRightArrow(g, 955, 275, 865, 275);
            g.drawString(this.link[i - 1].toString(), 755, 275);
            g.drawString("x6", 825, 275);
            g.drawString("x7", 790, 310);
            ++i;
        }
        if (i == 8 && i <= n) {
            this.drawOppositeSquare(g, 520, 275);
            g.drawString("x8", 555, 310);
            g.drawString(this.link[i - 1].toString(), 520, 275);
            g.drawString("x7", 590, 275);
            this.drawRightArrow(g, 720, 275, 630, 275);
            ++i;
        }
        if (i == 9 && i <= n) {
            this.drawOppositeSquare(g, 285, 275);
            this.drawRightArrow(g, 485, 275, 395, 275);
            g.drawString(this.link[i - 1].toString(), 285, 275);
            g.drawString("x8", 365, 275);
            g.drawString("x9", 320, 310);
            ++i;
        }
        if (i == 10 && i <= n) {
            this.drawOppositeSquare(g, 50, 275);
            g.drawString("x10", 85, 310);
            g.drawString(this.link[i - 1].toString(), 50, 275);
            g.drawString("x9", 120, 275);
            this.drawRightArrow(g, 250, 275, 160, 275);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            this.doDrawing(g);
            this.draw(g, this.front, this.rear);
        }
        catch (Exception ex) {
            Logger.getLogger(Queue.View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(1100, 400);
        View vw = new View();
        jf.add(vw);
        jf.setVisible(true);
        vw.setVisible(true);
        vw.front = 1;
        vw.rear = 1;
        vw.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }
}

