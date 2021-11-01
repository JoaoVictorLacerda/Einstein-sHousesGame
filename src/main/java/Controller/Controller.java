package Controller;

import javax.swing.*;

public class Controller {

    private static Controller instance;
    public boolean isCorrect1,isCorrect2,isCorrect3,isCorrect4,isCorrect5;

    private Controller() {}

    public static Controller getInstance(){
        if(instance==null){
            instance=new Controller();
        }
        return instance;
    }


    private void zera(){
        this.isCorrect1=false;
        this.isCorrect2=false;
        this.isCorrect3=false;
        this.isCorrect4=false;
        this.isCorrect5=false;

    }

    public void isWinn(JFrame window){
        if(isCorrect1 &&
                isCorrect2 &&
                isCorrect3 &&
                isCorrect4 &&
                isCorrect5 ){


            JOptionPane.showMessageDialog(window,"Parabéns, você ganhou");
            zera();
        }
    }

}
