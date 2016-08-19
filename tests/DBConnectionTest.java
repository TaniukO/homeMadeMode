import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.saniok.web.shop.model.CasheConn;
import ua.saniok.web.shop.model.DAO;
import ua.saniok.web.shop.model.entity.DB_User;
import ua.saniok.web.shop.model.to.DAO_User;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sAnCho on 17.08.2016.
 */
public class DBConnectionTest {
/*
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }*/

    @Test
    public void testGetAll() throws Exception {
        List<DB_User> list= new ArrayList<DB_User>();

            DAO_User dao= new DAO_User();
            list.add(dao.get());

        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
        Assert.assertEquals("name of user","saniok",list.get(0).getLogin());

    }
    @Test
    public void testInsertUser() throws Exception {

        DAO_User dao= new DAO_User();
        int i=dao.insert("as","asd","sd","df","df","1994-05-04",1);
        Assert.assertNotEquals("returned",0,i);
    }
}
