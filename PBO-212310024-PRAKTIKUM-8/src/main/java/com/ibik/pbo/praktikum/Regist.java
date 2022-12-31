package com.ibik.pbo.praktikum;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Regist extends JFrame {
    Regist() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(400, 500);
        setTitle("Contoh Window Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new Regist();
    }

    private void GenerateUI(Regist frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        mainPanel.add(panel1, BorderLayout.NORTH);

        JLabel lblFullName = new JLabel("Fullname");
        lblFullName.setBounds(22, 23, 80, 16);

        panel1.add(lblFullName);

        final JTextField textFullName = new JTextField();
        textFullName.setBounds(105, 18, 169, 30);
        textFullName.setEditable(true);
        panel1.add(textFullName);

        JLabel Email = new JLabel("Email");
        Email.setBounds(22, 69, 61, 16);
        panel1.add(Email);

        final JTextField textEmail = new JTextField();
        textEmail.setBounds(105, 64, 169, 30);
        panel1.add(textEmail);
        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(22, 109, 61, 16);
        panel1.add(lblPhone);

        final JTextField txtPhone = new JTextField();
        txtPhone.setBounds(105, 104, 169, 30);
        panel1.add(txtPhone);

        JLabel Gender = new JLabel("Gender");
        Gender.setBounds(22, 150, 61, 16);
        panel1.add(Gender);

        final JRadioButton radioGender1 = new JRadioButton("Female");
        radioGender1.setBounds(105, 145, 100, 30);
        panel1.add(radioGender1);

        final JRadioButton radioGender2 = new JRadioButton("Male");
        radioGender2.setBounds(200, 145, 100, 30);
        panel1.add(radioGender2);

        ButtonGroup all = new ButtonGroup();
        all.add(radioGender1);
        all.add(radioGender2);

        JLabel lblCityzen = new JLabel("Citizenship");
        lblCityzen.setBounds(22, 185, 100, 16);
        panel1.add(lblCityzen);

        String country[] = {
                "Indonesia",
                "China",
                "jepang"
        };

        final JComboBox selectCitizen = new JComboBox<>(country);
        selectCitizen.setBounds(105, 180, 169, 30);
        panel1.add(selectCitizen);

        JButton tombsub = new JButton("Submit");
        tombsub.setBounds(100, 250, 169, 40);
        ActionListener actionSubmit = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> data = new ArrayList<String>();

                if (!textFullName.getText().isEmpty()) {
                    data.add(textFullName.getText());
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Nama tidak boleh kosong . Silakan periksa kembali isian anda.",
                            "Alert!", JOptionPane.ERROR_MESSAGE);
                }

                if (!textEmail.getText().isEmpty()) {
                    data.add(textEmail.getText());
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Email tidak boleh kosong . Silakan periksa kembali isian anda.",
                            "Alert!", JOptionPane.ERROR_MESSAGE);
                }

                if (!txtPhone.getText().isEmpty()) {
                    data.add(txtPhone.getText());
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No Telepon tidak boleh kosong. Silakan periksa kembali isian anda.",
                            "Alert!", JOptionPane.ERROR_MESSAGE);
                }

                if (radioGender1.isSelected()) {
                    data.add(radioGender1.getText());
                } else if (radioGender2.isSelected()) {
                    data.add(radioGender2.getText());
                }

                data.add(selectCitizen.getSelectedItem().toString());

                String output = "";
                output += "Name : " + data.get(0) + "\n";
                output += "Email : " + data.get(1) + "\n";
                output += "Phone : " + data.get(2) + "\n";
                output += "Gender : " + data.get(3) + "\n";
                output += "Citizenship : " + data.get(4) + "\n";
                JOptionPane.showMessageDialog(null, output, "Test Submit", JOptionPane.INFORMATION_MESSAGE);

                Login loginPage = new Login();
                loginPage.setVisible(true);
                dispose();
            }
        };
       tombsub.addActionListener(actionSubmit);
        panel1.add(tombsub);

        frame.add(panel1);
    }

}