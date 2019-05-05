package source.jpu.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

/**
 * IGraphicsBuilder
 */
public interface IGraphicsBuilder {

    public void applyModelToGraphic(Graphics graphics, ImageObserver observer);
	public int getGlobalWidth();
	public int getGlobalHeight();
}