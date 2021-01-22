package ticTacToe;
/// setare imagine cu X sau O

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader() {
        try {
            imgX = ImageIO.read(new File("res/x.png"));
            imgO = ImageIO.read(new File("res/o.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
