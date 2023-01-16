package creational.abstract_factory.caching;

public class RedisCaching extends Caching{
    @Override
    public void cache(String data) {
        System.out.println("Redis cachelendi: " + data);
    }
}
