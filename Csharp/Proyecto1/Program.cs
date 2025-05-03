Random numero = new Random();

int roll1 = numero.Next (1, 7); 
int roll2 = numero.Next (1, 7);
int roll3 = numero.Next (1, 7);

int total = roll1 + roll2 + roll3;

Console.WriteLine($"Nuemro Roll: {roll1} + {roll2} + {roll3} = {total}");

if ((roll1 == roll2) || (roll2 == roll3) || (roll1 == roll3))
{
    if ((roll1 == roll2) && (roll2 == roll3))
    {
    Console.WriteLine("Sacaste dobles! +6 bonus al total!");
    total += 6;
    }
    else
    {
    Console.WriteLine("Sacaste dobles! +2 bonus al total!");
    total += 2;
    }
    Console.WriteLine($"Tu total incluye el bonus: {total}");
}
if (total >= 16)
{
    Console.WriteLine("Ganaste!!, un carro nuevo con un total de: "+total);
}
else if (total >= 10)
{
    Console.WriteLine("Ganaste!!, un computador nuevo con un total de: " + total);
}
else if (total == 7)
{
    Console.WriteLine("Ganaste!!, un vieaje con un total de: " + total);
}
else
{
    Console.WriteLine("Lo siento perdiste, ganaste un gato, con un total de: " + total);
}

//--------------------------------------------------------------------------------------------------------


int[] Inventario = { 200, 450, 700, 175, 250 };
int sum = 0;
int Conteo = 0;

foreach (int Grupos in Inventario)
{
    sum += Grupos;
    Conteo ++;
    Console.WriteLine($"Grupo {Conteo} = {Grupos} articulos (Contado total: {sum})");
}

Console.WriteLine($"Tenemos {sum} articulos en inventario.");


//------------------------------------------------------------------------------------------------

string [] Elementos = {"B123","C234","A345","C15","B177","G3003","C235","B179"};

foreach (string Elemento in Elementos)
{
    if (Elemento.StartsWith("B"))
    Console.WriteLine(Elemento);
}


Console.WriteLine(Elementos[3]);