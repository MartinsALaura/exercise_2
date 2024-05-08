import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Brandamente Brasil", "1585258", 5, 9);
        Aluno aluno2 = new Aluno("Radigunda Cercená", "2254879", 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo", "0085994", 7, 1);

        aluno1.imprimeInfo();
        aluno2.imprimeInfo();
        aluno3.imprimeInfo();

        aluno2.setNotaGrauA(9);
        System.out.println("\nMédia final de Radigunda após alteração: " + aluno2.calculaMediaFinal());

        System.out.println("Matricula de Vitimado: " + aluno3.getMatricula());

        aluno1.setMatricula("1585228");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe nova nota de grau b para radigunda: ");
        aluno2.setNotaGrauB(scanner.nextDouble());
    }
}
