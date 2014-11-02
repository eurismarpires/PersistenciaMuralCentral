package br.ufg.inf.fabrica.muralufg.central.resource;

import br.ufg.inf.fabrica.muralufg.central.organizacao.Aluno;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aluno")
public class AlunoConverter {
    private Aluno entity = null;

    public AlunoConverter() {
        entity = new Aluno();
    }

    public AlunoConverter(Aluno entity) {
        this.entity = entity;
    }
    @XmlElement
    public String getNome() {
        return entity.getNome();
    }

    @XmlElement
    public String getMatricula() {
        return entity.getMatricula();
    }
}
