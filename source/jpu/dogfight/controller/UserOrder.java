package source.jpu.dogfight.controller;

/**
 * UserOrder
 */
public class UserOrder implements IUserOrder{

    private final Integer player;

    private final Order order;

    public UserOrder(final Integer player, final Order order){

        this.player = player;
        this.order = order;
    }

    @Override
    public Order getOrder() {
        return this.order;
    }

    @Override
    public Integer getPlayer() {
        return this.player;
    }
}