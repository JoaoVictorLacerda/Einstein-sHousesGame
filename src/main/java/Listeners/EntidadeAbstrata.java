package Listeners;

import View.GameView;

import javax.swing.*;
import java.awt.*;

public abstract class EntidadeAbstrata implements ListenerView {

    protected JPanel painel;
    protected JComboBox<String> comboBox [];
    protected GameView gameView;

    public EntidadeAbstrata(GameView gameView) {
        this.gameView = gameView;
    }

    public void pegaOsOutrosJCombobox(JComboBox<String> comboBox [], JPanel painel){
        this.comboBox=comboBox;
        this.painel=painel;
    }

    protected void mudaCorDaCasa(JComboBox<String> comboBox){
        if(this.comboBox[0].equals(comboBox)){
            String choice = (String) comboBox.getSelectedItem();
            if(choice.equals("Amarelo")){
                painel.setBackground(Color.YELLOW);

            }else if(choice.equals("Azul")){
                painel.setBackground(Color.BLUE);

            }else if(choice.equals("Branco")){
                painel.setBackground(Color.WHITE);

            }else if(choice.equals("Verde")){
                painel.setBackground(Color.GREEN);

            }else if(choice.equals("Vermelho")){
                painel.setBackground(Color.RED);

            }else {
                painel.setBackground(Color.decode("#B1DDF1"));
            }
        }
        painel.validate();
        painel.repaint();

        gameView.getWindow().validate();
        gameView.getWindow().repaint();
    }


}
