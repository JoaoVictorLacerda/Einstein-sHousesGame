package Listeners;

import Controller.Controller;
import View.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EntidadeQuatro extends EntidadeAbstrata{

    public EntidadeQuatro(GameView gameView) {
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
                this.comboBox[0].getSelectedItem().equals("Verde") &&
                this.comboBox[1].getSelectedItem().equals("Alemão") &&
                this.comboBox[2].getSelectedItem().equals("Café") &&
                this.comboBox[3].getSelectedItem().equals("Prince") &&
                this.comboBox[4].getSelectedItem().equals("Peixes")
        ){
            c.isCorrect4 = true;
        }else{
            c.isCorrect4 = false;
        }

        c.isWinn(gameView.getWindow());

    }
}
