package Listeners;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface ListenerView extends ActionListener {

    public void pegaOsOutrosJCombobox(JComboBox<String> comboBox [],JPanel painel);
    public void paraTodosEntidades();

}
