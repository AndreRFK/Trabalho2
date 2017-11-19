/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex15;

/**
 *
 * @author andre
 */
abstract class ProfessorEs extends Professor {
    protected String cursoEspecializacao;

    public ProfessorEs(int cod, String name) {
        super(cod, name);
    }

    public String getCursoEspecializacao() {
        return cursoEspecializacao;
    }

    public void setCursoEspecializacao(String cursoEspecializacao) {
        this.cursoEspecializacao = cursoEspecializacao;
    }
}
