package lab1.lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab1.lab6.GameObjectsManager;
import lab1.lab6.Empty;
import javax.swing.*;

/**
 *
 * @author sebik
 */
public class GraWojenna {

    public static int blueLives = 15;
    public static int redLives = 15;
    private Window window;
    private GameObjectsManager gameObjectsManager;
    public GraWojenna() {
        gameObjectsManager = GameObjectsManager.getInstance();
        window = new Window(gameObjectsManager);
        init();
        loop();
    }

    public static void main(String[] args) {
        GraWojenna graWojenna = new GraWojenna();
    }

    public void init() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= 10; j++) {
                gameObjectsManager.add(new Empty(40, 40, i * 40, j * 40));
            }
        }

    }

    public void loop() {

        double delta = 0;
        double ticks = 120;
        long lastTime = System.nanoTime();
        double nanoseconds = 100000000 / ticks;

        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / nanoseconds;
            lastTime = now;

            while (delta >= 1) {
                delta--;
                tick();
                window.getRender().render();
            }

            if (blueLives <= 0) {
                JOptionPane.showMessageDialog(null, "Czerwoni wygrali!");
                System.exit(1);
            }
            if (redLives <= 0) {
                JOptionPane.showMessageDialog(null, "Niebiescy wygrali!");
                System.exit(1);
            }
        }
    }

    public void tick() {
        gameObjectsManager.tick();
    }


}
