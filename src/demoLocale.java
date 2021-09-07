import java.util.Locale;

public class demoLocale {
    public static void main(String[] args) {

        Locale l1 = new Locale("fr");
        Locale l2 = new Locale("fr", "FR");
        Locale l3 = new Locale("fr", "FR", "WIN");
        Locale l4 = Locale.FRANCE;

        Locale [] tab = new Locale[4];
        tab[0] = l1;
        tab[1] = l2;
        tab[2] = l3;
        tab[3] = l4;

        for(Locale l : tab) {
            displayLocale(l);
        }

        System.out.println(new Locale.Builder().setRegion("BE").setLanguage("fr").build());
        System.out.println("isEqual l2 l4 , expected true: "+l2.equals(l4));
        System.out.println("isEqual l3 l4 , expected false : "+l3.equals(l4));
    }

    public static void displayLocale(Locale locale) {
        System.out.println("getCountry : " +locale.getCountry());
        System.out.println("getDisplayCountry : "+locale.getDisplayCountry());
        System.out.println("getLanguage : " + locale.getLanguage());
        System.out.println("getDisplayLanguage : "+locale.getDisplayLanguage());
        System.out.println("getDisplayName : " + locale.getDisplayName());
        System.out.println("-----------------------------------");
    }
}
