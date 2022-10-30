package CONTROLLER;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import MODEL.Cliente;

import MODEL.DAO.ClienteBD;

public class ClienteControl {

    public static void cadastroCliente() {

        String nomeCliente;
        String endCliente;
        int cpfCliente;

        Scanner cadastro = new Scanner(System.in);

        System.out.println("Digite o nome do cliente");
        nomeCliente = cadastro.next();

        System.out.println("Digite o endereço do cliente");
        endCliente = cadastro.next();

        System.out.println("Digite o CPF do cliente");
        cpfCliente = cadastro.nextInt();

        Cliente novoCliente = new Cliente(nomeCliente, endCliente, cpfCliente);

        ClienteBD.clientes.add(novoCliente);


    }
}
