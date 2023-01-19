package behavioral.null_object;

public class RealCustomer extends AbstractCustomer{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
