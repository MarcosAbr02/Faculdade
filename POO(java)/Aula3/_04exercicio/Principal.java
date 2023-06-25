package _04exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	 public static void main(String[] args) {
	        // Criação do HashMap
	        Map<String, LocalDate> aniversario = new HashMap<>();

	        // Adição dos aniversários ao mapa
	        aniversario.put("Alice", LocalDate.of(1990, 5, 15));
	        aniversario.put("Bob", LocalDate.of(1985, 8, 27));
	        aniversario.put("Carol", LocalDate.of(1993, 12, 10));
	        
	        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	        // Impressão dos aniversários usando um loop
	        for (Map.Entry<String, LocalDate> entry : aniversario.entrySet()) {
	            String name = entry.getKey();
	            LocalDate birthday = entry.getValue();
	            System.out.println(name + ": " + birthday.format(formatador));
	        }
	    }
	}