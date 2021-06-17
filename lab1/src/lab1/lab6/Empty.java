package lab1.lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;

/**
 * @author sebik
 */
public class Empty extends GameObject {

    public Empty(int width, int height, int x, int y) {
        super(width, height, x, y, Type.Empty);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(imageEmpty, x, y, width, height, null);
    }

    @Override
    public void tick() {

    }

}
