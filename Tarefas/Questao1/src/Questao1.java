/*Enunciado
Criar uma classe com uma função main que vai receber um número via args e 
dizer se esse número é par ou impar. O método main deve ter a menor quantidade de linhas possíveis.
*/

public class Questao1 {

    public static void main(String[] args) {
        
        String result = (Double.parseDouble((args[0])) % 2 == 0) ? "Par" : "Impar";
        System.out.println(result);
    }
    
}
