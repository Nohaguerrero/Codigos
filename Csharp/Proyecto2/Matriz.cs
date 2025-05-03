string [] Elementos = {"B123","C234","A345","C15","B177","G3003","C235","B179"};

foreach (string Elemento in Elementos)
{
    if (Elemento.StartsWith("B"))
    Console.WriteLine(Elemento);
}


Console.WriteLine(Elementos[3]);