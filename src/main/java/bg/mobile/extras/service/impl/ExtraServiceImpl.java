package bg.mobile.extras.service.impl;

import bg.mobile.extras.entities.Extra;
import bg.mobile.extras.entities.ExtraRepository;
import bg.mobile.extras.model.ExtraModel;
import bg.mobile.extras.service.ExtraService;
import bg.mobile.extras.service.converters.ExtraConverter;
import bg.mobile.users.entities.User;
import bg.mobile.users.model.UserModel;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Log4j2
public class ExtraServiceImpl implements ExtraService {

    private final ExtraConverter extraConverter;
    private final ExtraRepository extraRepository;

    public ExtraServiceImpl(ExtraConverter extraConverter, ExtraRepository extraRepository) {
        this.extraConverter = extraConverter;
        this.extraRepository = extraRepository;
    }

    @Override
    public ExtraModel create(final ExtraModel model) {
        log.info("Create extra BEGIN: {}", model);

        if(model == null){
            return null;
        }

        final Extra extraEntity = extraConverter.convertToEntity(model);
        final Extra created = extraRepository.save(extraEntity);

        final ExtraModel createdModel = extraConverter.convertToModel(created);

        log.info("Create extra END: {}", createdModel);

        return createdModel;
    }

    @Override
    public ExtraModel getByName(final String name) {
        log.info("Get extra by name BEGIN: {}", name);

        if(name == null){
            return null;
        }

        final Optional<Extra> extraOpt = extraRepository.findByName(name);

        final ExtraModel model = extraOpt.map(extraConverter::convertToModel).orElse(null);

        log.info("Get extra by name END: {}", model);
        return model;
    }
}
