package com.sunbeam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

public class Tester {

	public static int menu(Scanner sc) {

		System.out.println();
		System.out.println("1. Add project");
		System.out.println("2. Display all Projects in Set");
		System.out.println("3. Delete a Project by Id from Set");
		System.out.println("4. Copy All Projects from Set to ArrayList");
		System.out.println("5. Display all Projects from List");
		System.out.println("6. Sort all Projects in List by cost");
		System.out.println("7. Find project with Max team size ");
		System.out.println("8. Count all Projects of \"Java\" technology using Stream API");
		System.out.print("Enter your choice :  ");
		return sc.nextInt();

	}

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);
		Set<Project> projects = loadProjects();
		List<Project> projectList = null;

		projects.add(new Project(1, "Train Reservation System", 5, 5000000, "Java"));
		projects.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
		projects.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
		projects.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
		projects.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
		projects.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));

		projects.forEach(System.out::println);

		while ((choice = menu(sc)) != 0) {

			switch (choice) {
			case 1:
				System.err.println(" id  title teamSize projectCost technology");
				projects.add(new Project(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.next()));
				break;

			case 2:
				projects.forEach(System.out::println);
				break;

			case 3:
				System.err.println("Enter project id ");
				System.out.println("project deleted : "+ projects.remove(new Project(sc.nextInt())));

				break;

			case 4:
                    projectList = new ArrayList<Project>(projects);
				break;

			case 5:
                 for (Project project : projectList) {
					System.out.println(project);
				}
				break;

			case 6:
				projectList.sort((x,y)-> Double.compare(x.projectCost, y.projectCost) );

				break;

			case 7:
				System.out.println(Collections.max(projects, (x,y)->x.teamSize - y.teamSize ));

				break;

			case 8:
			long cnt = projects.stream().filter((e) -> (e.technology.equals("Java"))).count();
			System.out.println("Projects of \\\"Java\\\" technology using Stream API : "+cnt);
				break;

			default:
				System.out.println("Wrong choice ....");
				break;
			}
		}
		
		saveProjects(projects);

	}

	private static Set<Project> loadProjects() {
		try(FileInputStream fis = new FileInputStream("project.db")){
			try(BufferedInputStream bis = new BufferedInputStream(fis)){
				try(ObjectInputStream ois = new ObjectInputStream(bis)){
					Set<Project> projects = (Set<Project>) ois.readObject();
					return projects;
				} 
				
			}
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private static void saveProjects(Set<Project> projects) {
		
		try(FileOutputStream fos = new FileOutputStream("project.db");) {
			try(BufferedOutputStream bos = new BufferedOutputStream(fos)){
				try(ObjectOutputStream oos = new ObjectOutputStream(bos)){
					oos.writeObject(projects);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
