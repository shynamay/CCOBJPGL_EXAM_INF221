public class Japan implements Locations {

    int airFare = 500;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
