/*
 * Decompiled with CFR 0_114.
 */
package Search;

import Search.View;
import Search.View1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Model
extends JFrame {
    View view;
    View1 view1;
    String[] elements = new String[10];
    Integer j = -1;
    String check_element = "fff";
    private JButton binary_search;
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
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JButton linear_search;
    private JTextField search_string;

    public Model() {
        this.initComponents();
        this.setLocationRelativeTo(null);
    }

    public void add_view(View view) {
        this.view = view;
    }

    public void add_view1(View1 view1) {
        this.view1 = view1;
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.element1 = new JTextField();
        this.jLabel1 = new JLabel();
        this.linear_search = new JButton();
        this.jLabel2 = new JLabel();
        this.element2 = new JTextField();
        this.element3 = new JTextField();
        this.element4 = new JTextField();
        this.element5 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.element6 = new JTextField();
        this.element7 = new JTextField();
        this.element8 = new JTextField();
        this.element9 = new JTextField();
        this.element10 = new JTextField();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.jLabel12 = new JLabel();
        this.jLabel7 = new JLabel();
        this.search_string = new JTextField();
        this.binary_search = new JButton();
        this.des = new JPanel();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(153, 255, 255));
        this.element1.setFont(new Font("Tahoma", 0, 18));
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setText("Enter the numbers");
        this.linear_search.setFont(new Font("Tahoma", 1, 12));
        this.linear_search.setText("Linear Search");
        this.linear_search.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.linear_searchActionPerformed(evt);
            }
        });
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("7.");
        this.element2.setFont(new Font("Tahoma", 0, 18));
        this.element3.setFont(new Font("Tahoma", 0, 18));
        this.element4.setFont(new Font("Tahoma", 0, 18));
        this.element5.setFont(new Font("Tahoma", 0, 18));
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("2.");
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("3.");
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("4.");
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("5.");
        this.element6.setFont(new Font("Tahoma", 0, 18));
        this.element7.setFont(new Font("Tahoma", 0, 18));
        this.element8.setFont(new Font("Tahoma", 0, 18));
        this.element9.setFont(new Font("Tahoma", 0, 18));
        this.element10.setFont(new Font("Tahoma", 0, 18));
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("1.");
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setText("6.");
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("8.");
        this.jLabel11.setFont(new Font("Tahoma", 1, 14));
        this.jLabel11.setText("9.");
        this.jLabel12.setFont(new Font("Tahoma", 1, 14));
        this.jLabel12.setText("10.");
        this.jLabel7.setFont(new Font("Times New Roman", 1, 18));
        this.jLabel7.setText("Enter the number to search");
        this.search_string.setFont(new Font("Times New Roman", 1, 18));
        this.search_string.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.search_stringActionPerformed(evt);
            }
        });
        this.binary_search.setFont(new Font("Tahoma", 1, 12));
        this.binary_search.setText("Binary Search");
        this.binary_search.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.binary_searchActionPerformed(evt);
            }
        });
        this.des.setBackground(new Color(255, 255, 255));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 394, 32767));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(76, 76, 76).addComponent(this.jLabel8).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element1, -2, 67, -2).addGap(77, 77, 77).addComponent(this.jLabel3)).addGroup(jPanel1Layout.createSequentialGroup().addGap(216, 216, 216).addComponent(this.jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element6, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel2))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.element7, -2, 67, -2).addGap(77, 77, 77).addComponent(this.jLabel10).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element8, -2, 67, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.element2, -2, 67, -2).addGap(77, 77, 77).addComponent(this.jLabel4).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element3, -2, 67, -2))).addGap(77, 77, 77).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element4, -2, 67, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel11).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.element9, -2, 67, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6, GroupLayout.Alignment.TRAILING).addComponent(this.jLabel12, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.element5, -2, 67, -2).addComponent(this.element10, -2, 67, -2)).addGap(17, 17, 17)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel7).addGap(80, 80, 80).addComponent(this.search_string, -2, 223, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.linear_search, -2, 304, -2).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addGap(632, 632, 632).addComponent(this.binary_search, -2, 304, -2).addContainerGap(-1, 32767)).addComponent(this.des, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.element1, -2, 64, -2).addComponent(this.jLabel1).addComponent(this.element2, -2, 64, -2).addComponent(this.element3, -2, 64, -2).addComponent(this.element4, -2, 64, -2).addComponent(this.element5, -2, 64, -2).addComponent(this.jLabel3).addComponent(this.jLabel4).addComponent(this.jLabel5).addComponent(this.jLabel6).addComponent(this.jLabel8)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.element6, -2, 64, -2).addComponent(this.element7, -2, 64, -2).addComponent(this.element8, -2, 64, -2).addComponent(this.element9, -2, 64, -2).addComponent(this.element10, -2, 64, -2).addComponent(this.jLabel2).addComponent(this.jLabel9).addComponent(this.jLabel10).addComponent(this.jLabel11).addComponent(this.jLabel12)).addGap(55, 55, 55).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.linear_search, -2, 32, -2).addComponent(this.jLabel7).addComponent(this.search_string, -2, 32, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.binary_search, -2, 32, -2).addGap(18, 18, 18).addComponent(this.des, -2, -1, -2)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
        this.pack();
    }

    private void search_stringActionPerformed(ActionEvent evt) {
    }

    private void binary_searchActionPerformed(ActionEvent evt) {
        this.des.add(this.view1);
        try {
            this.view1.elements[0] = this.elements[0] = this.element1.getText();
            this.view1.elements[1] = this.elements[1] = this.element2.getText();
            this.view1.elements[2] = this.elements[2] = this.element3.getText();
            this.view1.elements[3] = this.elements[3] = this.element4.getText();
            this.view1.elements[4] = this.elements[4] = this.element5.getText();
            this.view1.elements[5] = this.elements[5] = this.element6.getText();
            this.view1.elements[6] = this.elements[6] = this.element7.getText();
            this.view1.elements[7] = this.elements[7] = this.element8.getText();
            this.view1.elements[8] = this.elements[8] = this.element9.getText();
            this.view1.elements[9] = this.elements[9] = this.element10.getText();
            System.out.println("ggggggg");
            System.out.println(this.elements[8]);
        }
        catch (Exception e2) {
            // empty catch block
        }
        Integer e2 = this.j;
        Integer n = this.j = Integer.valueOf(this.j + 1);
        System.out.println(this.j);
        this.view1.j = this.j;
        this.view1.check_element = this.check_element = this.search_string.getText();
        this.view1.repaint();
    }

    private void linear_searchActionPerformed(ActionEvent evt) {
        this.des.add(this.view);
        try {
            this.view.elements[0] = this.elements[0] = this.element1.getText();
            this.view.elements[1] = this.elements[1] = this.element2.getText();
            this.view.elements[2] = this.elements[2] = this.element3.getText();
            this.view.elements[3] = this.elements[3] = this.element4.getText();
            this.view.elements[4] = this.elements[4] = this.element5.getText();
            this.view.elements[5] = this.elements[5] = this.element6.getText();
            this.view.elements[6] = this.elements[6] = this.element7.getText();
            this.view.elements[7] = this.elements[7] = this.element8.getText();
            this.view.elements[8] = this.elements[8] = this.element9.getText();
            this.view.elements[9] = this.elements[9] = this.element10.getText();
        }
        catch (Exception e2) {
            // empty catch block
        }
        Integer e2 = this.j;
        Integer n = this.j = Integer.valueOf(this.j + 1);
        this.view.j = this.j;
        this.view.check_element = this.check_element = this.search_string.getText();
        this.view.repaint();
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals(info.getName())) continue;
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new Model().setVisible(true);
            }
        });
    }

}

