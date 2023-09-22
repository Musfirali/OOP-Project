/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mullahfuels;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Long;

/**
 *
 * @author Hamza
 */
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    public Staff() {
        initComponents();
        display1.setVisible(true);
        display2.setVisible(false);

        hider();

    }

    Database obj = new Database();
    Petrol petrol = new Petrol();
    Diesel diesel = new Diesel();
    EngineOil engineOil = new EngineOil();
    GearOil gearOil = new GearOil();
    BrakeOil brakeOil = new BrakeOil();
    Customer customer = new Customer();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        topbar = new javax.swing.JPanel();
        toplabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        display1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        display2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        nametext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        numtext = new javax.swing.JTextField();
        vehtypedrop = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        costtext = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cashbutton = new javax.swing.JButton();
        cardbutton = new javax.swing.JButton();
        proceedbutton = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        cardinfo = new javax.swing.JPanel();
        carnumtext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pintext = new javax.swing.JTextField();
        cashinfo = new javax.swing.JPanel();
        paidtext = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        remainingbaltext = new javax.swing.JTextField();
        calculatecash = new javax.swing.JButton();
        priceperlitter = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quantitytext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/logo (1).png"))); // NOI18N
        jLabel1.setText("Mullah Fuelling");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/arrow-left (1).png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. No smoking or open flames.\n2. Turn off engine and electronics.\n3. Beware of static electricity.\n4. Use approved fueling equipment.\n5. Avoid cellphone usage.\n6. Stay attentive and alert.\n7. Know fire extinguisher locations.\n8. Prevent fuel overflow and spills.\n9. Emergency? Stop fueling, notify staff.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cautions"));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        topbar.setBackground(new java.awt.Color(0, 51, 51));

        toplabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        toplabel.setForeground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(toplabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toplabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("BRAKE OIL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ENGINE OIL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DIESEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("PETROL");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("GEAR OIL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout display1Layout = new javax.swing.GroupLayout(display1);
        display1.setLayout(display1Layout);
        display1Layout.setHorizontalGroup(
            display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(display1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, display1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, display1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        display1Layout.setVerticalGroup(
            display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(display1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(display1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer Info"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 27, 64, 36));

        jLabel3.setText("Name");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 69, 111, 33));

        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });
        jPanel1.add(idtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 35, 96, -1));
        jPanel1.add(nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 75, 96, -1));

        jLabel6.setText("Vehicle Type :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 32, 111, 33));

        jLabel42.setText("Vehicle # : ");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 71, 62, 26));

        numtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numtextActionPerformed(evt);
            }
        });
        jPanel1.add(numtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 71, 110, -1));

        vehtypedrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Bike", "Truck", "Others" }));
        vehtypedrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehtypedropActionPerformed(evt);
            }
        });
        jPanel1.add(vehtypedrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 38, 110, -1));

        jLabel4.setText("Email");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 108, 73, 33));

        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });
        jPanel1.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 114, 170, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantity Info"));

        jLabel7.setText("Price per  Liter / Box");

        jLabel8.setText("Amount");

        costtext.setEditable(false);
        costtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costtextActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Method"));

        cashbutton.setText("CASH");
        cashbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashbuttonActionPerformed(evt);
            }
        });

        cardbutton.setText("CARD");
        cardbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(cardbutton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashbutton)
                    .addComponent(cardbutton))
                .addContainerGap())
        );

        proceedbutton.setText("Proceed");
        proceedbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedbuttonActionPerformed(evt);
            }
        });

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cardinfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Card info"));

        carnumtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnumtextActionPerformed(evt);
            }
        });

        jLabel9.setText("Card Number");

        jLabel10.setText("PIN:");

        pintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pintextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardinfoLayout = new javax.swing.GroupLayout(cardinfo);
        cardinfo.setLayout(cardinfoLayout);
        cardinfoLayout.setHorizontalGroup(
            cardinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardinfoLayout.createSequentialGroup()
                .addGroup(cardinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardinfoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardinfoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carnumtext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pintext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        cardinfoLayout.setVerticalGroup(
            cardinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardinfoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(cardinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carnumtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        cashinfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cash info"));

        paidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidtextActionPerformed(evt);
            }
        });

        jLabel43.setText("Paid:");

        jLabel44.setText("Remaing Balance:");

        remainingbaltext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainingbaltextActionPerformed(evt);
            }
        });

        calculatecash.setText("Calculate");
        calculatecash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatecashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cashinfoLayout = new javax.swing.GroupLayout(cashinfo);
        cashinfo.setLayout(cashinfoLayout);
        cashinfoLayout.setHorizontalGroup(
            cashinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashinfoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(cashinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paidtext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remainingbaltext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashinfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculatecash)
                .addContainerGap())
        );
        cashinfoLayout.setVerticalGroup(
            cashinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashinfoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(cashinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paidtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remainingbaltext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculatecash)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(cardinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cashinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cashinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cashinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        priceperlitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceperlitterActionPerformed(evt);
            }
        });

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jLabel5.setText("Liters / Boxes");

        quantitytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitytextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(quantitytext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(costtext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceperlitter, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proceedbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(proceedbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(quantitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceperlitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout display2Layout = new javax.swing.GroupLayout(display2);
        display2.setLayout(display2Layout);
        display2Layout.setHorizontalGroup(
            display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        display2Layout.setVerticalGroup(
            display2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(display2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jLayeredPane1.setLayer(display1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(display2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(display1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(display2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(display1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(display2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (display1.isVisible()) {
            dispose();
            Loginform login = new Loginform();
            login.setVisible(true);
        } else {

            display1.setVisible(true);
            display2.setVisible(false);

            hider();
            toplabel.setText("       ");
        }
    }//GEN-LAST:event_backActionPerformed

    private void priceperlitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceperlitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceperlitterActionPerformed

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        
    }//GEN-LAST:event_idtextActionPerformed

    private void remainingbaltextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remainingbaltextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remainingbaltextActionPerformed

    private void paidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paidtextActionPerformed

    private void cardbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardbuttonActionPerformed
        cardinfo.setVisible(true);
        cashinfo.setVisible(false);
        proceedbutton.setVisible(true);
    }//GEN-LAST:event_cardbuttonActionPerformed

    private void cashbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashbuttonActionPerformed
        cardinfo.setVisible(false);
        cashinfo.setVisible(true);
        proceedbutton.setVisible(true);
    }//GEN-LAST:event_cashbuttonActionPerformed

    private void quantitytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitytextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitytextActionPerformed

    private void vehtypedropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehtypedropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehtypedropActionPerformed

    private void numtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numtextActionPerformed

    }//GEN-LAST:event_numtextActionPerformed

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextActionPerformed


    private void proceedbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedbuttonActionPerformed
        try {

            String labelText = toplabel.getText();

            String name = nametext.getText();
            String email = emailtext.getText();
            String vehicle = vehtypedrop.getSelectedItem().toString();
            String vehicleNumber = numtext.getText();
            String qty = quantitytext.getText();
            String cost = costtext.getText();
            String cash = paidtext.getText();

            double amount = Double.parseDouble(cost);
            double doubleCash = 0.0;
            if (!cash.isEmpty()) {
                doubleCash = Double.parseDouble(cash);
            }
            double soldQty = Double.parseDouble(qty);

            String cardNumber = carnumtext.getText();
            customer.setCardNumber(cardNumber);

            customer.setAmount(amount);
            customer.setName(name);
            customer.setEmail(email);
            customer.setVehicleType(vehicle);
            customer.setVehicleNumber(vehicleNumber);
            customer.setQty(soldQty);
            customer.setCashPaid(doubleCash);
            customer.setProduct(labelText);


            customer.insertCustomerInfo();

            if (labelText == "Petrol") {
                String petrolQty = obj.displayAll("SELECT PetrolTank FROM Stock");
                double currentPetrolQty = Double.parseDouble(petrolQty);

                double updatedPetrolQty = currentPetrolQty - soldQty;

                // Update the quantity in the "Stock" table
                obj.update("UPDATE Stock SET PetrolTank = " + updatedPetrolQty);
            } else if (labelText == "Deisel") {
                String dieselQty = obj.displayAll("SELECT DieselTank FROM Stock");
                double currentDieselQty = Double.parseDouble(dieselQty);

                double updatedDieselQty = currentDieselQty - soldQty;

                // Update the quantity in the "Stock" table
                obj.update("UPDATE Stock SET DieselTank = " + updatedDieselQty);
            } else if (labelText == "Engine OIL") {
                String engineOilQty = obj.displayAll("SELECT EngineOilBoxes FROM Stock");
                double currentEngineOilQty = Double.parseDouble(engineOilQty);

                double updatedEngineOilQty = currentEngineOilQty - soldQty;

                // Update the quantity in the "Stock" table
                obj.update("UPDATE Stock SET EngineOilBoxes = " + updatedEngineOilQty);
            } else if (labelText == "Brake OIL") {
                String brakeOilQty = obj.displayAll("SELECT BrakeOilBoxes FROM Stock");
                double currentBrakeOilQty = Double.parseDouble(brakeOilQty);

                double updatedBrakeOilQty = currentBrakeOilQty - soldQty;

                // Update the quantity in the "Stock" table
                obj.update("UPDATE Stock SET BrakeOilBoxes = " + updatedBrakeOilQty);
            } else if (labelText == "Gear OIL") {
                String gearOilQty = obj.displayAll("SELECT GearOilBoxes FROM Stock");
                double currentGearOilQty = Double.parseDouble(gearOilQty);

                double updatedGearOilQty = currentGearOilQty - soldQty;

                // Update the quantity in the "Stock" table
                obj.update("UPDATE Stock SET GearOilBoxes = " + updatedGearOilQty);
            }
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        Nextcustomer nc = new Nextcustomer();
        nc.setVisible(true);
        dispose();
    }//GEN-LAST:event_proceedbuttonActionPerformed

    private void costtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costtextActionPerformed

    }//GEN-LAST:event_costtextActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        display1.setVisible(false);
        display2.setVisible(true);

        toplabel.setText("Gear OIL");
        proceedbutton.setVisible(false);
        gearOil.setprice();
        double d = gearOil.price();
        priceperlitter.setEditable(false);
        priceperlitter.setText(String.valueOf(d));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        display1.setVisible(false);
        display2.setVisible(true);

        toplabel.setText("Petrol");
        proceedbutton.setVisible(false);
        petrol.setprice();
        double a = petrol.price();
        priceperlitter.setEditable(false);  // Set the text field as non-editable
        priceperlitter.setText(String.valueOf(a));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        display1.setVisible(false);
        display2.setVisible(true);

        toplabel.setText("Deisel");
        proceedbutton.setVisible(false);
        diesel.setprice();
        double b = diesel.price();
        priceperlitter.setEditable(false);  // Set the text field as non-editable
        priceperlitter.setText(String.valueOf(b));
        //79
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        display1.setVisible(false);
        display2.setVisible(true);

        toplabel.setText("Engine OIL");
        proceedbutton.setVisible(false);
        engineOil.setprice();
        double c = engineOil.price();
        priceperlitter.setEditable(false);  // Set the text field as non-editable
        priceperlitter.setText(String.valueOf(c));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        display1.setVisible(false);
        display2.setVisible(true);

        toplabel.setText("Brake OIL");
        proceedbutton.setVisible(false);
        brakeOil.setprice();
        double e = brakeOil.price();
        priceperlitter.setEditable(false);  // Set the text field as non-editable
        priceperlitter.setText(String.valueOf(e));

        try {
            String id = obj.displayAll("Select ID FROM CustomerInfo");
            idtext.setEditable(false);  // Set the text field as non-editable
            idtext.setText(String.valueOf(id));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private String amount(String quantity, String priceperlitter) {

        double a = Float.valueOf(quantity);
        double b = Float.valueOf(priceperlitter);
        double c;
        c = a * b;
        String d = String.valueOf(c);
        return d;
    }
    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        String a = amount(quantitytext.getText(), priceperlitter.getText());
        costtext.setText(a);

    }//GEN-LAST:event_calculateActionPerformed

    private void calculatecashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatecashActionPerformed
        String a = amount(quantitytext.getText(), priceperlitter.getText());
        int b = Integer.parseInt(paidtext.getText());
        double c = Double.valueOf(a);
        double d = b - c;
        String e = String.valueOf(d);
        remainingbaltext.setText(e);
    }//GEN-LAST:event_calculatecashActionPerformed

    private void pintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pintextActionPerformed

    private void carnumtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnumtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carnumtextActionPerformed

    private void hider() {
        cardinfo.setVisible(false);
        cashinfo.setVisible(false);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel background;
    private javax.swing.JButton calculate;
    private javax.swing.JButton calculatecash;
    private javax.swing.JButton cardbutton;
    private javax.swing.JPanel cardinfo;
    private javax.swing.JTextField carnumtext;
    private javax.swing.JButton cashbutton;
    private javax.swing.JPanel cashinfo;
    private javax.swing.JTextField costtext;
    private javax.swing.JPanel display1;
    private javax.swing.JPanel display2;
    private javax.swing.JTextField emailtext;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField numtext;
    private javax.swing.JTextField paidtext;
    private javax.swing.JTextField pintext;
    private javax.swing.JTextField priceperlitter;
    private javax.swing.JButton proceedbutton;
    private javax.swing.JTextField quantitytext;
    private javax.swing.JTextField remainingbaltext;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel topbar;
    private javax.swing.JLabel toplabel;
    private javax.swing.JComboBox<String> vehtypedrop;
    // End of variables declaration//GEN-END:variables
}
