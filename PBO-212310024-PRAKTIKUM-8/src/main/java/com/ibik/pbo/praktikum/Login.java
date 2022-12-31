package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    	Login() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(400, 500);
        setTitle("Contoh Window Frame");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new Login();
    }

    private void GenerateUI(Login frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        mainPanel.add(panel1, BorderLayout.NORTH);

        JLabel Email = new JLabel("Email");
        Email.setBounds(22, 23, 80, 16);
        panel1.add((Email));

        final JTextField textEmail = new JTextField();
        textEmail.setBounds(105, 18, 169, 30);
        panel1.add(textEmail);

        JLabel Pass = new JLabel("Password");
        Pass.setBounds(22, 69, 61, 16);
        panel1.add(Pass);

        final JPasswordField textPassword = new JPasswordField();
        textPassword.setBounds(105, 64, 169, 30);
        panel1.add(textPassword);

        JCheckBox chkRemember = new JCheckBox("Remember Account ?");
        chkRemember.setBounds(105, 100, 169, 40);
        panel1.add(chkRemember);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(105, 150, 83, 40);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Regist regPage = new Regist();
                regPage.setVisible(true);
                dispose();
            }
        });
        panel1.add(btnRegister);

        JButton tombolLog = new JButton("Login");
        tombolLog.setBounds(205, 150, 83, 40);
        tombolLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data[] = {
                        "212310024@student.ibik.ac.id",
                        "212310024",
                        "firza"
                };

                String inputedPass = new String(textPassword.getPassword());

                if (textEmail.getText().isEmpty() || inputedPass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Silakan mengisi data dengan benar", "Alert!",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!textEmail.getText().equals(data[0]) && !inputedPass.equals(data[1])) {
                        JOptionPane.showMessageDialog(null, "Data yang anda masukan salah!", "Alert!",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Selamat datang " + data[2], "Success!",
                                JOptionPane.INFORMATION_MESSAGE);

                 
                        Tabelnilai table = new Tabelnilai();
                        table.setVisible(true);
                        dispose();
                    }
                }
            }
        });
        panel1.add(tombolLog);

        
        JLabel lblCopyright = new JLabel("copyright IBIK @ 2022", SwingConstants.CENTER);
        lblCopyright.setSize(300, 50);
        mainPanel.add(lblCopyright, BorderLayout.SOUTH);

        frame.add(panel1);
    }
}