package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.name = "BTC";

        SellStockCommand command = new SellStockCommand(coin);
        BuyStockCommand buyStockCommand = new BuyStockCommand(coin);


        Broker broker = new Broker();
        broker.addCommand(buyStockCommand);
        broker.addCommand(command);
        broker.executeAll();
    }
}
