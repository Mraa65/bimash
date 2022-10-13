package com.example.bimash.controller;

import com.example.bimash.dto.VehicleAccidentDTO;
import com.example.bimash.dto.ConsultantDTO;
import com.example.bimash.entity.VehicleAccidentEntity;
import com.example.bimash.mapper.VehicleAccidentMapper;
import com.example.bimash.mapper.ConsultantMapper;
import com.example.bimash.service.VehicleAccidentService;
import com.example.bimash.service.ConsultantService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class VehicleAccidentController {

    private final VehicleAccidentService vehicleAccidentService;
    private final VehicleAccidentMapper vehicleAccidentMapper;
    private final ConsultantService consultantService;
    private final ConsultantMapper consultantMapper;

    @RequestMapping(value = {"/","/accidents"})
    public String index(Model model, String vin, Integer locationId) {
        List<VehicleAccidentEntity> accidentEntities = vehicleAccidentService.getAccidents(vin);
        List<VehicleAccidentDTO> accidents = vehicleAccidentMapper.toDTOs(accidentEntities);
        List<ConsultantDTO> consultants = consultantMapper.toDTOs(
                consultantService.getConsultants(accidentEntities, locationId));

        model.addAttribute("accidents", accidents);
        model.addAttribute("consultants", consultants);
        if (vin != null) {
            model.addAttribute("response", "data");
        }
        return "index";
    }

    @GetMapping("/accidents/{id}/image")
    public ResponseEntity<InputStreamResource> getAccidentImage(@PathVariable Long id) {
        VehicleAccidentEntity accident = vehicleAccidentService.getAccident(id);

        return ResponseEntity.ok()
                .contentLength(accident.getImage().length)
                .contentType(MediaType.parseMediaType("image/png"))
                .body(new InputStreamResource(new ByteArrayInputStream(accident.getImage())));
    }

}
