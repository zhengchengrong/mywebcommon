import com.zcr.myapp.dao.model.UserApp;
import com.zcr.myapp.rpc.api.UserAppService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.List;

/**
 * 单元测试
 * Created by shuzheng on 2017/2/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext.xml",
        "classpath:applicationContext-jdbc.xml",
        "classpath:applicationContext-listener.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class MyAppService {

    @Autowired
    private UserAppService userAppService;

    @Test
    public void index() {
        UserApp userApp = new UserApp();
        userApp.setId(1);
        userApp.setAge(10);
        userApp.setName("zcr");
        userAppService.insertSelective(userApp);
        System.out.println(userApp.getId());
    }

}
