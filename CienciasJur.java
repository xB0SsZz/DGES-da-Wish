public class CienciasJur extends Curso {

    public CienciasJur(String nome, int num, String uni, int id) {
        super(nome, num, uni, "ciencias juridicas", id);
    }

    @Override
    public void calcMedia(Aluno a) {
        double media = 0.5 * a.getExameA() + 0.5 * a.getNota();
        if (a.getzonaDesfavorecida())
            media += 2;
        if (a.getDeficiencia())
            media += 5;
        super.addCandidato(a, media);
    }
}
