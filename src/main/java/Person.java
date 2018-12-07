public class Person {

    private String vorname;
    private String nachname;
    private static int instanzen = 0;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;

        instanzen++;
    }

    //region Getter and Setter
    public static int getInstanzen() {
        return instanzen;
    }

    public static void setInstanzen(int instanzen) {
        Person.instanzen = instanzen;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    //endregion
}
