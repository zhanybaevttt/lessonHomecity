import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<City> tashSet=new TreeSet<>(City.cityComparator);
        tashSet.add(new City(6,"Tokyo"));
        tashSet.add(new City(2,"London"));
        tashSet.add(new City(7,"Nyu York"));
        tashSet.add(new City(5,"Moscow"));
        tashSet.add(new City(9,"Bishkek"));
        tashSet.add(new City(8,"Osh"));





        for (City d:tashSet) {
            if (d.getCode()%2 == 1) {
                System.out.println(d);
            }

        }

    }
}