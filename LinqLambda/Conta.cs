using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LInqLambda
{
    public class Conta
    {
        private int saldo;
        private string nome;
       
        public int Saldo { get => saldo; set => saldo = value; }
        public string Nome { get => nome; set => nome = value; }

        public Conta(string nome, int saldo)
        {
            this.saldo = saldo;
            this.nome = nome;
        }
    }
}
