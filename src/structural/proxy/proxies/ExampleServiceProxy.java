package structural.proxy.proxies;

import structural.proxy.services.ExampleService;
import structural.proxy.services.IExampleService;

import java.util.HashMap;


public class ExampleServiceProxy implements IExampleService {
    private IExampleService exampleService;
    private HashMap<Integer,Integer> datas = new HashMap<Integer,Integer>();

    public ExampleServiceProxy() {
        this.exampleService = new ExampleService();
    }

    @Override
    public int getData(int number) {
        if(!datas.containsKey(number)){
            datas.put(number,exampleService.getData(number));
        }
        return datas.get(number);
    }
}
