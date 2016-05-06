/*
 * Decompiled with CFR 0_114.
 */
package Conversion;

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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class View
extends JPanel {
    int k1 = 1;
    int k2 = 1;
    int paint_count = -2;
    String expression_string = "hhh";
    Integer j = 0;
    BasicStroke bs3;
    Graphics2D g2d;
    float[] dash3 = new float[]{4.0f, 0.0f, 2.0f};
    String[] expression_array;
    char[] char_exp_arr;
    int timer_counter = 8;
    int tpx = 0;
    int array_counter = 0;
    int column_counter = 0;
    String stack_string = new String();
    String exp_string = new String();
    Integer stack_row = 0;
    Integer expression_row = 0;
    Integer[] substring_counter;
    int cccc = 7;
    Timer timer;

    public View() {
        this.initComponents();
        this.setVisible(true);
        this.bs3 = new BasicStroke(2.0f, 0, 1, 1.0f, this.dash3, 2.0f);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g2d = (Graphics2D)g;
        this.stack_string = "";
        this.exp_string = "";
        if (this.cccc == 7) {
            this.g2d.setFont(new Font("Times New Roman", 1, 18));
            this.g2d.drawString("Rule 1: put '(' in the beginning of the expression", 200, 50);
            this.g2d.drawString("Rule 2: put operand in the expression", 200, 100);
            this.g2d.drawString("Rule 3: put operators in the stack", 200, 150);
            this.g2d.drawString("Rule 4: pop elements from stack when the low priority element comes after the high priority", 200, 200);
            this.g2d.drawString("Priority order:", 200, 250);
            this.g2d.drawString("^", 300, 300);
            this.g2d.drawString("*  /", 300, 350);
            this.g2d.drawString("+  -", 300, 400);
            this.cccc = 8;
            this.j = -1;
        }
        if (this.timer_counter == 5) {
            this.timer = new Timer(5000, new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    View.this.repaint();
                }
            });
            this.timer.start();
            this.timer_counter = 55;
        }
        try {
            ++this.paint_count;
            if (this.paint_count == 0) {
                this.g2d.drawString("ABC", 200, 100);
                return;
            }
            int ff = this.paint_count;
            this.tpx = this.paint_count;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                this.g2d.setStroke(this.bs3);
                this.g2d.drawLine(340, 50, 340, 500);
                this.g2d.drawLine(680, 50, 680, 500);
                this.g2d.setColor(Color.green);
                this.g2d.setFont(new Font("Times New Roman", 1, 18));
                this.g2d.drawString("Stack", 400, 30);
                this.g2d.drawString("Symbol Scanned", 50, 30);
                this.g2d.drawString("Expression", 740, 30);
                this.g2d.setColor(Color.red);
                this.g2d.drawString(this.expression_array[0], 140, 80);
                this.g2d.setColor(Color.black);
                for (int i = 1; i < this.expression_array.length - 1; ++i) {
                    this.g2d.drawString(this.expression_array[i].toString(), 140, 100 + i * 20);
                }
                this.g2d.setColor(Color.red);
                this.g2d.drawString(this.expression_array[this.expression_array.length - 1], 140, 110 + (this.expression_array.length - 1) * 20);
                this.g2d.setColor(Color.black);
            }
            int f1 = this.array_counter;
            int f2 = this.column_counter;
            this.array_counter = 0;
            this.column_counter = 0;
            this.array_counter = 0;
            while (this.array_counter <= this.paint_count) {
                this.g2d.drawString(this.stack_string, 450, 80 + this.column_counter * 20);
                this.g2d.drawString(this.exp_string, 800, 80 + this.column_counter * 20);
                ++this.column_counter;
                System.out.println("" + this.array_counter + "        " + this.paint_count);
                String str2 = "";
                if (View.check_element(this.char_exp_arr[this.array_counter]) == 1) {
                    String str3;
                    if (this.char_exp_arr[this.array_counter] == ')') {
                        int gh = this.stack_string.lastIndexOf("(");
                        String str1 = this.stack_string.substring(0, gh);
                        str2 = this.stack_string.substring(gh + 1);
                        int hh = str2.length();
                        --hh;
                        str3 = "";
                        while (hh >= 0) {
                            char d = str2.charAt(hh);
                            String str4 = Character.toString(d);
                            str3 = str3 + str4;
                            --hh;
                        }
                        str2 = str3;
                        int sub = this.stack_string.length() - str1.length();
                        this.stack_string = str1;
                        this.exp_string = this.exp_string + str2;
                    } else if (this.char_exp_arr[this.array_counter] == '+' || this.char_exp_arr[this.array_counter] == '-') {
                        int h = this.stack_string.length();
                        if (this.stack_string.charAt(--h) == '/' || this.stack_string.charAt(h) == '*' || this.stack_string.charAt(h) == '^') {
                            System.out.println("There it iss");
                            char f = this.stack_string.charAt(h);
                            String str4 = Character.toString(f);
                            this.exp_string = this.exp_string + this.char_exp_arr[this.array_counter];
                            this.exp_string = this.exp_string + str4;
                            this.stack_string = str3 = this.stack_string.substring(0, h);
                        } else {
                            String f = this.expression_array[this.array_counter];
                            this.stack_string = this.stack_string + f;
                            ++this.tpx;
                        }
                    } else {
                        String f = this.expression_array[this.array_counter];
                        this.stack_string = this.stack_string + f;
                        ++this.tpx;
                    }
                } else {
                    String f = this.expression_array[this.array_counter];
                    this.exp_string = this.exp_string + f;
                    ++this.tpx;
                }
                ++this.array_counter;
            }
            this.paint_count = ff;
            this.array_counter = f1;
            this.column_counter = f2;
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    public void initialize_array() {
        int i = 0;
        for (i = 0; i < this.char_exp_arr.length; ++i) {
            this.substring_counter[i] = View.check_element(this.char_exp_arr[i]) == 0 ? Integer.valueOf(0) : Integer.valueOf(1);
        }
    }

    public static int check_element(char x) {
        switch (x) {
            case '(': 
            case ')': 
            case '*': 
            case '+': 
            case '-': 
            case '/': 
            case '^': {
                return 1;
            }
        }
        return 0;
    }

    private void initComponents() {
        this.setBackground(new Color(255, 204, 102));
        this.setBorder(new LineBorder(new Color(0, 0, 153), 1, true));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 998, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 549, 32767));
    }

}

