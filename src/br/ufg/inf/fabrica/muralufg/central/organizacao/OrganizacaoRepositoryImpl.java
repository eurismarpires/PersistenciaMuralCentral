package br.ufg.inf.fabrica.muralufg.central.organizacao;

import java.util.Set;

/**
 * Created by Eurismar on 27/10/2014.
 */
public class OrganizacaoRepositoryImpl implements OrganizacaoRepository {
    /**
     * Obtém todos os dispositivos (ids) dos alunos e do
     * docente responsável por uma dada turma.
     *
     * @param turma A turma da qual os ids dos dispositivos serão
     *              obtidos.
     * @return Conjunto de todos os ids disponíveis dos usuários,
     * alunos e docente responsável, da turma em questão.
     */
    @Override
    public Set<String> dispositivos(Turma turma) {
        return null;
    }

    /**
     * Obtém os dispositivos cadastrados (ids) dos alunos da
     * turma.
     *
     * @param turma
     * @return
     */
    @Override
    public Set<String> dispositivosAlunos(Turma turma) {
        return null;
    }

    /**
     * Obtém o conjunto de alunos de uma turma.
     *
     * @param turma
     * @return
     */
    @Override
    public Set<Aluno> alunos(Turma turma) {
        return null;
    }

    /**
     * Obtém os docentes
     * responsáveis pela turma.
     *
     * @param turma
     * @return
     */
    @Override
    public Set<Docente> docentes(Turma turma) {
        return null;
    }

    /**
     * Obtém os dispositivos cadastrados (ids) dos
     * docentes do curso.
     *
     * @param curso
     * @return
     */
    @Override
    public Set<String> docentes(Curso curso) {
        return null;
    }

    /**
     * Obtém os dispositivos cadastrados (ids) dos docentes
     * lotados no órgão em questão.
     *
     * @param orgao
     * @return
     */
    @Override
    public Set<String> docentes(Orgao orgao) {
        return null;
    }

    /**
     * Obtém os dispositivos cadastrados (ids) dos técnicos
     * do órgão.
     *
     * @param orgao
     * @return
     */
    @Override
    public Set<String> tecnicos(Orgao orgao) {
        return null;
    }

    /**
     * Obtém as turmas de uma dada disciplina.
     *
     * @param disciplina
     * @return
     */
    @Override
    public Set<Turma> turmas(Disciplina disciplina) {
        return null;
    }

    /**
     * Obtém o conjunto de disciplinas de um dado curso.
     *
     * @param curso
     * @return
     */
    @Override
    public Set<Disciplina> disciplinas(Curso curso) {
        return null;
    }

    /**
     * Obtém o conjunto de cursos oferecidos por um órgão.
     *
     * @param orgao
     * @return
     */
    @Override
    public Set<Curso> cursos(Orgao orgao) {
        return null;
    }
}
