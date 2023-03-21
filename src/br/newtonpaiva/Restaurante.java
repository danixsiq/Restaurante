package br.newtonpaiva;
import javax.swing.*;

public class Restaurante {
    public static void main (String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String op = JOptionPane.showInputDialog("Informe o pedido:" + "1-Hamburguer" + "2-Pizza" + "3-Sair");

        if (op.equals("1")) {
            String preco = JOptionPane.showInputDialog("Digite o valor");
            Double preco01 = Double.parseDouble(preco);
            String pergunta = JOptionPane.showInputDialog("Deseja borda?" + "Sim/Não");}


        if (op.equals("sim")) {
            Hamburguer hb = new Hamburguer();
            System.out.println(nome + " " + "O seu pedido ficou no valor de:" + hb.calcular(preco01) );}

        else {
            System.out.println(nome + " " + "O total do seu pedido é:" + preco01 );}


        if (op.equals("2")) {
            String preco = JOptionPane.showInputDialog("Digite um valor:");
            Double preco02 = Double.parseDouble(preco);
            String pergunta = JOptionPane.showInputDialog("Artesanal?" + "Sim/Não");

            if (pergunta.equals("sim")) {
                Pizza p = new Pizza();
                System.out.println(nome + " " + "O seu pedido ficou no valor de:" + p.calcular (preco02) );
            } }

        else {
                System.out.println(nome + " " + "O total do seu pedido é:" + preco02 );
            }


    }   }