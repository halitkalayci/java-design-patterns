package behavioral.iterator;

public class CustomerRepository implements Container{
    public String customers[] = {"Halit","Andaç","Mina","İbrahim","İrem","Candan"};


    @Override
    public Iterator getIterator() {
        return new CustomerIterator();
    }

    private class CustomerIterator implements Iterator{
        int index=0;


        @Override
        public boolean hasNext() {
            // o an bulunan index'ten bir sonraki indexi kontrol et eğer mevcut ise true değil ise false dön..
            if(index < customers.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            // eğer hasNext true ise sonraki elemanı döndür..
            // yoksa null döndür..
            if(this.hasNext()){
                return customers[index++];
            }
            return null;
        }
    }
}
