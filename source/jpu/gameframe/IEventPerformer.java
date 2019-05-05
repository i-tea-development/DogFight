package source.jpu.gameframe;

import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * IEventPerformer
 */
public interface IEventPerformer {

    public void eventPerform(KeyEvent keyCode) throws IOException;
}