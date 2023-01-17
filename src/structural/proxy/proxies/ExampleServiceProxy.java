package structural.proxy.proxies;

import structural.proxy.services.ExampleService;
import structural.proxy.services.IExampleService;

public class ExampleServiceProxy implements IExampleService {
    private IExampleService exampleService;
    // Servisteki istekte => parametre 1 gönderildi => cevap 10 geldi 1,10
    private int data = -1;

    public ExampleServiceProxy() {
        this.exampleService = new ExampleService();
    }

    @Override
    public int getData(int number) {
        // Proxy davranışı..
        if(data == -1){
            data = exampleService.getData(number);
        }
        return data;
    }
}
