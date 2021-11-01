package View;

import DynamicLayout.DynamicLayout;
import Listeners.*;
import View.Components.JPanelComponent;

import javax.swing.*;
import java.awt.*;

public class GameView {
    private JFrame window;
    private JPanel painel;

    private Font font = new Font("Arial",Font.PLAIN,15);

    public JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,lbl12,lbl13,lbl14,lbl15;

    public GameView() {
        this.window = new JFrame("Einstein Game");
        this.window.setSize(800,500);
        this.window.setLayout(new DynamicLayout(800,500));
        this.window.setResizable(true);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setLocationRelativeTo(null);
        this.window.getContentPane().setBackground(Color.decode("#A395BA"));
        this.configWindow();
    }

    private void configWindow(){
        this.alemao();
        this.dinamarques();
        this.ingles();
        this.noruegues();
        this.sueco();
        this.addInstrucions();
        this.window.setVisible(true);
    }

    private void addInstrucions(){

        Font font = new Font("Arial",Font.BOLD,23);
        JPanel painelCHB = new JPanel();
        painelCHB.setBounds(0,0,800,190);
        painelCHB.setLayout(new DynamicLayout(800,530));
        painelCHB.setPreferredSize(new Dimension(0,530));
        painelCHB.setBackground(Color.decode("#A8B2D0"));

        JScrollPane scroll = new JScrollPane(painelCHB);
        scroll.setBounds(0,0,800,190);
        scroll.getVerticalScrollBar().setUnitIncrement(10);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        lbl1 = new JLabel("01. O inglês vive na casa vermelha",JLabel.CENTER);
        lbl1.setBounds(0,10,800,35);
        lbl1.setForeground(Color.black);
        lbl1.setFont(font);

        lbl2 = new JLabel("02. O Sueco tem Cachorros como animais de estimação.",JLabel.CENTER);
        lbl2.setBounds(0,45,800,35);
        lbl2.setForeground(Color.black);
        lbl2.setFont(font);

        lbl3 = new JLabel("03. O Dinamarquês bebe Chá.",JLabel.CENTER);
        lbl3.setBounds(0,80,800,35);
        lbl3.setForeground(Color.black);
        lbl3.setFont(font);

        lbl4 = new JLabel("04. A casa Verde fica do lado esquerdo da casa Branca.",JLabel.CENTER);
        lbl4.setBounds(0,115,800,35);
        lbl4.setForeground(Color.black);
        lbl4.setFont(font);

        lbl5 = new JLabel("05. O homem que vive na casa Verde bebe Café.",JLabel.CENTER);
        lbl5.setBounds(0,150,800,35);
        lbl5.setForeground(Color.black);
        lbl5.setFont(font);

        lbl6 = new JLabel("06. O homem que fuma Pall Mall cria Pássaros.",JLabel.CENTER);
        lbl6.setBounds(0,185,800,35);
        lbl6.setForeground(Color.black);
        lbl6.setFont(font);

        lbl7 = new JLabel("07. O homem que vive na casa Amarela fuma Dunhill.",JLabel.CENTER);
        lbl7.setBounds(0,220,800,35);
        lbl7.setForeground(Color.black);
        lbl7.setFont(font);

        lbl8 = new JLabel("08. O homem que vive na casa do meio bebe Leite.",JLabel.CENTER);
        lbl8.setBounds(0,255,800,35);
        lbl8.setForeground(Color.black);
        lbl8.setFont(font);

        lbl9 = new JLabel("09. O Norueguês vive na primeira casa.",JLabel.CENTER);
        lbl9.setBounds(0,290,800,35);
        lbl9.setForeground(Color.black);
        lbl9.setFont(font);

        lbl10 = new JLabel("10. O homem que fuma Blends vive ao lado do que tem Gatos.",JLabel.CENTER);
        lbl10.setBounds(0,325,800,35);
        lbl10.setForeground(Color.black);
        lbl10.setFont(font);

        lbl11 = new JLabel("11. O homem que cria Cavalos vive ao lado do que fuma Dunhill.",JLabel.CENTER);
        lbl11.setBounds(0,360,800,35);
        lbl11.setForeground(Color.black);
        lbl11.setFont(font);

        lbl12 = new JLabel("12. O homem que fuma Blue Master bebe Cerveja.",JLabel.CENTER);
        lbl12.setBounds(0,395,800,35);
        lbl12.setForeground(Color.black);
        lbl12.setFont(font);

        lbl13 = new JLabel("13. O Alemão fuma Prince.",JLabel.CENTER);
        lbl13.setBounds(0,430,800,35);
        lbl13.setForeground(Color.black);
        lbl13.setFont(font);

        lbl14 = new JLabel("14. O Norueguês vive ao lado da casa Azul.",JLabel.CENTER);
        lbl14.setBounds(0,465,800,35);
        lbl14.setForeground(Color.black);
        lbl14.setFont(font);

        lbl15 = new JLabel("15. O homem que fuma Blends é vizinho do que bebe Água.",JLabel.CENTER);
        lbl15.setBounds(0,500,800,35);
        lbl15.setForeground(Color.black);
        lbl15.setFont(font);

        painelCHB.add(lbl1);
        painelCHB.add(lbl2);
        painelCHB.add(lbl3);
        painelCHB.add(lbl4);
        painelCHB.add(lbl5);
        painelCHB.add(lbl6);
        painelCHB.add(lbl7);
        painelCHB.add(lbl8);
        painelCHB.add(lbl9);
        painelCHB.add(lbl10);
        painelCHB.add(lbl11);
        painelCHB.add(lbl12);
        painelCHB.add(lbl13);
        painelCHB.add(lbl14);
        painelCHB.add(lbl15);

        this.window.add(scroll);
    }

