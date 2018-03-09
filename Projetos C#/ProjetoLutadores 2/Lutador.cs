namespace ProjetoLutadores
{
    abstract class Lutador {
        public void Aquecer() => System.Console.WriteLine("Lutador aquecendo \n");

        public abstract string Chutar();
        public abstract string DarSoco();
        public abstract string Derrubar();
        public abstract string AplciarChave();
    }
}