/*
 * Decompiled with CFR 0_114.
 */
package Tree.BinarySearchTree;

import Tree.BinarySearchTree.BST;
import Tree.BinarySearchTree.View;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Model
extends JFrame {
    View view;
    String[] elements = new String[10];
    Integer j = -1;
    String check_element = "fff";
    Integer ptr_counter = -1;
    private JTextField del_field;
    public JPanel des;
    private JButton insert;
    private JTextField insertion;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JPanel jPanel1;
    private JButton postorder;

    public Model() {
        this.initComponents();
        this.setLocationRelativeTo(null);
    }

    public void add_view(View view) {
        this.view = view;
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.insertion = new JTextField();
        this.insert = new JButton();
        this.jButton1 = new JButton();
        this.postorder = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.del_field = new JTextField();
        this.des = new JPanel();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(51, 255, 255));
        this.insertion.setFont(new Font("Times New Roman", 1, 36));
        this.insert.setFont(new Font("Times New Roman", 1, 14));
        this.insert.setText("Insert");
        this.insert.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.insertActionPerformed(evt);
            }
        });
        this.jButton1.setText("Preorder");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton1ActionPerformed(evt);
            }
        });
        this.postorder.setText("Postorder");
        this.postorder.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.postorderActionPerformed(evt);
            }
        });
        this.jButton2.setText("Infix");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setText("Delete");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton3ActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jButton3).addGap(57, 57, 57)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.del_field, -2, 97, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.insertion, -2, 130, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(38, 38, 38).addComponent(this.insert, -2, 125, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(58, 58, 58).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.postorder, -1, 93, 32767).addComponent(this.jButton2, -1, -1, 32767))))).addContainerGap(37, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(66, 66, 66).addComponent(this.insertion, -2, 77, -2).addGap(29, 29, 29).addComponent(this.insert).addGap(34, 34, 34).addComponent(this.jButton1).addGap(38, 38, 38).addComponent(this.postorder).addGap(35, 35, 35).addComponent(this.jButton2).addGap(28, 28, 28).addComponent(this.del_field, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 119, 32767).addComponent(this.jButton3).addGap(37, 37, 37)));
        this.des.setBackground(new Color(255, 255, 153));
        this.des.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 803, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.des, -2, -1, -2)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.des, -1, -1, 32767));
        this.pack();
    }

    private void insertActionPerformed(ActionEvent evt) {
        String insert_text = this.insertion.getText();
        Integer n = this.j;
        Integer n2 = this.j = Integer.valueOf(this.j + 1);
        this.view.insert_element = insert_text;
        this.view.j = this.j;
        n = this.ptr_counter;
        n2 = this.ptr_counter = Integer.valueOf(this.ptr_counter + 1);
        this.view.ptr_counter = this.ptr_counter;
        this.view.ptr[this.ptr_counter.intValue()].data = insert_text;
        this.view.repaint();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.view.pr_i = 1;
        this.view.repaint();
    }

    private void postorderActionPerformed(ActionEvent evt) {
        this.view.po_i = 1;
        this.view.repaint();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.view.in_i = 1;
        this.view.repaint();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.view.del_i = 1;
        this.view.del_text = this.del_field.getText();
        this.view.del();
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
        System.out.println("123");
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new Model().setVisible(true);
            }
        });
    }

}

