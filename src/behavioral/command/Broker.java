package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    // Komutları al
    // Tüm komutları aldığın sırada çalıştır..
    private List<OrderCommand> commands = new ArrayList<OrderCommand>();

    public void addCommand(OrderCommand command){
        commands.add(command);
    }

    public void executeAll(){
        for(OrderCommand command : commands){
            command.execute();
        }
        commands.clear();
    }
}
