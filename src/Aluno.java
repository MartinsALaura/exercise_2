public class Aluno {
    private String nome, matricula;
    private double notaGrauA, notaGrauB;
    
    public Aluno(String nome, String matricula, double notaGrauA, double notaGrauB) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaGrauA = notaGrauA;
        this.notaGrauB = notaGrauB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaGrauA() {
        return notaGrauA;
    }

    public void setNotaGrauA(double notaGrauA) {
        this.notaGrauA = notaGrauA;
    }

    public double getNotaGrauB() {
        return notaGrauB;
    }
    
    public void setNotaGrauB(double notaGrauB) {
        this.notaGrauB = notaGrauB;
    }

    public String calculaMediaFinal() {
        return String.format("%.2f",  (notaGrauA * 0.33) + (notaGrauB * 0.67));
    }

    public void imprimeInfo() {
        System.out.println("_________________________");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota Grau A: " + notaGrauA);
        System.out.println("Nota Grau B: " + notaGrauB);
        System.out.println("Média Final: " + calculaMediaFinal());
    }
}
