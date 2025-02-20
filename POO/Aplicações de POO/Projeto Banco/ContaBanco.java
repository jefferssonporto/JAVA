/* Códito de ContaBanco de POO onde mostra quando abre uma conta e mostra seu status, quando deposita e saca dinheiro com mensagem interativa */

package aula02.aula05;

/**
 *
 * @author Jeferson
 */
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("-------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.tipo);
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }
    
    public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if (t == "CC"){
        this.setSaldo (50);
    }else if(t == "CP") {
        this.saldo = 150;
        this.setSaldo(150);
    }
        System.out.println("Contas aberta com sucesso");
}
    public void fecharConta(){
    if (this.getSaldo() > 0){
        System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
    } else if (this.getSaldo() < 0){
        System.out.println("Conta não pode ser fechada, pois ainda consta débitos");
    } else {
        this.setStatus(false);
        System.out.println("Conta fechada com Sucesso");
    }
}
    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else { 
            System.out.println("Impossível depositar em uma conta fechada!");
        }
}
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        }  else {
                    System.out.println("Impossível sacar de uma conta fechada!");
                }
}
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == CC) {
            v = 12;
        } else if (this.getTipo()=="CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());    
        } else {
            System.out.println("Impossível pagat uma conta fechada");
        }
    }
    
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
}

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
}



