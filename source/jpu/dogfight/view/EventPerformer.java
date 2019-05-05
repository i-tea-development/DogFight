package source.jpu.dogfight.view;

import java.awt.event.KeyEvent;
import java.io.IOException;

import source.jpu.dogfight.controller.IOrderPerformer;
import source.jpu.dogfight.controller.Order;
import source.jpu.dogfight.controller.UserOrder;
import source.jpu.gameframe.IEventPerformer; 

/**
 * EventPerformer
 */
public class EventPerformer implements IEventPerformer {

    private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer) {

	}

	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	@Override
	public void eventPerform(KeyEvent keyCode) throws IOException {
		if (keyCode != null) {
			this.getOrderPerformer().orderPerform(this.keyCodeToUserOrder(keyCode.getKeyCode()));
		}
	}

	private UserOrder keyCodeToUserOrder(int keyCode) {
		UserOrder userOrder;
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			userOrder = new UserOrder(1, Order.RIGHT);
			break;
		case KeyEvent.VK_LEFT:
			userOrder = new UserOrder(1, Order.RIGHT);
			break;
		case KeyEvent.VK_UP:
			userOrder = new UserOrder(1, Order.UP);
			break;
		case KeyEvent.VK_DOWN:
			userOrder = new UserOrder(1, Order.DOWN);
			break;
		case KeyEvent.VK_SPACE:
			userOrder = new UserOrder(1, Order.SHOOT);
			break;
		case KeyEvent.VK_D:
			userOrder = new UserOrder(0, Order.RIGHT);
			break;
		case KeyEvent.VK_Z:
			userOrder = new UserOrder(0, Order.UP);
			break;
		case KeyEvent.VK_S:
			userOrder = new UserOrder(0, Order.DOWN);
			break;
		case KeyEvent.VK_F:
			userOrder = new UserOrder(0, Order.SHOOT);
			break;
		default:
			userOrder = new UserOrder(0, Order.NOP);
			break;
		}
		return userOrder;
	}
}