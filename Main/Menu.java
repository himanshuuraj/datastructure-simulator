/*
 * Decompiled with CFR 0_114.
 */
package Main;

import Search.Controller;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu
extends JFrame {
    private JLabel avl;
    private JLabel bplus;
    private JLabel bst;
    private JLabel bubble;
    private JLabel bway;
    private JLabel conversion;
    private JLabel expression;
    private JLabel graph;
    private JLabel heap;
    private JLabel insertion;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JLabel linklist;
    private JLabel merge;
    private JLabel mway;
    private JLabel queue;
    private JLabel quick;
    private JLabel radix;
    private JLabel search;
    private JLabel selection;
    private JLabel stack;
    private JLabel tree;

    public Menu() {
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
        this.underline();
        this.setResizable(false);
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.stack = new JLabel();
        this.queue = new JLabel();
        this.linklist = new JLabel();
        this.expression = new JLabel();
        this.conversion = new JLabel();
        this.search = new JLabel();
        this.mway = new JLabel();
        this.jLabel8 = new JLabel();
        this.tree = new JLabel();
        this.bubble = new JLabel();
        this.bst = new JLabel();
        this.heap = new JLabel();
        this.graph = new JLabel();
        this.bway = new JLabel();
        this.avl = new JLabel();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jPanel4 = new JPanel();
        this.bplus = new JLabel();
        this.insertion = new JLabel();
        this.selection = new JLabel();
        this.quick = new JLabel();
        this.merge = new JLabel();
        this.radix = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setBackground(new Color(0, 0, 0));
        this.jPanel1.setBackground(new Color(102, 255, 255));
        this.stack.setFont(new Font("Times New Roman", 3, 24));
        this.stack.setText("STACK");
        this.stack.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.stackMousePressed(evt);
            }
        });
        this.queue.setFont(new Font("Times New Roman", 3, 24));
        this.queue.setText("QUEUE");
        this.queue.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.queueMousePressed(evt);
            }
        });
        this.linklist.setFont(new Font("Times New Roman", 3, 24));
        this.linklist.setText("LINK LIST");
        this.linklist.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.linklistMousePressed(evt);
            }
        });
        this.expression.setFont(new Font("Times New Roman", 3, 24));
        this.expression.setText("EXPRESSION");
        this.expression.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.expressionMousePressed(evt);
            }
        });
        this.conversion.setFont(new Font("Times New Roman", 3, 24));
        this.conversion.setText("CONVERSION");
        this.search.setFont(new Font("Times New Roman", 3, 24));
        this.search.setText("SEARCH");
        this.search.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.searchMousePressed(evt);
            }
        });
        this.mway.setFont(new Font("Times New Roman", 3, 24));
        this.mway.setText("M - WAY");
        this.jLabel8.setFont(new Font("Times New Roman", 3, 24));
        this.jLabel8.setText("DATA STRUCTURE");
        this.tree.setFont(new Font("Times New Roman", 3, 24));
        this.tree.setText("TREE");
        this.bubble.setFont(new Font("Times New Roman", 3, 24));
        this.bubble.setText("BUBBLE SORT");
        this.bubble.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.bubbleMousePressed(evt);
            }
        });
        this.bst.setFont(new Font("Times New Roman", 3, 24));
        this.bst.setText("BINARY SEARCH");
        this.bst.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.bstMousePressed(evt);
            }
        });
        this.heap.setFont(new Font("Times New Roman", 3, 24));
        this.heap.setText("HEAP");
        this.graph.setFont(new Font("Times New Roman", 3, 24));
        this.graph.setText("GRAPH");
        this.bway.setFont(new Font("Times New Roman", 3, 24));
        this.bway.setText("B- WAY");
        this.bway.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.bwayMousePressed(evt);
            }
        });
        this.avl.setFont(new Font("Times New Roman", 3, 24));
        this.avl.setText("AVL");
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 155, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 351, 32767));
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 152, 32767));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 357, 32767));
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 590, 32767));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 131, 32767));
        this.bplus.setFont(new Font("Times New Roman", 3, 24));
        this.bplus.setText("B+");
        this.insertion.setFont(new Font("Times New Roman", 3, 24));
        this.insertion.setText("INSERTION SORT");
        this.insertion.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.insertionMousePressed(evt);
            }
        });
        this.selection.setFont(new Font("Times New Roman", 3, 24));
        this.selection.setText("SELECTION SORT");
        this.selection.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.selectionMousePressed(evt);
            }
        });
        this.quick.setFont(new Font("Times New Roman", 3, 24));
        this.quick.setText("QUICK SORT");
        this.quick.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.quickMousePressed(evt);
            }
        });
        this.merge.setFont(new Font("Times New Roman", 3, 24));
        this.merge.setText("MERGE SORT");
        this.merge.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent evt) {
                Menu.this.mergeMousePressed(evt);
            }
        });
        this.radix.setFont(new Font("Times New Roman", 3, 24));
        this.radix.setText("RADIX SORT");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(87, 87, 87).addComponent(this.conversion).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.avl).addComponent(this.bst).addComponent(this.mway).addComponent(this.bway).addComponent(this.heap).addComponent(this.bplus)).addGap(51, 51, 51)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(63, 63, 63).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.queue).addComponent(this.stack).addComponent(this.linklist).addComponent(this.expression).addComponent(this.search).addComponent(this.bubble).addComponent(this.selection).addComponent(this.quick).addComponent(this.insertion, -2, 215, -2)).addGap(145, 145, 145).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.graph).addComponent(this.tree).addComponent(this.merge).addComponent(this.radix))).addGroup(jPanel1Layout.createSequentialGroup().addGap(53, 53, 53).addComponent(this.jPanel4, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, 32767))).addComponent(this.jPanel3, -2, -1, -2).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addGap(391, 391, 391).addComponent(this.jLabel8).addGap(27, 27, 27)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(196, 196, 196).addComponent(this.tree).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bst, -2, 28, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.avl).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.mway).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bway).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.heap).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bplus).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.graph).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.merge).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.radix)).addGroup(jPanel1Layout.createSequentialGroup().addGap(88, 88, 88).addComponent(this.jLabel8).addGap(80, 80, 80).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel2, -2, -1, -2).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.stack).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.queue).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.linklist).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.expression).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.conversion).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.search).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bubble).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.insertion).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.selection).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.quick)))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel3, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, -1, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.pack();
    }

    private void stackMousePressed(MouseEvent evt) {
        this.dispose();
        new Stack.Controller();
    }

    private void queueMousePressed(MouseEvent evt) {
        this.dispose();
        new Queue.Controller();
    }

    private void linklistMousePressed(MouseEvent evt) {
        this.dispose();
        new Linklist.Controller();
    }

    private void searchMousePressed(MouseEvent evt) {
        this.dispose();
        new Controller();
    }

    private void expressionMousePressed(MouseEvent evt) {
        this.dispose();
        new Conversion.Controller();
    }

    private void bubbleMousePressed(MouseEvent evt) {
        this.dispose();
        new Sort.Controller();
    }

    private void insertionMousePressed(MouseEvent evt) {
        this.dispose();
        new Sort.Controller();
    }

    private void selectionMousePressed(MouseEvent evt) {
        this.dispose();
        new Sort.Controller();
    }

    private void quickMousePressed(MouseEvent evt) {
        this.dispose();
        new Quick.Controller();
    }

    private void mergeMousePressed(MouseEvent evt) {
        this.dispose();
        new MergeSort.Controller();
    }

    private void bstMousePressed(MouseEvent evt) {
        this.dispose();
        new Tree.BinarySearchTree.Controller();
    }

    private void bwayMousePressed(MouseEvent evt) {
        this.dispose();
        new Tree.Bway.Controller();
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
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    void abc(JLabel xyz) {
        Font font = xyz.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, (Integer)TextAttribute.UNDERLINE_ON);
        xyz.setFont(font.deriveFont(attributes));
    }

    void underline() {
        this.abc(this.stack);
        this.abc(this.queue);
        this.abc(this.linklist);
        this.abc(this.expression);
        this.abc(this.conversion);
        this.abc(this.search);
        this.abc(this.mway);
        this.abc(this.jLabel8);
        this.abc(this.tree);
        this.abc(this.bubble);
        this.abc(this.bst);
        this.abc(this.heap);
        this.abc(this.graph);
        this.abc(this.bway);
        this.abc(this.avl);
    }

}

