
package Calc;


import java.awt.BorderLayout;
  import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public final class CalculatorUI extends javax.swing.JFrame {
    // ==== Singleton (مثل ما عندك) ====
    private static CalculatorUI instance = null;

    // ==== حقولك الأصلية ====
    private final Calculator calculator ;
    private int x, y;

    // ==== مكوّنات NetBeans الأصلية ====
    private javax.swing.JPanel app;
    private static javax.swing.JButton btn0;
    private static javax.swing.JButton btn1;
    private static javax.swing.JButton btn2;
    private static javax.swing.JButton btn3;
    private static javax.swing.JButton btn4;
    private static javax.swing.JButton btn5;
    private static javax.swing.JButton btn6;
    private static javax.swing.JButton btn7;
    private static javax.swing.JButton btn8;
    private static javax.swing.JButton btn9;
    private static javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private static javax.swing.JButton btnDel;
    private static javax.swing.JButton btnDiv;
    private static javax.swing.JButton btnDot;
    private static javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMini;
    private static javax.swing.JButton btnMult;
    private static javax.swing.JButton btnPlus;
    private static javax.swing.JButton btnPlusSub;
    private static javax.swing.JButton btnSub;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JTextField current;
    private javax.swing.JTextField previous;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBar;

    // ==== إضافات بسيطة: قائمة و Dialog للأزرار المتقدمة ====
    private JDialog advDialog;                 // نافذة العمليات المتقدمة
    private JPanel advContent;                 // لوحة أزرار العمليات المتقدمة داخل الـ Dialog

    private CalculatorUI() {
        calculator = new Calculator();
        initComponents();          // (مولّد NetBeans)
        getContentPane().setSize(400, 700);
        updateDisplay();
        addEvents();               // ربط أحداث الأزرار الأساسية

        buildAdvancedMenu();       // قائمة Advanced + فتح لوحة الأزرار المتقدمة
    }

    public static CalculatorUI getInstance() {
        if (instance == null) {
            instance = new CalculatorUI();
        }
        return instance;
    }

    // =========================================================
    // ===============  NetBeans Generated Code  ===============
    // =========================================================
    @SuppressWarnings("unchecked")
    private void initComponents() {

        app = new javax.swing.JPanel();
        resultsPanel = new javax.swing.JPanel();
        previous = new javax.swing.JTextField();
        current = new javax.swing.JTextField();
        buttonsPanel = new javax.swing.JPanel();
        btnDel = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlusSub = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        titleBar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnMini = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 100));
        setUndecorated(true);
        setResizable(false);

        app.setBackground(new java.awt.Color(13, 12, 20));
        app.setForeground(new java.awt.Color(40, 40, 40));
        app.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultsPanel.setBackground(new java.awt.Color(34, 34, 34));
        resultsPanel.setForeground(new java.awt.Color(57, 57, 57));
        resultsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous.setEditable(false);
        previous.setBackground(new java.awt.Color(21, 20, 22));
        previous.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        previous.setForeground(new java.awt.Color(203, 198, 213));
        previous.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        previous.setBorder(null);
        resultsPanel.add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        current.setEditable(false);
        current.setBackground(new java.awt.Color(41, 39, 44));
        current.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        current.setForeground(new java.awt.Color(255, 255, 255));
        current.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        current.setBorder(null);
        resultsPanel.add(current, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 320, 60));

        app.add(resultsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 110));

        buttonsPanel.setBackground(new java.awt.Color(21, 20, 22));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(250, 50));
        buttonsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDel.setBackground(new java.awt.Color(41, 39, 44));
        btnDel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("←");
        btnDel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDel.setFocusPainted(false);
        btnDel.setIconTextGap(1);
        btnDel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDel.setPreferredSize(new java.awt.Dimension(70, 70));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnClear.setBackground(new java.awt.Color(41, 39, 44));
        btnClear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setFocusPainted(false);
        btnClear.setIconTextGap(1);
        btnClear.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnClear.setPreferredSize(new java.awt.Dimension(70, 70));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        btnDiv.setBackground(new java.awt.Color(41, 39, 44));
        btnDiv.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(255, 255, 255));
        btnDiv.setText("÷");
        btnDiv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiv.setFocusPainted(false);
        btnDiv.setIconTextGap(1);
        btnDiv.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDiv.setPreferredSize(new java.awt.Dimension(70, 70));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        btnMult.setBackground(new java.awt.Color(41, 39, 44));
        btnMult.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMult.setForeground(new java.awt.Color(255, 255, 255));
        btnMult.setText("×");
        btnMult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnMult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMult.setFocusPainted(false);
        btnMult.setIconTextGap(1);
        btnMult.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMult.setPreferredSize(new java.awt.Dimension(70, 70));
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        btn7.setBackground(new java.awt.Color(21, 20, 22));
        btn7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setFocusPainted(false);
        btn7.setIconTextGap(1);
        btn7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn7.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        btn8.setBackground(new java.awt.Color(21, 20, 22));
        btn8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setFocusPainted(false);
        btn8.setIconTextGap(1);
        btn8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn8.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        btn9.setBackground(new java.awt.Color(21, 20, 22));
        btn9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setFocusPainted(false);
        btn9.setIconTextGap(1);
        btn9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn9.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        btnSub.setBackground(new java.awt.Color(41, 39, 44));
        btnSub.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSub.setForeground(new java.awt.Color(255, 255, 255));
        btnSub.setText("-");
        btnSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnSub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSub.setFocusPainted(false);
        btnSub.setIconTextGap(1);
        btnSub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSub.setPreferredSize(new java.awt.Dimension(70, 70));
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        btn4.setBackground(new java.awt.Color(21, 20, 22));
        btn4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setFocusPainted(false);
        btn4.setIconTextGap(1);
        btn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn4.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btn5.setBackground(new java.awt.Color(21, 20, 22));
        btn5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setFocusPainted(false);
        btn5.setIconTextGap(1);
        btn5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn5.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        btn6.setBackground(new java.awt.Color(21, 20, 22));
        btn6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setFocusPainted(false);
        btn6.setIconTextGap(1);
        btn6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn6.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        btnPlus.setBackground(new java.awt.Color(41, 39, 44));
        btnPlus.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus.setText("+");
        btnPlus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlus.setFocusPainted(false);
        btnPlus.setIconTextGap(1);
        btnPlus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPlus.setPreferredSize(new java.awt.Dimension(70, 140));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        btn1.setBackground(new java.awt.Color(21, 20, 22));
        btn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setFocusPainted(false);
        btn1.setIconTextGap(1);
        btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn1.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btn2.setBackground(new java.awt.Color(21, 20, 22));
        btn2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setFocusPainted(false);
        btn2.setIconTextGap(1);
        btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn2.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btn3.setBackground(new java.awt.Color(21, 20, 22));
        btn3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setFocusPainted(false);
        btn3.setIconTextGap(1);
        btn3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn3.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        btnPlusSub.setBackground(new java.awt.Color(21, 20, 22));
        btnPlusSub.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnPlusSub.setForeground(new java.awt.Color(255, 255, 255));
        btnPlusSub.setText("+/-");
        btnPlusSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnPlusSub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlusSub.setFocusPainted(false);
        btnPlusSub.setIconTextGap(1);
        btnPlusSub.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPlusSub.setPreferredSize(new java.awt.Dimension(70, 70));
        btnPlusSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusSubActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnPlusSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btn0.setBackground(new java.awt.Color(21, 20, 22));
        btn0.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setFocusPainted(false);
        btn0.setIconTextGap(1);
        btn0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn0.setPreferredSize(new java.awt.Dimension(70, 70));
        buttonsPanel.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        btnDot.setBackground(new java.awt.Color(21, 20, 22));
        btnDot.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDot.setForeground(new java.awt.Color(255, 255, 255));
        btnDot.setText(".");
        btnDot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnDot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDot.setFocusPainted(false);
        btnDot.setIconTextGap(1);
        btnDot.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDot.setPreferredSize(new java.awt.Dimension(70, 70));
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        btnEqual.setBackground(new java.awt.Color(41, 39, 44));
        btnEqual.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(255, 255, 255));
        btnEqual.setText("=");
        btnEqual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 39, 44)));
        btnEqual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEqual.setFocusPainted(false);
        btnEqual.setIconTextGap(1);
        btnEqual.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnEqual.setPreferredSize(new java.awt.Dimension(70, 70));
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        buttonsPanel.add(btnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        app.add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 320, 390));

        titleBar.setBackground(new java.awt.Color(21, 20, 22));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Calculator");
        title.setPreferredSize(new java.awt.Dimension(84, 18));
        title.setRequestFocusEnabled(false);
        titleBar.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 2, -1, 25));

        btnMini.setBackground(new java.awt.Color(21, 20, 22));
        btnMini.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnMini.setForeground(new java.awt.Color(255, 255, 255));
        btnMini.setText("-");
        btnMini.setBorder(null);
        btnMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMini.setFocusPainted(false);
        btnMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMiniMouseExited(evt);
            }
        });
        btnMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniActionPerformed(evt);
            }
        });
        titleBar.add(btnMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 30, -1));

        btnClose.setBackground(new java.awt.Color(21, 20, 22));
        btnClose.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("×");
        btnClose.setBorder(null);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setFocusPainted(false);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        titleBar.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, -1));

        app.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 30));

        // ملاحظة: نخلي app هو الـ contentPane الافتراضي (ما نغير تخطيطك)
        setContentPane(app);

        pack();
    }

    // =========================================================
    // ==================== الأحداث الأساسية ====================
    // =========================================================
    public void addEvents() {
        JButton[] btns = {
            btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9,
            btnDiv, btnDot, btnEqual, btnDel,
            btnMult, btnPlus, btnPlusSub, btnSub, btnClear
        };

        JButton[] numbers = {
            btn0, btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9
        };

        for (JButton number : numbers) {
            number.addActionListener((ActionEvent e) -> {
                calculator.appendNumber(((JButton) e.getSource()).getText());
                updateDisplay();
            });
        }
        for (JButton btn : btns) {
            btn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    ((JButton) e.getSource()).setBackground(new Color(73, 69, 78));
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    Object b = e.getSource();
                    if (b == btnDiv || b == btnEqual || b == btnDel || b == btnMult || b == btnSub || b == btnPlus || b == btnClear) {
                        ((JButton) b).setBackground(new Color(41, 39, 44));
                    } else {
                        ((JButton) b).setBackground(new Color(21, 20, 22));
                    }
                }
            });
        }
    }

    public void updateDisplay() {
        current.setText(calculator.getCurrentOperand());
        previous.setText(calculator.getPreviousOperand() + " " + calculator.getOperation());
    }

    // ==== أزرار الأرقام والعمليات الأساسية (كما هي) ====
    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {
        calculator.appendNumber((calculator.getCurrentOperand().isBlank() ? "0." : "."));
        updateDisplay();
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        calculator.clear();
        updateDisplay();
    }
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {
        String curr = calculator.getCurrentOperand();
        if (!curr.equals("")) {
            calculator.setCurrentOperand(curr.substring(0, curr.length() - 1));
            updateDisplay();
        }
    }
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {
        calculator.chooseOperation("+");
        updateDisplay();
    }
    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {
        calculator.chooseOperation("*");
        updateDisplay();
    }
    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {
        calculator.chooseOperation("-");
        updateDisplay();
    }
    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {
        calculator.chooseOperation("/");
        updateDisplay();
    }
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {
        calculator.compute();
        updateDisplay();
        if (calculator.getCurrentOperand().equals("Error"))
            calculator.setCurrentOperand("");
    }
    private void btnPlusSubActionPerformed(java.awt.event.ActionEvent evt) {
        if (!calculator.getCurrentOperand().isBlank()) {
            float tmp = -Float.parseFloat(calculator.getCurrentOperand());
            calculator.setCurrentOperand((tmp - (int) tmp) != 0 ? Float.toString(tmp) : Integer.toString((int) tmp));
            updateDisplay();
        }
    }
    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {
        btnClose.setBackground(new Color(255, 75, 75));
        btnClose.setForeground(new Color(31, 30, 33));
    }
    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {
        btnClose.setBackground(new Color(21,20,22));
        btnClose.setForeground(Color.WHITE);
    }
    private void btnMiniMouseEntered(java.awt.event.MouseEvent evt) {
        btnMini.setBackground(new Color(73, 69, 78));
    }
    private void btnMiniMouseExited(java.awt.event.MouseEvent evt) {
        btnMini.setBackground(new Color(21,20,22));
    }
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
    private void btnMiniActionPerformed(java.awt.event.ActionEvent evt) {
        setState(CalculatorUI.ICONIFIED);
    }
    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {
        x = evt.getX();
        y = evt.getY();
    }
    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }

    // =========================================================
    // ====================  Advanced UI  ======================
    // =========================================================

    /** يبني قائمة Advanced ويضيف عنصر يفتح لوحة الأزرار المتقدمة */
    private void buildAdvancedMenu() {
        JMenuBar bar = getJMenuBar();
        if (bar == null) { bar = new JMenuBar(); setJMenuBar(bar); }

        JMenu adv = new JMenu("Advanced");
        bar.add(adv);

        JMenuItem openPanel = new JMenuItem("Open Panel…");
        openPanel.addActionListener(e -> showAdvancedDialog());
        adv.add(openPanel);

        // (اختياري) أمثلة عناصر مباشرة من القائمة
        addAdvItem(adv, "^", false);
        addAdvItem(adv, "√", false);
        addAdvItem(adv, "ln", true);
        addAdvItem(adv, "log10", true);
        addAdvItem(adv, "logb", false);
        addAdvItem(adv, "exp", true);
        addAdvItem(adv, "hypot", false);
        addAdvItem(adv, "atan2", false);
        addAdvItem(adv, "max", false);
        addAdvItem(adv, "min", false);
        addAdvItem(adv, "Γ", true);
        addAdvItem(adv, "β", false);
        addAdvItem(adv, "C", false);
        addAdvItem(adv, "erf", true);
        addAdvItem(adv, "erfc", true);
    }

    private void addAdvItem(JMenu menu, String op, boolean unary) {
        JMenuItem item = new JMenuItem(op);
        item.addActionListener(e -> handleAdvancedOp(op, unary));
        menu.add(item);
    }

    /** يفتح نافذة فيها أزرار بيضاء للعمليات المتقدمة */
    private void showAdvancedDialog() {
        if (advDialog == null) {
            advDialog = new JDialog(this, "Advanced Operations", true);
            advDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            advContent = new JPanel(new GridLayout(0, 4, 8, 8));
            advContent.setBackground(new Color(21,20,22));
            advContent.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));

            // الأزرار (أيقونات بيضاء/سوداء)
            addAdvButton("^",   false);
            addAdvButton("√",   false);
            addAdvButton("ln",  true);
            addAdvButton("log10", true);
            addAdvButton("logb", false);
            addAdvButton("exp", true);
            addAdvButton("hypot", false);
            addAdvButton("atan2", false);
            addAdvButton("max", false);
            addAdvButton("min", false);
            addAdvButton("Γ",  true);
            addAdvButton("β",  false);
            addAdvButton("C",  false);
            addAdvButton("erf", true);
            addAdvButton("erfc", true);

            // أقواس
            JButton l = makeWhiteButton("(");
            l.addActionListener(e -> appendToCurrent("("));
            JButton r = makeWhiteButton(")");
            r.addActionListener(e -> appendToCurrent(")"));
            advContent.add(l);
            advContent.add(r);

            advDialog.getContentPane().add(advContent, BorderLayout.CENTER);
            advDialog.pack();
            advDialog.setSize(new Dimension(420, 360));
            advDialog.setLocationRelativeTo(this);
        }
        advDialog.setVisible(true);
    }

    /** يبني زر متقدم ويشبكه بـ handleAdvancedOp */
    private void addAdvButton(String label, boolean unary) {
        JButton b = makeWhiteButton(label);
        b.addActionListener(e -> handleAdvancedOp(label, unary));
        advContent.add(b);
    }

    /** زر أبيض بإطار أسود */
    private JButton makeWhiteButton(String text) {
        JButton b = new JButton(text);
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b.setFont(new java.awt.Font("Century Gothic", java.awt.Font.BOLD, 16));
        b.setPreferredSize(new Dimension(72, 36));
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseEntered(java.awt.event.MouseEvent e) { b.setBackground(new Color(240,240,240)); }
            @Override public void mouseExited (java.awt.event.MouseEvent e) { b.setBackground(Color.WHITE); }
        });
        return b;
    }

    /** تنفيذ العملية المتقدمة وتحديث previous/current */
    private void handleAdvancedOp(String op, boolean unary) {
        try {
            String t = current.getText().trim();
            float a = 0f;
            if (!t.isEmpty() && !"Error".equals(t)) a = Float.parseFloat(t);

            float b = 0f;
            if (!unary) {
                String prompt;
                switch (op) {
                    case "√":    prompt = "Enter b (2 = square root, 3 = cube root, ...)"; break;
                    case "logb": prompt = "Enter logarithm base b (e.g., 10)"; break;
                    case "atan2":prompt = "Enter x (the second value)"; break;
                    case "C":    prompt = "Enter k (n choose k)"; break;
                    default:     prompt = "Enter second value (b)";
                }
                String in = JOptionPane.showInputDialog(this, prompt, "Advanced Operation", JOptionPane.QUESTION_MESSAGE);
                if (in == null || in.trim().isEmpty()) return;
                b = Float.parseFloat(in.trim());
                if ("√".equals(op) && b == 0f) b = 2f;
            }

            // استدعاء الدالة المتقدمة من Calculator (حسب مشروعك)
            float result = new Calculator().applyAdvanced(op, a, b);

            // عرض الصيغة والنتيجة
            previous.setText(unary ? (op + "(" + a + ")") : (op + "(" + a + "," + b + ")"));
            current.setText((Float.isNaN(result) || Float.isInfinite(result)) ? "Error" : Float.toString(result));

        } catch (NumberFormatException ex) {
            current.setText("Error");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Operation failed: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void appendToCurrent(String s) {
        String t = current.getText();
        if (t == null) t = "";
        current.setText(t + s);
    }

   
}