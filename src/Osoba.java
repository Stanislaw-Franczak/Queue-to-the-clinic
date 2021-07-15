import java.util.Arrays;
import java.util.Random;

public class Osoba {

    //Konstruktor ============================================
    public Osoba(String imie, String nazwisko, String adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = setWiek();
        this.pesel = setPesel();
        isPelnoletnia();

    }

    //Zmienne "tworzące" daną osobę===========================
    long pesel;
    String imie;
    String nazwisko;
    int wiek;
    String pelnoletnia;
    String adres;

    //Prosta funkcja ustalająca pełnoletniość==================
    String isPelnoletnia(){
        if(wiek >= 18 ){
            return pelnoletnia = "Ta osoba jest pełnoletnia";
        }
        else return pelnoletnia = "Ta osoba nie jest pełnoletnia";
    }

    //Metoda przedstawiania się osoby=========================
    void PrzedstawSie(){
        System.out.println();
        System.out.println("PESEL: " + pesel);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Adres: " + adres);
        System.out.println(this.pelnoletnia);
        System.out.println();

    }

    //Ustalenie PESEL=====================================
    long setPesel(){
        Random random = new Random();
        long[] tablica = new long[12];
        for (int i = 0; i<11;i++){
            int p = random.nextInt(8) + 1;
            tablica[(int) i] = p*(long)Math.pow(10, (double)i);
        }
        this.pesel = Arrays.stream(tablica).sum();
        return pesel;
    }

    //Ustalenie wieku=====================================
    int setWiek(){
        Random random = new Random();
        return wiek = random.nextInt(99)+1;
    }
}

