/*
 * Decompiled with CFR 0_114.
 */
package Queue;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Stroke;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JPanel;

public class View
extends JPanel {
    Integer front;
    Integer rear;
    Integer mark = 0;
    Integer flag = 10;
    String added_string;
    Integer top;
    Graphics2D g2d;
    String[] queue = new String[10];

    public View() {
        this.initComponents();
    }

    private void doDrawing(Graphics g) throws InterruptedException {
        this.mark = 0;
        this.g2d = (Graphics2D)g;
        this.g2d.setStroke(new BasicStroke(10.0f));
        g.setFont(new Font("Times New Roman", 1, 20));
        this.g2d.drawString("Abc", 450, 370);
        this.g2d.drawLine(20, 185, 900, 185);
        this.g2d.drawLine(20, 310, 900, 310);
        try {
            int i;
            for (i = 0; i < 10; ++i) {
                this.g2d.drawLine(20 + 88 * i, 185, 20 + 88 * i, 310);
                this.g2d.setStroke(new BasicStroke(4.0f));
                this.g2d.drawString(this.mark.toString(), 68 + 88 * i, 330);
                Integer n = this.mark;
                Integer n2 = this.mark = Integer.valueOf(this.mark + 1);
            }
            if (this.front <= this.rear) {
                for (i = this.front.intValue(); i <= this.rear; ++i) {
                    this.g2d.setPaint(Color.GREEN);
                    this.g2d.drawString(this.queue[i], 60 + 88 * i, 245);
                    this.g2d.drawString("  ", 60 + 88 * (i + 1), 245);
                }
            }
            if (this.front > this.rear) {
                for (i = this.front.intValue(); i <= 9; ++i) {
                    this.g2d.setPaint(Color.GREEN);
                    this.g2d.drawString(this.queue[i], 60 + 88 * i, 245);
                    this.g2d.drawString("  ", 60 + 88 * (i + 1), 245);
                }
                for (i = 0; i <= this.rear; ++i) {
                    this.g2d.setPaint(Color.GREEN);
                    this.g2d.drawString(this.queue[i], 60 + 88 * i, 245);
                    this.g2d.drawString("  ", 60 + 88 * (i + 1), 245);
                }
            }
            if (this.front == this.rear && this.front != -1) {
                this.g2d.setPaint(Color.black);
                this.g2d.setStroke(new BasicStroke(4.0f));
                this.g2d.setPaint(Color.BLACK);
                this.g2d.drawString("Front", 50 + 88 * this.front, 45);
                this.g2d.drawLine(55 + 88 * this.front, 50, 55 + 88 * this.front, 185);
                this.g2d.setPaint(Color.BLACK);
                this.g2d.drawString("Rear", 70 + 88 * this.rear, 85);
                this.g2d.drawLine(75 + 88 * this.rear, 90, 75 + 88 * this.front, 185);
                return;
            }
            if (this.front != -1) {
                this.g2d.setStroke(new BasicStroke(4.0f));
                this.g2d.setPaint(Color.BLACK);
                this.g2d.drawString("Front", 60 + 88 * this.front, 45);
                this.g2d.drawLine(65 + 88 * this.front, 50, 65 + 88 * this.front, 185);
            }
            if (this.rear != -1) {
                this.g2d.setStroke(new BasicStroke(4.0f));
                this.g2d.setPaint(Color.BLACK);
                this.g2d.drawString("Rear", 60 + 88 * this.rear, 45);
                this.g2d.drawLine(65 + 88 * this.rear, 50, 65 + 88 * this.rear, 185);
            }
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            this.doDrawing(g);
        }
        catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 51));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 500, 32767));
    }

    void add_string() {
        this.queue[this.rear.intValue()] = this.added_string;
    }

    void fillqueue(Integer front, Integer rear) {
        this.front = front;
        this.rear = rear;
        this.repaint();
    }
}

