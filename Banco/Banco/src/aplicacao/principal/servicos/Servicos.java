package aplicacao.principal.servicos;

public class Servicos {

    private Double saldo = 0.0;
    private Double transferir;
    private Double deposito;
    private Double saque;

    public Double getSaldo() {
        return saldo;
    }

    public Double getTransferir() {
        return transferir;
    }

    public void setTransferir(Double transferir) {
        if (transferir > 0 && transferir <= this.saldo){
        this.saldo -= transferir;
            System.out.println("Tranferência realizada com sucesso!");
        }else {
            System.out.println("Valor inválido!");
        }
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
            System.out.println("Depósito realizado com sucesso.");
        }else {
            System.out.println("Valor inválido!");
        }
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        if (saque > 0 && saque <= this.saldo) {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso.");
        }else {
            System.out.println("Valor inválido!");
        }
    }
}