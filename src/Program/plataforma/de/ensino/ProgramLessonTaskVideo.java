package Program.plataforma.de.ensino;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.plataforma.de.ensino.Lesson;
import entities.plataforma.de.ensino.Task;
import entities.plataforma.de.ensino.Video;

public class ProgramLessonTaskVideo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Lesson>list = new ArrayList <>();
		
		System.out.print("Quantas aula tem o curso? ");
		int qtd = sc.nextInt();
		System.out.println("");
		
		for(int i = 0; i < qtd; i++) {
			
			System.out.println("Dados da " + (i+1) + "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char tipoConteudo = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.next();
			String title = sc.nextLine();
			
			if(tipoConteudo == 'c') {
				
				System.out.print("URL do video: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundo: ");
				int seconds = sc.nextInt();
				//Lesson lesson = new Video(title, url, seconds);
				list.add( new Video(title, url, seconds));
			}else {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				//Lesson lesson = new Task(title, description, questionCount);
				list.add(new Task(title, description, questionCount));
			}
			System.out.println("");
			
		}
		
		System.out.println("");
		
		int sum = 0;
		for(Lesson lesson:list) {
			
			sum += lesson.duration();
			
		}
		System.out.println("DURAÇÂO TOTAL DO CURSO = " + sum + " SEGUNDOS");
		sc.close();

	}

}
