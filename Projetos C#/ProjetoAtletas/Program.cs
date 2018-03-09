using System;
using System.Collections.Generic;

namespace ProjetoAtletas
{
    class Program
    {
        static void Main(string[] args)
        {
            LutadorIncompleto lutadorIncompleto = new LutadorIncompleto();
            System.Console.WriteLine(
                $"{lutadorIncompleto.DarSoco()} "+
                $"{lutadorIncompleto.Derrubar()} "+
                $"{lutadorIncompleto.Imobilizar()} "
            );

            LutadorCompleto lutadorCompleto = new LutadorCompleto();
            System.Console.WriteLine(
                $"{lutadorCompleto.DarChuteGiratorio()} "+
                $"{lutadorCompleto.DarJoelhada()} "+
                $"{lutadorCompleto.DarSoco()} "+
                $"{lutadorCompleto.Derrubar()} "+
                $"{lutadorCompleto.Imobilizar()} "
            );
        }
    }
}
