package com.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class formu extends JFrame {

    private Container contenedor;
    private JPanel panel1;
    private JLabel title;
    private JLabel name;
    private JTextField fname;
    private JLabel tele;
    private JTextField tel;
    private JLabel gen;
    private JRadioButton mas;
    private JRadioButton fem;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JLabel l2;
    private JPasswordField p;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };



    public formu(){
        this.setSize(900,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("PROYECTO");

        contenedor = getContentPane();
        contenedor.setLayout(null);
        contenedor.setBackground(new Color(199, 93, 10));

        panel1 = new JPanel();
        panel1.setSize(500,600);
        panel1.setLocation(0,0);
        panel1.setBackground(new Color(255, 255, 255));
        panel1.setLayout(null);
        contenedor.add(panel1);


        title = new JLabel("Viboras Boutique");
        title.setFont(new Font("Calibri", Font.PLAIN, 32));
        title.setSize(400, 35);
        title.setLocation(50, 30);
        title.setForeground(new Color(16, 40, 140));
        panel1.add(title);

        name = new JLabel("Cliente");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(50, 100);
        name.setForeground(new Color(0, 0, 0));
        panel1.add(name);

        fname = new JTextField("");
        fname.setForeground(new Color(0, 0, 0));
        fname.setFont(new Font("Arial", Font.PLAIN, 15));
        fname.setSize(220, 28);
        fname.setLocation(120, 100);
        panel1.add(fname);

        tele = new JLabel("Telef.");
        tele.setFont(new Font("Arial", Font.PLAIN, 20));
        tele.setSize(100, 20);
        tele.setLocation(50, 150);
        tele.setForeground(new Color(0, 0, 0));
        panel1.add(tele);

        tel = new JTextField("");
        tel.setForeground(new Color(153, 163, 164));
        tel.setFont(new Font("Arial", Font.PLAIN, 15));
        tel.setSize(220, 28);
        tel.setLocation(120, 150);
        panel1.add(tel);

        l2 =new JLabel("ID");
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2.setSize(100, 20);
        l2.setLocation(50, 200);
        l2.setForeground(new Color(0, 0, 0));
        panel1.add(l2);

        p = new JPasswordField();
        p.setForeground(new Color(0, 0, 0));
        p.setFont(new Font("Arial", Font.PLAIN, 15));
        p.setSize(220, 28);
        p.setLocation(120, 200);
        panel1.add(p);


        gen = new JLabel("Genero");
        gen.setFont(new Font("Arial", Font.PLAIN, 20));
        gen.setSize(80, 20);
        gen.setLocation(50, 250);
        gen.setForeground(new Color(0, 0, 0));
        panel1.add(gen);

        mas= new JRadioButton("Hombre");
        mas.setFont(new Font("Arial", Font.PLAIN, 17));
        mas.setSelected(true);
        mas.setSize(110, 20);
        mas.setLocation(130, 250);
        mas.setBackground(new Color(255,255,255));
        mas.setForeground(new Color(0,0,0));
        panel1.add(mas);

        fem = new JRadioButton("Mujer");
        fem.setFont(new Font("Arial", Font.PLAIN, 17));
        fem.setSelected(false);
        fem.setSize(110, 20);
        fem.setLocation(250, 250);
        fem.setBackground(new Color(255,255,255));
        fem.setForeground(new Color(0,0,0));
        panel1.add(fem);

        gengp = new ButtonGroup();
        gengp.add(mas);
        gengp.add(fem);

        dob = new JLabel("Fecha");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(50, 300);
        dob.setForeground(new Color(0, 0, 0));
        panel1.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(120, 300);
        panel1.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(190, 300);
        panel1.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(270, 300);
        panel1.add(year);

        add = new JLabel("Direccion");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(50, 350);
        add.setForeground(new Color(0, 0, 0));
        panel1.add(add);

        tadd = new JTextArea();
        tadd.setForeground(new Color(0, 0, 0));
        tadd.setBackground(new Color(229, 231, 233 ));
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(140, 350);
        tadd.setLineWrap(true);
        panel1.add(tadd);

        term = new JCheckBox("Acepto los beneficios de la tienda");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setBackground(new Color(255,255,255));
        term.setSize(250, 20);
        term.setLocation(110, 450);
        panel1.add(term);

        sub = new JButton("Ingresar");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 30);
        sub.setLocation(100, 550);
        sub.addActionListener(this::actionPerformed);
        panel1.add(sub);

        reset = new JButton("Eliminar");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 30);
        reset.setLocation(250, 550);
        reset.addActionListener(this::actionPerformed);
        panel1.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(550, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        contenedor.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(60, 500);
        res.setForeground(new Color(0, 0, 0));
        panel1.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        contenedor.add(resadd);




    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                        = "Name : "
                        + fname.getText() + "\n"
                        + "Mobile : "
                        + tel.getText() + "\n";
                if (mas.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                        = "DOB : "
                        + (String)date.getSelectedItem()
                        + "/" + (String)month.getSelectedItem()
                        + "/" + (String)year.getSelectedItem()
                        + "\n";

                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Ingreso Exitoso");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Acepte los beneficios de la tienda");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            fname.setText(def);
            tadd.setText(def);
            tel.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}