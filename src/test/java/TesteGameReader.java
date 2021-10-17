import br.inatel.cdg.game.ReaderGame;
import br.inatel.cdg.game.Game;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;

public class TesteGameReader {

    private static ReaderGame rg;

    @BeforeClass
    public static void init(){
        rg = new ReaderGame();
    }


    @Test
    public void testeQuantidadeGamesGB(){
        List<Game> gamesGB = rg.listagemPorPlataforma("GB");
        Assert.assertEquals(6,gamesGB.size());
    }

    @Test
    public void testeQuantidadeGamesDS(){
        List<Game> gamesDS = rg.listagemPorPlataforma("DS");
        Assert.assertEquals(13,gamesDS.size());
    }

    @Test
    public void testeQuantidadeGamesPS4(){
        List<Game> gamesPS4 = rg.listagemPorPlataforma("PS4");
        Assert.assertEquals(5,gamesPS4.size());
    }

    @Test
    public void testePlataformaWii(){
        List<Game> Wii = rg.listagemPorPlataforma("Wii");
        boolean flag = false;
        if(Wii.get(0).getPlatform().equals("Wii"))
            flag = true;
        Assert.assertTrue(flag);
    }

    @Test
    public void testeGamePS2(){
        List<Game> gamesPS2 = rg.listagemPorPlataforma("PS2");
        boolean flag = false;
        if(gamesPS2.get(0).getPlatform().equals("PS2"))
            flag = true;
        Assert.assertTrue(flag);
    }

    @Test
    public void testeGamePS3(){
        List<Game> gamesPS3 = rg.listagemPorPlataforma("PS3");
        boolean flag = false;
        if(gamesPS3.get(0).getPlatform().equals("PS3"))
            flag = true;
        Assert.assertTrue(flag);
    }



}
