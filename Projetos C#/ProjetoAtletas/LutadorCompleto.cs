namespace ProjetoAtletas
{
    class LutadorCompleto : Capoeirista, Jiujiteiro, Kickboxer, Pugilista
    {
        public string DarChuteGiratorio()
        {
            return "Lutador aplicando chute giratorio \n";
        }

        public string DarJoelhada()
        {
            return "Lutador aplicando joelhada \n";
        }

        public string DarSoco()
        {
            return "Lutador aplicando soco \n";
        }

        public string Derrubar()
        {
            return "Lutador derrubando \n";
        }

        public string Imobilizar()
        {
            return "Lutador imobilizando \n";
        }
    }
}