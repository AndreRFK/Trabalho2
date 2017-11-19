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
public class Teste {
    public static void main(String[] args) {  
        Aluno a1 = new Aluno();  
        Aluno a2 = new Aluno();  
        a1.setNome("João");  
        a2.setNome("José");  
        Vetor lista = new Vetor();  
        lista.adiciona(a1);  
        lista.adiciona(a2);  
   } 

    private static class Aluno {

        public Aluno() {
        }

        private void setNome(String joão) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Vetor {

        public Vetor() {
        }

        private void adiciona(Aluno a1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
