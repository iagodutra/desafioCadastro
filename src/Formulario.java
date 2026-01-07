package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Formulario {
    File file = new File("C:\\Users\\iagod\\IdeaProjects\\maratona-java\\desafioCadastro\\formulario\\formulario.txt");
    public void IniciarFormulario(){
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("1 - Qual o nome e sobrenome do pet?\n" +
                    "\n" +
                    "2 - Qual o tipo do pet (Cachorro/Gato)?\n" +
                    "\n" +
                    "3 - Qual o sexo do animal?\n" +
                    "\n" +
                    "4 - Qual endereço e bairro que ele foi encontrado?\n" +
                    "\n" +
                    "5 - Qual a idade aproximada do pet?\n" +
                    "\n" +
                    "6 - Qual o peso aproximado do pet?\n" +
                    "\n" +
                    "7 - Qual a raça do pet?");
            bw.newLine();
            bw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void LerFormulario(){
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

