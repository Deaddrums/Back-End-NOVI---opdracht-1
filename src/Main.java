
String name;
int age;
String email;
String address;
String phone;
double height;
double weight;


void main(String[] args) {
    printMenu();
    setName();
    setAge();
    setEmail();
    setAddress();
    setPhone();
    setHeight();
    setWeight();
    printProfile();
    IO.println("Afsluiten. Tot ziens!");
}

void printMenu() {
    IO.println("======================================");
    IO.println("Welkom bij de profiel app");
    IO.println("Deze app zal het volgende uitvoeren:");
    IO.println(" 1  - Vul naam in");
    IO.println(" 2  - vul leeftijd in (in gehele jaren) ");
    IO.println(" 3  - vul email-adres in ");
    IO.println(" 4  - vul adres en woonplaats in ");
    IO.println(" 5  - vul je telefoon nummer in ");
    IO.println(" 6  - vul je lengte in centimeters in ");
    IO.println(" 7  - vul je gewicht in ");
    IO.println(" 8  - toon profiel ");
}

void printProfile() {
    IO.println();
    IO.println("----- PROFIEL -----");
    IO.println("Naam: " + name);
    IO.println(" Leeftijd: " + age);
    IO.println(" Email: " + email);
    IO.println(" Adres: " + address);
    IO.println(" Telefoonnummer: " + phone);
    IO.println(" Lengte: " + height);
    IO.println(" Gewicht: " + weight);
    calculateBMI();
    IO.println("-------------------");
}

void setName() {
    IO.print("Voer je volledige naam in: ");
    String input = IO.readln().trim();
    name = input;
    IO.println("Naam opgeslagen: " + name);
}

void setAge() {
    IO.print("vul leeftijd in (in gehele jaren) ");
    int input = Integer.parseInt(IO.readln());
    age = input;
    IO.println("Leeftijd opgeslagen: " + age);
}


void setEmail() {
    IO.print("Voer je e-mailadres in: ");
    String input = IO.readln().trim();
    email = input;
    IO.println("E-mail opgeslagen: " + email);
}
//        Schrijf hier de andere methodes

void setAddress() {
    IO.print("Voer je e-mailadres in: ");
    String input = IO.readln().trim();
    address = input;
    IO.println("Adres opgeslagen: " + address);
}

void setPhone() {
    IO.print("Voer je e-mailadres in: ");
    String input = IO.readln().trim();
    phone = input;
    IO.println("Telefoonnummer opgeslagen: " + phone);
}
void setHeight() {
    IO.print("Voer je e-mailadres in: ");
    double input = Double.parseDouble(IO.readln());
    height = input;
    IO.println("Lengte opgeslagen: " + height);
}

void setWeight() {
    IO.print("Voer je e-mailadres in: ");
    double input = Double.parseDouble(IO.readln());
    weight = input;
    IO.println("Lengte opgeslagen: " + weight);

}

void calculateBMI() {
    double BMI = weight / ((height / 100) * (height / 100));
            IO.println("Je BMI is " + BMI);
}



