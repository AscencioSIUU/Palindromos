public class Palindromos {
    public String palabra;

    public Palindromos(String palabra) {
        this.palabra = palabra;
    }

    public char[] reverse() {
        char[] reverse = palabra.toCharArray();
        
        // Agarrar la palabra y ponerla al reves
        int j = 0;
        for (int i = palabra.length()-1 ; i >= 0 ; i--) {
            reverse[j] = palabra.charAt(i);
            j++;
        }

        // a diferencia del "Design", usamos una lista de caracteres para hacer la comparativa 
        return reverse;
        
    }

    public boolean isPalindrome() {
        char[] reverse = reverse();
        // a la palabra reserveda 
        for (int i = 0 ; i < palabra.length() ; i++) {
            if (palabra.charAt(i) != reverse[i]) {
                return false;
            }
        }


        return true;

    }

}
