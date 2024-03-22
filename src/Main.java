import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ 1 UZDUOTIS -----");
        //Tuscias konstruktorius//
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        //Pilnas konstruktorius//

        book1.setTitle("Kaktusas ar pienė");
        book1.setPages(270);
        book1.setReleaseYear(2021);

        book2.setTitle("Tiems, kurie neskaito");
        book2.setPages(240);
        book2.setReleaseYear(2024);

        book3.setTitle("Nebaigti reikalai");
        book3.setPages(320);
        book3.setReleaseYear(2024);

        Book book4 = new Book("Kaktusas ar pienė", 270, 2021);
        Book book5 = new Book("Tiems, kurie neskaito", 240, 2024);
        Book book6 = new Book("Nebaigti reikalai", 320, 2024);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + ", puslapių skaičius: " +  books.get(i).getPages() + ", išleidimo metai: " + books.get(i).getReleaseYear());
        }

        System.out.println("------ 2 UZDUOTIS -----");

        //Tuscias konstruktorius//
        Plant plant1 = new Plant();
        Plant plant2 = new Plant();
        Plant plant3 = new Plant();
        Plant plant4 = new Plant();

        //Pilnas konstruktorius//

        plant1.setPavadinimas("Liepa");
        plant1.setLotyniskasPavadinimas("Tilia");
        plant1.setVienmetis(false);
        plant1.setZemynas("Europa");
        plant1.setSuaugusioAugaloAukstisMetrais(50);
        plant1.setArValgomas(true);

        plant2.setPavadinimas("Vyšnia");
        plant2.setLotyniskasPavadinimas("Cerasus");
        plant2.setVienmetis(false);
        plant2.setZemynas("Rytų Azija");
        plant2.setSuaugusioAugaloAukstisMetrais(6);
        plant2.setArValgomas(true);

        plant3.setPavadinimas("Agurkas");
        plant3.setLotyniskasPavadinimas("Cucumis");
        plant3.setVienmetis(true);
        plant3.setZemynas("Europa");
        plant3.setSuaugusioAugaloAukstisMetrais(3);
        plant3.setArValgomas(true);

        plant4.setPavadinimas("Celiozija");
        plant4.setLotyniskasPavadinimas("Celosia");
        plant4.setVienmetis(true);
        plant4.setZemynas("Babos sodas");
        plant4.setSuaugusioAugaloAukstisMetrais(1);
        plant4.setArValgomas(false);

        Plant plant5 = new Plant("Liepa", "Tilia", false, "Europa", 50, true);
        Plant plant6 = new Plant("Vyšnia", "Cerasus", false, "Rytų Azija", 6, true);
        Plant plant7 = new Plant("Agurkas", "Cucumis", true, "Europa", 3, true);
        Plant plant8 = new Plant("Celiozija", "Celosia", true, "Babos sodas", 1, false);

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);

        for (Plant plant : plants) {
            System.out.println(plant.toString());
        }




















































    }
}