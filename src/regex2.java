import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {


    public static void main(String[] args) {
        Pattern p =Pattern.compile("[789]{1}[0-9]{9}");
        Matcher m = p.matcher("9794864492");
        boolean b = m.matches();
        System.out.println(b);

       // System.out.println(Patten.matches("[789][0-9]"));
    }
}
