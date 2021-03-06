package ubtms.module.user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ubtms.module.user.dto.PlayerDataDto;
import ubtms.module.user.entity.PlayerData;
import ubtms.module.user.entity.PlayerDataExample;
import ubtms.module.user.entity.PlayerDataQuery;

public interface PlayerDataMapper {
    List<PlayerDataDto> selectByUserIdAndTime(PlayerDataQuery playerDataQuery);
    int countAVGData(PlayerDataQuery playerDataQuery);
    List<PlayerDataDto> selectAVGData(PlayerDataQuery playerDataQuery);
    int countByExample(PlayerDataExample example);
    int deleteByExample(PlayerDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlayerData record);

    int insertSelective(PlayerData record);

    List<PlayerData> selectByExample(PlayerDataExample example);

    PlayerData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlayerData record, @Param("example") PlayerDataExample example);

    int updateByExample(@Param("record") PlayerData record, @Param("example") PlayerDataExample example);

    int updateByPrimaryKeySelective(PlayerData record);

    int updateByPrimaryKey(PlayerData record);

    PlayerData selectLastData();

    Integer sumMySchoolScore(Integer gameId);
    Integer sumRivalScore(Integer gameId);

    /**
     * 根据gameId、schoolId查询出该学校在该场比赛中所有球员的数据
     * @param gameId
     * @return
     */
    List<PlayerDataDto> selectMySchoolPlayerData(Integer gameId);
    List<PlayerDataDto> selectRivalPlayerData(Integer gameId);
}