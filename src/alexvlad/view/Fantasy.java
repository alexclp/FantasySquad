package alexvlad.view;

import alexvlad.model.Player;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Fantasy extends JFrame {

    JComboBox formationList;
    JPanel borderPanel;
    FormationPanel formationPanel;

    public Fantasy() {
        super("Fantasy Squad");
        createWidgets();
    }

    private void createWidgets() {
        setMinimumSize(new Dimension(800, 800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] formations = {"Select a formation...", "4-4-2", "4-3-3", "3-5-2", "5-3-2", "3-4-3", "4-5-1"};
        formationList = new JComboBox(formations);
        borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        borderPanel.add(formationList, BorderLayout.NORTH);
        add(borderPanel);
        pack();
    }

    public void clearPanel() {
        borderPanel.remove(formationPanel);
        borderPanel.validate();
    }

    public void updateFormationPanel() {
        borderPanel.add(formationPanel, BorderLayout.CENTER);
        borderPanel.validate();
    }

    public HashMap<Integer, PlayerPanel> getPlayerPanel() {
        return formationPanel.getPlayerButtonsMap();
    }

    public JButton getPlayerButtonById(int id) {
        return formationPanel.getPlayerButtonsMap().get(id).getButton();
    }

    public HashMap<String, String> getPlayer(int id) {
        return formationPanel.getPlayerButtonsMap().get(id).getPlayer();
    }

    public PlayerPanel getPanel(int id) {
        return formationPanel.getPlayerButtonsMap().get(id);
    }

    public Integer getPlayerIDForButton(JButton button) {
        return formationPanel.getPlayerIDForButton(button);
    }

    public JComboBox getFormationList() {
        return formationList;
    }

    public JPanel getBorderPanel() {
        return borderPanel;
    }

    public FormationPanel getFormationPanel() {
        return formationPanel;
    }

    public void setFormationPanel(FormationPanel formationPanel) {
        this.formationPanel = formationPanel;
    }
}
