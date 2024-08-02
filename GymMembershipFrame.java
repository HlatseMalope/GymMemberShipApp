/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author malop
 */
public class GymMembershipFrame extends JFrame{
    //panels
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idnoPnl;
    private JPanel genderPnl;
    private JPanel contactsPnl;
    private JPanel contactOptionsPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
        
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idnoLbl;
    private JLabel genderLbl;
    private JLabel personalTrainerLbl;
    private JLabel contractLbl;
        
    //text fields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idnoTxtFld;
        
    //combo box
    private JComboBox genderCB;
        
    //radio buttons
    private JRadioButton monthlyBtn;
    private JRadioButton sixMonthsBtn;
    private JRadioButton annualBtn;
        
    //check box
    private JCheckBox checkBoxBtn;
        
    //buttongroup
    private ButtonGroup btnGrp;
        
     //text area
    private JTextArea txtArea;
    
    //scrollplane
    private JScrollPane scrollableTxtArea;
        
    //button
    private JButton applyBtn;
    
    public GymMembershipFrame() {
        setTitle("Gym Membership");
        setSize(500, 500);
        
        //create the panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Client details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idnoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contactsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contactOptionsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl = new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Contract Options"));
        
        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPnl  =new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl = new JPanel(new BorderLayout());
        membershipCommentsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //create the labels
        headingLbl = new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl = new JLabel("Name:     ");
        surnameLbl = new JLabel("Surname:     ");
        idnoLbl = new JLabel("Id no:     ");
        genderLbl = new JLabel("Gender:     ");
        contractLbl = new JLabel("Type of contract: ");
        personalTrainerLbl = new JLabel("Select the checkbox if you need a personal trainer ");
        
        //create the textfields
        nameTxtFld = new JTextField(10);
        surnameTxtFld = new JTextField(10);
        idnoTxtFld = new JTextField(10);
        
        //create the combo box
        genderCB = new JComboBox();
        genderCB.addItem("Male");
        genderCB.addItem("Female");
        
        //create the radio button
        monthlyBtn = new JRadioButton("Month-to-month");
        sixMonthsBtn = new JRadioButton("Six months");
        annualBtn = new JRadioButton("Annual");
        
        //create the check box
        checkBoxBtn = new JCheckBox();
        
        //create button group
        btnGrp = new ButtonGroup();
        btnGrp.add(monthlyBtn);
        btnGrp.add(sixMonthsBtn);
        btnGrp.add(annualBtn);
        
        //create the text areea
        txtArea = new JTextArea(20,40);
        txtArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"Comments"));
        
        scrollableTxtArea = new JScrollPane(txtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn = new JButton("APPLY");
        
        //add the components to panels
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        idnoPnl.add(idnoLbl);
        idnoPnl.add(idnoTxtFld);
        genderPnl.add(genderLbl);
        genderPnl.add(genderCB);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idnoPnl);
        clientPnl.add(genderPnl);
        
        headingClientCombinedPnl.add(headingPnl, BorderLayout.NORTH);
        headingClientCombinedPnl.add(clientPnl, BorderLayout.CENTER);
        
        contactsPnl.add(contractLbl);
        contactsPnl.add(monthlyBtn);
        contactsPnl.add(sixMonthsBtn);
        contactsPnl.add(annualBtn);
        
        contactOptionsPnl.add(personalTrainerLbl);
        contactOptionsPnl.add(checkBoxBtn);
        
        membershipPnl.add(contactsPnl);
        membershipPnl.add(contactOptionsPnl);
        
        commentsPnl.add(scrollableTxtArea);
        
        membershipCommentsCombinedPnl.add(membershipPnl, BorderLayout.NORTH);
        membershipCommentsCombinedPnl.add(commentsPnl, BorderLayout.CENTER);
        
        btnsPnl.add(applyBtn);
        
        mainPnl.add(headingClientCombinedPnl, BorderLayout.NORTH);
        mainPnl.add(membershipCommentsCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        setVisible(true);
        
        
        
        
        
        
        
        

    }
    
}
