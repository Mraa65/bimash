package com.example.bimash.mapper;

import com.example.bimash.constant.Location;
import com.example.bimash.constant.Skill;
import com.example.bimash.dto.ConsultantDTO;
import com.example.bimash.entity.ConsultantEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-12T22:01:22+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class ConsultantMapperImpl implements ConsultantMapper {

    @Override
    public ConsultantDTO toDTO(ConsultantEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ConsultantDTO consultantDTO = new ConsultantDTO();

        consultantDTO.setPhoneNumber( entity.getPhoneNumber() );

        consultantDTO.setFullName( StringUtils.join(Arrays.asList(entity.getFirstName(),entity.getLastName()), ' ') );
        consultantDTO.setSkillTitle( StringUtils.join(Arrays.asList("کارشناس",entity.getSkill().getTitle()), ' ') );
        consultantDTO.setLocation( entity.getLocation().getTitle() );

        return consultantDTO;
    }

    @Override
    public List<ConsultantDTO> toDTOs(List<ConsultantEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<ConsultantDTO> list = new ArrayList<ConsultantDTO>( entity.size() );
        for ( ConsultantEntity consultantEntity : entity ) {
            list.add( toDTO( consultantEntity ) );
        }

        return list;
    }
}
