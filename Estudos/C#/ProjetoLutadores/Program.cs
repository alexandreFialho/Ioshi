using System;
using System.Collections.Generic;

namespace ProjetoLutadores
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Lutador> lutadores = new List<Lutador>();

            lutadores.Add(new Carateca());
            lutadores.Add(new Jiujiteiro());
            lutadores.Add(new Pugilista());

            foreach (var lutador in lutadores)
            {
                lutador.Aquecer();
                System.Console.WriteLine(
                    $"{lutador.Chutar()} \n"+
                    $"{lutador.DarSoco()} \n"+
                    $"{lutador.Derrubar()} \n"+
                    $"{lutador.AplciarChave()} \n"
                );
            }
        }
    }
}
