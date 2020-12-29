package id.ac.its.aff231yz160zlp118.snake;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;

public class Snake extends JFrame {
    BasePanel gameBoard;
    BasePanel mainMenu = new MainMenu();
    BasePanel creditMenu = new CreditMenu();
    BasePanel levelSelector = new LevelSelector();
    BasePanel highScoreStats = new HighScoreStats();

    public Snake() {
        initUI();
    }

    private void initUI() {
        mainMenu = new MainMenu();
        creditMenu.setVisible(false);
        levelSelector.setVisible(false);
        highScoreStats.setVisible(false);
        MouseHandler mouseHandler = new MouseHandler();
        addMouseListener(mouseHandler);
        mainMenu.setVisible(true);
        add(mainMenu);

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }

    private class MouseHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(mainMenu.isVisible()) {
                if(mainMenu.getButtonClicked(e) != ButtonClicked.NOT_CLICKED) {
                    mainMenu.setVisible(false);
                    getContentPane().remove(mainMenu);
                }
                if(mainMenu.getButtonClicked(e) == ButtonClicked.PLAY) {
                    levelSelector.setVisible(true);
                    add(levelSelector);
                } else if(mainMenu.getButtonClicked(e) == ButtonClicked.CREDITS) {
                    creditMenu.setVisible(true);
                    add(creditMenu);
                } else if(mainMenu.getButtonClicked(e) == ButtonClicked.HIGH_SCORE) {
                    highScoreStats.setVisible(true);
                    add(highScoreStats);
                }
            } else if(creditMenu.isVisible()) {
                if(creditMenu.getButtonClicked(e) == ButtonClicked.MAIN_MENU) {
                    creditMenu.setVisible(false);
                    getContentPane().remove(creditMenu);
                    mainMenu.setVisible(true);
                    add(mainMenu);
                } else if(creditMenu.getButtonClicked(e) == ButtonClicked.REFERENCE) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI oURL = new URI("http://zetcode.com/javagames/snake/");
                        desktop.browse(oURL);
                    } catch (URISyntaxException | IOException exception) {
                        exception.printStackTrace();
                    }
                }
            } else if (levelSelector.isVisible()) {
                if(levelSelector.getButtonClicked(e) != ButtonClicked.NOT_CLICKED) {
                    levelSelector.setVisible(false);
                    getContentPane().remove(levelSelector);
                }
                if(levelSelector.getButtonClicked(e) == ButtonClicked.LEVEL_0) {
                    gameBoard = new BoardLevel0();
                    gameBoard.setVisible(true);
                    add(gameBoard);
                    gameBoard.requestFocusInWindow();
                }
                else if(levelSelector.getButtonClicked(e) == ButtonClicked.LEVEL_1) {
                    gameBoard = new BoardLevel1();
                    gameBoard.setVisible(true);
                    add(gameBoard);
                    gameBoard.requestFocusInWindow();
                }
            } else if(highScoreStats.isVisible() && highScoreStats.getButtonClicked(e) == ButtonClicked.MAIN_MENU) {
                highScoreStats.setVisible(false);
                getContentPane().remove(highScoreStats);
                mainMenu.setVisible(true);
                add(mainMenu);
            } else if(gameBoard.isVisible() && gameBoard.getButtonClicked(e) == ButtonClicked.MAIN_MENU && !((Board)gameBoard).isInGame()) {
                gameBoard.setVisible(false);
                getContentPane().remove(gameBoard);
                mainMenu.setVisible(true);
                add(mainMenu);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}