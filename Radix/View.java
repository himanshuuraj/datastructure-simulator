/*
 * Decompiled with CFR 0_114.
 */
package Radix;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
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
    Integer[] integer = new Integer[10];
    Integer[] integer1 = new Integer[10];
    Timer timer;
    int ttimer = 0;
    String check_element = "ggg";
    Integer found_counter = 0;
    Integer check_counter = 0;
    Integer tpx;
    Integer e1 = -1;
    Integer jjj = 0;
    Integer row_counter = 0;
    float[] dash3 = new float[]{4.0f, 0.0f, 2.0f};
    BasicStroke bs3;

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
        this.bs3 = new BasicStroke(1.0f, 0, 1, 1.0f, this.dash3, 2.0f);
    }

    public int geti(String s) {
        char u = s.charAt(0);
        Integer n = this.e1;
        Integer n2 = this.e1 = Integer.valueOf(this.e1 + 1);
        String st = "1";
        switch (u) {
            case '0': {
                this.elements1[this.e1.intValue()] = "0";
                st = "0";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 0;
            }
            case '1': {
                this.elements1[this.e1.intValue()] = "1";
                st = "1";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 1;
            }
            case '2': {
                this.elements1[this.e1.intValue()] = "2";
                st = "2";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 2;
            }
            case '3': {
                this.elements1[this.e1.intValue()] = "3";
                st = "3";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 3;
            }
            case '4': {
                this.elements1[this.e1.intValue()] = "4";
                st = "4";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 4;
            }
            case '5': {
                this.elements1[this.e1.intValue()] = "5";
                st = "5";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 5;
            }
            case '6': {
                this.elements1[this.e1.intValue()] = "6";
                st = "6";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 6;
            }
            case '7': {
                this.elements1[this.e1.intValue()] = "7";
                st = "7";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 7;
            }
            case '8': {
                this.elements1[this.e1.intValue()] = "8";
                st = "8";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 8;
            }
            case '9': {
                this.elements1[this.e1.intValue()] = "9";
                st = "9";
                try {
                    this.integer[this.e1.intValue()] = Integer.parseInt(st);
                }
                catch (Exception e) {
                    // empty catch block
                }
                return 9;
            }
        }
        return 0;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("hello");
        try {
            Integer n = this.paint_count;
            Integer n2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            this.tpx = this.paint_count;
            this.paint_count = 0;
            this.g2d = (Graphics2D)g;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                Integer n3;
                Integer i = 0;
                while (i < 10) {
                    this.g2d.setStroke(new BasicStroke(4.0f));
                    this.g2d.setFont(new Font("New Times Roman", 1, 24));
                    this.g2d.drawString(this.elements[i].toString(), 150, 150 + 50 * i);
                    n2 = i;
                    n3 = i = Integer.valueOf(i + 1);
                }
                this.g2d.setStroke(this.bs3);
                i = 0;
                while (i < 10) {
                    this.g2d.drawLine(250 + 100 * i, 90, 250 + 100 * i, 600);
                    n2 = i;
                    n3 = i = Integer.valueOf(i + 1);
                }
                i = 0;
                while (i < 10) {
                    this.g2d.drawString(i.toString(), 300 + 100 * i, 40);
                    n2 = i;
                    n3 = i = Integer.valueOf(i + 1);
                }
                if (this.ttimer == 0) {
                    this.timer.start();
                    ++this.ttimer;
                }
            }
            System.out.println("hello1          " + this.tpx);
            this.paint_count = 0;
            while (this.paint_count < this.tpx) {
                try {
                    int i = 0;
                    i = this.geti(this.elements[this.paint_count]);
                    System.out.println("AAAAAAAAAAAAAA");
                    this.integer1[this.paint_count.intValue()] = this.paint_count;
                    this.g2d.drawString(this.elements[this.paint_count].toString(), 260 + 100 * i, 150 + 50 * this.paint_count);
                }
                catch (Exception e2) {
                    // empty catch block
                }
                Integer e2 = this.paint_count;
                n2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            }
            System.out.println(this.paint_count + "         " + this.tpx);
            this.paint_count = this.tpx;
        }
        catch (Exception e) {
            System.out.println("illegal");
        }
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 153));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1517, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 644, 32767));
    }

}

