package source.jpu.dogfight.view;

import java.util.Observable;

import source.jpu.dogfight.controller.IOrderPerformer;
import source.jpu.dogfight.model.IDogFightModel;
import source.jpu.gameframe.GameFrame;

/**
 * DogfightView
 */
public class DogfightView implements Runnable, IViewSystem {

    @SuppressWarnings("unused")
	private EventPerformer eventPerformer;
	@SuppressWarnings("unused")
	private GameFrame gameFrame;
	@SuppressWarnings("unused")
	private GraphicsBuilder graphicsBuilder;

	public DogfightView (IOrderPerformer OrderPerformer, IDogfightModel dogfightmodel, Observable observable) {
		
	}
	
	public void run() { 
		
	}
	public void displayMessage (String message) {
		
	}
	public void closeAll() {
		
	}
}