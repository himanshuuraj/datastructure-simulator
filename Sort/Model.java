/*
 * Decompiled with CFR 0_114.
 */
package Sort;

import Sort.View_Bubble;
import Sort.View_Insertion;
import Sort.View_Selection;
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

public class Model
extends JFrame {
    String[] elements = new String[10];
    Integer j = -1;
    String check_element = "fff";
    View_Selection view_selection;
    View_Bubble view_bubble;
    View_Insertion view_insertion;
    public JPanel des;
    private JTextField element1;
    private JTextField element10;
    private JTextField element2;
    private JTextField element3;
    private JTextField element4;
    private JTextField element5;
    private JTextField element6;
    private JTextField element7;
    private JTextField element8;
    private JTextField element9;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JButton linear_search;
    private JButton selection;

    public Model() {
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void add_viewbubble(View_Bubble view_bubble) {
        this.view_bubble = view_bubble;
    }

    public void add_viewinsertion(View_Insertion view_insertion) {
        this.view_insertion = view_insertion;
    }

    public void add_viewselection(View_Selection view_selection) {
        this.view_selection = view_selection;
    }

    private void initComponents() {
        this.des = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel4 = new JLabel();
        this.element6 = new JTextField();
        this.jLabel6 = new JLabel();
        this.element4 = new JTextField();
        this.element3 = new JTextField();
        this.jLabel3 = new JLabel();
        this.element5 = new JTextField();
        this.element7 = new JTextField();
        this.element8 = new JTextField();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.element9 = new JTextField();
        this.element10 = new JTextField();
        this.jLabel2 = new JLabel();
        this.linear_search = new JButton();
        this.element2 = new JTextField();
        this.jLabel12 = new JLabel();
        this.element1 = new JTextField();
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();
        this.selection = new JButton();
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(102, 255, 102));
        this.des.setBackground(new Color(255, 204, 51));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 450, 32767));
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("4.");
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("3.");
        this.element6.setFont(new Font("Tahoma", 0, 18));
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("5.");
        this.element4.setFont(new Font("Tahoma", 0, 18));
        this.element3.setFont(new Font("Tahoma", 0, 18));
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("2.");
        this.element5.setFont(new Font("Tahoma", 0, 18));
        this.element7.setFont(new Font("Tahoma", 0, 18));
        this.element8.setFont(new Font("Tahoma", 0, 18));
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("1.");
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setText("6.");
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("8.");
        this.jLabel11.setFont(new Font("Tahoma", 1, 14));
        this.jLabel11.setText("9.");
        this.element9.setFont(new Font("Tahoma", 0, 18));
        this.element10.setFont(new Font("Tahoma", 0, 18));
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("7.");
        this.linear_search.setFont(new Font("Tahoma", 1, 12));
        this.linear_search.setText("Bubble Sort");
        this.linear_search.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.linear_searchActionPerformed(evt);
            }
        });
        this.element2.setFont(new Font("Tahoma", 0, 18));
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("10.");
        this.element1.setFont(new Font("Tahoma", 0, 18));
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setText("Enter the numbers");
        this.jButton1.setFont(new Font("Times New Roman", 1, 14));
        this.jButton1.setText("Insertion Sort");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton1ActionPerformed(evt);
            }
        });
        this.selection.setFont(new Font("Times New Roman", 1, 14));
        this.selection.setText("Selection Sort");
        this.selection.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.selectionActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.des, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(76, 76, 76).addComponent(this.jLabel8).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element1, -2, 67, -2).addGap(77, 77, 77).addComponent(this.jLabel3)).addGroup(layout.createSequentialGroup().addGap(216, 216, 216).addComponent(this.jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element6, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel2)).addGroup(layout.createSequentialGroup().addGap(55, 55, 55).addComponent(this.jButton1, -2, 267, -2))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.element2, -2, 67, -2).addGap(77, 77, 77).addComponent(this.jLabel4).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element3, -2, 67, -2)).addGroup(layout.createSequentialGroup().addComponent(this.element7, -2, 67, -2).addGap(77, 77, 77).addComponent(this.jLabel10).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element8, -2, 67, -2))).addGap(77, 77, 77).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element4, -2, 67, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel11).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element9, -2, 67, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6, GroupLayout.Alignment.TRAILING).addComponent(this.jLabel12, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.element5, -2, 67, -2).addComponent(this.element10, -2, 67, -2)).addGap(17, 17, 17)).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.selection, -2, 157, -2).addGap(32, 32, 32).addComponent(this.linear_search, -2, 304, -2).addContainerGap()))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.element1, -2, 64, -2).addComponent(this.jLabel1).addComponent(this.element2, -2, 64, -2).addComponent(this.element3, -2, 64, -2).addComponent(this.element4, -2, 64, -2).addComponent(this.element5, -2, 64, -2).addComponent(this.jLabel3).addComponent(this.jLabel4).addComponent(this.jLabel5).addComponent(this.jLabel6).addComponent(this.jLabel8)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.element6, -2, 64, -2).addComponent(this.element7, -2, 64, -2).addComponent(this.element8, -2, 64, -2).addComponent(this.element9, -2, 64, -2).addComponent(this.element10, -2, 64, -2).addComponent(this.jLabel2).addComponent(this.jLabel9).addComponent(this.jLabel10).addComponent(this.jLabel11).addComponent(this.jLabel12)).addGap(29, 29, 29).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.linear_search, -2, 32, -2).addComponent(this.selection, -2, 33, -2).addComponent(this.jButton1, -2, 32, -2)).addGap(32, 32, 32).addComponent(this.des, -2, -1, -2)));
        this.pack();
    }

    private void linear_searchActionPerformed(ActionEvent evt) {
        this.des.add(this.view_bubble);
        try {
            this.view_bubble.elements[0] = this.elements[0] = this.element1.getText();
            this.view_bubble.elements[1] = this.elements[1] = this.element2.getText();
            this.view_bubble.elements[2] = this.elements[2] = this.element3.getText();
            this.view_bubble.elements[3] = this.elements[3] = this.element4.getText();
            this.view_bubble.elements[4] = this.elements[4] = this.element5.getText();
            this.view_bubble.elements[5] = this.elements[5] = this.element6.getText();
            this.view_bubble.elements[6] = this.elements[6] = this.element7.getText();
            this.view_bubble.elements[7] = this.elements[7] = this.element8.getText();
            this.view_bubble.elements[8] = this.elements[8] = this.element9.getText();
            this.view_bubble.elements[9] = this.elements[9] = this.element10.getText();
        }
        catch (Exception e2) {
            // empty catch block
        }
        Integer e2 = this.j;
        Integer n = this.j = Integer.valueOf(this.j + 1);
        this.view_bubble.j = this.j;
        this.view_bubble.check_element = this.check_element;
        this.view_bubble.repaint();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        System.out.println("hhhhhhhhh");
        this.des.add(this.view_insertion);
        System.out.println("gggggggggg");
        try {
            this.view_insertion.elements[0] = this.elements[0] = this.element1.getText();
            this.view_insertion.elements[1] = this.elements[1] = this.element2.getText();
            this.view_insertion.elements[2] = this.elements[2] = this.element3.getText();
            this.view_insertion.elements[3] = this.elements[3] = this.element4.getText();
            this.view_insertion.elements[4] = this.elements[4] = this.element5.getText();
            this.view_insertion.elements[5] = this.elements[5] = this.element6.getText();
            this.view_insertion.elements[6] = this.elements[6] = this.element7.getText();
            this.view_insertion.elements[7] = this.elements[7] = this.element8.getText();
            this.view_insertion.elements[8] = this.elements[8] = this.element9.getText();
            this.view_insertion.elements[9] = this.elements[9] = this.element10.getText();
        }
        catch (Exception e2) {
            // empty catch block
        }
        Integer e2 = this.j;
        Integer n = this.j = Integer.valueOf(this.j + 1);
        this.view_insertion.j = this.j;
        this.view_insertion.check_element = this.check_element;
        this.view_insertion.repaint();
    }

    private void selectionActionPerformed(ActionEvent evt) {
        this.des.add(this.view_selection);
        try {
            this.view_selection.elements[0] = this.elements[0] = this.element1.getText();
            this.view_selection.elements[1] = this.elements[1] = this.element2.getText();
            this.view_selection.elements[2] = this.elements[2] = this.element3.getText();
            this.view_selection.elements[3] = this.elements[3] = this.element4.getText();
            this.view_selection.elements[4] = this.elements[4] = this.element5.getText();
            this.view_selection.elements[5] = this.elements[5] = this.element6.getText();
            this.view_selection.elements[6] = this.elements[6] = this.element7.getText();
            this.view_selection.elements[7] = this.elements[7] = this.element8.getText();
            this.view_selection.elements[8] = this.elements[8] = this.element9.getText();
            this.view_selection.elements[9] = this.elements[9] = this.element10.getText();
        }
        catch (Exception e2) {
            // empty catch block
        }
        Integer e2 = this.j;
        Integer n = this.j = Integer.valueOf(this.j + 1);
        this.view_selection.j = this.j;
        this.view_selection.check_element = this.check_element;
        this.view_selection.repaint();
    }

}

