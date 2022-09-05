import java.text.DecimalFormat;

public class converted {

    public void conversionHeader(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|      Temperaturas passadas       |      Temperatura convertidas      |");
    }
   
    public void conversao(int op, int opOut, double result, double temps) {
        DecimalFormat df = new DecimalFormat("0.##");
        if(op==1){
            if (opOut == 1){
            System.out.println("           " + temps + "   CELSIUS"+"                      "+ df.format(result) + "    CELSIUS");
            }else if (opOut == 2) {
                System.out.println("           " + temps + "   CELSIUS"+"                      "+ df.format(result) + "    FAHRENHEIT");
            }else {
                System.out.println("           " + temps + "   CELSIUS"+"                      "+ df.format(result) + "    KELVIN");
            } 
        }else if(op==2){
            if (opOut == 1){
                System.out.println("           " + temps + "  FAHRENHEIT"+"                   "+  df.format(result) + "  CELSIUS");
                }else if (opOut == 2) {
                    System.out.println("           " + temps + "  FAHRENHEIT"+"                    "+ df.format(result) + "  FAHRENHEIT");
                }else {
                    System.out.println("           " + temps + "  FAHRENHEIT"+"                     "+ df.format(result) + "  KELVIN");
                }  
        }else{
            if (opOut == 1){
                System.out.println("           " + temps + "    KELVIN"+"                    "+df.format(result) + "  CELSIUS");
                }else if (opOut == 2) {
                    System.out.println("           " + temps + "    KELVIN"+"                    "+ df.format(result) + "  FAHRENHEIT");
                }else {
                    System.out.println("           " + temps + "    KELVIN"+"                      "+ df.format(result) + "  KELVIN");
                }  
        }         
        
    }


    public void medHeader(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| Média das temperaturas passadas | Média das Temperaturas convertidas |");
    }

}
