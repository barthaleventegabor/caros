import java.util.ArrayList;

public class Solution {
    static ArrayList<Car> carList = Store.readCsvFile2();;

    public static void sumSalary() {
        Double sum = 0d;
        for (Car car : carList) {
            sum += car.getPrice();
        }
        System.out.printf("Összeg: %.2f\n", sum);

    }

    public static void countLada() {
        Integer counter = 0;
        for (Car car : carList) {
            if (car.getBrand().equals("Lada")) {
                counter += 1;
            }
        }
        System.out.printf("Ladák száma: %d\n", counter);
    }

    public static void conatinCitroen() {
        String find = "Citroen";
        int n = carList.size();
        int i = 0;
        while (i < n && (!carList.get(i).getBrand().equals(find))) {
            i++;
        }
        if (i < n) {
            System.out.println("Van " + find);
        } else {
            System.out.println("Nincs " + find);
        }
    }

    public static void placeCitroen() {
        String find = "Citroen";

        int i = 0;
        while ((!carList.get(i).getBrand().equals(find))) {
            i++;
        }
        System.out.println("Hányadik helyen: " + (i + 1));

    }

    public static void conatinLada() {
        String find = "Lada";
        int n = carList.size();
        int i = 0;
        while (i < n && (!carList.get(i).getBrand().equals(find))) {
            i++;
        }
        if (i < n) {
            System.out.println("Van " + find + " Indexe: " + i);
        } else {
            System.out.println("Nincs " + find);
        }
    }

    public static void ladaToOtherList() {
        ArrayList<Car> ladaList = new ArrayList<>();

        for (Car car : carList) {
            if (car.getBrand().equals("Lada")) {
                ladaList.add(car);
            }
        }

    }

    public static void selectThings() {
        ArrayList<Car> expensiveList = new ArrayList<>();
        ArrayList<Car> cheapList = new ArrayList<>();
        // int j = 0;
        // int k = 0;
        for (Car car : carList) {
            if (car.getPrice() >= 1000) {
                expensiveList.add(car);
            } else {
                cheapList.add(car);
            }
        }
        System.out.println("Drágák: ");
        writeList(expensiveList);
        System.out.println("Olcsók: ");

        writeList(cheapList);
    }

    public static void writeList(ArrayList<Car> list) {
        for (Car car : list) {
            System.out.println(car.getPlate());
            System.out.println(car.getBrand());
            System.out.println(car.getPrice());
        }
    }
}
