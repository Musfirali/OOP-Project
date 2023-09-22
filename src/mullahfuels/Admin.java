/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mullahfuels;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import static javafx.scene.input.KeyCode.M;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hamza
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
         displayprice.setVisible(false);
        displaycapacity.setVisible(false);
        displayaboutus.setVisible(false);
        displaycustomerinfo.setVisible(false);
        displaybasic.setVisible(true);
    }
    //ALL OBJECTS YAHAN DEFINE KIAY HAIN
    Database obj = new Database();
    Petrol petrol = new Petrol();
    Diesel diesel = new Diesel();
    EngineOil engineOil = new EngineOil();
    GearOil gearOil = new GearOil();
    BrakeOil brakeOil = new BrakeOil();

    Color purple = new Color(153, 0, 255); //press color

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        price = new javax.swing.JButton();
        capacity = new javax.swing.JButton();
        aboutus = new javax.swing.JButton();
        customerinfo = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        topbar = new javax.swing.JPanel();
        toplabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        displayprice = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        petnewprice = new javax.swing.JTextField();
        desnewprice = new javax.swing.JTextField();
        petincrement = new javax.swing.JTextField();
        desincrement = new javax.swing.JTextField();
        engincrement = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        engnewprice = new javax.swing.JTextField();
        geaincrement = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        braincrement = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        geanewprice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        branewprice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newpricelabel = new javax.swing.JLabel();
        incrementlabel = new javax.swing.JLabel();
        visible = new javax.swing.JButton();
        change = new javax.swing.JButton();
        displaybasic = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        displaycustomerinfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        displaycapacity = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        desnewcap = new javax.swing.JTextField();
        petnewcap = new javax.swing.JTextField();
        petcapincrement = new javax.swing.JTextField();
        descapincrement = new javax.swing.JTextField();
        engcapincrement = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        engnewcap = new javax.swing.JTextField();
        geacapincrement = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        bracapincrement = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        geanewcap = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        branewcap = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        changecap = new javax.swing.JButton();
        visiblcap = new javax.swing.JButton();
        capincrementlabel = new javax.swing.JLabel();
        newcaplabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        displayaboutus = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(0, 51, 51));

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setText("Price");
        price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                priceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                priceMouseExited(evt);
            }
        });
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        capacity.setBackground(new java.awt.Color(255, 255, 255));
        capacity.setText("Capacity");
        capacity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capacityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                capacityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                capacityMouseExited(evt);
            }
        });
        capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacityActionPerformed(evt);
            }
        });

        aboutus.setBackground(new java.awt.Color(255, 255, 255));
        aboutus.setText("About Us");
        aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutusMouseExited(evt);
            }
        });
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });

        customerinfo.setBackground(new java.awt.Color(255, 255, 255));
        customerinfo.setText("Customer info");
        customerinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerinfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerinfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerinfoMouseExited(evt);
            }
        });
        customerinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerinfoActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/logo (1).png"))); // NOI18N
        jLabel1.setText("Mullah Fuelling");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(capacity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aboutus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(customerinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        topbar.setBackground(new java.awt.Color(0, 0, 0));

        toplabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        toplabel.setForeground(new java.awt.Color(255, 255, 255));
        toplabel.setText(" ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/saudi-arabia.png"))); // NOI18N

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toplabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(28, 28, 28))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topbarLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(toplabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        display.setBackground(new java.awt.Color(102, 102, 102));

        displayprice.setBackground(new java.awt.Color(51, 255, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/petrol (1).png"))); // NOI18N
        jLabel7.setText("Petrol");

        jLabel8.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/oil-barrel.png"))); // NOI18N
        jLabel8.setText("Deisel");

        jLabel9.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel9.setText("Lubricants");

        petnewprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petnewpriceActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel11.setText("Engine Oil");

        engnewprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engnewpriceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel10.setText("Gear Oil");

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel12.setText("Brake Oil");

        branewprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branewpriceActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/petrol (1).png"))); // NOI18N
        jLabel13.setText("FUELS");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setText("Price");

        newpricelabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        newpricelabel.setText("New Price");

        incrementlabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        incrementlabel.setText("Increment");

        visible.setText("Update Price");
        visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibleMouseClicked(evt);
            }
        });

        change.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        change.setText("Update");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displaypriceLayout = new javax.swing.GroupLayout(displayprice);
        displayprice.setLayout(displaypriceLayout);
        displaypriceLayout.setHorizontalGroup(
            displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaypriceLayout.createSequentialGroup()
                .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaypriceLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 609, Short.MAX_VALUE))
                    .addGroup(displaypriceLayout.createSequentialGroup()
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, displaypriceLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, displaypriceLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(displaypriceLayout.createSequentialGroup()
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField14)
                                            .addComponent(jTextField11)
                                            .addComponent(jTextField17)))
                                    .addGroup(displaypriceLayout.createSequentialGroup()
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displaypriceLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(displaypriceLayout.createSequentialGroup()
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(branewprice, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(geanewprice))
                                        .addGap(61, 61, 61)
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(geaincrement, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(braincrement)))
                                    .addGroup(displaypriceLayout.createSequentialGroup()
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(engnewprice, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(petnewprice)
                                            .addComponent(desnewprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(petincrement)
                                                .addComponent(desincrement, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addComponent(engincrement))
                                            .addComponent(visible, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(displaypriceLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(newpricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(incrementlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))))
                .addContainerGap())
        );
        displaypriceLayout.setVerticalGroup(
            displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaypriceLayout.createSequentialGroup()
                .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(displaypriceLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypriceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visible, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpricelabel)
                            .addComponent(incrementlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaypriceLayout.createSequentialGroup()
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(displaypriceLayout.createSequentialGroup()
                        .addComponent(petnewprice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(desnewprice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displaypriceLayout.createSequentialGroup()
                        .addComponent(petincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(desincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypriceLayout.createSequentialGroup()
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displaypriceLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(engincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(engnewprice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(displaypriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(displaypriceLayout.createSequentialGroup()
                                .addComponent(geaincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(braincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(displaypriceLayout.createSequentialGroup()
                                .addComponent(geanewprice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(branewprice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(displaypriceLayout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaypriceLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        displaybasic.setBackground(new java.awt.Color(0, 51, 51));
        displaybasic.setForeground(new java.awt.Color(204, 204, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 255));
        jLabel21.setText("Asalam u Alaikum");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 255));
        jLabel22.setText("خوش آمدید");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 255));
        jLabel23.setText("Mullah Fuelling Station");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/logo (1).png"))); // NOI18N

        javax.swing.GroupLayout displaybasicLayout = new javax.swing.GroupLayout(displaybasic);
        displaybasic.setLayout(displaybasicLayout);
        displaybasicLayout.setHorizontalGroup(
            displaybasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaybasicLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
            .addGroup(displaybasicLayout.createSequentialGroup()
                .addGroup(displaybasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaybasicLayout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel6))
                    .addGroup(displaybasicLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel23))
                    .addGroup(displaybasicLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displaybasicLayout.setVerticalGroup(
            displaybasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaybasicLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(21, 21, 21)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        displaycustomerinfo.setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Vehicle", "Vehicle #", "Product", "Quantity", "Amount", "Card Info"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout displaycustomerinfoLayout = new javax.swing.GroupLayout(displaycustomerinfo);
        displaycustomerinfo.setLayout(displaycustomerinfoLayout);
        displaycustomerinfoLayout.setHorizontalGroup(
            displaycustomerinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaycustomerinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        displaycustomerinfoLayout.setVerticalGroup(
            displaycustomerinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaycustomerinfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displaycapacity.setBackground(new java.awt.Color(102, 255, 255));

        jLabel14.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel14.setText("Lubricants");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/oil-barrel.png"))); // NOI18N
        jLabel15.setText("Deisel");

        jLabel16.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/petrol (1).png"))); // NOI18N
        jLabel16.setText("Petrol");

        jLabel17.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel17.setText("Engine Oil");

        engnewcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engnewcapActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel18.setText("Gear Oil");

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/gear (1).png"))); // NOI18N
        jLabel19.setText("Brake Oil");

        branewcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branewcapActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mullahfuels/petrol (1).png"))); // NOI18N
        jLabel20.setText("FUELS");

        changecap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        changecap.setText("Update");
        changecap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changecapActionPerformed(evt);
            }
        });

        visiblcap.setText("Update Capacity");
        visiblcap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visiblcapMouseClicked(evt);
            }
        });

        capincrementlabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        capincrementlabel.setText("Increment");

        newcaplabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        newcaplabel.setText("New Capacity");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setText("Capacity");

        javax.swing.GroupLayout displaycapacityLayout = new javax.swing.GroupLayout(displaycapacity);
        displaycapacity.setLayout(displaycapacityLayout);
        displaycapacityLayout.setHorizontalGroup(
            displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaycapacityLayout.createSequentialGroup()
                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaycapacityLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField23)
                                    .addComponent(jTextField26)
                                    .addComponent(jTextField28))))
                        .addGap(57, 57, 57)
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(branewcap)
                                    .addComponent(geanewcap))
                                .addGap(61, 61, 61)
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(geacapincrement, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(bracapincrement)))
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(engnewcap)
                                    .addComponent(petnewcap, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(desnewcap, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(petcapincrement)
                                    .addComponent(descapincrement, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(engcapincrement)))))
                    .addGroup(displaycapacityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(changecap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel3)
                                .addGap(133, 133, 133)
                                .addComponent(newcaplabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visiblcap, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaycapacityLayout.createSequentialGroup()
                                .addComponent(capincrementlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))))
                .addContainerGap())
            .addGroup(displaycapacityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displaycapacityLayout.setVerticalGroup(
            displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displaycapacityLayout.createSequentialGroup()
                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaycapacityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visiblcap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changecap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newcaplabel)
                            .addComponent(capincrementlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(displaycapacityLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displaycapacityLayout.createSequentialGroup()
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(displaycapacityLayout.createSequentialGroup()
                        .addComponent(petnewcap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(desnewcap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displaycapacityLayout.createSequentialGroup()
                        .addComponent(petcapincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(descapincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaycapacityLayout.createSequentialGroup()
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(engcapincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(engnewcap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(displaycapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addComponent(geacapincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(bracapincrement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addComponent(geanewcap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(branewcap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(displaycapacityLayout.createSequentialGroup()
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaycapacityLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to Mullah Fueling Station!\n\nAt Mullah Fueling Station, we are dedicated to providing exceptional fueling services to our valued customers.\nAs a Java-based project, we leverage the power of technology to optimize the operations of our fueling station\nand enhance the overall customer experience.\n\nWith our state-of-the-art infrastructure and cutting-edge Java programming techniques, we strive to create a\nseamless and efficient fueling process. Our highly skilled team of Java developers and fueling experts work \nin harmony to ensure that every customer receives the highest level of service, convenience, and satisfaction.\n\nWhat sets Mullah Fueling Station apart is our commitment to innovation and customer-centricity. By harnessing\nthe capabilities of Java, we have developed an advanced fuel management system that streamlines operations,\ntracks fuel usage, and facilitates precise billing. This technological integration enables us to provide \naccurate and transparent services, giving our customers peace of mind.\n\nOur friendly and professional staff are always ready to assist you with any queries or concerns you may have.\nWhether it's filling up your tank, providing maintenance advice, or helping you navigate our digital payment \noptions, we are here to ensure your fueling experience is hassle-free and enjoyable.\n\nWe understand the importance of environmental sustainability, and we strive to minimize our ecological \nfootprint. Through eco-friendly practices and initiatives, such as fuel quality monitoring, spill prevention\nmeasures, and waste management strategies, we aim to contribute to a cleaner and greener future.\n\nAt Mullah Fueling Station, we value your time, trust, and safety. We continuously invest in Java-based technologies \nto improve our services and stay ahead in an ever-evolving industry. Our commitment to excellence is unwavering, and\nwe look forward to serving you with the highest standards of professionalism and integrity.\n\nThank you for choosing Mullah Fueling Station as your preferred fuel provider. We appreciate your support and trust,\nand we invite you to experience the Mullah difference."); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout displayaboutusLayout = new javax.swing.GroupLayout(displayaboutus);
        displayaboutus.setLayout(displayaboutusLayout);
        displayaboutusLayout.setHorizontalGroup(
            displayaboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayaboutusLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        displayaboutusLayout.setVerticalGroup(
            displayaboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayaboutusLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displaybasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displaycustomerinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displayprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displaycapacity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displayaboutus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displaybasic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displaycustomerinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displayprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displaycapacity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displayaboutus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  //  public void setcolor(price p){

    // }
    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed

        displayprice.setVisible(true);
        displaycapacity.setVisible(false);
        displayaboutus.setVisible(false);
        displaycustomerinfo.setVisible(false);
        displaybasic.setVisible(false);

        toplabel.setText("Price");

        newpricelabel.setVisible(false);
        incrementlabel.setVisible(false);
        petnewprice.setVisible(false);
        desnewprice.setVisible(false);
        engnewprice.setVisible(false);
        geanewprice.setVisible(false);
        branewprice.setVisible(false);
        petincrement.setVisible(false);
        desincrement.setVisible(false);
        engincrement.setVisible(false);
        geaincrement.setVisible(false);
        braincrement.setVisible(false);
        visible.setVisible(true);
        change.setVisible(false);

    }//GEN-LAST:event_priceActionPerformed

    int pricebuttonvalue = 0;
    private void priceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceMouseEntered

        if (pricebuttonvalue == 0) {
            price.setBackground(Color.cyan);
        }

    }//GEN-LAST:event_priceMouseEntered

    private void priceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceMouseExited

        if (pricebuttonvalue == 0) {
            price.setBackground(Color.white);
        }
    }//GEN-LAST:event_priceMouseExited

    private void priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceMouseClicked

        price.setBackground(purple);
        pricebuttonvalue = 1;
        capacity.setBackground(Color.white);
        capacitybuttonvalue = 0;
        aboutus.setBackground(Color.white);
        dailyreportbuttonvalue = 0;
        logout.setBackground(Color.white);
        logoutbuttonvalue = 0;
        customerinfo.setBackground(Color.white);
        customerinfobuttonvalue = 0;

        petrol.setprice();
        double a = petrol.price();
        jTextField1.setEditable(false);  // Set the text field as non-editable
        jTextField1.setText( String.valueOf(a));

        diesel.setprice();
        double b = diesel.price();
        jTextField2.setEditable(false);  // Set the text field as non-editable
        jTextField2.setText( String.valueOf(b));

        engineOil.setprice();
        double c = engineOil.price();
        jTextField14.setEditable(false);  // Set the text field as non-editable
        jTextField14.setText( String.valueOf(c));

        gearOil.setprice();
        double d = gearOil.price();
        jTextField11.setEditable(false);  // Set the text field as non-editable
        jTextField11.setText( String.valueOf(d));

        brakeOil.setprice();
        double e = brakeOil.price();
        jTextField17.setEditable(false);  // Set the text field as non-editable
        jTextField17.setText(String.valueOf(e));

    }//GEN-LAST:event_priceMouseClicked

    int capacitybuttonvalue = 0;
    private void capacityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capacityMouseEntered

        if (capacitybuttonvalue == 0) {
            capacity.setBackground(Color.cyan);
        }
    }//GEN-LAST:event_capacityMouseEntered

    private void capacityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capacityMouseExited
        if (capacitybuttonvalue == 0) {
            capacity.setBackground(Color.white);
        }
    }//GEN-LAST:event_capacityMouseExited

    private void capacityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capacityMouseClicked

        capacity.setBackground(purple);
        capacitybuttonvalue = 1;
        price.setBackground(Color.white);
        pricebuttonvalue = 0;
        aboutus.setBackground(Color.white);
        dailyreportbuttonvalue = 0;
        logout.setBackground(Color.white);
        logoutbuttonvalue = 0;
        customerinfo.setBackground(Color.white);
        customerinfobuttonvalue = 0;

        petrol.setQty();
        double f = petrol.qty();
        jTextField3.setEditable(false);  // Set the text field as non-editable
        jTextField3.setText(String.valueOf(f));

        diesel.setQty();
        double g = diesel.qty();
        jTextField5.setEditable(false);  // Set the text field as non-editable
        jTextField5.setText(String.valueOf(g) );

        engineOil.setQty();
        double h = engineOil.qty();
        int intQtyEngineOil = (int) h;
        jTextField23.setEditable(false);  // Set the text field as non-editable
        jTextField23.setText(String.valueOf(intQtyEngineOil));

        gearOil.setQty();
        double i = gearOil.qty();
        int intQtyGearOil = (int) i;
        jTextField26.setEditable(false);  // Set the text field as non-editable
        jTextField26.setText(String.valueOf(intQtyGearOil));

        brakeOil.setQty();
        double k = brakeOil.qty();
        int intQtyBrakeOil = (int) k;    
        jTextField28.setEditable(false);  // Set the text field as non-editable
        jTextField28.setText(String.valueOf(intQtyBrakeOil));
    
    }//GEN-LAST:event_capacityMouseClicked

    int dailyreportbuttonvalue = 0;
    private void aboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseEntered
        if (dailyreportbuttonvalue == 0) {
            aboutus.setBackground(Color.cyan);
        }
    }//GEN-LAST:event_aboutusMouseEntered

    private void aboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseExited
        if (dailyreportbuttonvalue == 0) {
            aboutus.setBackground(Color.white);
        }
    }//GEN-LAST:event_aboutusMouseExited

    private void aboutusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseClicked
        aboutus.setBackground(purple);
        dailyreportbuttonvalue = 1;
        price.setBackground(Color.white);
        pricebuttonvalue = 0;
        capacity.setBackground(Color.white);
        capacitybuttonvalue = 0;
        customerinfo.setBackground(Color.white);
        customerinfobuttonvalue = 0;
        logout.setBackground(Color.white);
        logoutbuttonvalue = 0;
    }//GEN-LAST:event_aboutusMouseClicked
    int customerinfobuttonvalue = 0;
    private void customerinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerinfoMouseEntered
        if (customerinfobuttonvalue == 0) {
            customerinfo.setBackground(Color.cyan);
        }
    }//GEN-LAST:event_customerinfoMouseEntered

    private void customerinfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerinfoMouseExited
        if (customerinfobuttonvalue == 0) {
            customerinfo.setBackground(Color.white);
        }
    }//GEN-LAST:event_customerinfoMouseExited

    private void customerinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerinfoMouseClicked
        customerinfo.setBackground(purple);
        customerinfobuttonvalue = 1;
        price.setBackground(Color.white);
        pricebuttonvalue = 0;
        capacity.setBackground(Color.white);
        capacitybuttonvalue = 0;
        aboutus.setBackground(Color.white);
        dailyreportbuttonvalue = 0;
        logout.setBackground(Color.white);
        logoutbuttonvalue = 0;
    }//GEN-LAST:event_customerinfoMouseClicked

    int logoutbuttonvalue = 0;
    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        if (logoutbuttonvalue == 0) {
            logout.setBackground(Color.red);
        }
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        if (logoutbuttonvalue == 0) {
            logout.setBackground(Color.white);
        }
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        logout.setBackground(purple);
        logoutbuttonvalue = 1;
        price.setBackground(Color.white);
        pricebuttonvalue = 0;
        capacity.setBackground(Color.white);
        capacitybuttonvalue = 0;
        aboutus.setBackground(Color.white);
        dailyreportbuttonvalue = 0;
        customerinfo.setBackground(Color.white);
        customerinfobuttonvalue = 0;
    }//GEN-LAST:event_logoutMouseClicked

    private void capacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacityActionPerformed

        displayprice.setVisible(false);
        displaycapacity.setVisible(true);
        displayaboutus.setVisible(false);
        displaycustomerinfo.setVisible(false);
        displaybasic.setVisible(false);

        toplabel.setText("Capacity");

        newcaplabel.setVisible(false);
        capincrementlabel.setVisible(false);
        petnewcap.setVisible(false);
        desnewcap.setVisible(false);
        engnewcap.setVisible(false);
        geanewcap.setVisible(false);
        branewcap.setVisible(false);
        petcapincrement.setVisible(false);
        descapincrement.setVisible(false);
        engcapincrement.setVisible(false);
        geacapincrement.setVisible(false);
        bracapincrement.setVisible(false);
        visiblcap.setVisible(true);
        changecap.setVisible(false);
    }//GEN-LAST:event_capacityActionPerformed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed

        displayprice.setVisible(false);
        displaycapacity.setVisible(false);
        displayaboutus.setVisible(true);
        displaycustomerinfo.setVisible(false);
        displaybasic.setVisible(false);

        toplabel.setText("About Us");
    }//GEN-LAST:event_aboutusActionPerformed

    private void customerinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerinfoActionPerformed

    displayprice.setVisible(false);
    displaycapacity.setVisible(false);
    displayaboutus.setVisible(false);
    displaycustomerinfo.setVisible(true);
    displaybasic.setVisible(false);
    toplabel.setText("Customer Info");

    try {
        String query = "SELECT * FROM CustomerInfo";
        String[] columnNames = {"ID", "Name", "Email", "CarModel", "CarNumber", "Product", "Qty", "Amount", "CashPaid", "CardNumber"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        ResultSet rs = obj.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("ID");
            String name = rs.getString("Name");
            String email = rs.getString("Email");
            String carModel = rs.getString("CarModel");
            String carNumber = rs.getString("CarNumber");
            String product = rs.getString("Product");
            double qty = rs.getDouble("Qty");
            double amount = rs.getDouble("Amount");
            double cashpaid = rs.getDouble("CashPaid");            
            String cardNumber = rs.getString("CardNumber");

            model.addRow(new Object[]{id, name, email, carModel, carNumber, product, qty, amount,cashpaid, cardNumber});
        }

        jTable1.setModel(model);
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }   




                    
    }//GEN-LAST:event_customerinfoActionPerformed

    private void engnewpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engnewpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engnewpriceActionPerformed

    private void branewpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branewpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branewpriceActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void engnewcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engnewcapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engnewcapActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void branewcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branewcapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branewcapActionPerformed

    private void visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibleMouseClicked
        newpricelabel.setVisible(true);
        incrementlabel.setVisible(true);
        petnewprice.setVisible(true);
        desnewprice.setVisible(true);
        engnewprice.setVisible(true);
        geanewprice.setVisible(true);
        branewprice.setVisible(true);
        petincrement.setVisible(true);
        desincrement.setVisible(true);
        engincrement.setVisible(true);
        geaincrement.setVisible(true);
        braincrement.setVisible(true);
        visible.setVisible(false);
        change.setVisible(true);


    }//GEN-LAST:event_visibleMouseClicked

    private void visiblcapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visiblcapMouseClicked
        newcaplabel.setVisible(true);
        capincrementlabel.setVisible(true);
        petnewcap.setVisible(true);
        desnewcap.setVisible(true);
        engnewcap.setVisible(true);
        geanewcap.setVisible(true);
        branewcap.setVisible(true);
        petcapincrement.setVisible(true);
        descapincrement.setVisible(true);
        engcapincrement.setVisible(true);
        geacapincrement.setVisible(true);
        bracapincrement.setVisible(true);
        visiblcap.setVisible(false);
        changecap.setVisible(true);
    }//GEN-LAST:event_visiblcapMouseClicked
     private String inccap(String old , String newcap ){
     double a = Float.valueOf(old);
    double b = Float.valueOf(newcap);
    double c;
    c = b-a;
    String d = String.valueOf(c);
    return d;
     }
    private void changecapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changecapActionPerformed

        // Update Petrol capacity
        if (!petnewcap.getText().equals("")) {
            try {
                 String inc = inccap(jTextField3.getText(), petnewcap.getText());
                petcapincrement.setText(inc);
                String petcapstring = petnewcap.getText();
                int petcap = Integer.parseInt(petcapstring);
                petrol.setQty();
                jTextField3.setText(petnewcap.getText());
                petnewcap.setText("");
                // Update the capacity in the database
                obj.update("UPDATE Stock SET PetrolTank = " + petcap);
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Diesel capacity
        if (!desnewcap.getText().equals("")) {
            try {
                String inc = inccap(jTextField5.getText(), desnewcap.getText());
                descapincrement.setText(inc);
                String descapstring = desnewcap.getText();
                int descap = Integer.parseInt(descapstring);
                diesel.setQty();
                jTextField5.setText(desnewcap.getText());
                desnewcap.setText("");
                // Update the capacity in the database
                obj.update("UPDATE Stock SET DieselTank = " + descap);
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Engine Oil capacity
        if (!engnewcap.getText().equals("")) {
            try {
                String inc = inccap(jTextField23.getText(), engnewcap.getText());
                engcapincrement.setText(inc);
                String engcapstring = engnewcap.getText();
                int engcap = Integer.parseInt(engcapstring);
                engineOil.setQty();
                jTextField23.setText(engnewcap.getText());
                engnewcap.setText("");
                // Update the capacity in the database
                obj.update("UPDATE Stock SET EngineOilBoxes = " + engcap);
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Gear Oil capacity
        if (!geanewcap.getText().equals("")) {
            try {
                String inc = inccap(jTextField26.getText(), geanewcap.getText());
                geacapincrement.setText(inc);
                String geacapstring = geanewcap.getText();
                int geacap = Integer.parseInt(geacapstring);
                gearOil.setQty();
                jTextField26.setText(geanewcap.getText());
                geanewcap.setText("");
                // Update the capacity in the database
                obj.update("UPDATE Stock SET GearOilBoxes = " + geacap);
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Brake Oil capacity
        if (!branewcap.getText().equals("")) {
            try {
                String inc = inccap(jTextField28.getText(), branewcap.getText());
                bracapincrement.setText(inc);
                String bracapstring = branewcap.getText();
                int bracap = Integer.parseInt(bracapstring);
                brakeOil.setQty();
                jTextField28.setText(branewcap.getText());
                branewcap.setText("");
                // Update the capacity in the database
                obj.update("UPDATE Stock SET BrakeOilBoxes = " + bracap);
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_changecapActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        Loginform login = new Loginform();
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private String increment(String old , String newprice){
        
    double a = Float.valueOf(old);
    double b = Float.valueOf(newprice);
    double c;
    c = (b/a)*100;
    String d = String.valueOf(c);
    return d;
    }
    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // Update Petrol price
        if (!petnewprice.getText().equals("")) {
            try {
              
               String inc = increment(jTextField1.getText(), petnewprice.getText());
                petincrement.setText(inc);
                String petpricestring = petnewprice.getText();
                int petprice = Integer.parseInt(petpricestring);
                obj.update("UPDATE Table1 SET Petrol = " + petprice);
                jTextField1.setText(petnewprice.getText());
                petnewprice.setText("");
                

            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Diesel price
        if (!desnewprice.getText().equals("")) {
             String inc = increment(jTextField2.getText(), desnewprice.getText());
                desincrement.setText(inc);
            String despricestring = desnewprice.getText();
            int desprice = Integer.parseInt(despricestring);
            try {
                obj.update("UPDATE Table1 SET Diesel = " + desprice);
                jTextField2.setText(desnewprice.getText());
                desnewprice.setText("");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Petrol.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Engine Oil price
        if (!engnewprice.getText().equals("")) {
            try {
                 String inc = increment(jTextField14.getText(), engnewprice.getText());
                engincrement.setText(inc);
                String engpricestring = engnewprice.getText();
                int engprice = Integer.parseInt(engpricestring);
                obj.update("UPDATE Table1 SET EngineOil = " + engprice);
                jTextField14.setText(engnewprice.getText());
                engnewprice.setText("");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Petrol.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Gear Oil price
        if (!geanewprice.getText().equals("")) {
            try {
                 String inc = increment(jTextField11.getText(), geanewprice.getText());
                geaincrement.setText(inc);
                String geapricestring = geanewprice.getText();
                int geaprice = Integer.parseInt(geapricestring);
                obj.update("UPDATE Table1 SET GearOil = " + geaprice);
                jTextField11.setText(geanewprice.getText());
                geanewprice.setText("");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Petrol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Update Brake Oil price
        if (!branewprice.getText().equals("")) {
            try {
                 String inc = increment(jTextField17.getText(), branewprice.getText());
                braincrement.setText(inc);
                String brapricestring = branewprice.getText();
                int braprice = Integer.parseInt(brapricestring);
                obj.update("UPDATE Table1 SET BrakeOil = " + braprice);
                jTextField17.setText(branewprice.getText());
                branewprice.setText("");

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Petrol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changeActionPerformed

    private void petnewpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petnewpriceActionPerformed

    }//GEN-LAST:event_petnewpriceActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutus;
    private javax.swing.JPanel background;
    private javax.swing.JTextField bracapincrement;
    private javax.swing.JTextField braincrement;
    private javax.swing.JTextField branewcap;
    private javax.swing.JTextField branewprice;
    private javax.swing.JButton capacity;
    private javax.swing.JLabel capincrementlabel;
    private javax.swing.JButton change;
    private javax.swing.JButton changecap;
    private javax.swing.JButton customerinfo;
    private javax.swing.JTextField descapincrement;
    private javax.swing.JTextField desincrement;
    private javax.swing.JTextField desnewcap;
    private javax.swing.JTextField desnewprice;
    private javax.swing.JPanel display;
    private javax.swing.JPanel displayaboutus;
    private javax.swing.JPanel displaybasic;
    private javax.swing.JPanel displaycapacity;
    private javax.swing.JPanel displaycustomerinfo;
    private javax.swing.JPanel displayprice;
    private javax.swing.JTextField engcapincrement;
    private javax.swing.JTextField engincrement;
    private javax.swing.JTextField engnewcap;
    private javax.swing.JTextField engnewprice;
    private javax.swing.JTextField geacapincrement;
    private javax.swing.JTextField geaincrement;
    private javax.swing.JTextField geanewcap;
    private javax.swing.JTextField geanewprice;
    private javax.swing.JLabel incrementlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton logout;
    private javax.swing.JLabel newcaplabel;
    private javax.swing.JLabel newpricelabel;
    private javax.swing.JTextField petcapincrement;
    private javax.swing.JTextField petincrement;
    private javax.swing.JTextField petnewcap;
    private javax.swing.JTextField petnewprice;
    private javax.swing.JButton price;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel topbar;
    private javax.swing.JLabel toplabel;
    private javax.swing.JButton visiblcap;
    private javax.swing.JButton visible;
    // End of variables declaration//GEN-END:variables
}