    private void alemao(){
        int boundsJpanel []= {10,195,150,300};
        this.biuldJCombobox("Casa 1",boundsJpanel,new EntidadeUm(this));

    }

    private void dinamarques(){
        int boundsJpanel []= {170,195,150,300};
        this.biuldJCombobox("Casa 2",boundsJpanel,new EntidadeDois(this));
    }
    private void ingles(){
        int boundsJpanel []= {330,195,150,300};
        this.biuldJCombobox("Casa 3",boundsJpanel,new EntidadeTres(this));
    }
    private void noruegues(){
        int boundsJpanel []= {490,195,150,300};
        this.biuldJCombobox("Casa 4",boundsJpanel,new EntidadeQuatro(this));
    }
    private void sueco(){
        int boundsJpanel []= {650,195,150,300};
        this.biuldJCombobox("Casa 5",boundsJpanel,new EntidadeCinco(this));
    }


    private void biuldJCombobox(String title, int bounds[], ListenerView listener){

        painel = new JPanelComponent(20);
        painel.setBounds(bounds[0],bounds[1],bounds[2],bounds[3]);
        painel.setLayout(new DynamicLayout(150,330));
        painel.setBackground(Color.decode("#B1DDF1"));

        JLabel house = new JLabel(title,JLabel.CENTER);
        house.setBounds(0,0,150,40);

        this.painel.add(house);

        JComboBox<String> colors = new JComboBox<String>();
        JComboBox<String> person = new JComboBox<String>();
        JComboBox<String> drink = new JComboBox<String>();
        JComboBox<String> cigarettes = new JComboBox<String>();
        JComboBox<String> pet = new JComboBox<String>();

        colors.addItem(".");
        colors.addItem("Amarelo");
        colors.addItem("Azul");
        colors.addItem("Branco");
        colors.addItem("Verde");
        colors.addItem("Vermelho");
        colors.setBounds(6,40,140,30);
        colors.setFont(font);

        person.addItem(".");
        person.addItem("Alemão");
        person.addItem("Dinamarquês");
        person.addItem("Inglês");
        person.addItem("Norueguês");
        person.addItem("Sueco");
        person.setBounds(6,100,140,30);
        person.setFont(font);

        drink.addItem(".");
        drink.addItem("Água");
        drink.addItem("Café");
        drink.addItem("Chá");
        drink.addItem("Cerveja");
        drink.addItem("Leite");
        drink.setBounds(6,160,140,30);
        drink.setFont(font);

        cigarettes.addItem(".");
        cigarettes.addItem("Blends");
        cigarettes.addItem("Blue Master");
        cigarettes.addItem("Dunhill");
        cigarettes.addItem("Pall Mall");
        cigarettes.addItem("Prince");
        cigarettes.setBounds(6,220,140,30);
        cigarettes.setFont(font);


        pet.addItem(".");
        pet.addItem("Cachorros");
        pet.addItem("Cavalos");
        pet.addItem("Gatos");
        pet.addItem("Pássaros");
        pet.addItem("Peixes");
        pet.setBounds(6,280,140,30);
        pet.setFont(font);


        this.painel.add(colors);
        this.painel.add(person);
        this.painel.add(drink);
        this.painel.add(cigarettes);
        this.painel.add(pet);

        listener.pegaOsOutrosJCombobox(new JComboBox[]{
                colors,
                person,
                drink,
                cigarettes,
                pet
        },this.painel);


        colors.addActionListener(listener);
        person.addActionListener(listener);
        drink.addActionListener(listener);
        cigarettes.addActionListener(listener);
        pet.addActionListener(listener);


        this.window.add(painel);

    }

    public JFrame getWindow() {
        return window;
    }

}
