package com.example.bimash.mapper;

import com.example.bimash.constant.Skill;
import com.example.bimash.dto.VehicleAccidentDTO;
import com.example.bimash.entity.VehicleAccidentEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-12T22:01:22+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class VehicleAccidentMapperImpl implements VehicleAccidentMapper {

    @Override
    public VehicleAccidentDTO toDTO(VehicleAccidentEntity entity) {
        if ( entity == null ) {
            return null;
        }

        VehicleAccidentDTO vehicleAccidentDTO = new VehicleAccidentDTO();

        vehicleAccidentDTO.setId( entity.getId() );
        vehicleAccidentDTO.setVin( entity.getVin() );
        vehicleAccidentDTO.setAccidentDate( entity.getAccidentDate() );
        vehicleAccidentDTO.setAccidentReason( entity.getAccidentReason() );
        vehicleAccidentDTO.setVehicleModel( entity.getVehicleModel() );
        vehicleAccidentDTO.setPlateNumber( entity.getPlateNumber() );
        vehicleAccidentDTO.setDamagePosition( entity.getDamagePosition() );

        vehicleAccidentDTO.setRole( entity.isAtFault() ? "مقصر" : "زیان دیده" );
        vehicleAccidentDTO.setDamagedAccessories( String.join(",", entity.getDamagedAccessories()) );

        return vehicleAccidentDTO;
    }

    @Override
    public List<VehicleAccidentDTO> toDTOs(List<VehicleAccidentEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<VehicleAccidentDTO> list = new ArrayList<VehicleAccidentDTO>( entity.size() );
        for ( VehicleAccidentEntity vehicleAccidentEntity : entity ) {
            list.add( toDTO( vehicleAccidentEntity ) );
        }

        return list;
    }
}
