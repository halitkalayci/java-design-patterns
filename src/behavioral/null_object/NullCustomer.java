package behavioral.null_object;

public class NullCustomer extends AbstractCustomer{
    @Override
    public String getName() {
        return "There is no customer at database.";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
