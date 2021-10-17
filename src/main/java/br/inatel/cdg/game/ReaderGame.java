package br.inatel.cdg.game;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderGame {

    List<Game> games = new ArrayList<>();

    public ReaderGame(){
        listarGames();
    }

    public void listarGames(){

        try {
            Reader reader = Files.newBufferedReader(Paths.get("vendas-games.csv"));
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader).withType(Game.class).withIgnoreLeadingWhiteSpace(true).build();
            games = csvToBean.parse();
        }catch (IOException e){
            System.out.println("Erro: " +e.getMessage());
        }

    }

    public List<Game> listagemPorPlataforma(String plataforma){
        List<Game> gamesporPlatform = new ArrayList<>();

        for(int i = 0; i < games.size(); i++)
            if(games.get(i).getPlatform().equals(plataforma))
                gamesporPlatform.add(games.get(i));

        return gamesporPlatform;

    }

    public List<Game> listagemPorPublisher(String publisher){

        List<Game> gamesporPublisher = new ArrayList<>();

        for(int i = 0; i < games.size(); i++)
            if(games.get(i).getPublisher().equals(publisher))
                gamesporPublisher.add(games.get(i));

        return gamesporPublisher;

    }

}
