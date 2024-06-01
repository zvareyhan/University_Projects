package pl.vistula.multithreads;




public class ytyuj {
    private String surname;
    private String firstName;
    private String street;
    private String zipCode;
    private String city;

    // Method to initialize the fields
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        surname = scanner.nextLine();
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter street:");
        street = scanner.nextLine();
        System.out.println("Enter zip code:");
        zipCode = scanner.nextLine();
        System.out.println("Enter city:");
        city = scanner.nextLine();
    }

    // Method to print the details
    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        ytyuj person = new ytyuj();
        person.initialize();
        System.out.println("Details Entered:");
        person.print();
    }
}

