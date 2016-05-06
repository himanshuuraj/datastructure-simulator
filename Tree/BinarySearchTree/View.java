/*
 * Decompiled with CFR 0_114.
 */
package Tree.BinarySearchTree;

import Tree.BinarySearchTree.BST;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.Timer;

public class View
extends JPanel {
    int pr_i = 0;
    BST[] pr_a = new BST[20];
    BST gh;
    BST aj;
    BST loc;
    BST parsuc;
    BST save;
    BST par;
    BST bc;
    BST child;
    BST suc;
    Graphics2D g2d;
    Integer paint_count = -2;
    Integer j = -1;
    String[] elements = new String[10];
    Timer timer;
    String insert_element = "45";
    Integer found_counter = 0;
    Integer check_counter = 0;
    BST root;
    BST left;
    BST right;
    BST abc;
    int left_counter = 0;
    int right_counter = 0;
    int ptr_counter = 0;
    int root_data = 0;
    BST[] ptr = new BST[20];
    int x = 0;
    int pr_j = 0;
    String[] pre_data = new String[20];
    int po_j = 0;
    int po_x = -1;
    int po_i = 0;
    int in_j = 0;
    int in_x = -1;
    int in_i = 0;
    int del_i = 0;
    String del_text = "hh";
    int y = 0;
    int traverse_root = 0;

    public View() {
        this.initComponents();
        Integer i = 0;
        while (i < 10) {
            this.elements[i.intValue()] = i.toString();
            Integer n = i;
            Integer n2 = i = Integer.valueOf(i + 1);
        }
        this.root = new BST();
        this.left = new BST();
        this.right = new BST();
        this.abc = new BST();
        this.loc = new BST();
        this.par = new BST();
        this.parsuc = new BST();
        this.save = new BST();
        this.aj = new BST();
        this.bc = new BST();
        this.child = new BST();
        this.suc = new BST();
        this.timer = new Timer(3000, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    View.this.repaint();
                }
                catch (Exception ex) {
                    // empty catch block
                }
            }
        });
        for (int i2 = 0; i2 < 20; ++i2) {
            this.ptr[i2] = new BST();
            this.pr_a[i2] = new BST();
            this.pre_data[i2] = new String();
        }
        this.abc = this.root;
    }

    void preorder() {
        this.abc = this.root;
        this.pr_a[0] = null;
        while (this.abc != null) {
            ++this.pr_j;
            this.g2d.drawString(this.abc.data, 50, 40 + 30 * this.pr_j);
            if (this.abc.right != null) {
                ++this.x;
                this.pr_a[this.x] = this.abc.right;
            }
            if (this.abc.left != null) {
                this.abc = this.abc.left;
                continue;
            }
            this.abc = this.pr_a[this.x];
            --this.x;
        }
        this.pr_i = 0;
    }

    void postorder(BST abc) {
        if (abc != null) {
            this.postorder(abc.left);
            this.postorder(abc.right);
            System.out.print(abc.data);
            ++this.po_x;
            this.g2d.drawString(abc.data, 50, 40 + 40 * this.po_x);
        }
        this.po_i = 0;
    }

    void inorder(BST abc) {
        if (abc != null) {
            this.inorder(abc.left);
            System.out.print(abc.data);
            ++this.in_x;
            this.g2d.drawString(abc.data, 50, 40 + 40 * this.in_x);
            this.inorder(abc.right);
        }
        this.in_i = 0;
    }

    void del() {
        this.abc = this.root;
        this.find();
        if (this.loc == null) {
            this.g2d.drawString("Element not found", 100, 50);
            return;
        }
        if (this.loc.right != null && this.loc.left != null) {
            this.deltwo();
        } else {
            this.delone();
        }
    }

    int find() {
        if (this.root == null) {
            this.loc = null;
            this.par = null;
            return 1;
        }
        if (this.del_text.compareTo(this.root.data) == 0) {
            this.loc = this.root;
            this.par = null;
            return 0;
        }
        if (this.del_text.compareTo(this.root.data) < 0) {
            this.abc = this.root.left;
            this.save = this.root;
        } else {
            this.abc = this.root.right;
            this.save = this.root;
        }
        while (this.abc != null) {
            if (this.del_text.compareTo(this.root.data) == 0) {
                this.loc = this.abc;
                this.par = this.save;
                return 0;
            }
            if (this.del_text.compareTo(this.root.data) < 0) {
                this.save = this.abc;
                this.abc = this.abc.left;
                continue;
            }
            this.save = this.abc;
            this.abc = this.abc.right;
        }
        this.loc = null;
        this.par = this.save;
        return 0;
    }

    void delone() {
        if (this.loc.left == null && this.loc.right == null) {
            this.child = null;
        } else if (this.loc.left != null && this.loc.right == null) {
            this.child = this.loc.left;
        } else if (this.loc.right != null && this.loc.left == null) {
            this.child = this.loc.right;
        }
        if (this.par != null) {
            if (this.loc == this.par.left) {
                this.par.left = this.child;
            } else {
                this.par.right = this.child;
            }
        } else {
            this.root = this.child;
        }
    }

    void deltwo() {
        this.abc = this.loc.right;
        this.save = this.loc;
        while (this.abc.left != null) {
            this.save = this.abc;
            this.abc = this.abc.left;
        }
        this.aj = this.abc;
        this.bc = this.save;
        this.suc = this.loc;
        this.parsuc = this.par;
        this.loc = this.abc;
        this.par = this.save;
        this.delone();
        this.par = this.parsuc;
        this.loc = this.suc;
        this.suc = this.aj;
        this.parsuc = this.bc;
        if (this.par != null) {
            if (this.loc == this.par.left) {
                this.par.left = this.suc;
            } else {
                this.par.right = this.suc;
            }
        } else {
            this.root = this.suc;
        }
        this.suc.left = this.loc.left;
        this.suc.right = this.loc.right;
    }

    void drawcircle(Graphics g, String t, Integer x, Integer y) {
        this.g2d = (Graphics2D)g;
        this.g2d.setPaint(Color.CYAN);
        this.g2d.fillOval(x, y, 50, 50);
        this.g2d.setPaint(Color.BLACK);
        this.g2d.drawString(t, x + 15, y + 28);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Integer n = this.paint_count;
            Integer n2 = this.paint_count = Integer.valueOf(this.paint_count + 1);
            this.g2d = (Graphics2D)g;
            if (this.j == 10) {
                this.j = 0;
            }
            if (this.j > -1) {
                this.left_counter = 0;
                this.right_counter = 0;
                if (this.root_data == 0) {
                    this.root.data = this.insert_element;
                    this.drawcircle(g, this.insert_element, 400, 50);
                    this.root = this.ptr[this.ptr_counter];
                    ++this.root_data;
                    return;
                }
                if (this.root_data != 0) {
                    // empty if block
                }
                this.abc = this.root;
                if (this.pr_i == 1) {
                    this.showtree(this.root, 400, 50);
                    this.preorder();
                    this.x = 0;
                    return;
                }
                if (this.po_i == 1) {
                    this.showtree(this.root, 400, 50);
                    this.postorder(this.root);
                    this.po_x = 0;
                    return;
                }
                if (this.in_i == 1) {
                    this.showtree(this.root, 400, 50);
                    this.inorder(this.root);
                    this.in_x = 0;
                    return;
                }
                this.gh = this.abc;
                while (this.abc != null) {
                    this.gh = this.abc;
                    BST f = this.ptr[this.ptr_counter];
                    if (f.data.compareTo(this.abc.data) > 0) {
                        this.abc = this.abc.right;
                        System.out.println("2");
                        if (this.abc == null) continue;
                        ++this.left_counter;
                        ++this.right_counter;
                        continue;
                    }
                    this.abc = this.abc.left;
                    if (this.abc == null) continue;
                    ++this.left_counter;
                    ++this.right_counter;
                }
                this.abc = this.gh;
                if (this.ptr[this.ptr_counter].data.compareTo(this.abc.data) > 0) {
                    this.abc = this.abc.right = this.ptr[this.ptr_counter];
                    ++this.left_counter;
                    ++this.right_counter;
                } else {
                    ++this.left_counter;
                    ++this.right_counter;
                    this.abc = this.abc.left = this.ptr[this.ptr_counter];
                }
            }
            this.showtree(this.root, 400, 50);
            System.out.println();
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    void traverse(BST abc) {
        if (abc != null) {
            this.traverse(abc.left);
            System.out.print(abc.data);
            this.traverse(abc.right);
        }
    }

    void drawLeftArrow(Integer x, Integer y) {
        try {
            x = x + 25;
            y = y + 60;
            int z = x;
            this.g2d.setStroke(new BasicStroke(4.0f));
            this.g2d.drawLine(x - 25, y, x + 55, y - 35);
        }
        catch (Exception e) {
            // empty catch block
        }
    }

    void drawRightArrow(Integer x, Integer y) {
        x = x + 25;
        y = y + 60;
        this.g2d.setStroke(new BasicStroke(4.0f));
        this.g2d.drawLine(x + 25, y, x - 55, y - 35);
    }

    private void initComponents() {
        this.setBackground(new Color(255, 255, 153));
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 800, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 601, 32767));
    }

    void showtree(BST abc, int col, int row) {
        this.drawcircle(this.g2d, abc.data, col, row);
        if (abc.left != null) {
            this.drawLeftArrow(col - 40, row + 20);
            if (row % 2 == 0) {
                this.showtree(abc.left, col - 60, row + 60);
            } else {
                this.showtree(abc.left, col - 80, row + 60);
            }
        }
        if (abc.right != null) {
            this.drawRightArrow(col + 40, row + 20);
            if (row % 2 == 0) {
                this.showtree(abc.right, col + 60, row + 60);
            } else {
                this.showtree(abc.right, col + 80, row + 60);
            }
        }
    }

}

