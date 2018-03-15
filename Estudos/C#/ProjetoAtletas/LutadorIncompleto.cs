namespace ProjetoAtletas
{
    class LutadorIncompleto : Jiujiteiro , Pugilista
    {
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
