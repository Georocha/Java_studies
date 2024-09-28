package br.edu.ifs.loja.service;


public class EmailNotificador implements Notificador {
    @Override
    public void notificarCliente(String mensagem) {
        // Lógica para enviar um e-mail
        System.out.println("Notificação enviada por e-mail: " + mensagem);
    }
}
