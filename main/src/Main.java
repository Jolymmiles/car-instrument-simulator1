import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int distance = Integer.parseInt(sc.nextLine()), inputDistance = Integer.parseInt(sc.nextLine());
        double fuel = Double.parseDouble(sc.nextLine());
        Odometr od = new Odometr(distance, fuel);
        while (i < 50){
            i++;
            od.move();
        }
    }

}
