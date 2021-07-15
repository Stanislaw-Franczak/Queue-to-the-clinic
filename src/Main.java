import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Utworzenie kolejki wraz z przykładowymi 2 osobami===========================================
        Queue<Osoba> lista = new ArrayDeque<>();
        lista.add(new Osoba("Kamil", "Kowalski", "Zamorska 1"));
        lista.add(new Osoba("Kasia","Kowalska","Zamorska 12"));

        //Menu Główne ================================================================================
        while(true){
            System.out.println("Przychodnia Ostatnia Szansa");
            System.out.println("1. Zarejestruj nowego pacjenta.");
            System.out.println("2. Wczytaj kolejną osobę z kolejki.");
            System.out.println("3. Zakończ");
            System.out.println("Wybierz, co chcesz zrobić:");
            Scanner scanner = new Scanner(System.in);
            int pomoc = scanner.nextInt();
            
            switch (pomoc){
                case 1:
                    lista.add(Rejestracja());
                    break;
                case 2:
                    if(lista.size() == 0){
                        System.out.println("Nie ma więcej pacjentów.");
                        System.out.println();
                    }
                    else lista.poll().PrzedstawSie();
                    break;
                case 3: theEnd(); break;
                default:
                    System.out.println("Podana opcja nie znajduje się wsród możliwych.");
                    System.out.println("Spróbuj jeszcze raz.");
                    System.out.println();
            }
        }




    }

    //Metoda rejestracji nowego pacjenta ==================================================================
   static Osoba Rejestracja(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj imie: ");
       String imie = scanner.nextLine();
       System.out.println("Podaj nazwisko: ");
       String nazwisko = scanner.nextLine();
       System.out.println("Podaj adres: ");
       String adres = scanner.nextLine();
      return new Osoba(imie,nazwisko,adres);
    }

    //Metoda kończąca działanie programu =====================================================================
    static void theEnd(){
        System.out.println("Do zobaczenia :)");
        System.exit(1);
    }
}
