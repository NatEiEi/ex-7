public class App {
    public static void main(String[] args) {
        Employee Settha = new Employee("Settha", "CEO", 500000);

        Employee Kamphaka = new Employee("Kamphaka", "Head Sales", 300000);
        Settha.addChild(Kamphaka);

        Employee Wiroj = new Employee("Wiroj", "Sales", 150000);
        Kamphaka.addChild(Wiroj);

        Employee Weeranan = new Employee("Weeranan", "Sales", 100000);
        Kamphaka.addChild(Weeranan);

        Employee UngInk = new Employee("UngInk", "Head Marketing", 300000);
        Settha.addChild(UngInk);

        Employee Oak = new Employee("Oak", "Marketing", 200000);
        UngInk.addChild(Oak);

        Employee Aem = new Employee("Aem", "Marketing", 250000);
        UngInk.addChild(Aem);
        
        printAllEmployee(Settha);

    }
    public static void printAllEmployee(Employee ceo) {
        // System.out.println(ceo);  
        ceo.print(0);
    }
}
