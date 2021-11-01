package Listeners;

import Controller.Controller;
import View.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EntidadeDois extends EntidadeAbstrata{

    public EntidadeDois(GameView gameView) {
        super(gameView);
    }

    public void actionPerformed(ActionEvent e) {
        JComboBox<String> comboBox = (JComboBox<String>) e.getSource();


        this.paraTodosEntidades();
        this.mudaCorDaCasa(comboBox);
    }

    public void paraTodosEntidades(){
        Controller c = Controller.getInstance();
        if(
        this.comboBox[0].getSelectedItem().equals("Azul") &&
        this.comboBox[1].getSelectedItem().equals("Dinamarquês") &&
        this.comboBox[2].getSelectedItem().equals("Chá") &&
        this.comboBox[3].getSelectedItem().equals("Blends") &&
        this.comboBox[4].getSelectedItem().equals("Cavalos")
        ){
            c.isCorrect2 = true;
        }else{
            c.isCorrect2 = false;
        }
        c.isWinn(gameView.getWindow());


    }

}
