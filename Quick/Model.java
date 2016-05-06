/*
 * Decompiled with CFR 0_114.
 */
package Quick;

import Quick.View;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    String[] elements = new String[10];
    Integer j = -1;
    String check_element = "fff";
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
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;

    public Model() {
        this.initComponents();
        this.setLocationRelativeTo(null);
    }

    public void add_view(View view) {
        this.view = view;
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.element3 = new JTextField();
        this.element4 = new JTextField();
        this.jLabel2 = new JLabel();
        this.element2 = new JTextField();
        this.element6 = new JTextField();
        this.element7 = new JTextField();
        this.jLabel9 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.element5 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jLabel4 = new JLabel();
        this.des = new JPanel();
        this.element1 = new JTextField();
        this.jLabel7 = new JLabel();
        this.element8 = new JTextField();
        this.jLabel10 = new JLabel();
        this.element9 = new JTextField();
        this.jLabel11 = new JLabel();
        this.element10 = new JTextField();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Tahoma", 1, 14));
        this.jLabel1.setText("Enter the numbers");
        this.element3.setFont(new Font("Tahoma", 0, 18));
        this.element4.setFont(new Font("Tahoma", 0, 18));
        this.jLabel2.setFont(new Font("Tahoma", 1, 14));
        this.jLabel2.setText("7.");
        this.element2.setFont(new Font("Tahoma", 0, 18));
        this.element6.setFont(new Font("Tahoma", 0, 18));
        this.element7.setFont(new Font("Tahoma", 0, 18));
        this.element7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.element7ActionPerformed(evt);
            }
        });
        this.jLabel9.setFont(new Font("Tahoma", 1, 14));
        this.jLabel9.setText("6.");
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("4.");
        this.jLabel6.setFont(new Font("Tahoma", 1, 14));
        this.jLabel6.setText("5.");
        this.element5.setFont(new Font("Tahoma", 0, 18));
        this.jLabel3.setFont(new Font("Tahoma", 1, 14));
        this.jLabel3.setText("2.");
        this.jLabel8.setFont(new Font("Tahoma", 1, 14));
        this.jLabel8.setText("1.");
        this.jLabel4.setFont(new Font("Tahoma", 1, 14));
        this.jLabel4.setText("3.");
        this.des.setBackground(new Color(255, 255, 102));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 670, 32767));
        this.element1.setFont(new Font("Tahoma", 0, 18));
        this.jLabel7.setFont(new Font("Tahoma", 1, 14));
        this.jLabel7.setText("8.");
        this.element8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.element8ActionPerformed(evt);
            }
        });
        this.jLabel10.setFont(new Font("Tahoma", 1, 14));
        this.jLabel10.setText("9.");
        this.element9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.element9ActionPerformed(evt);
            }
        });
        this.jLabel11.setFont(new Font("Tahoma", 1, 14));
        this.jLabel11.setText("10.");
        this.jButton1.setText("Merge Sort");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(769, 32767).addComponent(this.jLabel7).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element8, -2, 60, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel10).addGap(18, 18, 18).addComponent(this.element9, -2, 63, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel11).addGap(18, 18, 18).addComponent(this.element10, -2, 59, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton1).addContainerGap()).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.des, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel8).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element1, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element2, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element3, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element4, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element5, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element6, -2, 67, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.element7, -2, 67, -2).addContainerGap(400, 32767))))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel10).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel11).addComponent(this.element10, -2, 32, -2).addComponent(this.element9))).addGap(0, 2147483605, 2147483605))).addGap(671, 671, 671)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.element8, -2, 41, -2).addComponent(this.jLabel7)).addContainerGap(-1, 32767)))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.element2, -2, 40, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.element1, -2, 41, -2).addComponent(this.jLabel1).addComponent(this.jLabel3).addComponent(this.jLabel8).addComponent(this.jLabel4))).addGap(1, 1, 1)).addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.element3, -2, 41, -2).addComponent(this.jLabel5).addComponent(this.element4, -2, 40, -2).addComponent(this.jLabel6).addComponent(this.element5, -2, 41, -2).addComponent(this.jLabel9).addComponent(this.element6, -2, 42, -2).addComponent(this.jLabel2).addComponent(this.element7, -2, 42, -2))).addComponent(this.des, -1, -1, 32767))));
        this.pack();
    }

    private void element7ActionPerformed(ActionEvent evt) {
    }

    private void element9ActionPerformed(ActionEvent evt) {
    }

    private void element8ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
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
        this.view.check_element = this.check_element;
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

