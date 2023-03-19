/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

/**
 *
 * @author Administrator
 */
public class Exercicio2 {

    public static void main(String[] args) {
       Contato matheus = new Contato();
       Contato lucas = new Contato();
       Contato nicolas = new Contato();
       
        Agenda agenda = new Agenda();
       
       matheus.nome = "Matheus";
       matheus.email = "Matheus@hotmail.com";
       lucas.nome = "Lucas";
       lucas.email = "Lucas@gmail.com";
       nicolas.nome = "Nicolas";
       nicolas.email = "Nicolas@gmail.com";
       
       agenda.addContato(matheus);
       agenda.addContato(lucas);
       agenda.addContato(nicolas);
       
     agenda.getTodosContatos();
       
       Contato contatoSelecionado = agenda.getContato("Lucas");
       System.out.println("Você escolheu o: "+contatoSelecionado.nome);
       System.out.println("Com o email: "+ contatoSelecionado.email);
       
       agenda.deleteContato("Matheus");
       
      agenda.getTodosContatos();
     
       
       
       
       

    }
}
