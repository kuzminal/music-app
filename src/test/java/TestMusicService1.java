import com.kuzmin.model.Song;
import com.kuzmin.service.MusicService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "/config.xml")
public class TestMusicService1 extends AbstractJUnit4SpringContextTests {
    @Autowired
    ApplicationContext context;
    @Autowired
    MusicService service;

    @Test
    public void testConfiguration() {
        assertNotNull(context);
        Set<String> definitions = new HashSet<>(
                Arrays.asList(context.getBeanDefinitionNames())
        );
        assertTrue(definitions.contains("musicService1"));
    }

    @Test
    public void testMusicService() {
        Song song = service.getSong(
                "Threadbare Loaf", "Someone Stole the Flour"
        );
        assertEquals(song.getVotes(), 0);
    }
}
