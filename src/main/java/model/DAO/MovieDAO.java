package model.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import model.entity.CinemaSeats;
import model.entity.Movie;

public class MovieDAO {

    private File archive;
    private File seats;

    public MovieDAO() {
        archive = new File("Movies.txt");
        seats = new File("Seats.txt");
    }

    public boolean saveMovie(Movie m) {
        try (FileWriter fw = new FileWriter(archive, true); BufferedWriter bw = new BufferedWriter(fw)) {
            //Escribir el producto usando el método toCSV y añadimos una nueva linea
            bw.write(m.toCSV());
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to save movie (line 26)", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
      public boolean saveTicket(CinemaSeats m) {
        try (FileWriter fw = new FileWriter(seats, true); BufferedWriter bw = new BufferedWriter(fw)) {
            //Escribir el producto usando el método toCSV y añadimos una nueva linea
            bw.write(m.toCSV());
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to save movie (line 26)", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
// listar Peliculas

    public ArrayList<Movie> moviesList() {
        ArrayList<Movie> list = new ArrayList<>();
        if (!archive.exists()) {
            return list;
        }

        try (FileReader fr = new FileReader(archive); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                //reconstruir el producto desde el texto del archivo
                if (parts.length == 2) {
                    Movie m = new Movie(parts[1], Double.parseDouble(parts[0]));
                    list.add(m);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to list movies (line 53)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    public ArrayList<CinemaSeats> seatList() {
        ArrayList<CinemaSeats> list = new ArrayList<>();
        if (!seats.exists()) {
            return list;
        }

        try (FileReader fr = new FileReader(seats); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                //reconstruir el producto desde el texto del archivo
                if (parts.length == 4) {
                    CinemaSeats c = new CinemaSeats(Integer.parseInt(parts[0]),parts[1],Double.parseDouble(parts[2]),Integer.parseInt(parts[3]));
                    list.add(c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error to list movies (line 93)", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    

    //método auxiliar para buscar una pelicula
    public String searchMovieName(String name) {
        ArrayList<Movie> list = moviesList();
        for (Movie p : list) {
            if (p.getName().equals(name)) {
                return p.getName();
            }
        }
        return null;

    }
    public Movie searchMovie(String name) {
        ArrayList<Movie> list = moviesList();
        for (Movie p : list) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;

    }
     public CinemaSeats searchTicket(int ticketNumber) {
        ArrayList<CinemaSeats> list = seatList();
        for (CinemaSeats c : list) {
            if (c.getTicketNumber() == ticketNumber) {
                return c;
            }
        }
        return null;

    }
}
