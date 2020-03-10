package bg.mobile.extras.service;

import bg.mobile.extras.model.ExtraModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class TestExtraService {

    @Autowired
    private ExtraService extraService;

    @Test
    public void testCreateExtra(){

        final ExtraModel model = new ExtraModel();
        model.setName("ABS");

        final ExtraModel created = extraService.create(model);

        assertEquals(model.getName(), created.getName());

        final ExtraModel byName = extraService.getByName(created.getName());

    }
}
