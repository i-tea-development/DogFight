package source;

import source.jpu.dogfight.controller.DogfightController;
import source.jpu.dogfight.model.DogfightModel;
import source.jpu.dogfight.view.DogfightView;

/**
 * dogFightMain
 */
public class dogFightMain {

    public static void main(String[] args) {

        final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
        dogfightController.play(); 
        
    }
}