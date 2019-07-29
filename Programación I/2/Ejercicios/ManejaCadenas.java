public class ManejaCadenas{

    public String reverso(String x){
        String reverso = "";
        for (int i = x.length()-1; i >= 0; i--){
            reverso+=x.charAt(i);
        }
        return reverso;
    }

    public String eliminaVocales(String x){
        String erasedVocals = "";
        erasedVocals = x;
        erasedVocals = erasedVocals.replaceAll("[aeiouAEIOU]","");
        return erasedVocals;
    }

    public int cuentaVocales(String x){
        int contador = 0;
        for (int i = 0; i < x.length(); i++){
            String caracter = String.valueOf(x.charAt(i));
            if (caracter.matches("[aeiouAEIOU]")){
                contador++;
            }
        }
        return contador;
    }

    public int cuentaConsonantes(String x){
        int contador = 0;
        for (int i = 0; i < x.length(); i++){
            String caracter = String.valueOf(x.charAt(i));
            if (caracter.matches("[^aeiouAEIOU\\W]")){
                contador++;
            }
        }
        return contador;
    }

    public int cuentaPalabras(String x){
        int contador = 0;
        for (int i = 0; i < x.length(); i++){
            String caracter = String.valueOf(x.charAt(i));
            if (caracter.matches("[\\s]")){
                contador++;
            }
        }
        String ultimochar = String.valueOf(x.charAt(x.length()-1));
        if (ultimochar.matches("[^\\s]")){
        contador++;
        }
        return contador;
    }
}