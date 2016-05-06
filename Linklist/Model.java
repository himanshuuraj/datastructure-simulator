/*
 * Decompiled with CFR 0_114.
 */
package Linklist;

import Linklist.View;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.BorderFactory;
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
    String insert_text;
    Integer insert_int = 0;
    Integer front = 0;
    Integer rear = 0;
    String[] link = new String[10];
    String[] links = new String[10];
    private JTextField del_loc;
    public JPanel des;
    private JLabel hint;
    private JTextField ins_loc;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JTextField textfield;

    public Model() {
        this.initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void add_view(View view) {
        this.view = view;
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.textfield = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jButton3 = new JButton();
        this.ins_loc = new JTextField();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.del_loc = new JTextField();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.hint = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.des = new JPanel();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 153), 1, true), "Operations", 0, 0, new Font("Times New Roman", 1, 12)));
        this.textfield.setFont(new Font("Times New Roman", 1, 24));
        this.jButton1.setFont(new Font("Times New Roman", 1, 18));
        this.jButton1.setText("Insert at front");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Times New Roman", 1, 18));
        this.jButton2.setForeground(new Color(255, 0, 0));
        this.jButton2.setText("Delete at front");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton2ActionPerformed(evt);
            }
        });
        this.jLabel3.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel3.setText("Enter two digit number to put");
        this.jLabel4.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel4.setText("in linklist");
        this.jButton3.setFont(new Font("Times New Roman", 1, 18));
        this.jButton3.setText("Insert at rear");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton3ActionPerformed(evt);
            }
        });
        this.ins_loc.setFont(new Font("Times New Roman", 1, 18));
        this.jButton4.setFont(new Font("Times New Roman", 1, 18));
        this.jButton4.setText("Insert at given location");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton5.setFont(new Font("Times New Roman", 1, 18));
        this.jButton5.setForeground(new Color(255, 0, 0));
        this.jButton5.setText("Delete at rear");
        this.jButton5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton6.setFont(new Font("Times New Roman", 1, 18));
        this.jButton6.setForeground(new Color(255, 0, 0));
        this.jButton6.setText("Delete at given location");
        this.jButton6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton6ActionPerformed(evt);
            }
        });
        this.del_loc.setFont(new Font("Times New Roman", 1, 18));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4).addComponent(this.jLabel3, -2, 190, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.textfield, -2, 100, -2).addGap(18, 18, 18).addComponent(this.jButton1, -2, 145, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 137, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton4, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ins_loc, -2, 100, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton5).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton6, -2, 224, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.del_loc, -2, 100, -2))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.textfield, -2, 49, -2).addComponent(this.jButton1, -2, 46, -2).addComponent(this.jButton3, -2, 46, -2).addComponent(this.ins_loc, -2, 46, -2).addComponent(this.jButton4, -2, 46, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.del_loc, -2, 46, -2).addComponent(this.jButton6, -2, 46, -2).addComponent(this.jButton5, -2, 46, -2).addComponent(this.jButton2, -2, 46, -2)))).addContainerGap(-1, 32767)));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Implementation", 0, 0, new Font("Times New Roman", 1, 12)));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Hint", 0, 0, new Font("Times New Roman", 1, 12), new Color(0, 0, 153)));
        this.hint.setFont(new Font("Times New Roman", 3, 24));
        this.hint.setText("jLabel1");
        this.jLabel1.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel1.setText("Initially front = -1 && rear =-1");
        this.jLabel2.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel2.setText("size of list = 10(design constraint)");
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1)).addGroup(jPanel3Layout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.jLabel2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.hint, -2, 449, -2).addGap(159, 159, 159)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2)).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.hint))).addContainerGap(-1, 32767)));
        this.des.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 1098, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 447, 32767));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.des, -2, -1, -2).addGap(0, 0, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.des, -2, -1, -2).addGap(0, 0, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jPanel2, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(5, 5, 5).addComponent(this.jPanel2, -2, -1, -2)));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.insert_text = this.textfield.getText();
        if (this.front == 10 && this.rear == 1) {
            this.hint.setForeground(Color.red);
            this.hint.setText("FULL -- DESIGN CONSTRAINT");
            System.out.println("h1");
            return;
        }
        if (this.front == 0) {
            this.link[this.front.intValue()] = this.insert_text;
            this.view.link[this.front.intValue()] = this.insert_text;
            Integer n = this.front;
            Integer n2 = this.front = Integer.valueOf(this.front + 1);
            n = this.rear;
            n2 = this.rear = Integer.valueOf(this.rear + 1);
            System.out.println("h2");
        } else if (this.front != 10) {
            this.link[this.front.intValue()] = this.insert_text;
            this.view.link[this.front.intValue()] = this.insert_text;
            Integer n = this.front;
            Integer n3 = this.front = Integer.valueOf(this.front + 1);
            System.out.println("h3");
        } else if (this.rear != 1 && this.front == 10) {
            int j = 0;
            int i = this.rear - 1;
            while (i < this.front) {
                this.link[j] = this.link[i];
                this.view.link[j] = this.link[i];
                ++i;
                ++j;
            }
            System.out.println("" + j + "        " + this.insert_text);
            this.front = j++;
            this.rear = 1;
            System.out.println(this.link[this.front]);
            this.link[this.front.intValue()] = this.insert_text;
            this.view.link[this.front.intValue()] = this.insert_text;
            System.out.println("h4");
        }
        this.view.front = this.front;
        this.view.rear = this.rear;
        this.view.repaint();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if (this.front == this.rear) {
            this.front = 0;
            this.rear = 0;
            this.view.front = this.front;
            this.view.rear = this.rear;
            this.view.repaint();
        } else {
            Integer n = this.front;
            Integer n2 = this.front = Integer.valueOf(this.front - 1);
            this.view.front = this.front;
            this.view.repaint();
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        int i;
        this.insert_text = this.textfield.getText();
        Integer n = this.front;
        Integer n2 = this.front = Integer.valueOf(this.front + 1);
        int n3 = this.front - 1;
        if (n3 == 9) {
            this.view.link[0] = this.insert_text;
            for (int i2 = 0; i2 < n3; ++i2) {
                this.link[i2 + 1] = this.link[i2];
                this.view.link[i2 + 1] = this.link[i2];
            }
            this.view.front = this.front;
            this.view.repaint();
            return;
        }
        if (n3 == 10 && this.rear == 1) {
            this.hint.setText("FULL --  Design Constraint");
            for (int i3 = 0; i3 < 9; ++i3) {
                System.out.println(this.link[i3] + "    " + i3);
            }
            return;
        }
        if (n3 == 10 && this.rear != 1) {
            int j = 0;
            int i4 = this.rear - 1;
            while (i4 < 10) {
                this.link[j] = this.link[i4];
                this.view.link[j] = this.link[j];
                ++i4;
                ++j;
            }
            this.rear = 1;
            this.front = j;
            this.view.rear = this.rear;
            this.view.front = this.front;
            this.view.repaint();
            return;
        }
        for (i = 0; i <= n3; ++i) {
            this.links[i + 1] = this.link[i];
        }
        this.links[0] = this.insert_text;
        this.link[0] = this.insert_text;
        this.view.link[0] = this.link[0];
        for (i = 0; i <= n3; ++i) {
            this.link[i] = this.links[i];
            this.view.link[i] = this.links[i];
        }
        this.view.front = this.front;
        this.view.repaint();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        String insert_location = this.textfield.getText();
        String inser_loc = this.ins_loc.getText();
        Integer loc = 5;
        try {
            loc = Integer.parseInt(inser_loc);
            loc = loc + (this.rear - 1);
        }
        catch (Exception e) {
            System.out.println("Illegal");
        }
        int abc = this.front - this.rear + 1;
        if (abc < loc) {
            this.hint.setText("Illegal");
            return;
        }
        if (this.front == 10 && this.rear == 1) {
            this.hint.setForeground(Color.red);
            this.hint.setText("FULL");
            return;
        }
        if (this.front == 10 && this.rear != 1) {
            for (int i2 = this.rear.intValue() - 2; i2 < loc; ++i2) {
                this.link[i2] = this.link[i2 + 1];
                this.view.link[i2] = this.link[i2];
            }
            this.link[loc.intValue()] = insert_location;
            this.view.link[loc.intValue()] = this.link[loc];
            Integer i2 = this.rear;
            Integer n = this.rear = Integer.valueOf(this.rear - 1);
            this.view.rear = this.rear;
            this.view.repaint();
            return;
        }
        if (this.rear == 1 && this.front != 10 || this.rear != 1 && this.front != 10) {
            for (int i3 = loc.intValue(); i3 < this.front; ++i3) {
                this.link[i3 + 1] = this.link[i3];
                this.view.link[i3] = this.link[i3];
            }
            this.link[loc.intValue()] = insert_location;
            this.view.link[loc.intValue()] = this.link[loc];
            Integer i3 = this.front;
            Integer n = this.front = Integer.valueOf(this.front + 1);
            this.view.front = this.front;
            this.view.repaint();
            return;
        }
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        if (this.rear == 11) {
            this.hint.setText("Link empty");
            return;
        }
        this.rear = this.rear == 0 ? Integer.valueOf(this.rear + 2) : Integer.valueOf(this.rear + 1);
        this.view.rear = this.rear;
        this.view.repaint();
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        String insert_location = this.textfield.getText();
        String inser_loc = this.del_loc.getText();
        Integer loc = 5;
        try {
            loc = Integer.parseInt(inser_loc);
            Integer n = loc = Integer.valueOf(loc + (this.rear - 1));
            Integer n2 = loc = Integer.valueOf(loc + 1);
        }
        catch (Exception e) {
            System.out.println("Illegal");
        }
        int abc = this.front - this.rear + 1;
        if (abc < loc) {
            this.hint.setText("Illegal");
            return;
        }
        for (int i2 = loc.intValue(); i2 < this.front - 1; ++i2) {
            this.link[loc.intValue()] = this.link[loc + 1];
            this.view.link[loc.intValue()] = this.view.link[loc + 1];
        }
        Integer i2 = this.front;
        Integer n = this.front = Integer.valueOf(this.front - 1);
        this.view.front = this.front;
        this.view.repaint();
    }

}

