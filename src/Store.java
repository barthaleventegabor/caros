import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static ArrayList<Car> readCsvFile() {
        ArrayList<Car> carList = null;
        try {
            carList = tryReadCsvFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());

        }
        return carList;
    }

    public static ArrayList<Car> tryReadCsvFile() throws FileNotFoundException {
        ArrayList<Car> carList = new ArrayList<>();

        File file = new File("cars.csv");
        try (Scanner scanner = new Scanner(file)) {
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineSp = line.split(",");
                Car car = new Car();

                car.setId(Integer.parseInt(lineSp[0]));
                car.setPlate(lineSp[1]);
                car.setBrand(lineSp[2]);
                car.setYear(Integer.parseInt(lineSp[3]));
                car.setPrice(Double.parseDouble(lineSp[4]));

                carList.add(car);
            }
        }
        return carList;

    }

    public static ArrayList<Car> readCsvFile2() {
        ArrayList<Car> carList = null;
        try {
            carList = tryReadCsvFile2();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());

        }
        return carList;
    }

    public static ArrayList<Car> tryReadCsvFile2() throws FileNotFoundException {
        ArrayList<Car> carList = new ArrayList<>();

        File file = new File("cars2.csv");
        try (Scanner scanner = new Scanner(file)) {
            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] lineSp = line.split(",");
                Car car = new Car();

                car.setId(Integer.parseInt(lineSp[0].trim()));
                car.setPlate(lineSp[1].replace("\"", "").trim());
                car.setBrand(lineSp[2].replace("\"", "").trim());
                car.setYear(Integer.parseInt(lineSp[3].trim()));
                car.setPrice(Double.parseDouble(lineSp[4]));

                carList.add(car);
            }
        }
        return carList;

    }
}