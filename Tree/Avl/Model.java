/*
 * Decompiled with CFR 0_114.
 */
package Tree.Avl;

import Tree.Avl.View;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Model
extends JFrame {
    View view;
    public JPanel des;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;

    public Model() {
        this.initComponents();
        this.setLocationRelativeTo(null);
    }

    public void add_view(View view) {
        this.view = view;
    }

    private void initComponents() {
        this.des = new JPanel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.setDefaultCloseOperation(3);
        this.des.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        GroupLayout desLayout = new GroupLayout(this.des);
        this.des.setLayout(desLayout);
        desLayout.setHorizontalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
        desLayout.setVerticalGroup(desLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 625, 32767));
        this.jButton1.setText("delete");
        this.jButton2.setText("insert");
        this.jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setText("Rotation");
        this.jButton3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setText("Basic");
        this.jButton4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent evt) {
                Model.this.jButton4ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.des, -1, -1, 32767).addGroup(layout.createSequentialGroup().addContainerGap(172, 32767).addComponent(this.jButton4).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(51, 51, 51).addComponent(this.jButton3).addGap(240, 240, 240).addComponent(this.jButton1).addGap(336, 336, 336)).addGroup(layout.createSequentialGroup().addGap(191, 191, 191).addComponent(this.jButton2).addContainerGap(521, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jButton2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton3)).addGap(18, 18, 18)).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jButton4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767))).addComponent(this.des, -2, -1, -2)));
        this.pack();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.view.insert = 1;
        this.view.paint_count = -2;
        this.view.p = 1;
        this.view.repaint();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.view.basic = 0;
        this.view.rotate = 1;
        this.view.repaint();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        this.view.basic = 1;
        this.view.rotate = 0;
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

