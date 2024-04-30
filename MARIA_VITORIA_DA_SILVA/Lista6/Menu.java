package Lista6;

public class Menu {
    public static void main(String[] args) {

        //Objeto Endereço
        Endereco endereco = new Endereco("Centro", "Rua 1", "Cascavel", "Paraná", 123, "Casa 1");
        endereco.presentarLogradouro();

        //Objeto Pedido
        Item novoItem = new Item(12, "Cacto", "Planta", 15.00);
        novoItem.gerarDescricao();

        //Objeto Vendedor
        Vendedor novoVendedor = new Vendedor("Robson", 20, "Myy Plant", 0, null);
        novoVendedor.apresentarse();

        //Objeto Gerente
        Gerente gerente = new Gerente("Marcia", 30, "Myy Plant", 50000, new double[]{20000, 15000, 18000});
        System.out.println(gerente);

        //Objeto Pedido
        Pedido novoPedido = new Pedido(123, 100);
        novoPedido.gerarDescricao();
        novoPedido.processarPedido();

    }
}

