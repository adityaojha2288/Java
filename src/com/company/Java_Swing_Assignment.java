package com.company;
import javax.swing.*;

public class Java_Swing_Assignment {
    private JFrame frame;
    public static void main(String[] args) {
                Java_Swing_Assignment window = new Java_Swing_Assignment();
                 window.frame.setVisible(true);
            }
    public Java_Swing_Assignment() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 730, 489);
        frame.getContentPane().setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(128, 28, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblName = new JLabel("Name ");
        lblName.setBounds(65, 31, 46, 14);
        frame.getContentPane().add(lblName);

        JLabel lblPhone = new JLabel("Phone: ");
        lblPhone.setBounds(65, 68, 46, 14);
        frame.getContentPane().add(lblPhone);

        JTextField textField_1 = new JTextField();
        textField_1.setBounds(128, 65, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblEmailId = new JLabel("Email Id");
        lblEmailId.setBounds(65, 115, 46, 14);
        frame.getContentPane().add(lblEmailId);

        JTextField textField_2 = new JTextField();
        textField_2.setBounds(128, 112, 247, 17);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        JLabel lblpwd = new JLabel("Password");
        lblpwd.setBounds(65, 162, 90, 14);
        frame.getContentPane().add(lblpwd);

        JPasswordField pwdField = new JPasswordField();
        pwdField.setBounds(150, 157, 212, 17);
        frame.getContentPane().add(pwdField);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(65,200,46,14);
        frame.getContentPane().add(lbladdress);

        JTextArea textadd = new JTextArea();
        textadd.setBounds(150,210,212,40);
        frame.getContentPane().add(textadd);

//        JScrollPane scroll = new JScrollPane(textadd);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(312, 540, 89, 23);
        frame.getContentPane().add(btnClear);

        JLabel lblSex = new JLabel("Gender");
        lblSex.setBounds(65, 270, 46, 14);
        frame.getContentPane().add(lblSex);

        JLabel lblMale = new JLabel("Male");
        lblMale.setBounds(128, 270, 46, 14);
        frame.getContentPane().add(lblMale);

        JLabel lblFemale = new JLabel("Female");
        lblFemale.setBounds(292, 270, 46, 14);
        frame.getContentPane().add(lblFemale);

        JRadioButton radioButton = new JRadioButton("");
        radioButton.setBounds(337, 250, 109, 23);
        frame.getContentPane().add(radioButton);

        JRadioButton radioButton_1 = new JRadioButton("");
        radioButton_1.setBounds(162, 270, 109, 23);
        frame.getContentPane().add(radioButton_1);
        JLabel lblint = new JLabel("Interested Domain");
        lblint.setBounds(65,300,150,14);
        frame.getContentPane().add(lblint);

        JCheckBox cb = new JCheckBox("Al/ML");
        cb.setBounds(65,300,150,50);
        frame.getContentPane().add(cb);

        JCheckBox cb2 = new JCheckBox("Cyber");
        cb2.setBounds(65,340,150,50);
        frame.getContentPane().add(cb2);

        JCheckBox cb3 = new JCheckBox("Data Analytics");
        cb3.setBounds(65,380,150,50);
        frame.getContentPane().add(cb3);




        JLabel lblOccupation = new JLabel("Occupation");

        lblOccupation.setBounds(65, 500, 67, 14);
        frame.getContentPane().add(lblOccupation);

        JComboBox<String> comboBox = new JComboBox();
        comboBox.addItem("Select");
        comboBox.addItem("Business");
        comboBox.addItem("Engineer");
        comboBox.addItem("Doctor");
        comboBox.addItem("Student");
        comboBox.addItem("Others");
        comboBox.setBounds(180, 500, 91, 20);
        frame.getContentPane().add(comboBox);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(65, 540, 89, 23);
        frame.getContentPane().add(btnSubmit);

    }
}
