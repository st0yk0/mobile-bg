package bg.mobile.extras.service;

import bg.mobile.extras.model.ExtraModel;

public interface ExtraService {

    ExtraModel create(ExtraModel model);

    ExtraModel getByName(String name);


}
