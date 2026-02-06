
String name;
//    Definieer hier de variabelen


void main(String[] args) {
    printMenu();
    setName();

//        Roep hier de andere methodes aan

    printProfile();
    IO.println("Afsluiten. Tot ziens!");
}

void printMenu() {
    IO.println("======================================");
    IO.println("Welkom bij de profiel app");
    IO.println("Deze app zal het volgende uitvoeren:");
    IO.println(" 1  - Vul naam in");
//        Vul hier het menu aan

}

void printProfile() {
    IO.println();
    IO.println("----- PROFIEL -----");
    IO.println("Naam: " + name);
//        Print hier de andere variabelen

//        Roep de calculateBMI() methode aan.
    IO.println("-------------------");
}

void setName() {
    IO.print("Voer je volledige naam in: ");
    String input = IO.readln().trim();
    name = input;
    IO.println("Naam opgeslagen: " + name);
}


//        Schrijf hier de andere methodes






