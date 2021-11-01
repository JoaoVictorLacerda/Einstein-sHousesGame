package Listeners;

import Controller.Controller;
import View.GameView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EntidadeTres extends EntidadeAbstrata{

    public EntidadeTres(GameView gameView) {

        super(gameView);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> comboBox = (JComboBox<String>) e.getSource();


        this.paraTodosEntidades();
        this.mudaCorDaCasa(comboBox);
    }

    @Override
    public void paraTodosEntidades(){
        Controller c = Controller.getInstance();

        if(
            this.comboBox[0].getSelectedItem().equals("Vermelho") &&
            this.comboBox[1].getSelectedItem().equals("Inglês") &&
            this.comboBox[2].getSelectedItem().equals("Leite") &&
            this.comboBox[3].getSelectedItem().equals("Pall Mall") &&
            this.comboBox[4].getSelectedItem().equals("Pássaros")
        ){
            c.isCorrect3 = true;
        }else{
            c.isCorrect3 = false;
        }
        c.isWinn(gameView.getWindow());


    }

}
