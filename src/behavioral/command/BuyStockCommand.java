package behavioral.command;

public class BuyStockCommand implements OrderCommand{

    private Coin coin;

    public BuyStockCommand(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void execute() {
        coin.buy();
    }
}
