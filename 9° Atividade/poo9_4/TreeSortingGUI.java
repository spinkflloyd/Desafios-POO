package poo9_4;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;

public class TreeSortingGUI extends JFrame {

    private JTree tree;
    private DefaultTreeModel treeModel;
    private JRadioButton rbAlphabetical;
    private JRadioButton rbBySize;
    private ButtonGroup sortGroup;

    static class CustomTreeNode extends DefaultMutableTreeNode {
        private String name;
        private int simulatedSize;

        public CustomTreeNode(String name, int simulatedSize) {
            super(name);
            this.name = name;
            this.simulatedSize = simulatedSize;
        }

        public String getName() {
            return name;
        }

        public int getSimulatedSize() {
            return simulatedSize;
        }

        public String toString() {
            return name + " (" + simulatedSize + " KB)";
        }
    }

    public TreeSortingGUI() {
        setTitle("Ordenação de JTree");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        CustomTreeNode root = new CustomTreeNode("Meu Computador", 0);
        CustomTreeNode cDrive = new CustomTreeNode("C:", 0);
        CustomTreeNode users = new CustomTreeNode("Users", 0);
        CustomTreeNode documents = new CustomTreeNode("Documents", 0);
        CustomTreeNode downloads = new CustomTreeNode("Downloads", 0);
        CustomTreeNode user1 = new CustomTreeNode("Alice", 0);
        CustomTreeNode user2 = new CustomTreeNode("Bob", 0);

        CustomTreeNode file1 = new CustomTreeNode("documento.txt", 150);
        CustomTreeNode file2 = new CustomTreeNode("foto.jpg", 2500);
        CustomTreeNode file3 = new CustomTreeNode("relatorio.pdf", 800);
        CustomTreeNode file4 = new CustomTreeNode("setup.exe", 12000);
        CustomTreeNode file5 = new CustomTreeNode("audio.mp3", 3000);

        root.add(cDrive);
        cDrive.add(users);
        users.add(user1);
        users.add(user2);
        user1.add(documents);
        user1.add(downloads);
        documents.add(file1);
        documents.add(file3);
        downloads.add(file2);
        downloads.add(file5);
        cDrive.add(file4);

        treeModel = new DefaultTreeModel(root);
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        tree.setRootVisible(true);

        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane, BorderLayout.CENTER);

        JPanel sortPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        sortPanel.setBorder(BorderFactory.createTitledBorder("Ordenar Por"));

        rbAlphabetical = new JRadioButton("Alfabética");
        rbAlphabetical.setSelected(true);
        rbBySize = new JRadioButton("Por Tamanho");

        sortGroup = new ButtonGroup();
        sortGroup.add(rbAlphabetical);
        sortGroup.add(rbBySize);

        sortPanel.add(rbAlphabetical);
        sortPanel.add(rbBySize);
        add(sortPanel, BorderLayout.NORTH);

        ActionListener sortListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTreeSorting();
            }
        };

        rbAlphabetical.addActionListener(sortListener);
        rbBySize.addActionListener(sortListener);

        updateTreeSorting();

        setVisible(true);
    }

    private void updateTreeSorting() {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) treeModel.getRoot();
        sortChildren(root);
        treeModel.reload(root);
    }

    private void sortChildren(DefaultMutableTreeNode parentNode) {
        if (parentNode == null || parentNode.getChildCount() == 0) {
            return;
        }

        ArrayList<MutableTreeNode> children = new ArrayList<>();
        Enumeration<TreeNode> e = parentNode.children();
        while (e.hasMoreElements()) {
            children.add((MutableTreeNode) e.nextElement());
        }

        Comparator<MutableTreeNode> comparator;
        if (rbAlphabetical.isSelected()) {
            comparator = new Comparator<MutableTreeNode>() {
                public int compare(MutableTreeNode node1, MutableTreeNode node2) {
                    if (node1 instanceof CustomTreeNode && node2 instanceof CustomTreeNode) {
                        CustomTreeNode customNode1 = (CustomTreeNode) node1;
                        CustomTreeNode customNode2 = (CustomTreeNode) node2;
                        return customNode1.getName().compareToIgnoreCase(customNode2.getName());
                    }
                    return node1.toString().compareToIgnoreCase(node2.toString());
                }
            };
        } else {
            comparator = new Comparator<MutableTreeNode>() {
                public int compare(MutableTreeNode node1, MutableTreeNode node2) {
                    if (node1 instanceof CustomTreeNode && node2 instanceof CustomTreeNode) {
                        CustomTreeNode customNode1 = (CustomTreeNode) node1;
                        CustomTreeNode customNode2 = (CustomTreeNode) node2;
                        return Integer.compare(customNode2.getSimulatedSize(), customNode1.getSimulatedSize());
                    }
                    return 0;
                }
            };
        }

        Collections.sort(children, comparator);

        parentNode.removeAllChildren();
        for (MutableTreeNode child : children) {
            parentNode.add(child);
            if (child.getChildCount() > 0) {
                sortChildren((DefaultMutableTreeNode) child);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TreeSortingGUI();
            }
        });
    }
}