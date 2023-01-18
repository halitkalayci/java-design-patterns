package structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("Halit","Kalaycı",2000);
        Employee headOfSales = new Employee("Helin","Sever",1000);
        Employee headOfSoftware = new Employee("Candan","Sumaktaş",1000);
        Employee softwareDeveloper = new Employee("Andaç","Erdoğmuş",1000);
        Employee softwareDeveloper2 = new Employee("Furkan","Ünlü",1000);
        // n kadar

        CEO.add(headOfSales);
        CEO.add(headOfSoftware);

        headOfSoftware.add(softwareDeveloper);
        headOfSoftware.add(softwareDeveloper2);

        System.out.println("CEO: " + CEO.name);
        for (Employee headEmployee : CEO.subordinates){
            System.out.println("Müdür: " + headEmployee.name);
            for(Employee employee : headEmployee.subordinates)
            {
                System.out.println("Çalışan: "+employee.name);
            }
        }
    }
}
