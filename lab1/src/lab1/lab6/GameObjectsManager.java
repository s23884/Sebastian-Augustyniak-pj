package lab1.lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab1.lab6.GameObject;
import java.awt.*;
import java.util.ArrayList;

public class GameObjectsManager {

    private static GameObjectsManager instance = null;
    private ArrayList<GameObject> gameObjects = new ArrayList<>();

    private GameObjectsManager() {
    }

    public static GameObjectsManager getInstance() {
        if (instance == null) {
            instance = new GameObjectsManager();
        }
        return instance;
    }

    public void add(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    public void move() {
        for (GameObject g : gameObjects) {
            if (g instanceof Zolnierz) {
                ((Zolnierz) g).setMove(true);
            }
        }
    }

    public void render(Graphics graphics) {
        for (int i = 0; i < gameObjects.size(); i++) {
            gameObjects.get(i).render(graphics);
        }
    }

    public void tick() {
        for (int i = 0; i < gameObjects.size(); i++) {
            gameObjects.get(i).tick();
        }
    }

    public GameObject getGameObject(int x, int y) {
        for (GameObject go : gameObjects) {
            if (x == go.getX() && y == go.getY()) {
                return go;
            }
        }
        return null;
    }

    public void replace_empty(GameObject gameobject, Direction direction) {
        int x = gameobject.x, y = gameobject.y;

        if (x % 40 != 0) {
            x -= x % 40;
        }
        if (y % 40 != 0) {
            y -= y % 40;
        }

        int nx = x, ny = y;

        switch (direction) {
            case UP -> {
                ny += 40;
            }
            case DOWN -> {
                ny -= 40;
            }
        }

        GameObject orginalGameObject = getGameObject(nx, ny);

        if (orginalGameObject instanceof Zolnierz && gameobject instanceof Zolnierz) {
            ((Zolnierz) orginalGameObject).collision((Zolnierz) gameobject);
        }

        try {
            orginalGameObject.setXY(x, y);
        } catch (Exception ex) {

        }

        if (!gameObjects.contains(gameobject))
            gameObjects.add(gameobject);

        gameobject.setXY(nx, ny);

    }

    public void replace(GameObject gameobject, Integer x, Integer y) {


        if (x % 40 != 0) {
            x -= x % 40;
        }
        if (y % 40 != 0) {
            y -= y % 40;
        }

        gameObjects.remove(getGameObject(x, y));

        if (!gameObjects.contains(gameobject))
            gameObjects.add(gameobject);

        gameobject.setXY(x, y);


    }

    public void replace(GameObject gameobject) {
        Integer x = gameobject.getX();
        Integer y = gameobject.getY();

        if (x % 40 != 0) {
            x -= x % 40;
        }
        if (y % 40 != 0) {
            y -= y % 40;
        }

        gameObjects.remove(getGameObject(x, y));

        if (!gameObjects.contains(gameobject))
            gameObjects.add(gameobject);

        gameobject.setXY(x, y);


    }

    enum Direction {
        UP,
        DOWN
    }
}
