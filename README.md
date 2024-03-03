# Exercício de Processos - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-000?style=for-the-badge&logo=linux&logoColor=FCC624)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)

</div>

## Sobre o projeto
Este é o exercício 1, da lista de exercícios de processos em Windows e Linux, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.

## Índice
=================
<!--ts-->
* [Título](#exercício-de-processos---sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercício 1](#exercício-1)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercício 1
* Criar em Eclipse, um novo Java Project com uma classe chamada RedesController.java no
package controller e uma classe Main.java no package view.

* A classe RedesController.java deve ter 3 métodos:
1) O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo
privado)
2) O segundo, chamado ip, que verifica o Sistema Operacional e, de acordo com o S.O., faz a
chamada de configuração de IP.<br>A leitura do processo chamado deve verificar cada linha e, imprimir, apenas, o nome do
adaptador de rede e o IPv4, portanto, adaptadores sem IPv4 não devem ser mostrados
3) O terceiro, chamado ping, que verifica o Sistema Operacional e, de acordo com o S.O. e, faz a
chamada de ping em IPv4 com 10 iterações.<br>
A leitura do processo chamado deve verificar as linhas de saída e exibir, apenas, o tempo médio
do ping. O teste de ping deve ser feito com a URL `www.google.com.br` <br>
A Classe Main.java deve dar as opções de chamadas do método ip ou do método ping com
JOptionPane e, dependendo da escolha, instanciar a Classe RedesController.java e chamar o
método escolhido. A opção de finalizar a aplicação também deve estar disponível.

* Dicas:
1) Para validar o Sistema Operacional, utilizar a operação contains;
2) Para validar as saídas e executar o que foi pedido, utiizar a operação Split;
3) Processo de chamada de configuração de IP:
Windows: IPCONFIG
Linux: ifconfig ou ip addr
4) Processo de chamada de PING com 10 iterações, em IPv4 para www.google.com.br
Windows: ping -4 -n 10 www.google.com.br
Linux: ping -4 -c 10 www.google.com.br


## Status do projeto
✅ Finalizado ✅

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)
  - [BufferedWriter](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedWriter.html)
  - [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)
  - [InputStreamReader](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html)

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, Leandro Colevati, por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
