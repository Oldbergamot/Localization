import java.util.Locale;
import java.util.ResourceBundle;

public class demoResourceBundle {
    public static void main(String[] args) {

        Locale localeFr = Locale.FRANCE;
        Locale localeEn = Locale.ENGLISH;

        ResourceBundle frMessages = ResourceBundle.getBundle("MessagesBundle_fr");
        ResourceBundle enMessages = ResourceBundle.getBundle("MessagesBundle_en", localeEn);
        System.out.println("frMessage");
        System.out.println(frMessages.getString("msg1"));
        System.out.println(frMessages.getString("msg2"));
        System.out.println("enMessage");
        System.out.println(enMessages.getString("msg1"));
        System.out.println(enMessages.getString("msg2"));
    }

}
