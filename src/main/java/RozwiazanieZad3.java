import entity.*;

public class RozwiazanieZad3 {

    public static void main(String[] args) {
        DAO dao = new DAO();
        Adres adres1 = new Adres("Gdanska", "2", "13", "80-131", "Gdansk");
        Adres adres2 = new Adres("Dluga", "21", "6", "80-561", "Gdansk");
        Adres adres3 = new Adres("Wiejska", "2a", "23", "86-541", "Sopot");
        Adres adres4 = new Adres("Polnocna", "5", "3", "83-131", "Gdynia");
        Adres adres5 = new Adres("Grunwaldzka", "3", "16", "80-125", "Rewa");

        Klient klient1 = new Klient("Jan", "Niezbedny", "123456789");
        Klient klient2 = new Klient("Adam", "Nowy", "123456781");
        Klient klient3 = new Klient("Pawel", "Adamski", "123456782");
        Klient klient4 = new Klient("Anna", "Kowalska", "123456222");
        Klient klient5 = new Klient("Kasia", "Nowak", "123453333");

        KategoriaProduktu kategoria1 = new KategoriaProduktu("ksiazka techniczna");
        KategoriaProduktu kategoria2 = new KategoriaProduktu("ksiazka fantastyczna");
        KategoriaProduktu kategoria3 = new KategoriaProduktu("ksiazka sensacyjna");

        Producent producent1 = new Producent("Helion");
        Producent producent2 = new Producent("PWN");

        Produkt produkt1 = new Produkt("ksazka techniczna1", 30.0, producent1, kategoria1);
        Produkt produkt2 = new Produkt("ksazka techniczna2", 130.0, producent1, kategoria1);
        Produkt produkt3 = new Produkt("ksazka techniczna3", 50.0, producent2, kategoria1);
        Produkt produkt4 = new Produkt("ksazka techniczna4", 90.0, producent2, kategoria1);
        Produkt produkt5 = new Produkt("ksazka fantastyczna1", 83.99, producent1, kategoria2);
        Produkt produkt6 = new Produkt("ksazka fantastyczna2", 31.0, producent2, kategoria2);
        Produkt produkt7 = new Produkt("ksazka fantastyczna3", 53.50, producent2, kategoria2);
        Produkt produkt8 = new Produkt("ksazka sensacyjna1", 32.0, producent1, kategoria3);
        Produkt produkt9 = new Produkt("ksazka sensacyjna2", 40.0, producent1, kategoria3);
        Produkt produkt10 = new Produkt("ksazka sensacyjna3", 30.0, producent1, kategoria3);
        adres1.setKlient(klient1);
        adres2.setKlient(klient2);
        adres3.setKlient(klient3);
        adres4.setKlient(klient4);
        adres5.setKlient(klient5);

        klient1.getProdukty().add(produkt1);
        klient1.getProdukty().add(produkt2);
        klient1.getProdukty().add(produkt3);
        klient1.getProdukty().add(produkt4);

        klient2.getProdukty().add(produkt5);
        klient2.getProdukty().add(produkt6);
        klient2.getProdukty().add(produkt7);

        klient3.getProdukty().add(produkt8);
        klient3.getProdukty().add(produkt9);
        klient3.getProdukty().add(produkt10);
        klient3.getProdukty().add(produkt3);

        klient4.getProdukty().add(produkt4);

        klient5.getProdukty().add(produkt1);
        klient5.getProdukty().add(produkt2);
        klient5.getProdukty().add(produkt3);

        dao.newObject(producent1);
        dao.newObject(producent2);

        dao.newObject(kategoria1);
        dao.newObject(kategoria2);
        dao.newObject(kategoria3);

        dao.newObject(produkt1);
        dao.newObject(produkt2);
        dao.newObject(produkt3);
        dao.newObject(produkt4);
        dao.newObject(produkt5);
        dao.newObject(produkt6);
        dao.newObject(produkt7);
        dao.newObject(produkt8);
        dao.newObject(produkt9);
        dao.newObject(produkt10);

        dao.newObject(klient1);
        dao.newObject(klient2);
        dao.newObject(klient3);
        dao.newObject(klient4);
        dao.newObject(klient5);

        dao.newObject(adres1);
        dao.newObject(adres2);
        dao.newObject(adres3);
        dao.newObject(adres4);
        dao.newObject(adres5);

        Producent byId = dao.findById(1L, Producent.class);
        System.out.println("drukowanie: obiekt Producent "+byId.getNazwa());
        System.out.println("drukowanie: obiekt Producent "+byId.toString());

        dao.delete(adres1);

    }
}
