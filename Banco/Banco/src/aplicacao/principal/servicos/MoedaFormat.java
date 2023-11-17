package aplicacao.principal.servicos;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaFormat {
    public static String format(Double value){
        Locale locale = new Locale("pt","BR");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(value);
    }
}
