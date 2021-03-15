package frank.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wgsstart
 * @creat 2021-03-13 16:41
 */

public class DBUtilTest {
    @Test
    public void test(){
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
