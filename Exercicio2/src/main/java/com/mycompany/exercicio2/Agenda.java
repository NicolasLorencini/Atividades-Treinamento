/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList();

    public void addContato(Contato aContato) {
        contatos.add(aContato);

    }

    public Contato getContato(String nome) {
        Contato contatoSelecionado = new Contato();
        for (Contato contato : contatos) {
            if (contato.nome.equals(nome)) {
                contatos.remove(contato);
                contatoSelecionado = contato;
                System.out.println("Contato deletado");
            } else {
                System.out.println("Não achei o contato");
            }

        }
        return contatoSelecionado;
    }

    public void deleteContato(String nome) {
        for (Contato elementoDoArray : contatos) {
            if (elementoDoArray.nome.equals(nome)) {
                contatos.remove(elementoDoArray);
                System.out.println("Contato deletado");
            } else {
                System.out.println("Não achei o contato");
            }
        }
    }

    public void getTodosContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome:  " + contato.nome);
            System.out.println("Email " + contato.email);
            System.out.println("-----------------------");
        }
    }
}
