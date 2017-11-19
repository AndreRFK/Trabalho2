/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex13;

/**
 *
 * @author andre
 */
public class Vetor {
    private Aluno[] alunos = new Aluno[100];    
    public void adiciona(Aluno aluno){    
        for (int i = 0; i < alunos.length; i++) {    
            if(this.alunos[i] == null) {  
               this.alunos[i] = aluno;  
               System.out.println(this.alunos[i].getNome());
               break;
            }   
        }    
    }    

    private static class Aluno {

        public Aluno() {
        }

        private boolean getNome() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
