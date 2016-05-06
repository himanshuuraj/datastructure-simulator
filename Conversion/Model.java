/*
 * Decompiled with CFR 0_114.
 */
package Conversion;

import Conversion.View;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Model
extends JFrame {
    View view;
    String expression_string = "jjj";
    Integer j = -1;
    Character[] expression_array;
    char c = 107;
    Character ch = Character.valueOf(this.c);
    String[] s;
    public JPanel des;
    private JTextField expression;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;

    public Model() {
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void add_view(View view) {
        this.view = view;
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.expression = new JTextField();
        this.jButton1 = new JButton();
        this.des = new JPanel();
        this.setDefaultCloseOperation(2);
        this.jPanel1.setBackground(new Color(153, 255, 255));
        this.jPanel1.setBorder(new LineBorder(new Color(0, 0, 153), 1, true));
        this.jLabel1.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel1.setText("Enter expression to convert");
        this.jLabel2.setFont(new Font("Times New Roman", 1, 14));
        this.jLabel2.setText("infix to postfix");
        this.expression.setBackground(new Color(204, 204, 204));
        this.expression.setFont(new Font("Tahoma", 1, 18));
        this.expression.setForeground(new Color(0, 153, 51));
        this.expression.setBorder(new LineBorder(new Color(0, 0, 153), 1, true));
        this.jButton1.setBackground(new Color(255, 255, 51));
        this.jButton1.setFont(new Font("Times New Roman", 1, 14));
        this.jButton1.setForeground(new Color(0, 0, 153));
        this.jButton1.setText("Convert");
        this.jButton1.setBorder(new LineBorder(new Color(0, 0, 204), 2, true));
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(23, 23, 23).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel2).addComponent(this.jLabel1)).addGap(38, 38, 38).addComponent(this.expression, -2, 651, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton1, -1, -1, 32767).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(36, 36, 36).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.expression).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2)).addComponent(this.jButton1, -1, -1, 32767)).addContainerGap(30, 32767)));
        this.des.setBackground(new Color(255, 102, 102));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1000, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 561, 32767));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.des, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.des, -1, -1, 32767)));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int i;
        this.expression_string = this.expression.getText();
        String t = "(";
        t = t + this.expression_string;
        this.view.expression_string = this.expression_string = (t = t + ")");
        char[] expression_arrays = this.expression_string.toCharArray();
        for (i = 0; i < expression_arrays.length; ++i) {
            System.out.println(expression_arrays[i]);
        }
        this.s = new String[expression_arrays.length];
        this.view.expression_array = new String[expression_arrays.length];
        this.view.char_exp_arr = new char[expression_arrays.length];
        for (i = 0; i < expression_arrays.length; ++i) {
            this.s[i] = Character.toString(expression_arrays[i]);
            this.view.expression_array[i] = this.s[i];
            this.view.char_exp_arr[i] = this.s[i].charAt(0);
        }
        Integer i2 = this.j;
        Integer n = this.j = Integer.valueOf(this.j + 1);
        this.view.j = this.j;
        this.view.timer_counter = 5;
        this.view.substring_counter = new Integer[expression_arrays.length];
        this.view.initialize_array();
        this.view.paint_count = -1;
        this.view.repaint();
    }

}

