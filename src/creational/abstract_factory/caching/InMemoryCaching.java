package creational.abstract_factory.caching;

public class InMemoryCaching extends Caching{
    @Override
    public void cache(String data) {
        System.out.println("In Memory Cachelendi: " + data);
    }
}
