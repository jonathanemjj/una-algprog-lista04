Este repositório reúne a resolução de uma série de exercícios cujo foco está no raciocínio lógico, no uso de estruturas condicionais e na construção de caminhos diferentes dentro do código dependendo da entrada do usuário.

🚀 1. Objetivo

Demonstrar domínio de estruturas de controle utilizando decisões condicionais (if, elif, else), cálculos básicos e validações lógicas aplicadas a diferentes cenários.

📝 2. Resumo dos Exercícios

🟦 Exercício 1 — Validador de Maioridade

Contexto: Um site precisa bloquear menores de idade.

Tarefa: Ler o ano de nascimento e calcular a idade.

Se idade ≥ 18 → "Acesso Permitido"

Senão → "Acesso Negado: Usuário menor de idade"

🟦 Exercício 2 — Radar de Velocidade

Contexto: Uma prefeitura deseja automatizar multas.

Tarefa: Ler a velocidade de um carro.

Se velocidade > 80:

Multa de R$ 7,00 por km acima do limite

Exibir o valor da multa

Se velocidade ≤ 80 → "Boa viagem!"

🟦 Exercício 3 — Sistema de Aprovação Escolar

Contexto: Uma escola precisa avaliar um aluno.

Tarefa: Calcular a média entre duas notas.

Média ≥ 7.0 → Aprovado

🟦 Exercício 4 — Par ou Ímpar?

Contexto: Um jogo precisa identificar o tipo de número.

Tarefa: Ler um número inteiro e dizer se ele é PAR ou ÍMPAR.

Dica: utilizar o operador de resto da divisão %.

Exemplo: numero % 2 == 0 significa que ele é par.

🟦 Exercício 5 — Analisador de Triângulos

Contexto: Um software de engenharia deve classificar triângulos.

Tarefa: Ler 3 lados de um triângulo.

Primeiro, verificar se os lados podem formar um triângulo (cada lado precisa ser menor que a soma dos outros dois).

Se formar:

Equilátero → todos os lados iguais

Isósceles → dois lados iguais

Escaleno → todos os lados diferentes

Média entre 5.0 e 6.9 → Recuperação

Média < 5.0 → Reprovado

🧩 3. O que são Operadores Lógicos (E, OU, NÃO)?

Operadores lógicos permitem combinar condições dentro de um único se, deixando o código mais poderoso, claro e eficiente.

🔹 E

Usado quando todas as condições precisam ser verdadeiras.

Exemplo:

se (valorUm == valorDois e valorDois == valorTres) 
🔹 OU

Usado quando pelo menos uma condição deve ser verdadeira.

Exemplo:

se (valorUm == valorDois ou valorUm == valorTres ou valorDois == valorTres)
🔹 NAO

Nega uma condição, transformando True em False e vice‑versa.

Exemplo:

se(idade >= 18){
  escreva(" Acesso Permitido")
}
**senao**
  escreva(" Acesso Negado: Usuário menor de idade.")
✔ Como esses operadores ajudam?

Eles permitem criar verificações mais complexas em um unico se

se(idade >= 18){
  escreva(" Acesso Permitido")
}
senao
  escreva(" Acesso Negado: Usuário menor de idade.")

  
📦 4. Conclusão

Este projeto demonstra o uso de condições, operadores lógicos e estruturação de lógica de decisão, fundamentais para qualquer aplicação que lide com entrada de dados e regras de negócio.
