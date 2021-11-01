package Listeners;

import Controller.Controller;
import View.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EntidadeCinco extends EntidadeAbstrata{

    public EntidadeCinco(GameView gameView) {
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
                    this.comboBox[0].getSelectedItem().equals("Branco") &&
                    this.comboBox[1].getSelectedItem().equals("Sueco") &&
                    this.comboBox[2].getSelectedItem().equals("Cerveja") &&
                    this.comboBox[3].getSelectedItem().equals("Blue Master") &&
                    this.comboBox[4].getSelectedItem().equals("Cachorros")){

                c.isCorrect5 = true;
            }else{
                c.isCorrect5 = false;
            }

        c.isWinn(gameView.getWindow());

        }

}
