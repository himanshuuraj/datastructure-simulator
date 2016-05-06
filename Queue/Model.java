/*
 * Decompiled with CFR 0_114.
 */
package Queue;

import Queue.View;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Model
extends JFrame {
    View view;
    String insert_text;
    Integer insert_int;
    Integer top = 0;
    Integer front = -1;
    Integer rear = -1;
    Integer flag = 10;
    String[] queue = new String[10];
    public JPanel des;
    private JLabel hint;
    private JButton jButton1;
    private JButton jButton2;
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
        this.setTitle("QUEUE");
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
        this.jLabel4.setText("in queue");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3, -2, 190, -2).addComponent(this.jLabel4)).addGap(50, 50, 50).addComponent(this.textfield, -2, 221, -2).addGap(84, 84, 84).addComponent(this.jButton1, -2, 130, -2).addGap(95, 95, 95).addComponent(this.jButton2, -2, 120, -2).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(this.textfield, -2, 80, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(47, 47, 47).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.jButton2, -1, 46, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4))).addContainerGap(19, 32767)));
        this.jPanel2.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Implementation", 0, 0, new Font("Times New Roman", 1, 12)));
        this.jPanel3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Hint", 0, 0, new Font("Times New Roman", 1, 12), new Color(0, 0, 153)));
        this.hint.setFont(new Font("Times New Roman", 3, 24));
        this.hint.setText("jLabel1");
        this.jLabel1.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel1.setText("Initially front = -1 && rear = -1 ");
        this.jLabel2.setFont(new Font("Times New Roman", 3, 14));
        this.jLabel2.setText("size of queue =10");
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1)).addGroup(jPanel3Layout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.jLabel2).addGap(117, 117, 117).addComponent(this.hint, -2, 449, -2))).addContainerGap(-1, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jLabel1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.hint)).addGap(23, 23, 23)));
        this.des.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 376, 32767));
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
        if (this.rear == -1 && this.front == -1) {
            this.rear = this.front = Integer.valueOf(0);
            this.queue[this.rear.intValue()] = this.insert_text;
            this.hint.setText("rear = rear+1    front = rear = 0");
            this.hint.setFont(new Font("Times New Roman", 1, 24));
        } else {
            if (this.rear == 9 && this.front == 0) {
                this.hint.setText("Queue[] is full");
                this.hint.setFont(new Font("Times New Roman", 1, 24));
                this.hint.setForeground(Color.RED);
                System.out.println(this.front + "      " + this.rear);
                return;
            }
            if (this.front == this.rear + 1) {
                this.hint.setText("Queue[] is full");
                this.hint.setFont(new Font("Times New Roman", 1, 24));
                this.hint.setForeground(Color.RED);
                System.out.println(this.front + "      " + this.rear);
                return;
            }
            if (this.rear == 9) {
                this.rear = 0;
                this.hint.setForeground(Color.black);
                this.hint.setText("Since,rear = 9 So,rear=0  Queue[rear]=" + this.insert_text);
            } else {
                Integer n = this.rear;
                Integer n2 = this.rear = Integer.valueOf(this.rear + 1);
                this.hint.setForeground(Color.black);
                this.hint.setText("rear = rear+1   Queue[rear]=" + this.insert_text);
                try {
                    Thread.sleep(1000);
                }
                catch (Exception ex) {
                    // empty catch block
                }
            }
        }
        this.view.rear = this.rear;
        this.view.added_string = this.insert_text;
        this.view.front = this.front;
        this.view.add_string();
        System.out.println(this.front + "      " + this.rear);
        this.view.repaint();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        if (this.rear == -1 && this.front == -1) {
            this.hint.setFont(new Font("Times New Roman", 1, 24));
            this.hint.setForeground(Color.red);
            this.hint.setText("Queue empty");
            System.out.println(this.front + "      " + this.rear);
            return;
        }
        if (this.front == 9) {
            this.view.front = this.front = Integer.valueOf(0);
            this.hint.setFont(new Font("Times New Roman", 1, 24));
            this.hint.setForeground(Color.black);
            this.hint.setText("Since front =9   So front =0");
        } else {
            Integer n = this.front;
            Integer n2 = this.front = Integer.valueOf(this.front + 1);
            this.view.front = this.front;
            this.hint.setForeground(Color.black);
            this.hint.setText("front = front+1");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
                Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.view.rear = this.rear;
        }
        System.out.println(this.front + "      " + this.rear);
        this.view.repaint();
    }

    void add_view(View view) {
        this.view = view;
    }

}

