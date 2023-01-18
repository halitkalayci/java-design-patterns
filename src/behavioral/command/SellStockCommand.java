package behavioral.command;

public class SellStockCommand implements OrderCommand{

    private Coin coin;

    public SellStockCommand(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void execute() {
        coin.sell();
    }
}
