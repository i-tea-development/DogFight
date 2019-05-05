package source.jpu.dogfight.model;

import java.io.IOException;

/**
 * Cloud
 */
public class Cloud extends Mobile{

    private static Integer SPEED = 4;
    private static Integer WIDTH = 300;
    private static Integer HEIGHT = 150;
    private static String IMAGE = "cloud";

    public Cloud(final Direction direction, final Position position) throws IOException{

        super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
        
    }
}