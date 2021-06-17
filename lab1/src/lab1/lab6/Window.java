package lab1.lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab1.lab6.GameObjectsManager;
import lab1.lab6.GameObject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

/**
 * @author sebik
 */
public class Window extends JFrame implements KeyListener {

    private static JTextArea textArea;
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 465;
    private Render render;
    private final GameObjectsManager gameObjectsManager;
    private Window window;

    public Window(GameObjectsManager gameObjectsManager) {
        this.gameObjectsManager = gameObjectsManager;
        new GeneralPanel();
        setUpWindow();
        setVisible(true);
    }

    public static void comment(String comment) {
        textArea.append(comment + "\n");
    }

    public void setUpWindow() {

        this.window = this;
        render = new Render();
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Gra wojenna");
        addKeyListener(this);
        getContentPane().addKeyListener(this);
        getRootPane().add(render);
        add(render);

    }

    public Render getRender() {
        return render;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("X");
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class Render extends Canvas {

        public void render() {
            BufferStrategy bs = this.getBufferStrategy();
            if (bs == null) {
                this.createBufferStrategy(3);
                return;
            }

            this.addKeyListener(window);
            Graphics graphics = bs.getDrawGraphics();

            graphics.setColor(Color.DARK_GRAY);
            graphics.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

            gameObjectsManager.render(graphics);

            graphics.dispose();
            bs.show();

        }
    }

    class GeneralPanel extends JFrame {

        private JPanel general1, general2;
        private JButton nextTurn;
        private JButton spawn1, spawn2;
        private JTextField money1, money2;
        private final int money1_i = 25;
        private final int money2_i = 25;

        public GeneralPanel() {
            setSize(300, 420);
            setTitle("Panel generala");
            setLayout(new GridLayout(2, 0));
            setUpComponents();
            setVisible(true);
        }

        public void setUpComponents() {


            spawn1 = new JButton("Spawn");
            spawn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < 10; i++) {

                        if (!(GameObjectsManager.getInstance().getGameObject(0 + 40 * i, 400) instanceof Zolnierz) && Integer.parseInt(money1.getText().substring(money1.getText().indexOf("=") + 1)) > 0) {
                            GameObjectsManager.getInstance().replace(new Zolnierz(40, 40, 0 + 40 * i, 400, GameObject.Strona.Niebieska));
                            money1.setText("Money =" + (Integer.parseInt(money1.getText().substring(money1.getText().indexOf("=") + 1)) - 1));
                            comment("General niebieski zakupił żołnierza");
                            break;
                        }
                    }
                }

            });
            money1 = new JTextField("Money =" + money1_i);
            money1.setHorizontalAlignment(JTextField.CENTER);
            money1.setPreferredSize(new Dimension(100, 50));
            money1.setEditable(false);

            general1 = new JPanel();
            general1.setLayout(new BorderLayout());
            general1.add(spawn1, BorderLayout.SOUTH);
            general1.setBackground(Color.blue);
            general1.add(money1, BorderLayout.CENTER);

            textArea = new JTextArea();
            textArea.setPreferredSize(new Dimension(100, 130));
            textArea.setEditable(false);
            general1.add(textArea, BorderLayout.NORTH);


            spawn2 = new JButton("Spawn");
            spawn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < 10; i++) {

                        if (!(GameObjectsManager.getInstance().getGameObject(0 + 40 * i, 0) instanceof Zolnierz) && Integer.parseInt(money2.getText().substring(money2.getText().indexOf("=") + 1, money2.getText().length())) > 0) {
                            GameObjectsManager.getInstance().replace(new Zolnierz(40, 40, 0 + 40 * i, 0, GameObject.Strona.Czerwa));
                            money2.setText("Money =" + (Integer.parseInt(money2.getText().substring(money2.getText().indexOf("=") + 1)) - 1));
                            comment("General czerwony zakupił żołnierza");
                            break;
                        }
                    }
                }

            });
            general2 = new JPanel();
            general2.setLayout(new BorderLayout());
            general2.add(spawn2, BorderLayout.NORTH);
            general2.setBackground(Color.red);

            money2 = new JTextField("Money =" + money2_i);
            money2.setHorizontalAlignment(JTextField.CENTER);
            money2.setSize(100, 60);
            money2.setEditable(false);
            general2.add(money2, BorderLayout.CENTER);


            nextTurn = new JButton("Next turn");
            nextTurn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GameObjectsManager.getInstance().move();
                    money1.setText("Money =" + (Integer.parseInt(money1.getText().substring(money1.getText().indexOf("=") + 1)) + 1));
                    money2.setText("Money =" + (Integer.parseInt(money2.getText().substring(money2.getText().indexOf("=") + 1)) + 1));
                    textArea.setText("");
                }

            });
            general2.add(nextTurn, BorderLayout.SOUTH);

            add(general2);
            add(general1);
        }
    }

}
