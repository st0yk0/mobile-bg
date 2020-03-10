package bg.mobile.extras.service.converters;

import bg.mobile.extras.entities.Extra;
import bg.mobile.extras.model.ExtraModel;
import org.springframework.stereotype.Component;

@Component
public class ExtraConverter {

    public ExtraModel convertToModel (final Extra extra){
        if(extra == null){
            return null;
        }

        final ExtraModel model = new ExtraModel();
        model.setId(extra.getId());
        model.setName(extra.getName());

        return model;
    }

    public Extra convertToEntity(final ExtraModel model){
        if(model == null){
            return null;
        }

        final Extra extra = new Extra();
        extra.setId(model.getId());
        extra.setName(model.getName());

        return extra;
    }
}
