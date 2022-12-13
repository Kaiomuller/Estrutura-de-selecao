import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        System.out.println("Criar objeto");

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int auxPri = leia.nextInt();
        System.out.println("Digite o segundo numero:");
        int auxSeg = leia.nextInt();
        System.out.println("Digite o terceiro numero:");
        int auxTer = leia.nextInt();

        tresNumerosInteiros t2 = new tresNumerosInteiros(auxPri, auxSeg, auxTer);
        System.out.println("Maior valor:" +t2.getMaior());
        System.out.println("Menor valor:" +t2.getMenor());
        t2.clsssificaOrdemCrescente();

        t2.setPrimeiroNumero(6);
        t2.setSegundoNumero(-13);
        t2.setTerceiroNumero(5);

        System.out.println("Segundo: "+ t2.getSegundoNumero());

        System.out.println("Maior valor:" +t2.getMaior());
        System.out.println("Menor valor:" +t2.getMenor());
        t2.clsssificaOrdemCrescente();
    }
}
