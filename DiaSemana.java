import java.util.ArrayList;
import java.util.Scanner;

public class DiaSemana {


   
    public static void main(String[] args) {


        ArrayList <String> dias = new ArrayList<>();
        dias.add("Domingo");
        dias.add("segunda-feira");
        dias.add("terça-feira");
        dias.add("quarta-feira");
        dias.add("quinta- feira");
        dias.add("sexta-feira");
        dias.add("sábado");


        Scanner sc = new Scanner(System.in);
       
        while (true) {
            
            System.out.println("digite o dia da semana");
            int dia = sc.nextInt();

            if (dia == 0) {
                System.out.println("O programa está sendo encerrado...");
                break;
                
            }

            else if (dia >=1 && dia <= 7) {
                System.out.println( "o dia escolhido foi" + dias.get(dia - 1));
                
            }
            else{
                System.out.println(" numero invalido");
            }
        }

        
    }
    
}