package structural.facade.caching;

public class RedisCaching implements ICaching{
    @Override
    public void cache(String data) {
        System.out.println("Redis cached: " + data);
    }
}
