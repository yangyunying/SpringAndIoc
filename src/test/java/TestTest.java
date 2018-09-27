import org.junit.Test;

import static org.junit.Assert.*;
import com.spring01.ioc01.BookService;
/**
 * Created by admin on 2018/9/25.
 */
public class TestTest {
    @Test
    public void testStoreBook() throws Exception {
        BookService bookservice=new BookService();
        bookservice.storeBook("《Spring MVC权威指南 第一版》");
    }

}