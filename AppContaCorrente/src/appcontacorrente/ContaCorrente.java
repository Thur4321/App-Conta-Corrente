
package appcontacorrente;

public class ContaCorrente {
    
    private String nomes;
    
    private float saldo;
    
    private int númeroConta;
    
    public int getNúmeroConta() {
        return númeroConta;
    }

    public void setNúmeroConta(int númeroConta) {
        this.númeroConta = númeroConta;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public ContaCorrente(String nomes, int númeroConta){
        this.nomes = nomes;
        this.númeroConta = númeroConta;
    }
    
    public String dados(){
        return "Número da conta: "+númeroConta
                +"\nNome dos titulares: "+nomes
                +"\nSaldo disponível: R$"+saldo;
    }
    
    public boolean saque(float saque){
        if (saque <= saldo){
            saldo = saldo - saque;
            return true;
        }
        return false;
    }
    
    public void depósito(float depósito) {
        saldo = saldo + depósito;
    }
    
    
}
  
