namespace ProjetoLutadores
{
    class Carateca : Lutador
    {
        public override string AplciarChave()
        {
            return "Carateca não aplica chave";
        }

        public override string Chutar()
        {
            return "Carateca dando chute";
        }

        public override string DarSoco()
        {
            return "Carateca dando soco";
        }

        public override string Derrubar()
        {
            return "Carateca derrubando";
        }
    }
}