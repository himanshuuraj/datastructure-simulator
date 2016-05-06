/*
 * Decompiled with CFR 0_114.
 */
package Stack;

import Stack.Design;
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
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Model
extends JFrame {
    Design design;
    String insert_text;
    Integer insert_int = 0;
    Integer top = 0;
    Integer front = -1;
    Integer rear = -1;
    public JPanel des;
    private JLabel hint;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JTextField textfield;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;

    public Model() {
        this.initComponents();
        this.hint.setText("Initially   top = 0   Stack[] is empty");
        this.hint.setFont(new Font("Times New Roman", 1, 24));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.textfield.setText("");
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.textfield = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
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
        this.jButton1.setText("Insert");
        this.jButton1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Tahoma", 0, 18));
        this.jButton2.setForeground(new Color(255, 0, 0));
        this.jButton2.setText("Delete");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton2ActionPerformed(evt);
            }
        });
        this.jLabel3.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel3.setText("Enter two digit number to put");
        this.jLabel4.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel4.setText("in stack");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3, -2, 190, -2).addComponent(this.jLabel4)).addGap(50, 50, 50).addComponent(this.textfield, -2, 221, -2).addGap(84, 84, 84).addComponent(this.jButton1, -2, 130, -2).addGap(95, 95, 95).addComponent(this.jButton2, -2, 120, -2).addContainerGap(78, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(this.textfield, -2, 80, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(47, 47, 47).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.jButton2, -1, 46, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4))).addContainerGap(30, 32767)));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Implementation", 0, 0, new Font("Times New Roman", 1, 12)));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Hint", 0, 0, new Font("Times New Roman", 1, 12), new Color(0, 0, 153)));
        this.hint.setFont(new Font("Times New Roman", 3, 24));
        this.hint.setText("jLabel1");
        this.jLabel1.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel1.setText("Initially top = -1");
        this.jLabel2.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel2.setText("size of stack =10");
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.hint, -2, 449, -2).addGap(239, 239, 239)).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1)).addGroup(jPanel3Layout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.jLabel2))).addContainerGap(-1, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.hint).addContainerGap(35, 32767)));
        this.des.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 322, 32767));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel3, -1, -1, 32767).addComponent(this.des, -1, -1, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jPanel3, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.des, -1, -1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jPanel2, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, -1, -2)));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.insert_text = this.textfield.getText();
        try {
            this.insert_int = Integer.parseInt(this.insert_text);
        }
        catch (Exception e) {
            System.out.println("Illegal");
        }
        if (this.top == 10) {
            this.hint.setForeground(Color.RED);
            this.hint.setText("Finally   top = 10   Stack[] is full");
            this.hint.setFont(new Font("Times New Roman", 1, 24));
        } else {
            Integer e = this.top;
            Integer n = this.top = Integer.valueOf(this.top + 1);
            this.hint.setForeground(Color.black);
            this.hint.setText("top=top+1   Stack[top]=" + this.insert_text);
            try {
                Thread.sleep(1000);
                boolean i = false;
            }
            catch (Exception ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.design.top = this.top;
        this.design.added_string = this.insert_text;
        this.design.add_string();
        this.design.repaint();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if (this.top == 0) {
            this.top = 0;
            this.hint.setForeground(Color.red);
            this.hint.setText("Stack empty");
        } else {
            Integer n = this.top;
            Integer n2 = this.top = Integer.valueOf(this.top - 1);
            this.design.top = this.top;
            this.hint.setForeground(Color.black);
            if (this.top == 0) {
                this.hint.setText("top = top-1   Stack[] is empty");
            } else {
                this.hint.setText("top = top -1");
            }
            try {
                Model.mywait(1000);
            }
            catch (Exception ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.design.repaint();
        }
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
                new Model();
            }
        });
    }

    void add_design(Design design) {
        this.design = design;
    }

    public static void mywait(int n) {
        long t1;
        long t0 = System.currentTimeMillis();
        while ((t1 = System.currentTimeMillis()) - t0 < (long)n) {
        }
    }

}

