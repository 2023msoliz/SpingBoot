package repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {
	ArrayList<Libro> libros = new ArrayList<Libro>();
	public BaseDatos() {
		libros.add(new Libro(1, "El Secreto del Bosque Encantado", "Ana García", "Libros Mágicos", "26/09/2006 09:45:32", "Fantasía"));
		libros.add(new Libro(1, "El Secreto del Bosque Encantado", "Ana García", "Libros Mágicos", "26/09/2006 09:45:32", "Fantasía"));
        libros.add(new Libro(2, "Código de las Estrellas", "Javier Pérez", "Universo Digital", "26/09/2006 14:21:18", "Ciencia Ficción"));
        libros.add(new Libro(3, "La Última Noche en París", "Marta Ruiz", "Ediciones Románticas", "26/09/2006 17:53:07", "Romance"));
        libros.add(new Libro(4, "Misterios en la Mansión Blackwood", "Carlos Martínez", "Libros de Misterio", "26/09/2006 08:14:56", "Misterio"));
        libros.add(new Libro(5, "Aventuras en el Tiempo Perdido", "Laura Sánchez", "Viajes Temporales", "26/09/2006 11:37:44", "Aventura"));
        libros.add(new Libro(6, "El Código de Da Vinci", "Dan Brown", "Editorial Planeta", "26/09/2006 19:02:29", "Thriller"));
        libros.add(new Libro(7, "El Juego de Ender", "Orson Scott Card", "Ediciones B", "26/09/2006 15:09:12", "Ciencia Ficción"));
        libros.add(new Libro(8, "La Sombra del Viento", "Carlos Ruiz Zafón", "Penguin Random House", "26/09/2006 22:28:55", "Drama"));
        libros.add(new Libro(9, "Harry Potter y la Piedra Filosofal", "J.K. Rowling", "Salamandra", "26/09/2006 07:11:39", "Fantasía"));
        libros.add(new Libro(10, "1984", "George Orwell", "Editorial Debolsillo", "26/09/2006 10:59:20", "Distopía"));
        libros.add(new Libro(11, "Crimen y Castigo", "Fyodor Dostoevsky", "Alianza Editorial", "26/09/2006 16:42:03", "Clásico Literario"));
        libros.add(new Libro(12, "Los Pilares de la Tierra", "Ken Follett", "Plaza & Janés", "26/09/2006 12:35:27", "Histórica"));
        libros.add(new Libro(13, "Matar un Ruiseñor", "Harper Lee", "Editorial Jus", "26/09/2006 20:14:15", "Drama Legal"));
        libros.add(new Libro(14, "El Hobbit", "J.R.R. Tolkien", "Minotauro", "26/09/2006 13:25:48", "Fantasía"));
        libros.add(new Libro(15, "La Odisea", "Homero", "Ediciones Cátedra", "26/09/2006 18:47:09", "Clásico Épico"));
        libros.add(new Libro(16, "El Misterio del Collar Perdido", "Luisa Ramírez", "Ediciones Misterio", "26/09/2006 14:30:15", "Misterio"));
        libros.add(new Libro(17, "El Tesoro de los Piratas", "Carlos González", "Aventuras Editoriales", "26/09/2006 16:55:42", "Aventura"));
        libros.add(new Libro(18, "El Amor en Tiempos Modernos", "María Pérez", "Romance Publishing", "26/09/2006 20:10:07", "Romance"));
	}
	
	public void inserta(Libro libro) {
		libros.add(libro);
;	}
	
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro>libros) {
		this.libros = libros;
	}
	public void borrar(int id) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if (li.getId()==id) {
				it.remove();
				break;
			}
		}
	}
	
	public void modifica(Libro libro) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if(li.getId()==libro.getId()) {
				li.setTitulo(libro.getTitulo());
				li.setAutor(libro.getAutor());
				li.setEditorial(libro.getEditorial());
				li.setFecha(libro.getFecha());
				li.setTematica(libro.getTematica());
				break;
			}
		}
	}
	
	public Libro getLibro(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
