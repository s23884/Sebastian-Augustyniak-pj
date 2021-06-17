package lab6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.util.Random;

/**
 * @author sebik
 */
public class Zolnierz extends GameObject {

    protected Ranga ranga = Ranga.szeregowy;
    protected Strona strona_konfliktu;
    protected int doswiadczenie = 5;
    protected int sila = 1;
    protected boolean alive = true;
    private boolean move = false;

    public Zolnierz(int width, int height, int x, int y, Strona strona) {
        super(width, height, x, y, Type.Szeregowy);
        this.strona_konfliktu = strona;
    }

    @Override
    public void render(Graphics graphics) {

        if (ranga == Ranga.szeregowy) {
            graphics.drawImage(imageSzer, x, y, width, height, null);
        } else if (ranga == Ranga.kapral) {
            graphics.drawImage(imageKapr, x, y, width, height, null);
        } else if (ranga == Ranga.kapitan) {
            graphics.drawImage(imageKap, x, y, width, height, null);
        } else if (ranga == Ranga.major) {
            graphics.drawImage(imageMaj, x, y, width, height, null);

        }
    }

    @Override
    public void tick() {
        Awans();
        switch (ranga) {
            case szeregowy:
                sila = doswiadczenie;
                break;
            case kapral:
                sila = doswiadczenie * 2;
                break;
            case kapitan:
                sila = doswiadczenie * 3;
                break;
            case major:
                sila = doswiadczenie * 4;
                break;

        }

        if (strona_konfliktu == Strona.Czerwa && move) {
            GameObjectsManager.getInstance().replace_empty(this, GameObjectsManager.Direction.UP);
            move = false;
        }
        if (strona_konfliktu == Strona.Niebieska && move) {
            GameObjectsManager.getInstance().replace_empty(this, GameObjectsManager.Direction.DOWN);
            move = false;
        }

        if (strona_konfliktu == Strona.Czerwa && y == 400) {
            GraWojenna.blueLives--;
            GameObjectsManager.getInstance().replace(new Empty(40, 40, x, y));
            Window.comment("Zolnierz strony czerwonej przedarł sie do bazy oponenta!");
        }
        if (strona_konfliktu == Strona.Niebieska && y == 0) {
            GraWojenna.redLives--;
            GameObjectsManager.getInstance().replace(new Empty(40, 40, x, y));
            Window.comment("Zolnierz strony niebieskiej przedarł sie do bazy oponenta!");

        }

        if (!alive) {
            GameObjectsManager.getInstance().replace(new Empty(40, 40, x, y));
        }

    }

    public void collision(Zolnierz z) {
        if (z.doswiadczenie > 0 && doswiadczenie > 0) {
            Window.comment("Doszło do starcia wojsk");
            Random r = new Random();
            if (r.nextInt(2) == 0) {
                z.doswiadczenie -= 10;
                doswiadczenie += r.nextInt(7)+5;
            }
            else {
                doswiadczenie -= 10;
                doswiadczenie += r.nextInt(7)+5;
            }
            isAlive();
            z.isAlive();
        }
    }

    public void isAlive() {

        if (doswiadczenie <= 0) {
            alive = false;
        }
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public void Awans() {
        int exp_major = 20;
        int exp_kapitan = 15;
        int exp_kapral = 10;
        if (doswiadczenie == exp_kapral) {
            Window.comment("Zolnierz strony " + strona_konfliktu + " awansował do rangi kaprala ");
            ranga = Ranga.kapral;
        }
        if (doswiadczenie == exp_kapitan) {
            Window.comment("Zolnierz strony " + strona_konfliktu + " awansował do rangi kapitana ");
            ranga = Ranga.kapitan;
        }
        if (doswiadczenie == exp_major) {
            Window.comment("Zolnierz strony " + strona_konfliktu + " awansował do rangi majora ");
            ranga = Ranga.major;
        }
    }

    enum Ranga {
        szeregowy,
        kapral,
        kapitan,
        major
    }

}
