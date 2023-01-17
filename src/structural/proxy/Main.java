package structural.proxy;

import structural.proxy.proxies.ExampleServiceProxy;
import structural.proxy.services.ExampleService;
import structural.proxy.services.IExampleService;

public class Main {
    public static void main(String[] args) {
        // Proxy pattern uygulanmadığında..
        IExampleService exampleService = new ExampleServiceProxy();
        System.out.println(exampleService.getData(5));
        System.out.println(exampleService.getData(10));
        System.out.println(exampleService.getData(10));
    }
}
