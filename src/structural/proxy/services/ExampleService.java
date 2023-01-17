package structural.proxy.services;

public class ExampleService implements IExampleService{
    @Override
    public int getData(int number) {
        // Simülasyon: 10 saniyelik bir işlem..
        int total=0;
        for (int i=0; i<number; i++){
            total += i;
            try{
                Thread.sleep(1000);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return total;
    }
}
