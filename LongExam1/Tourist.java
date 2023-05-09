interface Tourist {

    int budget = 0;

    void visit();

    void visit(Korea korea);

    void visit(Maldives maldives);

    void visit(Boracay boracay);

    void visit(Cebu Cebu);

    void visit(Japan japan);

    void visit(Switzerland switzerland);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
