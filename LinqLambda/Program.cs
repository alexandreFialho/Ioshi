using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LInqLambda
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Conta> lista = new List<Conta>();

            lista.Add(new Conta("Ale", 1000));
            lista.Add(new Conta("joão", 2000));
            lista.Add(new Conta("maria", 1000));
            lista.Add(new Conta("jose", 2000));
            lista.Add(new Conta("jack", 1000));

            // Aqui eu criei uma "List<Conta> filtrados"!
            List<Conta> filtrados = new List<Conta>();

            // Aqui faremos o filtro de forma tradicinal 
            // Utilizando Foreach para Varrer todos os itens da "lista"
            foreach (Conta c in lista)
            {
                if (c.Saldo > 1000)
                {
                    filtrados.Add(c);
                }
            }

            // Quando usamos var não precisamos declarar o seu tipo.
            // Poderiamos dizer var numero = 1 / var texto = "..." / var numeroReal = 2.3 etc.
            // Como declaramos o tipo da "lista" la em cima, aqui nos só reutilizamos. 
            // Utilizando a função Lambda da linguagem criamos uma delcaração simples para fazer o filtro.
            // Atribuimos a lista "filtradas" todos os itens que satifaz a condição de uma vez só.
            // Poupando assim o tempo de processamento.
            var filtradas = lista.Where((Conta c) => { return c.Saldo > 1000; });

            // Simplicado a declaração Lambda
            // No código acima definimos que o argumento da função Lambda é do tipo "Conta"
            // Isso porque a "lista" é do tipo "Conta" porem é redundante.
            // Então podemos fazer assim.
            filtradas = lista.Where(contas => { return contas.Saldo > 1000; });

            // Além disso, quando declaramos a função que retrona apenas um valor
            // Podemos remover as chaves e o return da declaração.
            // Ficando assim.
            filtradas = lista.Where(contas => contas.Saldo > 1000);

            // soma dos saldos de todas as contas
            double saldoTotal = lista.Sum(c => c.Saldo);

            // media do saldo das contas
            double mediaDosSaldos = lista.Average(c => c.Saldo);

            // número de contas que possuem saldo menor do que 2000
            int numero = lista.Count(c => c.Saldo < 2000);

            int menorSaldo = lista.Min(c => c.Saldo );

            double maiorSaldo = lista.Max(c => c.Saldo);

            filtradas = from conta in lista where conta.Saldo < 2000 select conta;

            var resultado = from conta in lista where conta.Saldo > 1000 && conta.Nome != "joão" select new { conta.Nome, conta.Saldo };

        }
    }
}
