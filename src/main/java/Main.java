public class Main {
    public static void main(String[] args) {

        Person[] personen = new Person[10];

        for (int i = 0; i < 10; i++) {
            personen[i] = new Person("Lukas", "Starka");
        }

        System.out.print("Es existieren " + Person.getInstanzen() + " Instanzen der Klasse Person.");

    }
}
