package Control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Idade {
    private Date dataNascimento;
    private int idade;

    public static void main(String[] args) throws ParseException {
        //Instância de um objeto da classe Idade
        Idade idade = new Idade();

        idade.espaçoVazio();
        idade.formatarDataNascimento(lerNascimentoString());
        idade.calcularIdade();
        idade.imprimirIdade();
        idade.verificarIdade();
    }

    private static String lerNascimentoString() {
        //Lê e armazena data de nascimento
        String dataNascimentoString;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        dataNascimentoString = ler.nextLine();
        ler.close();

        return dataNascimentoString;
    }

    private void formatarDataNascimento(String dataNascimento) throws ParseException {
        //Converte para Date alguma data (em String) informada pelo usuário
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = formatarData.parse(dataNascimento);
    }

    private void calcularIdade() {
        //Armazena as partes da data de nascimento para viabilizar o cálculo da idade
        int diaAtual, mesAtual, anoAtual;
        int diaNascimento, mesNascimento, anoNascimento;

        //Pega data atual do sistema
        Date hoje = new Date();

        Calendar calendario = Calendar.getInstance();

        //Passa data de hoje no calendário
        calendario.setTime(hoje);
        diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
        mesAtual = calendario.get(Calendar.MONTH) + 1;
        anoAtual = calendario.get(Calendar.YEAR);        

        calendario.setTime(this.dataNascimento);
        diaNascimento = calendario.get(Calendar.DAY_OF_MONTH);
        mesNascimento = calendario.get(Calendar.MONTH) + 1;
        anoNascimento = calendario.get(Calendar.YEAR);

        //Calcula idade
        this.idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento) {
            this.idade--;
        } else if (mesAtual < mesNascimento && diaAtual < diaNascimento) {
            this.idade--;
        }

        //Tratamento para evitar resultados negativos, pois não existe idade negativa
        if (this.idade < 0) {
            this.idade = 0;
        }
    }

    private void imprimirIdade() {
        // Exibe a idade
        System.out.println("\nSua idade é " + idade + " anos.");
    }

    private boolean verificarIdade() {
        //Verifica se a pessoa é elegível para efetuar cadastro com base em sua idade
        boolean idadeCorreta = false;

        if (idade >= 18 && idade <= 120) {
            System.out.println("Você está apto a prosseguir com o cadastro.");
            idadeCorreta = true;
        } else if (idade < 18) {
            System.out.println("Você é menor de idade, portanto não está apto a prosseguir com o cadastro.");
        } else if (idade > 120) {
            System.out.println("Sua idade é considerada extrema (120 anos ou mais), portanto não está apto a prosseguir com o cadastro.");
        }

        return idadeCorreta;
    }

    private void espaçoVazio() {
        System.out.println("");
    }
}