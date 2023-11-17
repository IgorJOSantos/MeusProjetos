package aplicacao.principal.servicos;

public class Menu {
    private String menu = """
                **********************************************
                            BEM VINDO AO MEU BANCO
                **********************************************                            
                O que deseja fazer ?
                
                1 - Saldo
                2 - Saque
                3 - Depósito
                4 - Transferir
                5 - Sair
                """;;
    public String getMenu() {
       return this.menu;
    }
}



























