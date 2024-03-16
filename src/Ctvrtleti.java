public class Ctvrtleti {
    public static void main(String[] args) {

        int mesic = 2;
        if (mesic >= 1 && mesic <= 3)
            System.out.println("Je první čtvrtletí.");
        else if (mesic >= 4 && mesic <= 6)
            System.out.println("Je druhé čtvrtletí.");
        else if (mesic >= 7 && mesic <= 9)
            System.out.println("Je třetí čtvrtletí.");
        else if (mesic >= 10 && mesic <= 12)
            System.out.println("Je čtvrté čtvrtletí.");

    }
}