/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex14;

/**
 *
 * @author andre
 */
public class PessoaApp {
    public static void main (String [] args){
    Pessoa vitu = new Pessoa() {};
   
    Endereco endereco = new Endereco();
    endereco.setEndereco("Rua 14");
    }

    private static class Endereco {

        public Endereco() {
        }

        private void setEndereco(String rua_14) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
