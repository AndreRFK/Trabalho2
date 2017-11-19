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
abstract class ProfessorMes extends Professor {
    protected String cursoMestrado;

    public ProfessorMes(int cod, String name) {
        super(cod, name);
    }

    public String getCursoMestrado() {
        return cursoMestrado;
    }

    public void setCursoMestrado(String cursoMestrado) {
        this.cursoMestrado = cursoMestrado;
    }
}
