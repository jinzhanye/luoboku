package ubtms.module.training.service;

import org.springframework.stereotype.Service;
import ubtms.module.training.dto.TrainingDto;
import ubtms.module.training.entity.Training;
import ubtms.module.training.entity.TrainingQuery;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jinzhany on 2017/3/18.
 */

public interface TrainingService {
    int saveTraining(HttpServletRequest request);
    List<TrainingDto> getTrainingMng(TrainingQuery trainingQuery);
    int countTrainingMng(TrainingQuery trainingQuery);
    Training getTrainingById(Integer id);
    int delTraining(List<Training> trainings);
}