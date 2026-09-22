import Inventario.Arma;
import Inventario.Consumible;
import Inventario.Item;
import Inventario.RandomItem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


    List<Item> inventario = new ArrayList<>();

    Consumible item0 = new Consumible("Manzana", 1.5f, "Manzana verde del arbol mistico", true, 1, 3, 64);
    Arma item1 = new Arma("Espada Maestra", 5f, "Espada para combatir a Ganondorf", 1);
    RandomItem item2 = new RandomItem("Diente de leon", 0.1f, "Una carta que pille por ahi", true);
    RandomItem item3 = new RandomItem("Vasija rota", 0.5f, "El florero que le rompí a mi mamá", true);

    inventario.add(item0);
    inventario.add(item1);
    inventario.add(item2);
    inventario.add(item3);

    // Ciclo iterativo for para recorrer el inventario
    for(int i=0; i< inventario.size(); i++)
    {
        System.out.println("ITEM EN INVENTARIO[" + i + "] = " + inventario.get(i).getNombre());
    }
}
