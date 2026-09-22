package Inventario;

public class RandomItem extends Item{

    public RandomItem(String nuevoNombre, float nuevoPeso, String nuevaDescripcion, boolean nuevoAcumulable)
    {
        super(nuevoNombre, nuevoPeso, nuevaDescripcion, nuevoAcumulable, 1);
    }
}
