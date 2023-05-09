public class Me implements Tourist {

    static int budget = 20000;
    private int koreaairFare;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Korea korea) {

        //Gastos
        budget -= korea.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Korea: ");
        System.out.println("Taena lamig dito tuwing december, sana sa Manila rin");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Maldives maldives) {

        //Gastos
        budget -= maldives.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Maldives: ");
        System.out.println("Puntahan ko magagandang beach sa Maldives");
        checkBudget();
        System.out.println("-------------------------------------------");
    }
    
    public void visit(Boracay boracay) {

        //Gastos
        budget -= boracay.airFare;
        
        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Boracay: ");
        System.out.println("Wohoi swimming, nognog nanaman hahahaha");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Cebu cebu) {

        //Gastos
        budget -= cebu.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Cebu: ");
        System.out.println("always kasing pinupuntahan ng mga k-pop");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Japan japan) {

        //Gastos
        budget -= japan.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa Japan: ");
        System.out.println("Fave place na gusto kong puntahan");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Switzerland switzerland) {

        //Gastos
        budget -= switzerland.airFare;

        // Define your visit
        System.out.println("-------------------------------------------");
        System.out.print("Pumunta sa switzerland: ");
        System.out.println("I love Switzerland especially their quiet place");
        checkBudget();
        System.out.println("Wala na kong pera aguy");
        System.out.println("-------------------------------------------");

    }

    public void checkBudget() {

        System.out.println("my budget is " + budget);
    }

}
