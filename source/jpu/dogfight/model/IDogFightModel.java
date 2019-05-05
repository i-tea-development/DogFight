package source.jpu.dogfight.model;

import java.io.IOException;
import java.util.ArrayList;

/**
 * IDogFightModel
 */
public interface IDogFightModel {

    public IArea getArea();

    public void buildArea(Dimension dimension) throws IOException;

	public void removeMobile(IMobile Mobile);

	public ArrayList<IMobile> getMobiles();

	public IMobile getMobileByPlayer(int Player);

	public void setMobilesHavesMoved();
}