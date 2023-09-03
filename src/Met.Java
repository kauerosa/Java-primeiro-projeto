public class Met {

public static void main (String [] args) {

    String primeiroNome = "Kauê";
    String segundoNome ="Rosa";
    
    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return " metodo correto" + primeiroNome.concat(" ").concat(segundoNome);
}

}