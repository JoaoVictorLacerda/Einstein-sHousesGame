package Listeners;

import Controller.Controller;
import View.GameView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EntidadeUm extends EntidadeAbstrata{

    public EntidadeUm(GameView gameView) {

        super(gameView);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> comboBox = (JComboBox<String>) e.getSource();

        this.paraTodosEntidades();
        this.mudaCorDaCasa(comboBox);
    }

    public void paraTodosEntidades(){
        Controller c = Controller.getInstance();

        if(
            this.comboBox[0].getSelectedItem().equals("Amarelo") &&
            this.comboBox[1].getSelectedItem().equals("Norueguês") &&
            this.comboBox[2].getSelectedItem().equals("Água") &&
            this.comboBox[3].getSelectedItem().equals("Dunhill") &&
            this.comboBox[4].getSelectedItem().equals("Gatos")
        ){
            c.isCorrect1 = true;
        }else{
            c.isCorrect1 = false;
        }

        c.isWinn(gameView.getWindow());

    }


}
