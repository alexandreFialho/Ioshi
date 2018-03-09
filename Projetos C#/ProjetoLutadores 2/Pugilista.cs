namespace ProjetoLutadores
{
    class Pugilista : Lutador
    {
        public override string AplciarChave()
        {
            return "Pugilista não aplica chave";
        }

        public override string Chutar()
        {
            return "Pugilista não aplica chute";
        }

        public override string DarSoco()
        {
            return "Pugilista dando soco";
        }

        public override string Derrubar()
        {
            return "Pugilista não derruba";
        }
    }
}