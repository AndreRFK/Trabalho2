/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioCadastro;

/**
 *
 * @author andre
 */
public class ClienteEX extends Cliente {
  private double DiscontoFixo; 

    public double getDiscontoFixo() {
        return DiscontoFixo;
    }

    public void setDiscontoFixo(double DiscontoFixo) {
        this.DiscontoFixo = DiscontoFixo;
    }
    public ClienteEX(String ende, int tel) {
        super(ende, tel);
    }
}
